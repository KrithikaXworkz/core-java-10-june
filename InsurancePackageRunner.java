class InsurancePackageRunner{

    public static void main(String[] args){
	     
		System.out.println("Main Started");
		String names = "Max Life" ;
		int quantity = 3 ;
	    double price = InsurancePackage.search(names);
		System.out.println("Insurance Name is " + names);
		System.out.println("Number of Quantity is " + quantity);
		System.out.println("The Price of Insurance is :" + quantity*price);
		System.out.println("Main Ended");
	}

}

