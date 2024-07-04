class Camera{

    public static void main(String[] osmoAction){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		System.out.println("Camera Started");
		String brandName = "DJI" ;
	    int price = 31990 ;
	    String flashMemoryType = "SDXC, SDHC" ;
	    String color = "Black" ;
	    String specialFeature = "WaterProof" ;
	    String screenSize = "2.25 inches" ;
	    String videoCaptureFormat = "MP4" ;
	    String maximumAperture = "2.8f" ;
	    String maximumFocalLength = "24 millimeters" ;
	    String videoCaptureresolution = "4k" ;
	    String photoSensorTechnology = "CMOS" ;
		
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Flash Memory Type is " + flashMemoryType);
		System.out.println("The Color is " + color);
		System.out.println("The Special Feature is " + specialFeature);
		System.out.println("The Screen Size is " + screenSize);
		System.out.println("The Video Capture Format is " + videoCaptureFormat);
		System.out.println("The Maximum Aperture is " + maximumAperture);
		System.out.println("The Maximum Focal Length is " + maximumFocalLength);
		System.out.println("The Video Capture Resolution is " + videoCaptureresolution);
		System.out.println("The Photo Sensor Technology is " + photoSensorTechnology);
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}