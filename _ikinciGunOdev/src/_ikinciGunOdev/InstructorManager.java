package _ikinciGunOdev;

public class InstructorManager {
	public void login(Instructor instructor) {
		
		System.out.println(instructor.getName() + " Giri� Yapt�. " + "Ya�� :" + instructor.getAge());
	}
	
	public void logout(Instructor instructor) {	
		
		System.out.println(instructor.getName() + " ��k�� Yapt�");
	}
}
