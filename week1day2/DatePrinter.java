package week1day2;

public class DatePrinter {
	
	   public static void main(String[] args) {
		      
		      printDate(30, 7, 2012);
		      System.out.println();
		      
		      printDate(30, "July", 2012);
		      System.out.println();
		   }
	
	   public static void printDate(int currDay, int currMonth, int currYear) {    
	      System.out.print(currMonth + "/" + currDay + "/" + currYear);
	   }

	   public static void printDate(int currDay, String currMonth, int currYear) {
	      System.out.print(currMonth + " " + currDay + ", " + currYear);
	   }

	    // We cannot define another printDate method like the following:
	   //public static void printDate(int year, int month, int day) {} 


	}
