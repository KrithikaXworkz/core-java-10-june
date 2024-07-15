class SangeethaMobiles{

    public static double mobiles(String mobileBrand){
	    
        double mobilePrice = 0.0 ;
		if(mobileBrand == "Amazon"){
		    mobilePrice = 6000.66 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Apple"){
		    mobilePrice = 15000.99 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Lenovo"){
		    mobilePrice = 17000.6 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Motorola"){
		    mobilePrice = 15000.40 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Oppo"){
		    mobilePrice = 15000.99 ;
			return mobilePrice ;
		}
		if(mobileBrand == "OnePlus"){
		    mobilePrice = 30000.09 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Vivo"){
		    mobilePrice = 17500.99 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Vodafone"){
		    mobilePrice = 14000.50 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Samsung"){
		    mobilePrice = 40000.9 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Xiaomi"){
		    mobilePrice = 25000.7 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Realme"){
		    mobilePrice =  27500.60 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Honor"){
		    mobilePrice = 33000.89 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Micromax Informatics"){
		    mobilePrice =  34000.09 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Acer"){
		    mobilePrice = 16000.5 ;
			return mobilePrice ;
		}
		if(mobileBrand == "Casio"){
		    mobilePrice = 45000;
			return mobilePrice ;
		}
		else{
		    System.out.println(mobileBrand +" not found");
		}
		return mobilePrice ;
	}
	
}


