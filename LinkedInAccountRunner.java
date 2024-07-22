class LinkedInAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean LinkedInAccountCreated = LinkedInAccount.createLinkedInAccount("Krithka" , "B S" , "Mandya" , "Bangalore" , 6362393876L , "krithika@gmail.com" , "17-dec-2002" , "BE" , "VTU" , "Playing Volleyboll" , "kruthi@2002" , "kruthi@2002");
			
			if(LinkedInAccountCreated ==true)
			LinkedInAccount.readUserLinkedInAccountDetails();
		System.out.println("Main Ended");
	}
}