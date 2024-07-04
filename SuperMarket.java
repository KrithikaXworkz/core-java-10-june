class SuperMarket{

    //Arrays Declaration and Initialization
	static String groceries[] = {"Rice","Wheat","Ragi","Urad Dal","Maize","Millet","Barley","Oats","Rye","Spelt","Emmer","Triticale","Sorghum","Corn","Cereals"};
	static String vegetables[] = {"Carrot","Potato","Ladies Finger","Beans","Raddish","Beetroot","Turnip","Cabbage","Broadbeans","Brussels sprout","Capsicum","Green Peas","Cluster Beans","Ginger","Cucumber"};
	static String perfumes[] = {"Rose","Jasemine","Extrait de Parfum","Fogg","Chanel Coco Noir Eau de","Aramis","Azzaro","Acqua di Parma","Burberry","Byredo","Dior","Jimmy Choo","Clinique","Designer Perfumes","Chloe"};
	static String fruits[] = {"Apple","Banana","Mango","Orange","Pomogranate","Chicko","Grapes","Strawberries","Pineapple","Watermelon","Papaya","Kiwi","Olive","Currant","Tangerine"};
	static String chocolates[] = {"Dairy Milk","Milkybar","Kitkat","Perk","Munch","Eclairs","Kinderjoy","Mars Bar","Snickers","Cadbury 5 star","Cadbury Bournville","Kaccha Mango","King","Amul Chocolate","Ferrero Rocher"};
	static String snacks[] = {"Samosa","Calcutta Chop","Bhel","Momo","Vada Pav","Chips","Popcorn","Pita and hummus","Cottage Cheese","Crackers and Cheese","Bingo","Cheetos","Pakora","Cheese Puffs","Rice Cakes"};
	static String alcohols[] = {"Vodka","Gin","Baijiu","Shochu","Soju","Tequila","Rum","Whisky","Brandy","Singani","Cider","Beer","Wine","Liqueurs","Sake"};
	static String biscuits[] = {"Oreo","Bornborn","Treat","Hide&Seek","ParleG","Goodday","Dark Fantasy","Sunfeast Marigold","Googly","Monaco","Krack Jack","Anmol","Patanjali","PriyaGold","Tiffany"};
	static String footWears[] = {"Flip-flops","Crocs","Jika-tabi","Sandals","Clogs","Moccasins","Slippers","Riding boots","SnowBoots","Cleats","Sneakers","Barefoot Shoes","Geta","High heels","Leathr Shoe"};
	static String cosmetics[] = {"Face Cream","Primer","Nail Polish","Lip Pencil","Face Powder","Lotion","Mascara","Eye Shadow","Toner","Sponge","Foundation","Bronzer","Moisturiser","Cleanser","Makeup kit"};
	static String sweets[] = {"Mysorepaak","Jalebi","Gulab Jamun","Rasmalai","Champakali","Peda","Barfi","Ghee Laddus","Soan Papdi","Bombay Halwa","Rasgulla","Kheer","Milk Kova","Pudding","Carrot Halwa"};
	static String coolDrinks[] = {"Coca-Cola","Pepsi","Thums up","Sprite","Fanta","Mirinda","Mountain Dew","Appy Fizz","Limca","Bovonta","Mazza","7up","Minute maid","Slice","Red bull"}; 
	static String iceCreams[] = {"Cone","Cup Ice","Chocobar","Family pack","Kulfi","Gelato","Amul","Byakuya","Starbucks","Nugget ice","Creambell","Nirula's","Cream bell","Mother Diary","Giani'sIce Cream"};
	
	public static void main(String[] dMart){
	  //method execute statements[SOP]
	System.out.println("Main Started");
	System.out.println("Welcome to Reliance ");
	System.out.println("--------------------------");
	//System.out.println("List of Groceries are :" + groceries[0] + "," + groceries[1] + "," +groceries[2] + "," + groceries[4] + "," + groceries[5] + "," + groceries[6] + "," + groceries[7] + "," + groceries[8] + "," + groceries[9] + "," + groceries[10] + "," + groceries[11] + "," + groceries[12] + "," + groceries[13] + "," + groceries[14] + "."); 
	for(String grocery : groceries){
		System.out.println(grocery);
	}
	//System.out.println("List of Vegetables are :" + vegetables[0] + "," + vegetables[1] + "," + vegetables[2] + "," + vegetables[3] + "," + vegetables[4] + "," + vegetables[5] + "," + vegetables[6] + "," + vegetables[7] + "," + vegetables[8] + "," +vegetables[9] + "," + vegetables[10] + "," +vegetables[11] + "," + vegetables[12] + "," + vegetables[13] + "," + vegetables[14] + ".");
	for(String vegetable : vegetables){
		System.out.println(vegetable);
	}
	//System.out.println("List of Perfumes are :" + perfumes[0] + "," + perfumes[1] + "," + perfumes[2] + "," + perfumes[3] + "," + perfumes[4] + "," + perfumes[5] + "," + perfumes[6] + "," + perfumes[7] + "," + perfumes[8] + "," + perfumes[9] + "," + perfumes[10] + "," + perfumes[11] + "," + perfumes[12] + "," + perfumes[13] + "," + perfumes[14] + ".");
	for(String perfume : perfumes){
		System.out.println(perfume);
	}
    //System.out.println("List of Fruits are :" + fruits[0] + "," + fruits[1] + "," + fruits[2] + "," + fruits[3] + "," + fruits[4] + "," + fruits[5] + "," + fruits[6] + "," + fruits[7] + "," + fruits[8] + "," + fruits[9] + "," + fruits[10] + "," + fruits[11] + "," + fruits[12] + "," + fruits[13] + "," + fruits[14] + ".");
	for(String fruit : fruits){
		System.out.println(fruit);
	}
	//System.out.println("List of Chocolates are :" + chocolates[0] + "," + chocolates[1] + "," + chocolates[2] + "," + chocolates[3] + "," + chocolates[4] + "," + chocolates[5] + "," + chocolates[6] + "," + chocolates[7] + "," + chocolates[8] + "," + chocolates[9] + "," + chocolates[10] + "," + chocolates[11] + "," + chocolates[12] + "," + chocolates[13] + "," + chocolates[14] + ".");
	for(String chocolate : chocolates){
		System.out.println(chocolate);
	}
	//System.out.println("List of snacks are :" + snacks[0] + "," + snacks[1] + "," + snacks[2] + "," + snacks[3] + "," + snacks[4] + "," + snacks[5] + "," + snacks[6] + "," + snacks[7] + "," + snacks[8] + "," + snacks[9] + "," + snacks[10] + "," + snacks[11] + "," + snacks[12] + "," + snacks[13] + "," + snacks[14] + ".");
	for(String snack : snacks){
		System.out.println(snack);
	}
	//System.out.println("List of Alcohols are :" + alcohols[0] + "," + alcohols[1] + "," + alcohols[2] + "," + alcohols[3] + "," + alcohols[4] + "," + alcohols[5] + "," + alcohols[6] + "," + alcohols[7] + "," + alcohols[8] + "," + alcohols[9] + "," + alcohols[10] + "," + alcohols[11] + "," + alcohols[12] + "," + alcohols[13] + "," + alcohols[14] + ".");
	for(String alcohol : alcohols){
		System.out.println(alcohol);
	}
	//System.out.println("List of Biscuits are :" + biscuits[0] + "," + biscuits[1] + "," + biscuits[2] + "," + biscuits[3] + "," + biscuits[4] + "," + biscuits[5] + "," + biscuits[6] + "," + biscuits[7] + "," + biscuits[8] + "," + biscuits[9] + "," + biscuits[10] + "," + biscuits[11] + "," + biscuits[12] + "," + biscuits[13] + "," + biscuits[14] + ".");
	for(String biscuit : biscuits){
		System.out.println(biscuit);
	}
	//System.out.println("List of Footwears are :" + footWears[0] + "," + footWears[1] + "," + footWears[2] + "," + footWears[3] + "," + footWears[4] + "," + footWears[5] + "," + footWears[6] + "," + footWears[7] + "," + footWears[8] + "," + footWears[9] + "," + footWears[10] + "," + footWears[11] + "," + footWears[12] + "," + footWears[13] + "," + footWears[14] + ".");
	for(String footWear : footWears){
		System.out.println(footWear);
	}
	//System.out.println("List of Cosmetics are :" + cosmetics[0] + "," + cosmetics[1] + "," + cosmetics[2] + "," + cosmetics[3] + "," + cosmetics[4] + "," + cosmetics[5] + "," + cosmetics[6] + "," + cosmetics[7] + "," + cosmetics[8] + "," + cosmetics[9] + "," + cosmetics[10] + "," + cosmetics[11] + "," + cosmetics[12] + "," + cosmetics[13] + "," + cosmetics[14] + ".");
	for(String cosmetic : cosmetics){
		System.out.println(cosmetic);
	}
	//System.out.println("List of Sweets are :" + sweets[0] + "," + sweets[1] + "," + sweets[2] + "," + sweets[3] + "," + sweets[4] + "," + sweets[5] + "," + sweets[6] + "," + sweets[7] + "," + sweets[8] + "," + sweets[9] + "," + sweets[10] + "," + sweets[11] + "," + sweets[12] + "," + sweets[13] + "," + sweets[14] + ".");
	for(String sweet : sweets){
		System.out.println(sweet);
	}
	//System.out.println("List of Cool Drinks are :" + coolDrinks[0] + "," + coolDrinks[1] + "," + coolDrinks[2] + "," + coolDrinks[3] + "," + coolDrinks[4] + "," + coolDrinks[5] + "," + coolDrinks[6] + "," + coolDrinks[7] + "," + coolDrinks[8] + "," + coolDrinks[9] + "," + coolDrinks[10] + "," + coolDrinks[11] + "," + coolDrinks[12] + "," + coolDrinks[13] + "," + coolDrinks[14] + ".");
	for(String coolDrink :coolDrinks){
		System.out.println(coolDrink);
	}
	//System.out.println("List of Ice Creams are :" + iceCreams[0] + "," + iceCreams[1] + "," + iceCreams[2] + "," + iceCreams[3] + "," + iceCreams[4] + "," + iceCreams[5] + "," + iceCreams[6] + "," + iceCreams[7] + "," + iceCreams[8] + "," + iceCreams[9] + "," + iceCreams[10] + "," + iceCreams[11] + "," + iceCreams[12] + "," + iceCreams[13] + "," + iceCreams[14] + ".");
	for(String iceCream : iceCreams){
		System.out.println(iceCream);
	}
	
	}
	
}

	