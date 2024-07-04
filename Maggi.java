class Maggi{

    static String name = "Maggi" ;
	static int price = 14 ;
	static int qtyInGms = 15 ;
	static String countryOfOrigin = "India" ;
	static String shelfLife = "8 Months" ;
	static String ingredients[] = {"Refined wheat flour","Palm oil","Iodised salt","Wheat gluten","Thickeners","Acidity Regulators","Humectant","Palm Fat And Olein","Tapioca Starch","Mineral","Sugar","Chilli","Maltodextrin","Garlic","Coriander","Spices","Onion","Cumin"};
	
	public static void main(String[] tasty){
	
	System.out.println("Main Started");
	System.out.println("The Name of the Product is " + name);
	System.out.println("The Price of MAggi are " + price);
	System.out.println("Quantity of " + qtyInGms);
	System.out.println("The Country of Origin is " + countryOfOrigin);
	System.out.println("The Shelf Life is " + shelfLife);
	System.out.println("List of Maggi Ingredients are :");
	                     
						                               //index++
	for(int index = 0 ; index < ingredients.length ; index = index + 1){
	      System.out.println(ingredients[index]);	
	}
	System.out.println("Main Ended");
	
}

}