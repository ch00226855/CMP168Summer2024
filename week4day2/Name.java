package week4day2;

public class Name implements Comparable<Name>{
	
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof Name) {
			Name n = (Name) obj;
			if (this.firstName.equals(n.firstName) &&
				this.lastName.equals(n.lastName)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Name n) {
		if (this.lastName.compareTo(n.lastName) != 0) {
			return this.lastName.compareTo(n.lastName);
		} else if (this.firstName.compareTo(n.firstName) != 0) {
			return this.firstName.compareTo(n.firstName);
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
