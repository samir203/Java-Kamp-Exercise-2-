public class Instructor  extends User{
	int salary;
	String rank;
	String lesson;
	
	public Instructor(int id, String firstName, String lastName, int age, int salary, String rank, String lesson) {
		super(id, firstName, lastName, age);
		this.salary = salary;
		this.rank = rank;
		this.lesson = lesson;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
}

