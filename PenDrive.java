class PenDrive{

    public static void main(String[] sanDisk){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "SanDisk" ;
		int price = 2099 ;
		String memoryStorageCapacity = "256 GB" ;
		String hardwareInterface = "USB 3.2 Gen 1" ;
		String specialFeature = "Dual USB Connector" ;
		String readSpeed = "400 Megabytes Per Second" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Memory Storage Capacity is " + memoryStorageCapacity);
		System.out.println("The Hardware Interface is " + hardwareInterface);
		System.out.println("The Special Feature is " + specialFeature);
		System.out.println("The Read Speed is " + readSpeed);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}