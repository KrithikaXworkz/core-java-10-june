class Speaker{
     
	static boolean isConnected = false ;

       //method declaration
        public static boolean onOrOff(){
			 
			System.out.println("start of onOrOff");
		
		    if(isConnected == false){
				isConnected = true ;
			}else if(isConnected == true){
				isConnected = false ;
			}
			
			System.out.println("end of onOrOff");
	    return isConnected;
	    }
		
}
	    
		/*public static void turnOff(){
			
			System.out.println("start of turnOff");
			
			if(isConnected == true){
				isConnected = false ;
				System.out.println("The Speaker is Turned off...");
			}
			    System.out.println("end of turnOff");
		return;
		}*/
