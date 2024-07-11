class Laptop{

	static boolean isDisplayOn = false ;
	//static int maxZoom = 5;
	//static int minZoom = 0;
	//static int currentZoom;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of onOrOff method");
		
		isDisplayOn = (isDisplayOn == true) ? false : true ;
		
		/*if(!isDisplayOn)	isDisplayOn = true;
		else	isDisplayOn = false;*/
		
		System.out.println("End of onOrOff method");
	return isDisplayOn;
	}
	
	   //nested-if Condition
	/*public static void increaseZoom(){
		System.out.println("Start of increase Zoom method");
	
			if(isDisplayOn == true){
				if(currentZoom < maxZoom){
					currentZoom = currentZoom + 1;
					System.out.println("Current Zoom is "+ currentZoom);
				}else System.out.println("Maximum Zoom reached");
			}else System.out.println("Turn on the Laptop");
             System.out.println("End of increase zoom method");
	return;
	}
	
	   //nested-if Condition
	public static void decreaseZoom(){
		System.out.println("Start of decrease Zoom method");
			if(isDisplayOn == true){
				if(currentZoom > minZoom){
					currentZoom = currentZoom - 1;
					System.out.println("Current zoom is "+ currentZoom);
				}else System.out.println("Minimum zoom reached");
			}else System.out.println("Turn on the Laptop ");
		System.out.println("End of decrease zoom method");
	return;
	}*/
}