class FoodPanda{

    public static int searchFoodOrder(String foodName){
	
	    int foodPrice = 0 ;
		if(foodName == "Chicken Biriyani"){
		    foodPrice = 150 ;
			return foodPrice ;
		}
		if(foodName == "Egg Rice"){
		    foodPrice = 100 ;
			return foodPrice ;
		}
		if(foodName == "Kabab"){
		    foodPrice = 100 ;
			return foodPrice ;
		}
		if(foodName == "Egg Burji"){
		    foodPrice = 50 ;
			return foodPrice ;
		}
		if(foodName == "Amlet"){
		    foodPrice = 10 ;
			return foodPrice ;
		}
		if(foodName == "Matan Biriyani"){
		    foodPrice = 200 ;
			return foodPrice ;
		}
		if(foodName == "Kuska"){
		    foodPrice = 60 ;
			return foodPrice ;
		}
		if(foodName == "Chilli Chicken"){
		    foodPrice = 150 ;
			return foodPrice ;
		}
		if(foodName == "Chicken Lolipop"){
		    foodPrice = 200 ;
			return foodPrice ;
		}
		if(foodName == "Chicken Tikka"){
		    foodPrice = 180 ;
			return foodPrice ;
		}
		if(foodName == "Fish Masala"){
		    foodPrice = 265 ;
			return foodPrice ;
		}
		if(foodName == "Garlic Chicken"){
		    foodPrice = 240;
			return foodPrice ;
		}
		if(foodName == "Ginger Chicken"){
		    foodPrice = 240 ;
			return foodPrice ;
		}
		if(foodName == "Tandoori Chicken"){
		    foodPrice = 300 ;
			return foodPrice ;
		}
		if(foodName == "Grilli Chicken"){
		    foodPrice = 300 ;
			return foodPrice ;
		}
		if(foodName == "Chicken 65"){
		    foodPrice = 264 ;
			return foodPrice ;
		}
		if(foodName == "Egg Biriyani"){
		    foodPrice = 154 ;
			return foodPrice ;
		}
		if(foodName == "Tandoori Roti"){
		    foodPrice = 40 ;
			return foodPrice ;
		}
		if(foodName == "Rumali Roti"){
		    foodPrice = 40 ;
			return foodPrice ;
		}
		if(foodName == "Chicken Garlic Kabab"){
		    foodPrice = 243;
			return foodPrice ;
		}
		if(foodName == "Veg Family Pack"){
		    foodPrice = 383 ;
			return foodPrice ;
		}
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
}