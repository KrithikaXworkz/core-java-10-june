class RestaurantJobRegisteredRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    RestaurantJobRegistered.createRestaurantRegistrationForm("Mithun", "S", "Gowda", "Malavalli", "Mandya", "Karnataka", "mithun@gmail.com", 6360961244L, true, false, false);
		RestaurantJobRegistered.readRestaurantStaffDetails();
		System.out.println("Main Ended");
	
	}
}

