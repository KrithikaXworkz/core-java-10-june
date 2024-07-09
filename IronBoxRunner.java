class IronBoxRunner{

    public static void main(String[] bajaj){
	
	    System.out.println("Main Started");
	    boolean connect = IronBox.onOrOff();
		    System.out.println("is Iron Box Connected :" + connect);
		boolean connected = IronBox.onOrOff();
		    System.out.println("is Iron Box Connected :" +connected);
		System.out.println("Main Ended");
	}
		
}