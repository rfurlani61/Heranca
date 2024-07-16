package entities;

public abstract class Account {
	
	/* 
	 * Ao colocarmos a palavra reservada abstract, impidimos a classe de seer instanciada
	Mas ainda podemos usar as suas capacidades de reuso e polimorfismo
	Da mesma forma métodos abstratos são métodos que não possuem implementação, são métodos que precisam ser abstratos,
	Quando a classe é genérica demais para conter a sua implementação.
	SE UMA CLASSE CONTER PELO MENOS UM MÉTODO ABSTRATO ELA TAMBÉM SERÁ ABSTRTATA.
	Exemplo: 
	Classe: 
	Forma: Uma forma tem cor. Uma forma tem área. Mas como calcular a área de uma forma?
	Somente poderemos calcular a área de subclasses de formas como retangulo ou circulos.
	 
	*/
	private Integer number;
	private String holder;
	protected Double balance;
	//Modo protected => A variável somente pode ser visivel na classe onde foi declarada e nas sub-classes que a herdam.
	
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withDraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
}
