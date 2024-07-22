class CanaraBankAccountCreatedRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    boolean canaraBankAccountCreated = CanaraBankAccountCreated.createBankAccount("Shashi", "Kumar", 342145326578L, "Indian", 7763706209L, "Mandya");
		
		if(canaraBankAccountCreated == true)
		CanaraBankAccountCreated.readBankAccountDetails();
		System.out.println("Main Ended");
	
	}
}

