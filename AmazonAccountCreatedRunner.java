class AmazonAccountCreatedRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
		boolean amazonAccountCreated = AmazonAccountCreated.createUserAccount("Kruthika", "Kruthi", 8796751870L, "kruthika@gmail.com", "kru@1234", "kru@1234");
		
		if(amazonAccountCreated == true)
		AmazonAccountCreated.readUserAccountDetails();
		System.out.println("Main Ended");
	
	}
}


