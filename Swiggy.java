class Swiggy{

    public static int getFoodOrder(String foodName){
	
	    int foodPrice = 0 ;
		if(foodName == "Rice and Dal"){
		    foodPrice = 150 ;
			return foodPrice ;
		}
		if(foodName == "Chithrana"){
		    foodPrice = 50 ;
			return foodPrice ;
		}
		if(foodName == "Curd"){
		    foodPrice = 150 ;
			return foodPrice ;
		}
		if(foodName == "Puliyogare"){
		    foodPrice = 150 ;
			return foodPrice ;
		}
		if(foodName == "Rice Bhath"){
		    foodPrice = 100 ;
			return foodPrice ;
		}
		if(foodName == "Poori and Saagu"){
		    foodPrice = 60 ;
			return foodPrice ;
		}
		if(foodName == "Masala Dosa"){
		    foodPrice = 80 ;
			return foodPrice ;
		}
		if(foodName == "Set Dosa"){
		    foodPrice = 60 ;
			return foodPrice ;
		}
		if(foodName == "Kaali Dosa"){
		    foodPrice = 40 ;
			return foodPrice ;
		}
		if(foodName == "Upittu"){
		    foodPrice = 50 ;
			return foodPrice ;
		}
		if(foodName == "KesariBhath"){
		    foodPrice = 30 ;
			return foodPrice ;
		}
		if(foodName == "Idly"){
		    foodPrice = 60;
			return foodPrice ;
		}
		if(foodName == "Vada"){
		    foodPrice = 20 ;
			return foodPrice ;
		}
		if(foodName == "Chineese wok"){
		    foodPrice = 199 ;
			return foodPrice ;
		}
		if(foodName == "Wow Momo"){
		    foodPrice = 100 ;
			return foodPrice ;
		}
		if(foodName == "Barbiqueue Nation"){
		    foodPrice = 100 ;
			return foodPrice ;
		}
		if(foodName == "Subway"){
		    foodPrice = 100 ;
			return foodPrice ;
		}
		if(foodName == "Grameen Kulfi"){
		    foodPrice = 120 ;
			return foodPrice ;
		}
		if(foodName == "Mc Donalds"){
		    foodPrice = 200 ;
			return foodPrice ;
		}
		if(foodName == "Chowman"){
		    foodPrice = 75 ;
			return foodPrice ;
		}
		if(foodName == "Pailwan Pulao"){
		    foodPrice = 80 ;
			return foodPrice ;
		}
		else{
		    System.out.println(foodName + " not found ");
		}
		return foodPrice ;
		
	}
	
}