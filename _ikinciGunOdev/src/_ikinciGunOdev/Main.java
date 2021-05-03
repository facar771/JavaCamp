package _ikinciGunOdev;

public class Main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course(1, "C#", 15, "C# yazýlým geliþtirici yetiþtirme kampý");
		Course course2 = new Course(2, "JAVA", 30, "JAVA yazýlým geliþtirici yetiþtirme kampý");
		
		Course[] courses = new Course[] {course1, course2} ;
		
		for (Course course : courses) {
			System.out.println(course.getId());
			System.out.println(course.getName());
			System.out.println(course.getProgress());
			System.out.println(course.getContent());
			System.out.println("********");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course1);
		System.out.println("********");
		courseManager.add(course2);
		courseManager.delete(course2);
		courseManager.update(course2);
		System.out.println("********");
		
		//*********************************************
		
		Instructor instructor1 = new Instructor();
		Instructor instructor2 = new Instructor();
		Instructor instructor3 = new Instructor();
		
		instructor1.setName("Engin Demiroð");
		instructor1.setAge(30);
		
		instructor2.setName("Ferhat AÇAR");
		instructor2.setAge(21);
		
		instructor3.setName("Sümeyye AÇAR");
		instructor3.setAge(10);
		
		Instructor[] instructors = new Instructor[] {instructor1,instructor2,instructor3};
		
		InstructorManager instructorManager = new InstructorManager();
		
		for (Instructor instructor : instructors) {
			instructorManager.login(instructor);
		}
		
		System.out.println("********");
		
		for (Instructor instructor : instructors) {
			instructorManager.logout(instructor);
		}
	}
}
