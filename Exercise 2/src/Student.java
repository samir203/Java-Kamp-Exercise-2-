public class Student extends User {
	int scholarship;
	String lectureNotes;
	String email;
	
	public Student(int id, String firstName, String lastName, int age, int scholarship, String lectureNotes,
			String email) {
		super(id, firstName, lastName, age);
		this.scholarship = scholarship;
		this.lectureNotes = lectureNotes;
		this.email = email;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	public String getLectureNotes() {
		return lectureNotes;
	}

	public void setLectureNotes(String lectureNotes) {
		this.lectureNotes = lectureNotes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
