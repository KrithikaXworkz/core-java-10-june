class Swiggy{
    public static void main(String[] swig){
	    String nonVegStarters[] = {"Chicken Pepper Dry","Kabab","Chicken Tikka","Chicken Biriyani","Chicken Pepper Fry","Butter Chicken","Mutton Biriyani","Dum Biriyani","Chicken Pyaza","Chicken Hyderabadi"};
		String vegStarters[] = {"Dosa","Idly","Vada","Puliyogare","Chithrana","Kesaribaath","Veg Biriyani","Palav","Poori","Chapathi"};
		String nonVegMainCourses[] = {"Chicken Curry","Mutton Grevi","Mutton Kurma","Mutton Masala","Mutton Curry","Mutton Kurma","Chicken Kurma","Chicken Patiyala","Chicken Kollhapuri","Chicken Kadal"};
		String vegMainCourses[] ={"Cauliflower Curry","Veg Curry","Red Lentil","Gobi Masala","Aloo Chana","Tikka Masala Sauce","Mughlai Shahi Panneer","Paneer Masala","Paneer Bhurji","Okra Curry"};
		
		System.out.println("Main Started");
		//System.out.println("List of Non Veg Starter are :" + nonVegStarters[0] + " ," + nonVegStarters[1] + " ," + nonVegStarters[2] + " ," + nonVegStarters[3] + " ," + nonVegStarters[4] + " ," + nonVegStarters[5] + " ," + nonVegStarters[6] + " ," + nonVegStarters[7] + " ," + nonVegStarters[8] + " ," + nonVegStarters[9] + " .");
		for(String nonVegStarter : nonVegStarters){
			System.out.println(nonVegStarter);
		}
		//System.out.println("List of Veg Starter are :" + vegStarters[0] + " ," + vegStarters[1] + " ," + vegStarters[2] + " ," + vegStarters[3] + " ," + vegStarters[4] + " ," + vegStarters[5] + " ," + vegStarters[6] + " ," + vegStarters[7] + " ," + vegStarters[8] + " ," + vegStarters[9] + " .");
		for(String vegStarter : vegStarters){
			System.out.println(vegStarter);
		}
		//System.out.println("List of Non Veg Main Course are :" + nonVegMainCourses[0] + " ," + nonVegMainCourses[1] + " ," + nonVegMainCourses[2] + " ," + nonVegMainCourses[3] + " ," + nonVegMainCourses[4] + " ," + nonVegMainCourses[5] + " ," + nonVegMainCourses[6] + " ," + nonVegMainCourses[7] + " ," + nonVegMainCourses[8] + " ," + nonVegMainCourses[9] + " .");
		for(String nonVegMainCourse : nonVegMainCourses){
			System.out.println(nonVegMainCourse);
		}
		//System.out.println("List of Veg Main Course are :" + vegMainCourses0] + " ," + vegMainCourses[1] + " ," + vegMainCourses[2] + " ," + vegMainCourses[3] + " ," + vegMainCourses[4] + " ," + vegMainCourses[5] + " ," + vegMainCourses[6] + " ," + vegMainCourses[7] + " ," + vegMainCourses[8] + " ," + vegMainCourses[9] + " .");
		for(String vegMainCourse : vegMainCourses){
			System.out.println(vegMainCourse);
		}
		System.out.println("Main Ended");
	}
	
}