package jana60.bank;

import java.util.Random;

public class Conto {
	private int contNumber;
	private String name;
	private double balance;
	//private double withdrawal;
	
	public Conto( String name) {
		Random rn = new Random();
		
		this.contNumber = rn.nextInt(1001);
		
		this.name = name;
		this.balance = 0;
		
	}
	
	public int getContNumber() {
		return contNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//function for add balance
	
	public void addBalance(double balance) {
		this.balance = balance;
	}
	
	public double takeBalance(double withdrawal) {
		
		return	this.balance = this.balance - withdrawal;
		
	}
}
