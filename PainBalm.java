class PainBalm{
    
	static String name = "Amrutanjan" ;
	static double price = 45.00 ;
	static int qtyInGms = 20 ;
	static String ingredients[] = {"Pudina","Gandhapura Patra Taila","ointment base Q.S","paraffin","wintergreen oil"}; 
	
	public static void main (String[] goodBalm){
	
	    System.out.println("Details of " + name +"are :");
		System.out.println("Price of " + name +" is "+ price);
		System.out.println("Quantity of " + name +" is "+ qtyInGms);
		System.out.println("List of the Ingredients for Amrutanjan is :");
		
		for(String ingredient : ingredients){
		    System.out.println(ingredient);
		}
		
		
	}
	




}