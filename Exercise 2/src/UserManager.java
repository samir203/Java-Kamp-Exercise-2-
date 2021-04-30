public class UserManager {
	public void add(User user) {
		System.out.println("Eklendi " + user.firstName + " " + user.lastName);
	}
	
	public void remove(User user) {
		System.out.println("Silindi " + user.firstName + " " + user.lastName);
	}
	
	public void update(User user) {
		System.out.println("Guncellendi " + user.firstName + " " + user.lastName);
	}
}
