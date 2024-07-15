class JioPlanRunner{
    
	public static void main(String[] args){
	
	    System.out.println("Main Started");
		String plans = "365 days" ;
		int price = JioPlan.rechargePlans(plans);
		System.out.println("Jio Plan is " + plans);
		System.out.println("The Price of the Jio Plans is :" + price);
		System.out.println("Main Ended");
	
	
	}
	
}