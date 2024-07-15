class DominosRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String foodName = "Veg Pizza" ;
	int price = Dominos.getFoodItem(foodName);
	System.out.println("Dominos Food Name is " + foodName);
	System.out.println("The Price of the Food of Zomato is :" + price);
	System.out.println("Main Ended");
	
	}
	
}