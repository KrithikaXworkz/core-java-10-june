class Swiggy{

    public static int getFoodOrder(String foodName){
	
	    int foodPrice = 0 ;
		if(foodName == "Rice and Dal") return foodPrice = 150 ;
		if(foodName == "Chithrana")return foodPrice = 50 ;
		if(foodName == "Curd") return foodPrice = 150 ;
		if(foodName == "Puliyogare") return foodPrice = 150 ;
		if(foodName == "Rice Bhath") return foodPrice = 100 ;
		if(foodName == "Poori and Saagu") return foodPrice = 60 ;
		if(foodName == "Masala Dosa") return foodPrice = 80 ;
		if(foodName == "Set Dosa") return foodPrice = 60 ;
		if(foodName == "Kaali Dosa") return foodPrice = 40 ;
		if(foodName == "Upittu") return foodPrice = 50 ;
		if(foodName == "KesariBhath") return foodPrice = 30 ;
		if(foodName == "Idly") return foodPrice = 60;
		if(foodName == "Vada") return foodPrice = 20 ;
		if(foodName == "Chineese wok") return foodPrice = 199 ;
		if(foodName == "Wow Momo") return foodPrice = 100 ;
		if(foodName == "Barbiqueue Nation") return foodPrice = 100 ;
		if(foodName == "Subway") return foodPrice = 100 ;
		if(foodName == "Grameen Kulfi") return foodPrice = 120 ;
		if(foodName == "Mc Donalds") return foodPrice = 200 ;
		if(foodName == "Chowman") return foodPrice = 75 ;
		if(foodName == "Pailwan Pulao") return foodPrice = 80 ;
			
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
}