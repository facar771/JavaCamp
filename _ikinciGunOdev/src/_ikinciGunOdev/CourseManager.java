package _ikinciGunOdev;

public class CourseManager {
	public void add(Course course) { 
		
		System.out.println(course.getName() + " Kurslar�n�za Eklendi");
	}
	
	public void update(Course course) { 
		
		System.out.println(course.getName() + " Kurslar�n�z G�ncellendi");
	}
	
	public void delete(Course course) { 
		
		System.out.println(course.getName() + " Kurslar�n�zdan Silindi");
	}
}
