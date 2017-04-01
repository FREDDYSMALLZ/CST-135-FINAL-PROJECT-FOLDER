
public abstract class Snack extends Product {
	public String name;
	public double calories;
	public double size;
	public java.util.Date manufacturingAndExpiryDate;
	
	public String toString(){
		return "Snack";
	}

}
class Candy extends Snack{
	
}
class Chpis extends Snack{
	
}
class Chips extends Snack{
	
}