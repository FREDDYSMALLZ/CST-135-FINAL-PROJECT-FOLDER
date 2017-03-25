import java.util.Date;

	public  class Product {
		
		public static void main(String[] args) {
			//Programing design for a product that can be found in a vending machine
			
			
			String productName  ;
			 double weightOfProduct ;
			 double caloriesOfProduct;
			 java.util.Date productDate;
			 int quantityOfProduct;
			 
			  Product product = new Product();
				  
			  }
		
			 
		private double weightOfProuct;
		public double getWeightOfProduct(double weightOfProduct) {
			return weightOfProduct;
		}
		public void SetWeightOfProduct(double weightOfProduct){
			this.weightOfProuct = weightOfProduct;
		}
		private double caloriesOfProduct;
		public double getCaloriesOfProduct(double caloriesOfProduct){
			return caloriesOfProduct;
			
		}
		public void setCaloriesOfProduct(double caloriesOfProduct){
			this.caloriesOfProduct = caloriesOfProduct;
		}
		private int quantityOfProduct;
		public int getQuantityOfProduct(int quantityOfProduct){
			return quantityOfProduct;
		}
		public void setQuantityOfProduct(int quantityOfProduct){
			this.quantityOfProduct = quantityOfProduct;
		}
		private java.util.Date Date;
		public java.util.Date getDate(){
			return Date;
		}
		public void setDate(){
			this.Date = Date;
		}
		private static String productName;
		public String getProductName(String productName){
			return productName;
		}
		public void setProductName(String productName){
			this.productName = productName;
		}
	}

	


