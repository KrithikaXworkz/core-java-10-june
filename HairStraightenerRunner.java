class HairStraightenerRunner{
      
    public static void main(String[] lizze){
	
	System.out.println("Main Started");
	boolean connect = HairStraightener.onOrOff();
	System.out.println("is Hair Straightener Connected :" + connect);
	
	/*HairStraightener.increaseTemp();
	HairStraightener.increaseTemp();
	HairStraightener.increaseTemp();
	HairStraightener.increaseTemp();
	HairStraightener.increaseTemp();
	HairStraightener.increaseTemp();
	HairStraightener.increaseTemp();
	
	HairStraightener.decreaseTemp();
	HairStraightener.decreaseTemp();
	HairStraightener.decreaseTemp();*/
	
	boolean connected = HairStraightener.onOrOff();
	System.out.println("is Hair Straightener Connected :" + connected);
	System.out.println("Main Ended");
	
	}
    
}