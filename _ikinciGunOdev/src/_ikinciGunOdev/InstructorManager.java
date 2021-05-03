package _ikinciGunOdev;

public class InstructorManager {
	public void login(Instructor instructor) {
		
		System.out.println(instructor.getName() + " Giriþ Yaptý. " + "Yaþý :" + instructor.getAge());
	}
	
	public void logout(Instructor instructor) {	
		
		System.out.println(instructor.getName() + " Çýkýþ Yaptý");
	}
}
