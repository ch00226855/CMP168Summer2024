package week2day3;

public class Course implements Comparable<Course>{
	
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course(boolean isGraduateCourse,
					int courseNum,
					String courseDept,
					int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits; // WARNING: should check the number first.
	}

	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}
	
	public String getCourseName() {
		String str;
//		if (isGraduateCourse) {
//			str = "G";
//		} else {
//			str = "U";
//		}
		// Use the ternary operator (conditional expression)
		str = isGraduateCourse ? "G" : "U";
		str += courseDept + courseNum;
		return str;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if (o instanceof Course) {
			Course c = (Course) o;
			if (this.isGraduateCourse == c.isGraduateCourse &&
				this.courseNum == c.courseNum &&
				this.courseDept.equals(c.courseDept) &&
				this.numCredits == c.numCredits) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = String.format("Course: %3s-%3d | Number of Credits: %02d |",
				courseDept, courseNum, numCredits);
		str += isGraduateCourse ? " Graduate" : " Undergraduate";
		return str;
	}
	
	@Override 
	public int compareTo(Course c) {
		// The sign is decided by the difference
		if (this.courseNum < c.courseNum) {
			return -1;
		} else if (this.courseNum > c.courseNum) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	
	
	
}
