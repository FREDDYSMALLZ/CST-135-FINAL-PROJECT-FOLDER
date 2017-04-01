import java.util.ArrayList;
public class Dispenser  {
	public static void main(String[] args) {
		
		
		ArrayList<String> product = new ArrayList<>();
		product.add("Candy");
		product.add("Chips");
		product.add("Soda");
		product.add("Gum");
		product.add("Chocolate");
		
		System.out.println(product.toString());
	
	}
	
	String productChoice;// contains the selction ids for the products
	double productPrice;// Holds the price of the selected product
	double change;//Returns the change after the the transaction is complete
	double currency;//User is prompted to enter the currency for making a purchase
	double transaction;// Evaluates the entered currency value against the product price


public Dispenser(double change, double currency, double transaction){
	this.currency = currency;
	this.change = change;
	this.transaction = transaction;
	
}
public Dispenser(String productChoice, double productPrice,
		double change, double currency, double transaction){
	this.currency = currency;
	this.change = change;
	this.transaction = transaction;
	setProductChoice(productChoice);
	setProductPrice(productPrice);
}
public String getProductChoice() {
	return productChoice;
}
public double getProductPrice() {
	return productPrice;
}
public double getChange() {
	return change;
}
public double getCurrency() {
	return currency;
}
public double getTransaction() {
	return transaction = currency - productPrice;
}
public void setProductChoice(String productChoice) {
	this.productChoice = productChoice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public void setChange(double change) {
	this.change = change;
}
public void setCurrency(double currency) {
	this.currency = currency;
}
}




	

