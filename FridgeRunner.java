class FridgeRunner{

    public static void main(String[] whirlPool){
	
	    System.out.println("Main Started");
		boolean connect = Fridge.onOrOff();
		    System.out.println("is Fridge Connected  :"+ connect);
			
			Fridge.increaseTemp();
			Fridge.increaseTemp();
			Fridge.increaseTemp();
			Fridge.increaseTemp();
			Fridge.increaseTemp();
			Fridge.increaseTemp();
			
			Fridge.decreaseTemp();
			Fridge.decreaseTemp();
			Fridge.decreaseTemp();
			Fridge.decreaseTemp();
			
		        connect = Fridge.onOrOff();
			System.out.println("is Fridge Connected :" + connect);
		System.out.println("Main ended");
	}
	
}