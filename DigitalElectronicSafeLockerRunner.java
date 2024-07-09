class DigitalElectronicSafeLockerRunner{

    public static void main(String[] godrej){
	
	    System.out.println("Main Started");
		boolean connected = DigitalElectronicSafeLocker.onOrOff();
		System.out.println("is Digital Electronic Safe Locker Connected :" + connected);
		boolean connect = DigitalElectronicSafeLocker.onOrOff();
		System.out.println("is Digital Electronic Safe Locker Connected :" + connect);
		System.out.println("Main Ended");
		
	}
	
}