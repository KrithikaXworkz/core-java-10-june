class FoodPanda{

    public static int searchFoodOrder(String foodName){
	
	    int foodPrice = 0 ;
		if(foodName == "Chicken Biriyani") return foodPrice = 150 ;
		if(foodName == "Egg Rice") return foodPrice = 100 ;
		if(foodName == "Kabab") return foodPrice = 100 ;
		if(foodName == "Egg Burji") return foodPrice = 50 ;
		if(foodName == "Amlet") return foodPrice = 10 ;
		if(foodName == "Matan Biriyani") return foodPrice = 200 ;
		if(foodName == "Kuska") return foodPrice = 60 ;
		if(foodName == "Chilli Chicken") return foodPrice = 150 ;
		if(foodName == "Chicken Lolipop") return foodPrice = 200 ;
		if(foodName == "Chicken Tikka") return foodPrice = 180 ;
		if(foodName == "Fish Masala") return foodPrice = 265 ;
		if(foodName == "Garlic Chicken") return foodPrice = 240;
		if(foodName == "Ginger Chicken") return foodPrice = 240 ;
		if(foodName == "Tandoori Chicken") return foodPrice = 300 ;
		if(foodName == "Grilli Chicken") return foodPrice = 300 ;
		if(foodName == "Chicken 65") return foodPrice = 264 ;
		if(foodName == "Egg Biriyani") return foodPrice = 154 ;
		if(foodName == "Tandoori Roti") return foodPrice = 40 ;
		if(foodName == "Rumali Roti") return foodPrice = 40 ;
		if(foodName == "Chicken Garlic Kabab") return foodPrice = 243;
		if(foodName == "Veg Family Pack") return foodPrice = 383 ;
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
	public static int searchFoodOrder(String foodName,int quantity){
	
	    int foodPrice = 0 ;
		if(foodName == "Chicken Biriyani") return foodPrice = 150*quantity ;
		if(foodName == "Egg Rice") return foodPrice = 100*quantity ;
		if(foodName == "Kabab") return foodPrice = 100*quantity ;
		if(foodName == "Egg Burji") return foodPrice = 50*quantity ;
		if(foodName == "Amlet") return foodPrice = 10*quantity ;
		if(foodName == "Matan Biriyani") return foodPrice = 200*quantity ;
		if(foodName == "Kuska") return foodPrice = 60*quantity ;
		if(foodName == "Chilli Chicken") return foodPrice = 150*quantity ;
		if(foodName == "Chicken Lolipop") return foodPrice = 200*quantity ;
		if(foodName == "Chicken Tikka") return foodPrice = 180*quantity ;
		if(foodName == "Fish Masala") return foodPrice = 265*quantity ;
		if(foodName == "Garlic Chicken") return foodPrice = 240*quantity ;
		if(foodName == "Ginger Chicken") return foodPrice = 240*quantity ;
		if(foodName == "Tandoori Chicken") return foodPrice = 300*quantity ;
		if(foodName == "Grilli Chicken") return foodPrice = 300*quantity ;
		if(foodName == "Chicken 65") return foodPrice = 264*quantity ;
		if(foodName == "Egg Biriyani") return foodPrice = 154*quantity ;
		if(foodName == "Tandoori Roti") return foodPrice = 40*quantity ;
		if(foodName == "Rumali Roti") return foodPrice = 40*quantity ;
		if(foodName == "Chicken Garlic Kabab") return foodPrice = 243*quantity ;
		if(foodName == "Veg Family Pack") return foodPrice = 383*quantity ;
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
}