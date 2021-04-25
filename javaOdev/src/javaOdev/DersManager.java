package javaOdev;

public class DersManager {
	public void beforButton(int dersIndex) {
		System.out.println((dersIndex - 1 ) + ".ders e yönlendiriliyor.");
		System.out.println("bir önceki derse yönlendirildi.");
	}
	public void afterButton(int dersIndex) {
		System.out.println((dersIndex + 1 ) + ".ders e yönlendiriliyor.");
		System.out.println("bir sonraki derse yönlendirildi.");
	}
}
