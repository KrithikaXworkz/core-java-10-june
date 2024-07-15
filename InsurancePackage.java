class InsurancePackage{

    public static double search(String insuranceName){
	         
			double insurancePrice = 0.0 ;

		if(insuranceName == "HDFC Life Insurance"){
		      insurancePrice = 8000.70 ;
			  return insurancePrice ;
		}
		if(insuranceName == "Max Life"){
			   insurancePrice = 9000.09 ;
			   return insurancePrice ;
		}
		if(insuranceName == "SBI Life Insurance"){
			   insurancePrice = 5000.80 ;
			   return insurancePrice ;
		}
		if(insuranceName == "Kotak Life Insurance"){
			    insurancePrice = 11000.90 ;
				return insurancePrice ;
		}
		if(insuranceName == "Star Union"){
			   insurancePrice = 25000.65 ;
			   return insurancePrice ;
		}
		if(insuranceName == "IDBI Federal"){
			   insurancePrice = 15000.60 ;
			   return insurancePrice ;
		}
		if(insuranceName == "Met Life Insurance"){
			   insurancePrice = 11000.90 ;
			   return insurancePrice ;
		}
		if(insuranceName == "Exide Life Insurance"){
			   insurancePrice = 22000.9 ;
			   return insurancePrice ;
		}
		if(insuranceName == "Bharathi Axa"){
			   insurancePrice = 12000.65 ;
			   return insurancePrice ;
		}
		if(insuranceName == "Birla Sunlife"){
		      insurancePrice = 5000.87 ;
			  return insurancePrice ;
		}
		if(insuranceName == "Shriram Life"){
			   insurancePrice = 8000.99 ;
			   return insurancePrice ;
		}
		if(insuranceName == "India First"){
			   insurancePrice = 7000.99;
			   return insurancePrice ;
		}
		if(insuranceName == "ICICI Life Insurance"){
			    insurancePrice = 6500.90 ;
				return insurancePrice ;
		}
		if(insuranceName == "Tata Life Insurance"){
			    insurancePrice = 7000.09 ;
				return insurancePrice ;
		}
		else{
	        System.out.println(insuranceName +" not found" );
		}
		return insurancePrice ;

    }

}
