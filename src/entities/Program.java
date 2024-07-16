package entities;

public class Program {

	public static void main(String[] args) {
/*		
		Account acc = new Account(1001, "João Silva", 0.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Jose Slva", 0.00, 500.00);
		
		// Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"Maria Silva", 0.00, 600.00);
		Account acc3 = new SavingsAccount(1004, "Luca Leal", 0.00, 0.01);
		
		// Porque é possível => porque BusinessAccount e SavingsAccount são subclassed derivadad de Account, 
		// ou seja, BusinessAccount e SavingsAccount também são Accounts
		
		// Downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2; // Mesmo tendo criado acc2 como BusinessAccount dá erro, temos de fazer um Downcast.
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; 
		
	
		 * Exception in thread "main" java.lang.ClassCastException: class entities.SavingsAccount cannot be 
		 * cast to class entities.BusinessAccount (entities.SavingsAccount and entities.BusinessAccount are in unnamed module 
		 * of loader 'app')	at entities.Program.main(Program.java:24)
		 * 
		 * Em tempo de compilação não temos um erro, o erro somente irá ocorrer em tempo de execução quando se verificará que acc3
		 * é uma classe SavingsAccount e não BusinessAccount e não daria para fazer o Downcast nesse caso . Para verificarmos se
		 * podemos ou não fazeer o Downcast usamos INSTANCEOF
		 
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
*/
		Account acc1 = new Account(1001, "João", 1000.00);
		acc1.withDraw(200.00);
		System.out.println(acc1.getBalance());
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		acc2.withDraw(200.00);
		System.out.println(acc2.getBalance());
		Account acc3 = new BusinessAccount(1003, "Andre", 1000.00, 700.00);
		acc3.withDraw(200.00);
		System.out.println(acc3.getBalance());
	}
}
