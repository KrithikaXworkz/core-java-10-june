class NandiniParlour{
    
	public static int getProductPriceByName(String productName){
	
	    int productPrice = 0 ;
		if(productName == "Milk Peda"){
		   productPrice = 150 ;
		   return productPrice ;
		}
		if(productName == "Powdered Milk"){
		   productPrice = 100 ;
		   return productPrice ;
		}
		if(productName == "Lassi"){
		   productPrice = 15 ;
		   return productPrice ;
		}
		if(productName == "Badam Milk"){
		   productPrice = 20 ;
		   return productPrice ;
		}
		if(productName == "IceCreams"){
		   productPrice = 40 ;
		   return productPrice ;
		}
		if(productName == "Cookies"){
		   productPrice = 25 ;
		   return productPrice ;
		}
		if(productName == "Ghee"){
		   productPrice = 180 ;
		   return productPrice ;
		}
		if(productName == "Paneer"){
		   productPrice = 200 ;
		   return productPrice ;
		}
		if(productName == "Good Life Milk"){
		   productPrice = 30 ;
		   return productPrice ;
		}
		if(productName == "Curd"){
		   productPrice = 35 ;
		   return productPrice ;
		}
		else{
		    System.out.println(productName + " not found");
		}
		return productPrice ;
		
	}
	
}