class Dominos{

    public static int getFoodItem(String foodName){
	
	    int foodPrice = 0 ;
		if(foodName == "Veg Pizza") return foodPrice = 399 ;
		if(foodName == "Burger") return foodPrice = 250;
		if(foodName == "Sandwitch") return foodPrice = 190 ;
		if(foodName == "French Fries") return foodPrice = 200 ;
		if(foodName == "Non-Veg Pizza") return foodPrice = 380 ;
		if(foodName == "Piza Mania ") return foodPrice = 480 ;
		if(foodName == "Pasta") return foodPrice = 299 ;
		if(foodName == "Kadai Paneer") return foodPrice = 389 ;
		if(foodName == "Chicken Sausage") return foodPrice = 299 ;
		if(foodName == "Choco Lava Cake") return foodPrice = 110 ;
		if(foodName == "ButterScotch Mousy Cake") return foodPrice = 105 ;
		if(foodName == "Paneer Tikka Stuffed Garlic Bread") return foodPrice = 170 ;
		if(foodName == "Taco Mexicana Veg") return foodPrice = 145 ;
		if(foodName == "FriedRice") return foodPrice = 100 ;
		if(foodName == "Cheesy Dip") return foodPrice = 30 ;
		if(foodName == "Garlic Breadsticks") return foodPrice = 110 ;
		if(foodName == "Potato Cheese Shots") return foodPrice = 80 ;
		if(foodName == "Peri-Peri Chicken") return foodPrice = 305 ;
	    if(foodName == "Chicken Kickers") return foodPrice = 320 ;
		if(foodName == "Potato Widgets") return foodPrice = 399;
		if(foodName == "Pan") return foodPrice = 150 ;
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
}