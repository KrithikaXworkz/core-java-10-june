class VacuumCleanerRunner{

    public static void main(String[] roboson){
	
	    System.out.println("Main Started");
		boolean connect = VacuumCleaner.onOrOff();
		System.out.println("is Vacuum Cleaner Connected :" + connect);
		boolean connected = VacuumCleaner.onOrOff();
		System.out.println("is Vacuum Cleaner Connected :" + connected);
		System.out.println("Main Ended");
	}
	
}