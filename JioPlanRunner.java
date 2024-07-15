class JioPlanRunner{
    
	public static void main(String[] args){
	
	    System.out.println("Main Started");
		String plans = "365 days" ;
		int quantity = 2 ;
		double price = JioPlan.rechargePlans(plans);
		double noOfPack = JioPlan.rechargePlans(plans);
		System.out.println("Jio Plan is " + plans);
		System.out.println("No of Pack is " + quantity);
		System.out.println("The Price of the Jio Plans is :" + price*quantity);
		System.out.println("Main Ended");
	
	
	}
	
}