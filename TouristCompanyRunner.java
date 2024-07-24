class TouristCompanyRunner{

    public static void main(String[] places){
	
	    boolean touristPlaceAdded = TouristCompany.addTouristPlaceName("Taj Mahal");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Mysore Palace");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Goa");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Gateway of India");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Charminar");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Ooty");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Varanasi");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Bengaluru Palace");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Udaipur");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Srinagar");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Sikkim");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		
		
		TouristCompany.readTouristPlacesDetails();
		
		
	
	}

}