package org.lessons.java.shop;

public class Prodotto {
	private String code;
	private String name;
	private String description;
	private double price;
	private int iva;
	
	public Prodotto(String code, String name, String description, double price, int iva) {
		this.code = code;
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
	}
	
	// Getter and Setter 
	
	public String getCode() {
		if(code.length() < 8) {
			StringBuilder sb = new StringBuilder(code);
			while(sb.length() < 8 ) {
				sb.insert(0, "0");
			}
			this.code= sb.toString();
		}
		return code;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public double getIvaPrice() {
		double fulPrice = price + (price * iva / 100);
		return fulPrice;
	}
	
}
