package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ProgramArea {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre om o numero de formas: ");
		int n = sc.nextInt();
		List<Shape> list = new ArrayList<>();
		for (int i = 1; i <= n ; i++) {
			System.out.println("Forma #" + i +":");
			System.out.print("Retangulo ou circulo (r/c): ");
			sc.nextLine();
			char f = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (f == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");	
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println("Shape Areas:");
		for (Shape s : list) {
			System.out.println(s.area());
		}
	}

}
