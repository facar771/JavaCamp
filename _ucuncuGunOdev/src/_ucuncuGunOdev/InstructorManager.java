package _ucuncuGunOdev;

public class InstructorManager extends UserManager{
	
	public void createCourse(Instructor instructor){
		System.out.println(instructor.getName() + " Kurs a�t�");
	}
	public void deleteCourse(Instructor instructor){
		System.out.println(instructor.getName() + " Kursu sildi");
	}
}
