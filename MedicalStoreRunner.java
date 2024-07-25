class MedicalStoreRunner{

    public static void main(String[] medicines){
	
	    boolean medicinesAdded = MedicalStore.addMedicineName("Levothyroxine");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Metformin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Albuterol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Lisinopril");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Cephalexin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Metoprolol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Atorvastatin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Losarton");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Omeprazol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Citalopram");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Atorvastatin");
		System.out.println("Medicines added " + medicinesAdded);
		
		
		
		MedicalStore.readMedicineDetails();
		
		boolean medicineNameUpdated = MedicalStore.updateMedicineName("Dolo","Omeprazol");
		System.out.println("medicineNameUpdated" + medicineNameUpdated);
		
		MedicalStore.readMedicineDetails();
		
		boolean medicineNameDeleted = MedicalStore.deleteMedicineName("Citalopram");
		System.out.println("medicineNameDeleted" + medicineNameDeleted);
		
		
		MedicalStore.readMedicineDetails();
		
		
	
	}

}