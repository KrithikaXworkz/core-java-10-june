class NandiniParlourRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String product = "Lassi" ;
	int quantity = 3 ;
	int price = NandiniParlour.getProductPriceByName(product);
	System.out.println("Product Name is " + product);
	System.out.println("No of Quantity is " + quantity);
	System.out.println("The Price of the Milk Products is :" + price*quantity);
	System.out.println("Main Ended");
	
	}
	
	
}