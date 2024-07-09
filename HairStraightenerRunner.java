class HairStraightenerRunner{

    public static void main(String[] lizze){
	
	System.out.println("Main Started");
	boolean connect = HairStraightener.onOrOff();
	System.out.println("is Hair Straightener Connected :" + connect);
	boolean connected = HairStraightener.onOrOff();
	System.out.println("is Hair Straightener Connected :" + connected);
	System.out.println("Main Ended");
	
	}
	
}