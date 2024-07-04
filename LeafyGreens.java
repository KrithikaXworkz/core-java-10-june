class LeafyGreens{

    public static void main(String[] amarunthus){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "Fresh" ;
		int price = 34 ;
		String dietType = "Vegeterian" ;
		String itemForm = "Whole" ;
		String itemWeight = "250 Grams" ;
		int numberOfItems = 1 ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Diet Type is " + dietType);
		System.out.println("The Item Form is " + itemForm);
		System.out.println("The Item Weight is " + itemWeight);
		System.out.println("The Number of Items is " + numberOfItems);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}