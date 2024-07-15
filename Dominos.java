class Dominos{

    public static int getFoodItem(String foodName){
	
	    int foodPrice = 0 ;
		if(foodName == "Veg Pizza"){
		    foodPrice = 399 ;
			return foodPrice ;
		}
		if(foodName == "Burger"){
		    foodPrice = 250;
			return foodPrice ;
		}
		if(foodName == "Sandwitch"){
		    foodPrice = 190 ;
			return foodPrice ;
		}
		if(foodName == "French Fries"){
		    foodPrice = 200 ;
			return foodPrice ;
		}
		if(foodName == "Non-Veg Pizza"){
		    foodPrice = 380 ;
			return foodPrice ;
		}
		if(foodName == "Piza Mania "){
		    foodPrice = 480 ;
			return foodPrice ;
		}
		if(foodName == "Pasta"){
		    foodPrice = 299 ;
			return foodPrice ;
		}
		if(foodName == "Kadai Paneer"){
		    foodPrice = 389 ;
			return foodPrice ;
		}
		if(foodName == "Chicken Sausage"){
		    foodPrice = 299 ;
			return foodPrice ;
		}
		if(foodName == "Choco Lava Cake"){
		    foodPrice = 110 ;
			return foodPrice ;
		}
		if(foodName == "ButterScotch Mousy Cake"){
		    foodPrice = 105 ;
			return foodPrice ;
		}
		if(foodName == "Paneer Tikka Stuffed Garlic Bread"){
		    foodPrice = 170 ;
			return foodPrice ;
		}
		if(foodName == "Taco Mexicana Veg"){
		    foodPrice = 145 ;
			return foodPrice ;
		}
		if(foodName == "FriedRice"){
		    foodPrice = 100 ;
			return foodPrice ;
		}
		if(foodName == "Cheesy Dip"){
		    foodPrice = 30 ;
			return foodPrice ;
		}
		if(foodName == "Garlic Breadsticks"){
		    foodPrice = 110 ;
			return foodPrice ;
		}
		if(foodName == "Potato Cheese Shots"){
		    foodPrice = 80 ;
			return foodPrice ;
		}
		if(foodName == "Peri-Peri Chicken"){
		    foodPrice = 305 ;
			return foodPrice ;
		}
		if(foodName == "Chicken Kickers"){
		    foodPrice = 320 ;
			return foodPrice ;
		}
		if(foodName == "Potato Widgets"){
		    foodPrice = 399;
			return foodPrice ;
		}
		if(foodName == "Pan"){
		    foodPrice = 150 ;
			return foodPrice ;
		}
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
}