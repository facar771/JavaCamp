package _ucuncuGunOdev;

public class StudentManager extends UserManager{
	
	public void selectCourse(Student student){
		System.out.println(student.getName() + " Kursu se�ti");
	}
	public void leaveCourse(Student student){
		System.out.println(student.getName() + " Kurstan ayr�ld�");
	}
}
