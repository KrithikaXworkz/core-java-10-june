class PvrRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String movieName = "Kaatera" ;
	int price = Pvr.getMoviePriceByName(movieName);
	System.out.println("PVR movie Name is " + movieName);
	System.out.println("The Price of the Movie in the PVR is :" + price);
	System.out.println("Main Ended");
	
	}
	
}