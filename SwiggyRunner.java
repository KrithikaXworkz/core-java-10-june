class SwiggyRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String foodName = "Chithrana" ;
	int price = Swiggy.getFoodOrder(foodName);
	System.out.println("Swiggy Food Name is " + foodName);
	System.out.println("The Price of the Swiggy Food is :" + price);
	System.out.println("Main Ended");
	
	}
	
}