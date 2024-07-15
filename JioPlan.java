class JioPlan{
     
	public static int rechargePlans(String plans){
	
	    int jioPlans = 0 ;
		if(plans == "28 days"){
		    jioPlans = 329 ;
			return jioPlans ; 
		}
		if(plans == "84 days"){
		    jioPlans = 889 ;
			return jioPlans ;
		}
		if(plans == "84 days"){
		    jioPlans = 1299 ;
			return jioPlans ;
		}
		if(plans == "365 days"){
		    jioPlans = 3999 ;
			return jioPlans ;
		}
	    if(plans == "1 day"){
		    jioPlans = 49 ;
			return jioPlans ;
		}
		if(plans == "90 days"){
		    jioPlans = 899 ;
			return jioPlans ;
		}
		if(plans == "98 days"){
		    jioPlans = 999 ;
			return jioPlans ;
		}
		if(plans == "1 Month"){
		    jioPlans = 319 ;
			return jioPlans ;
		}
		if(plans == "18 days"){
		    jioPlans = 199 ;
			return jioPlans ;
		}
		if(plans == "56 days"){
		    jioPlans = 629 ;
			return jioPlans ;
		}
		if(plans == "72 days"){
		    jioPlans = 749 ;
			return jioPlans ;
		}
		if(plans == "70 days"){
		   jioPlans = 719 ;
		   return jioPlans ;
		}
		if(plans == "22 days"){
		   jioPlans = 239 ;
		   return jioPlans ;
		}
		if(plans == "10 days"){
		   jioPlans = 2499 ;
		   return jioPlans ;
		}
		if(plans == "21 days"){
		   jioPlans = 2555 ;
		   return jioPlans ;
		}
		else{
		    System.out.println(jioPlans + " not found ");
		}
		return jioPlans ;
	}



}