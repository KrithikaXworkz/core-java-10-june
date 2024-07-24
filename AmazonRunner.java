class AmazonRunner{

    public static void main(String[] products){
	
	    boolean productAdded = Amazon.createProductName("Refrigerator");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Washine Machine");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Clothes");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Air Conditioner");
		System.out.println("Product Name added " + productAdded);
		
	    productAdded = Amazon.createProductName("MicroOven");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Laptop");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Digital Television");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Mobile Phones");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Kitchen Appliances");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Iron Box");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Bags");
		System.out.println("Product Name added " + productAdded);
		
		Amazon.readProductDetails();
		
		
	
	}

}