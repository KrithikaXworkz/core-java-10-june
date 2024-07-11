class IronBoxRunner{

    public static void main(String[] bajaj){
	
	    System.out.println("Main Started");
	    boolean connect = IronBox.onOrOff();
		    System.out.println("is Iron Box Connected :" + connect);
			
			IronBox.increaseTemp();
			IronBox.increaseTemp();
			IronBox.increaseTemp();
			IronBox.increaseTemp();
			IronBox.increaseTemp();
			IronBox.increaseTemp();
			IronBox.increaseTemp();
			
			IronBox.decreaseTemp();
			IronBox.decreaseTemp();
			IronBox.decreaseTemp();
			IronBox.decreaseTemp();
			
		boolean connected = IronBox.onOrOff();
		    System.out.println("is Iron Box Connected :" +connected);
		System.out.println("Main Ended");
	}
		
}