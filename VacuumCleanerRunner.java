class VacuumCleanerRunner{

    public static void main(String[] roboson){
	
	    System.out.println("Main Started");
		boolean connect = VacuumCleaner.onOrOff();
		System.out.println("is Vacuum Cleaner Connected :" + connect);
		
		/*VacuumCleaner.increaseTemp();
		VacuumCleaner.increaseTemp();
		VacuumCleaner.increaseTemp();
		VacuumCleaner.increaseTemp();
		VacuumCleaner.increaseTemp();
		VacuumCleaner.increaseTemp();
		
		VacuumCleaner.decreaseTemp();
		VacuumCleaner.decreaseTemp();
		VacuumCleaner.decreaseTemp();
		VacuumCleaner.decreaseTemp();*/
		
		boolean connected = VacuumCleaner.onOrOff();
		System.out.println("is Vacuum Cleaner Connected :" + connected);
		System.out.println("Main Ended");
	}
	
}