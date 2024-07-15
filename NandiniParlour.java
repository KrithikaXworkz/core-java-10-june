class NandiniParlour{
    
	public static int getProductPriceByName(String productName){
	
	    int productPrice = 0 ;
		if(productName == "Milk Peda") return productPrice = 150 ;
		if(productName == "Powdered Milk") return productPrice = 100 ;
		if(productName == "Lassi") return productPrice = 15 ;
		if(productName == "Badam Milk") return productPrice = 20 ;
		if(productName == "IceCreams") return productPrice = 40 ;
		if(productName == "Cookies") return productPrice = 25 ;
		if(productName == "Ghee") return productPrice = 180 ;
		if(productName == "Paneer") return productPrice = 200 ;
		if(productName == "Good Life Milk") return productPrice = 30 ;
		if(productName == "Curd") return productPrice = 35 ;
		else{
		    System.out.println(productName + " not found");
		}
		return productPrice ;
		
	}
	
	public static int getProductPriceByName(String productName, int quantity){
	
	    int productPrice = 0 ;
		if(productName == "Milk Peda") return productPrice = 150*quantity ;
		if(productName == "Powdered Milk") return productPrice = 100*quantity ;
		if(productName == "Lassi") return productPrice = 15*quantity ;
		if(productName == "Badam Milk") return productPrice = 20*quantity ;
		if(productName == "IceCreams") return productPrice = 40*quantity ;
		if(productName == "Cookies") return productPrice = 25*quantity ;
		if(productName == "Ghee") return productPrice = 180*quantity		;
		if(productName == "Paneer") return productPrice = 200*quantity ;
		if(productName == "Good Life Milk") return productPrice = 30*quantity ;
		if(productName == "Curd") return productPrice = 35*quantity ;
		else{
		    System.out.println(productName + " not found");
		}
		return productPrice ;
		
	}
	
	
}