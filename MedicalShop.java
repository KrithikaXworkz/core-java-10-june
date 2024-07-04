class MedicalShop{

    public static void main(String[] medi){
	
	//Datatypes ref = value ;
	
	System.out.println("Main Started");
	String name = "Sri Venkateshwara Chemist & Drugist" ;
	String tablets[] = {"Dolowin Plus" , "Haloset" , "Okacel L" , "Imol Plus" , "Citrizens" , "Vixaction 500" ,"Capsules" , "Lisinopril" , "Albuterol" , "Metroprotol" };
	
	System.out.println("The Medical Shop Name is " + name);
	//System.out.println("Available Tablets/Medicines are :" + tablets[0] + "," + tablets[1] + "," + tablets[2] + "," + tablets[3] + "," + tablets[4] + "," + tablets[5] + "," + tablets[6] + "," +tablets[7] + "," + tablets[8] + "," + tablets[9] + ".");
	for(String tablet : tablets){
		System.out.println("tablet");
	}
	System.out.println("Main Ended");
	
	}
	
}
	
	