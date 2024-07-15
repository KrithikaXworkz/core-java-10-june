class SangeethaMobiles{

    public static double mobiles(String mobileBrand){
	    
        double mobilePrice = 0.0 ;
		if(mobileBrand == "Amazon") return mobilePrice = 6000.66 ;
		if(mobileBrand == "Apple") return mobilePrice = 15000.99 ;
		if(mobileBrand == "Lenovo") return mobilePrice = 17000.6 ;
		if(mobileBrand == "Motorola") return mobilePrice = 15000.40 ;
		if(mobileBrand == "Oppo") return mobilePrice = 15000.99 ;
		if(mobileBrand == "OnePlus") return mobilePrice = 30000.09 ;
		if(mobileBrand == "Vivo") return mobilePrice = 17500.99 ;
	    if(mobileBrand == "Vodafone") return mobilePrice = 14000.50 ;
	    if(mobileBrand == "Samsung") return mobilePrice = 40000.9 ;
	    if(mobileBrand == "Xiaomi") return mobilePrice = 25000.7 ;
		if(mobileBrand == "Realme") return mobilePrice =  27500.60 ;
		if(mobileBrand == "Honor") return mobilePrice = 33000.89 ;
		if(mobileBrand == "Micromax Informatics") return mobilePrice =  34000.09 ;
		if(mobileBrand == "Acer") return mobilePrice = 16000.5 ;
		if(mobileBrand == "Casio") return mobilePrice = 45000;
			
		else{
		    System.out.println(mobileBrand +" not found");
		}
		return mobilePrice ;
	}
	
	public static double mobiles(String mobileBrand, int quantity){
	    
        double mobilePrice = 0.0 ;
		if(mobileBrand == "Amazon") return mobilePrice = 6000.66*quantity ;
		if(mobileBrand == "Apple") return mobilePrice = 15000.99*quantity ;
		if(mobileBrand == "Lenovo") return mobilePrice = 17000.6*quantity ;
		if(mobileBrand == "Motorola") return mobilePrice = 15000.40*quantity ;
		if(mobileBrand == "Oppo") return mobilePrice = 15000.99*quantity ;
		if(mobileBrand == "OnePlus") return mobilePrice = 30000.09*quantity ;
		if(mobileBrand == "Vivo") return mobilePrice = 17500.99*quantity ;
	    if(mobileBrand == "Vodafone") return mobilePrice = 14000.50*quantity ;
	    if(mobileBrand == "Samsung") return mobilePrice = 40000.9*quantity ;
	    if(mobileBrand == "Xiaomi") return mobilePrice = 25000.7*quantity ;
		if(mobileBrand == "Realme") return mobilePrice =  27500.60*quantity ;
		if(mobileBrand == "Honor") return mobilePrice = 33000.89*quantity ;
		if(mobileBrand == "Micromax Informatics") return mobilePrice = 34000.09 * quantity ;
		if(mobileBrand == "Acer") return mobilePrice = 16000.5*quantity ;
		if(mobileBrand == "Casio") return mobilePrice = 45000*quantity ;
			
		else{
		    System.out.println(mobileBrand +" not found");
		}
		return mobilePrice ;
	}
	
}


