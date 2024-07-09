class FridgeRunner{

    public static void main(String[] whirlPool){
	
	    System.out.println("Main Started");
		boolean connect = Fridge.onOrOff();
		    System.out.println("is Fridge Connected :" + connect);
		        connect = Fridge.onOrOff();
			System.out.println("is Fridge Connected :" + connect);
		System.out.println("Main ended");
	}
	
}