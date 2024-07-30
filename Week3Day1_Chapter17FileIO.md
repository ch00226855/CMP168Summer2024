# Week 3 Day 1
# Chapter 17 Files I/O

## Reading from Files
A program sometimes need to read data from files rather than from a user typing on a keyboard. Java provides several ways to interact with files on the machine's hard drive.

**Input Sources:**
- `InputStream`: An abstract class representing an input stream of bytes.
- `System.in`: A predefined input stream associated with the system's standard input (keyboard).
- `File`: A class representation of files.
- `FileInputStream`: A class obtaines input bytes from a file in the file system.

**A File vs. A File Object**
- A **computer file** stores data in a computer storage device (hard drive). Files can be edited and transfered from one computer system to another.
- A computer file has a name that uniquely identifies the file. A file name includes:
  - **Base name**: such as `Scanner`, `README`, `HelloWorld`.
  - **Extension**: indicates the type of content, such as `.txt`, `.java`, `.html`.
  - **Path**: indicates the directory of the file, such as `/user/username/home/Downloads/` or `C:\Users\Username\Downloads`
- A **file object** in java is a reference variable representing a computer file. It has useful methods for a Java programme to read and write on the file.
- A file name must be provided when the program defines a file object.

![](https://www.linuxtrainingacademy.com/wp-content/uploads/2014/03/linux-folders.jpg)

![](https://mail.codejava.net/images/articles/javase/fileio/list-directory/a%20directory.png)

**Absolute Path vs. Relative Path**
- An **absolute path** indicates the path to reach a file from the **root** directory.
- A **relative path** indicates the path to reach a file from the current working directory. 
  - The current working directory of a java project can be found in Properties.
  - For files in the current working directory, no path is needed. Ex: `Text.txt`
  - For files in a sub-directory, show the name of sub-directory. Ex: `src/week2day3/FileDemo.java`
  - Use `..` to refer the higher-level directory. Ex: `../../Downloads/file.txt`
- The absolute path of a file is independent of the current working directory.


**Example**: p17.1.1, p17.1.2 Read a file using `Scanner` and `FileInputStream`.
- Import `java.util.Scanner`, `java.io.FileInputStream`, and `java.io.IOException`.
- Create a `FileInputStream` object representing a computer file.
- Create a `Scanner` object and connect it to the file input stream.
- Use methods like `nextInt()`, `nextDouble()`, or `nextLine()` to read from the file.
- Close the file input stream afterwards (otherwise the file cannot be accessed by another program).
- Close the scanner to release memory space.

**Exercise**: Create a TXT file and read the file in Java.

**Reading until the end of the file**
The `Scanner` class offers `hasNext()` method to detect whether the scanner has reached the end the file. It has several variants such as `hasNextInt()` and `hasNextDouble()` for specific types.

**Example**: Figure 17.1.1 Reading a varying amount of data from a file

**Exercise**: Counting instances of a specific word in a file

**Class `FileReader`**
The `FileReader` class provides a convenient way to read character files. It provides a `read()` method that reads one character at a time. If there is no more characters, the method will return -1.

**Exercise**: Read a TXT file using `Scanner` and `FileReader`.

**Class `File`**
The `File` class provides an abstract representation of a file or a directory. It has many useful methods including:
- `exists()`: tests whether the file or directory exists.
- `canRead()`, `canWrite()`
- `isFile()`, `isDirectory()`
- `list()`: returns a list of files and subdirectories in a directory
- `length()`
- `delete()`
- `getAbsolutePath()`
- `setReadOnly()`

## Exception Handling in File I/O
A file input/output stream requires exception handling to ensure invalid or interrupted file operation exceptions are appropriately caught and handled. 

- A `FileNotFoundException` will be thrown if the string pathname is incorrect
- An `AccessDeniedException` will be thrown if the permissions prohibit the read/write/execute action attempted
- A `FileIOException` represents a general types of exception that occurs during interactions with files.

**Exercise:** Safely read from a file and display the content
```java
try {	file = new FileInputStream("C:/Users/DancyZou/Downloads/temp.txt");
	scnr = new Scanner(file);

	// load until the end of a file
	while (scnr.hasNext()) {
		System.out.println(scnr.nextLine());
	}
} catch (IOException e) {
	System.err.println(e.getMessage());
	e.printStackTrace();
} finally {
	try {
		file.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}	
```

**Closing files with the try-with-resources statement (Recommended)**
A program can use a **try-with-resources** statement to automatically close files if any exception, caught or uncaught, occurs within a try block. The try-with-resources statement declares closable resources, like files, within parentheses after the try keyword and before the try's opening curly brace. The declared resources are closed after the try block exits. Multiple resources, separated by semicolons, can be declared in a single try-with-resources statement.

```java
try (FileInputStream file = new FileInputStream("src/temp.txt");
			Scanner scnr = new Scanner(file))
{
	System.out.println(scnr.nextLine());
} catch (IOException e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
}
```

## Write to Files
Java provides various way to represent outputs of a program:
- `OutputStream`: represents the output of the program as a byte stream
- `PrintStream`: subclass of `OutputStream` with additional print methods
- `FileOutputStream`: an output stream writing to a file
- `File`

We can write oiutput to a file via the `PrintWriter` class.

**Syntax**
```java
PrintWriter pw = new PrintWriter("myFile.txt");
PrintWriter pw = new PrintWriter(new File("myFile.txt"));
PrintWriter pw = new PrintWriter(new FileOutputStream("myFile.txt"));
```

**Useful methods:**
- `append(char c)`
- `print()`, `println()`, `printf()`
- `write(String s)`
- `flush()`: flush the stream and write to file immediately
- `close()`

**Example**: p17.2.2, p17.2.3 Writing to an output text file

**Safely write to a new file**
```java
FileOutputStream file = null;
PrintWriter outStream = null; // notice this is not inside the try block
try {
	file = new FileOutputStream("FileName");
	outStream = new PrintWriter(file); // create and connect to a new empty file
	outStream.println(text); // write text to the file
} catch (IOException e) {
	System.err.println("Could not create the file " + fileName);
	e.printStackTrace();
} finally {
	try {
		outStream.close(); // close the stream and release resources
		file.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
```

**Exercises:**
- Safely appending to an existing file
```java
try {
	pw = new PrintWriter(new FileOutputStream("data/records.txt", true));
	pw.println("I am appending to this file!");
} catch (IOException e) {
	System.out.println(e.getMessage());
} finally {
	if (pw != null) {
		pw.close();
	}
}
```
- Copy a file (read from `file1` and write the content to `file2`)

```java
File file1 = new File("data/recordss.txt");
File file2 = new File("data/records_copy.txt");
Scanner scnr = null;
PrintWriter pw = null;

try {
	scnr = new Scanner(file1);
	pw = new PrintWriter(file2);

	while(scnr.hasNext()) {
		// read and write one line
		String line = scnr.nextLine();
		pw.println(line);
	} 
	pw.flush();
} catch (IOException e) {
	System.err.println(e.getMessage());
	e.printStackTrace();
} finally {
	if (scnr != null) {
		scnr.close();
	}
	if (pw != null) {
		pw.close();
	}
}
```
### File Writing with Try-with-Resources Block
```java
try (FileInputStream file1 = new FileInputStream("src/temp.txt");
	Scanner scnr = new Scanner(file1);
	FileOutputStream file2 = new FileOutputStream("src/records3.txt", true);
	PrintWriter pw = new PrintWriter(file2)) {

			while (scnr.hasNext()) {
				pw.println(scnr.nextLine());
			}

			pw.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
```
- Delete a file
```java
File file = new File("data/records_copy.txt");
System.out.println("Does file exist? " + file.exists());
boolean results = file.delete();
System.out.println("Has the file been deleted? " + results);
```

**Exercise**: Save and reconstruct a database.
