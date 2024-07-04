class KeyBoard{

    public static void main(String[] hP){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "HP" ;
		int price = 629 ;
		String  compatibleDevices= "Laptop" ;
		String connectivityTechnology = "Wired" ;
		String keyboardDescription = "Wired" ;
		String recommenedUsesForProduct = "Office" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Compatible Devices is " + compatibleDevices);
		System.out.println("The Connectivity Technology is " + connectivityTechnology);
		System.out.println("The Keyboard Descriptions " + keyboardDescription);
		System.out.println("The Recommended Uses for Laptop is " + recommenedUsesForProduct);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}