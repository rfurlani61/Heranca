package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NewProgram {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o numero de empregados: ");
		int numero = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		for (int i = 1; i <= numero; i++) {
			System.out.println("Dados do empregado #" + i + ":");
			System.out.print("Terceirizado (S/N)? ");
			sc.nextLine();
			String outsourced = sc.next();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			sc.nextLine();
			double valorPorHora = sc.nextDouble();
			if (outsourced.equals("S")) {
				System.out.print("Carga adicional: ");
				double cargaAdicional = sc.nextDouble();
				list.add(new OutSourcedEmployee(nome, horas, valorPorHora, cargaAdicional));
			}
			else {
				list.add(new Employee(nome, horas, valorPorHora));
			}
		}
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}
}
