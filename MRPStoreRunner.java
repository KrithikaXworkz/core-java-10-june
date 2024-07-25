class MRPStoreRunner{

    public static void main(String[] alcohols){
	
	    boolean alcoholsAdded = MRPStore.addAlcoholName("Brandy");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Gin");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Rum");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Whiskey");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Beer");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Port Wine");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Cider");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("EverClear");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Kingfisher");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Marsala");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Liqueurs");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		
		MRPStore.readAlcoholDetails();
		
		boolean alcoholNamesUpdate = MRPStore.updatealcoholNames("OldMonk" , "Gin");
		System.out.println("Alcohol Name is updated" + alcoholNamesUpdate);
		
		MRPStore.readAlcoholDetails();
		
		boolean alcoholNamesDelete = MRPStore.deletealcoholNames("Campari");
		System.out.println("Alcohol Name is Deleted" +alcoholNamesDelete);
		
		MRPStore.readAlcoholDetails();
		
		/*boolean alcoholNameUpdated = MRPStore.updateAlcoholName("soda","Kingfisher");
		System.out.println("alcoholNameUpdated" + alcoholNameUpdated);
		
		MRPStore.readAlcoholDetails();
		
		boolean alcoholNameDeleted = MRPStore.deleteAlcoholName("Whiskey");
		System.out.println("alcoholNameDeleted" + alcoholNameDeleted);
		
		MRPStore.readAlcoholDetails();*/
		
		
		
		
	
	}

}