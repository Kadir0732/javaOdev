package javaOdev;

public class DersManager {
	public void beforButton(int dersIndex) {
		System.out.println((dersIndex - 1 ) + ".ders e y�nlendiriliyor.");
		System.out.println("bir �nceki derse y�nlendirildi.");
	}
	public void afterButton(int dersIndex) {
		System.out.println((dersIndex + 1 ) + ".ders e y�nlendiriliyor.");
		System.out.println("bir sonraki derse y�nlendirildi.");
	}
}
