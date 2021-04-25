package javaOdev;

public class Main {
	
	public static void main(String[] args) {

	Course course1 = new Course(1, "java", "java.jpg", "Engin Demiroð");
	Course course2 = new Course(2, "c#", "cSharp.jpg", "Engin Demiroð");
	Course course3 = new Course(3, "programlamaya giriþ", "programlamaYeni.jpg", "Engin Demiroð");
	
	Category category1 = new Category(1,"Programlama");
	Category category2 = new Category(2,"Gragik");
	
	DersManager dersMannager = new DersManager();
	
	Course[] courses = {
			course1,
			course2,
			course3
		};
		Category[] categories = {
				category1,
				category2
		};
		System.out.println("----------------------- Kurslar -----------------------");
		for (Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.imgUrl);
			System.out.println(course.teacher);
			System.out.println("-----------------------------------");
		}
		System.out.println("----------------------- Kategoriler -----------------------");
		for (Category category : categories) {
			
			System.out.println(category.id);
			System.out.println(category.name);
			System.out.println("-----------------------------------");
		}
		System.out.println("----------------------- button simülasyonu -----------------------");
		dersMannager.afterButton(3);
		System.out.println("----------------------------------");
		dersMannager.beforButton(3);
	}
}
