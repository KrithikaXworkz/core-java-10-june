class EarBudsRunner{

    public static void main(String[] boAt){
	
	    System.out.println("Main Started");
	    boolean connect = EarBuds.onOrOff();
		    System.out.println("is Ear Buds Connected :" + connect);
		        
			
			/*EarBuds.increaseVolume();
			EarBuds.increaseVolume();
			EarBuds.increaseVolume();
			EarBuds.increaseVolume();
			EarBuds.increaseVolume();
			EarBuds.increaseVolume();
			
			
			EarBuds.decreaseVolume();
			EarBuds.decreaseVolume();
			EarBuds.decreaseVolume();*/
	
			
			connect = EarBuds.onOrOff();
		    System.out.println("is Ear Buds Connected :" + connect);
		System.out.println("Main Ended");
		
	}
	
}