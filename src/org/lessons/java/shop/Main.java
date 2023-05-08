package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		 Prodotto prod = new Prodotto("123", "prod", "descrizione prodotto", 122.20, 30);
		 
		 System.out.println(prod.getCode());
		 System.out.println(prod.getIvaPrice());
	}
}
