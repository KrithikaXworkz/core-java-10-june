class SangeethaMobilesRunner{

    public static void main(String[] args){

        System.out.println("Main Started");
		String brandName = "Oppo" ;
		int quantity = 4 ;
		double price = SangeethaMobiles.mobiles(brandName);
		System.out.println("Mobile Brand is " + brandName);
		System.out.println("Quantity of the Mobile is " + quantity);
		System.out.println("The Price of Mobiles is :" + price*quantity);
		System.out.println("Main Ended");
		
	}
		
}