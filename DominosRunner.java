class DominosRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String foodName = "Veg Pizza" ;
	int quantity = 4 ;
	int price = Dominos.getFoodItem(foodName);
	System.out.println("Dominos Food Name is " + foodName);
	System.out.println("Quantity of Dominos Food is " + quantity);
	System.out.println("The Price of the Food of Zomato is :" + price*quantity);
	System.out.println("Main Ended");
	
	}
	
}