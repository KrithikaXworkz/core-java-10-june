class InsurancePackageRunner{

    public static void main(String[] args){
	     
		System.out.println("Main Started");
		String names = "HDFC Life Insurance" ;
	    double price = InsurancePackage.search(names);
		System.out.println("Insurance Name is " + names);
		System.out.println("The Price of Insurance is :" + price);
		System.out.println("Main Ended");
	}

}