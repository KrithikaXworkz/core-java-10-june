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
		
		
	
	}

}