class BedSheet{

    public static void main(String[] bedSheet){
	    
		System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
	
	}
	
	public static void getFeatures(){
	
	    System.out.println("getFeatures method started");
		String size = "Queen" ;
        String material = "Polycotton" ;
        String color = "Peach" ;
        String pattern = "Striped" ;
        String brand = "Maple Linens" ;
        String specialFeature = "Breathable" ;
        String style = "stripe" ;
        String includedComponents = "1 Bedsheet and 2 Pillow Cover" ;
        String closureType = "Elastic" ;
        int threadCount = 350 ;
		int price = 709 ;
		
		System.out.println("The Size of the Bed Sheet is " + size);
		System.out.println("The Material of the BedSheet is " + material);
		System.out.println("The Color of the Bed Sheet is " +color);
		System.out.println("The Pattern of Bed Sheet is " + pattern);
		System.out.println("The Brand of Bed Sheet is " + brand);
		System.out.println("The Special Feature is " + specialFeature);
		System.out.println("The Style of Bed Sheet is " + style);
		System.out.println("The Included Components are " + includedComponents);
		System.out.println("The Closure Type is " + closureType);
		System.out.println("The Thread Count is " + threadCount);
		System.out.println("The Price of Bed Sheet is " + price);
		System.out.println("getFeatures method ended");
		return;
		
	}
	}