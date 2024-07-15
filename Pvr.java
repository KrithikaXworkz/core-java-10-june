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
	
}