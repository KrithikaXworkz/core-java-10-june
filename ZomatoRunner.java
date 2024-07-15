class ZomatoRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String foodName = "Kerala Parota" ;
	int price = Zomato.getFoodName(foodName);
	System.out.println("Zomato Food Name is " + foodName);
	System.out.println("The Price of the Food of Zomato is :" + price);
	System.out.println("Main Ended");
	
	}
	
}