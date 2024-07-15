class ZomatoRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String foodName = "Kerala Parota" ;
	int quantity = 2 ;
	int price = Zomato.getFoodName(foodName);
	System.out.println("Zomato Food Name is " + foodName);
	System.out.println("Quantity of Zomato's Food is " + quantity);
	System.out.println("The Price of the Food of Zomato is :" + price*quantity);
	System.out.println("Main Ended");
	
	}
	
}