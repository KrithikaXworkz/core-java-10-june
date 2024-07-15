class InsurancePackage{

    public static double search(String insuranceName){
	         
			double insurancePrice = 0.0 ;

		if(insuranceName == "HDFC Life Insurance") return insurancePrice = 8000.70 ;
		if(insuranceName == "Max Life") return insurancePrice = 9000.09;
		if(insuranceName == "SBI Life Insurance") return insurancePrice =  5000.80 ;
		if(insuranceName == "Kotak Life Insurance") return insurancePrice = 11000.90;
		if(insuranceName == "Star Union") return insurancePrice = 25000.65 ;
		if(insuranceName == "IDBI Federal") return  insurancePrice = 15000.60 ;
		if(insuranceName == "Met Life Insurance") return insurancePrice = 11000.90 ;
		if(insuranceName == "Exide Life Insurance") return insurancePrice = 22000.9 ;
		if(insuranceName == "Bharathi Axa") return insurancePrice = 12000.65 ;
		if(insuranceName == "Birla Sunlife") return insurancePrice = 5000.87 ;
		if(insuranceName == "Shriram Life") return insurancePrice = 8000.99 ;
		if(insuranceName == "India First") return insurancePrice = 7000.99;
	    if(insuranceName == "ICICI Life Insurance") return insurancePrice = 6500.90 ;
	    if(insuranceName == "Tata Life Insurance")return insurancePrice = 7000.09 ;
		else{
	        System.out.println(insuranceName +" not found" );
		}
		return insurancePrice ;

    }
	
	public static double search(String insuranceName, int quantity){
		
		    double insurancePrice = 0.0 ;
			
	    if(insuranceName == "HDFC Life Insurance") return insurancePrice = 8000.70*quantity ;
		if(insuranceName == "Max Life") return insurancePrice = 9000.09*quantity ;
		if(insuranceName == "SBI Life Insurance") return insurancePrice =  5000.80*quantity ;
		if(insuranceName == "Kotak Life Insurance") return insurancePrice = 11000.90*quantity ;
		if(insuranceName == "Star Union") return insurancePrice = 25000.65*quantity ;
		if(insuranceName == "IDBI Federal") return  insurancePrice = 15000.60*quantity ;
		if(insuranceName == "Met Life Insurance") return insurancePrice = 11000.90*quantity ;
		if(insuranceName == "Exide Life Insurance") return insurancePrice = 22000.9*quantity ;
		if(insuranceName == "Bharathi Axa") return insurancePrice = 12000.65*quantity ;		
		if(insuranceName == "Birla Sunlife") return insurancePrice = 5000.87*quantity ;
		if(insuranceName == "Shriram Life") return insurancePrice = 8000.99*quantity ;
		if(insuranceName == "India First") return insurancePrice = 7000.99*quantity ;
	    if(insuranceName == "ICICI Life Insurance") return insurancePrice = 6500.90*quantity ;
	    if(insuranceName == "Tata Life Insurance")return insurancePrice = 7000.09*quantity ;
		else{
	        System.out.println(insuranceName +" not found" );
		}
		return insurancePrice ;

		
	}

}


