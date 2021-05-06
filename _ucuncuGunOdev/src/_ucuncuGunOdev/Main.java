package _ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		Instructor instructor1 = new Instructor();
		
		student1.setId(1);
		student1.setName("Ferhat");
		student1.setLastName("A�ar");
		student1.setUserName("facar");
		student1.setEmail("*****@gmail.com");
		student1.setPassword("********");
		
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setUserName("engdemr");
		instructor1.setEmail("*****@gmail.com");
		instructor1.setPassword("********");
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		instructorManager.login(instructor1);
		instructorManager.login(student1);
		studentManager.logout(instructor1);
		studentManager.logout(student1);
		instructorManager.deleteCourse(instructor1);
		
		studentManager.selectCourse(student1);
		studentManager.leaveCourse(student1);
	}
}