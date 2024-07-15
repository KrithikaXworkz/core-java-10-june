class NandiniParlourRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String product = "Lassi" ;
	int price = NandiniParlour.getProductPriceByName(product);
	System.out.println("Product Name is " + product);
	System.out.println("The Price of the Milk Products is :" + price);
	System.out.println("Main Ended");
	
	}
	
	
}