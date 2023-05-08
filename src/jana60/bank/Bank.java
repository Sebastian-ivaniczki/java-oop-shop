package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Conto cont = new Conto("franco");
		System.out.println(cont.getName());
		Scanner sc = new Scanner(System.in);
		String menu ="scegli una delle seguenti operazioni 1: versamento; 2: prelievo; 3: esci;";
		System.out.println(menu);
		
		int choice = sc.nextInt();
		
		
		if (choice == 1) {
			System.out.println("quanto vuoi versare?");
			double amount = sc.nextDouble();
			cont.setBalance(amount);
			System.out.println("il tuo saldo è: " +cont.getBalance());
			System.out.println(menu);
			choice = sc.nextInt();
		}
		
		if (choice == 2) {

			System.out.println("quanto vuoi prelevare?");
			
			double amount = sc.nextDouble();
			if(cont.getBalance()< amount) {
				System.out.println("saldo insufficente");
			} else {
				double balance = cont.takeBalance(amount);
				
				System.out.println("il saldo è: " + balance );
			}
			
			System.out.println(menu);
			choice = sc.nextInt();
		}
		sc.close();
		
		if (choice == 3) {
			
			System.out.println("corri");
			return;
		}
		
		
		//System.out.println(cont.getBalance());
		//System.out.println(cont.getContNumber());
	}
}
