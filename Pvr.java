class Pvr{
    public static int getMoviePriceByName(String movieName){
	
	    int moviePrice = 0 ;
		if(movieName == "Yajamana") return moviePrice = 70 ;
		if(movieName == "Apthamithra") return moviePrice = 80;	
		if(movieName == "Upadhyaksha") return moviePrice = 75 ;
		if(movieName == "Chamak") return moviePrice = 90 ;
		if(movieName == "Mukunda Murari") return moviePrice = 50 ;
		if(movieName == "Triple Riding") return moviePrice = 150 ;
		if(movieName == "Simhadriya Simha") return moviePrice = 120;
		if(movieName == "Virappa Nayaka") return moviePrice = 120 ;
		if(movieName == "Kalasipalya") return moviePrice = 150 ;
		if(movieName == "Yajamana") return moviePrice = 70 ;
		if(movieName == "Veerappa Nayaka") return moviePrice = 100 ;
		if(movieName == "Vamsi") return moviePrice = 170 ;
		if(movieName == "Ninagoskara") return moviePrice = 90 ;
		if(movieName == "Majestic") return moviePrice = 100 ;
		if(movieName == "Kaatera") return moviePrice = 150 ;
		if(movieName == "Gange Baare Thunge Baare") return moviePrice = 85 ;
		if(movieName == "Aptharakshaka") return moviePrice = 100 ;
		if(movieName == "Rider") return moviePrice = 80 ;
		if(movieName == "Gaja") return moviePrice = 90 ;
		if(movieName == "Laali Haadu") return moviePrice = 100 ;
		else{
		    System.out.println(movieName + "not found");
		}
		return moviePrice ;
		
	}
	
	public static int getMoviePriceByName(String movieName, int quantity){
	
	    int moviePrice = 0 ;
		if(movieName == "Yajamana") return moviePrice = 70*quantity ;
		if(movieName == "Apthamithra") return moviePrice = 80*quantity ;	
		if(movieName == "Upadhyaksha") return moviePrice = 75*quantity ;
		if(movieName == "Chamak") return moviePrice = 90*quantity ;
		if(movieName == "Mukunda Murari") return moviePrice = 50*quantity ;
		if(movieName == "Triple Riding") return moviePrice = 150*quantity ;
		if(movieName == "Simhadriya Simha") return moviePrice = 120*quantity ;
		if(movieName == "Virappa Nayaka") return moviePrice = 120*quantity ;
		if(movieName == "Kalasipalya") return moviePrice = 150*quantity ;
		if(movieName == "Yajamana") return moviePrice = 70*quantity ;
		if(movieName == "Veerappa Nayaka") return moviePrice = 100*quantity ;
		if(movieName == "Vamsi") return moviePrice = 170*quantity ;
		if(movieName == "Ninagoskara") return moviePrice = 90*quantity ;
		if(movieName == "Majestic") return moviePrice = 100*quantity ;
		if(movieName == "Kaatera") return moviePrice = 150*quantity ;
		if(movieName == "Gange Baare Thunge Baare") return moviePrice = 85*quantity ;
		if(movieName == "Aptharakshaka") return moviePrice = 100*quantity ;
		if(movieName == "Rider") return moviePrice = 80*quantity ;
		if(movieName == "Gaja") return moviePrice = 90*quantity ;
		if(movieName == "Laali Haadu") return moviePrice = 100*quantity ;
		else{
		    System.out.println(movieName + "not found");
		}
		return moviePrice ;
		
	}
	
}