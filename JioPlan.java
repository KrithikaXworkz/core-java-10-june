class JioPlan{
     
	public static int rechargePlans(String plans){
	
	    int jioPlans = 0 ;
		if(plans == "28 days") return jioPlans = 329 ;
		if(plans == "84 days") return jioPlans = 889 ;
	    if(plans == "84 days") return jioPlans = 1299 ;
        if(plans == "365 days") return jioPlans = 3999 ;
		if(plans == "1 day") return jioPlans = 49 ;
		if(plans == "90 days") return jioPlans = 899 ;
		if(plans == "98 days") return jioPlans = 999 ;
		if(plans == "1 Month") return jioPlans = 319 ;
	    if(plans == "18 days") return jioPlans = 199 ;
		if(plans == "56 days") return jioPlans = 629 ;
		if(plans == "72 days") return jioPlans = 749 ;
		if(plans == "70 days") return jioPlans = 719 ;
		if(plans == "22 days") return jioPlans = 239 ;
		if(plans == "10 days") return jioPlans = 2499 ;
		if(plans == "21 days") return jioPlans = 2555 ;
		else{
		    System.out.println(jioPlans + " not found ");
		}
		return jioPlans ;
	}



}