class XworkzRegistrationRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    boolean xWorkzRegistered = XworkzRegistration.createXworkzRegistration("Kruthika", 9964285658L, "kruthika123@gmail.com", "4CA20CS023", 2024, "CIT", "Computer Science and Engineering", "BE");
		
		if(xWorkzRegistered  == true)
		XworkzRegistration.readXworkzRegistrationDetails();
		System.out.println("Main Ended");
	
	}
}

