class InductionStoveRunner{

    public static void main(String[] pigeon){
	
	    System.out.println("Main Started");
		boolean connect = InductionStove.onOrOff();
		    System.out.println("is Induction Stove Connected :" + connect);
		boolean connected = InductionStove.onOrOff();
		    System.out.println("is Induction Stove Connected :" + connected);
		System.out.println("Main Ended");
		
	}
	
}