class Shoes{

    public static void main(String[] batashowroom){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
	    int brandID = 837645;
	    String brandName = "Adidas" ;
	    int size = 9 ;
	    String color = "Blue" ;
	    String price = "1250" ;
	    String typeOfShoe = "Formals" ;
	
	    System.out.println("The Brand ID of Shoes is " + brandID);
	    System.out.println("The Brand Name of Shoes is " + brandName);
	    System.out.println("The Size of Shoes is " + size);
	    System.out.println("The Color of Shoes is " + color);
	    System.out.println("The Price of Shoes is " + price);
	    System.out.println("The Type of Shoes is " + typeOfShoe);
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}