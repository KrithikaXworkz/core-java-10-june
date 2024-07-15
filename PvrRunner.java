class PvrRunner{

    public static void main(String[] args){
	
	System.out.println("Main Started");
	String movieName = "Kaatera" ;
	int quantity = 5 ;
	int price = Pvr.getMoviePriceByName(movieName);
	System.out.println("PVR movie Name is " + movieName);
	System.out.println("Number of Quantity is " + quantity);
	System.out.println("The Price of the Movie in the PVR is :" + price*quantity);
	System.out.println("Main Ended");
	
	}
	
}