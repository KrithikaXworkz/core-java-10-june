class FoodPandaRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String foodName = "Chicken Biriyani" ;
	int quantity = 3 ;
	int price = FoodPanda.searchFoodOrder(foodName);
	System.out.println("Food Panda Food Name is " + foodName);
	System.out.println("Quantity of Food is " + quantity);
	System.out.println("The Price of the Food Panda is :" + price*quantity);
	System.out.println("Main Ended");
	
	}
	
}