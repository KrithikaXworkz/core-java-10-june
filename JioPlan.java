class JioPlan{
     
	public static double rechargePlans(String plans){
	
	    double jioPlans = 0 ;
		if(plans == "28 days") return jioPlans = 329.00 ;
		if(plans == "84 days") return jioPlans = 889.00 ;
	    if(plans == "84 days") return jioPlans = 1299.00 ;
        if(plans == "365 days") return jioPlans = 3999.00 ;
		if(plans == "1 day") return jioPlans = 49.00 ;
		if(plans == "90 days") return jioPlans = 899.00 ;
		if(plans == "98 days") return jioPlans = 999.00 ;
		if(plans == "1 Month") return jioPlans = 319.00 ;
	    if(plans == "18 days") return jioPlans = 199.00 ;
		if(plans == "56 days") return jioPlans = 629.00 ;
		if(plans == "72 days") return jioPlans = 749.00 ;
		if(plans == "70 days") return jioPlans = 719.00 ;
		if(plans == "22 days") return jioPlans = 239.00 ;
		if(plans == "10 days") return jioPlans = 2499.00 ;
		if(plans == "21 days") return jioPlans = 2555.00 ;
		else{
		    System.out.println(jioPlans + " not found ");
		}
		return jioPlans ;
	}
	
	public static double rechargePlans(String plans, int noOfPack){
	
	    double jioPlans = 0 ;
		if(plans == "28 days") return jioPlans = 329*noOfPack ;
		if(plans == "84 days") return jioPlans = 889*noOfPack ;
	    if(plans == "84 days") return jioPlans = 1299*noOfPack ;
        if(plans == "365 days") return jioPlans = 3999*noOfPack ;
		if(plans == "1 day") return jioPlans = 49*noOfPack ;
		if(plans == "90 days") return jioPlans = 899*noOfPack ;
		if(plans == "98 days") return jioPlans = 999*noOfPack ;
		if(plans == "1 Month") return jioPlans = 319*noOfPack ;
	    if(plans == "18 days") return jioPlans = 199*noOfPack ;
		if(plans == "56 days") return jioPlans = 629*noOfPack ;
		if(plans == "72 days") return jioPlans = 749*noOfPack ;
		if(plans == "70 days") return jioPlans = 719*noOfPack ;
		if(plans == "22 days") return jioPlans = 239*noOfPack ;
		if(plans == "10 days") return jioPlans = 2499*noOfPack ;
		if(plans == "21 days") return jioPlans = 2555*noOfPack ;
		else{
		    System.out.println(jioPlans + " not found ");
		}
		return jioPlans ;
	}
	
	
	
}



