class Addition{
    
	public static void main(String[] adding){
	        System.out.println("Main Started");
            add(687, 89);
            add(45, 112);
			//invoking a add method by passing 2 arguments
			//add();
			System.out.println("Main Ended");
			
    }
	
	//methods declaration
	public static void add(int num1, int num2){
		System.out.println("add method started");
	    System.out.println(num1+num2);
		System.out.println("add method ended");
        return;
    }

}

