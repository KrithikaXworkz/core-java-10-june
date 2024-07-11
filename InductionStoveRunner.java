class InductionStoveRunner{

    public static void main(String[] pigeon){
	
	    System.out.println("Main Started");
		boolean connect = InductionStove.onOrOff();
		    System.out.println("is Induction Stove Connected :" + connect);
			
			/*InductionStove.increaseTemp();
			InductionStove.increaseTemp();
			InductionStove.increaseTemp();
			InductionStove.increaseTemp();
			InductionStove.increaseTemp();
			InductionStove.increaseTemp();
			InductionStove.increaseTemp();
			
			InductionStove.decreaseTemp();
			InductionStove.decreaseTemp();
			InductionStove.decreaseTemp();
			InductionStove.decreaseTemp();
			InductionStove.decreaseTemp();
			InductionStove.decreaseTemp();
			InductionStove.decreaseTemp();*/
			
		     connect = InductionStove.onOrOff();
		    System.out.println("is Induction Stove Connected :" + connect);
		System.out.println("Main Ended");
		
	}
	
}