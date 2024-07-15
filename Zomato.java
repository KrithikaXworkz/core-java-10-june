class Zomato{

    public static int getFoodName(String foodName){
	
	    int foodPrice = 0 ;
		if(foodName == "Donne Biriyani") return foodPrice = 300 ;
		if(foodName == "Biriyani Blues") return foodPrice = 300 ;
		if(foodName == "Chicken Manchuri") return foodPrice = 260 ;
		if(foodName == "Ginger Chicken Gravy ") return foodPrice = 260 ;
		if(foodName == "Mutton Chops ") return foodPrice = 380 ;
		if(foodName == "Mutton Pepper Dry ") return foodPrice = 480 ;
		if(foodName == "Brain Dry Single") return foodPrice = 240 ;
		if(foodName == "Brain Masala") return foodPrice = 220 ;
		if(foodName == "Sukki Pal") return foodPrice = 380 ;
		if(foodName == "Panipuri") return foodPrice = 100 ;
		if(foodName == "Masalpuri") return foodPrice = 100 ;
		if(foodName == "Gobbi") return foodPrice = 80;
		if(foodName == "Gobbi Noodles") return foodPrice = 150 ;
		if(foodName == "Mashroom Manchuri") return foodPrice = 150 ;
		if(foodName == "Mushroom Masala") return foodPrice = 300 ;
		if(foodName == "Panner Thikka") return foodPrice = 260 ;
		if(foodName == "Chicken Kadai") return foodPrice = 290 ;
		if(foodName == "Chicken Taj Korma") return foodPrice = 300 ;
		if(foodName == "Chicken Hyderabadi") return foodPrice = 320 ;
		if(foodName == "Kerala Parota") return foodPrice = 60;
		if(foodName == "Butter Naan") return foodPrice = 60 ;
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
}