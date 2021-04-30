public class Main {

	public static void main(String[] args) {
		User user  = new User(1,"Samir","Elizade",17);
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.remove(user);
		userManager.update(user);
		
		Student student = new Student(2, "Asim", "Alizada", 18, 130, "A,A,A,A,A", "asim@gmail.com");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.bestStudent(student);
		
		Instructor instructor = new Instructor(3, "Engin", "Demirog", 37, 100000, "Egitmen", "Program Analystic");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.updateSalary(instructor);

	}

}
