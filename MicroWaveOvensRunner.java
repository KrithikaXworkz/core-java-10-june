class MicroWaveOvensRunner{
	public static void main(String[] args){
	System.out.println("main method started");
	boolean display = MicroWaveOvens.onOrOff();
	System.out.println("the oven is displayed:" + display);
	MicroWaveOvens.increaseTemp();
	MicroWaveOvens.increaseTemp();
	MicroWaveOvens.increaseTemp();
    MicroWaveOvens.increaseTemp();
	MicroWaveOvens.increaseTemp();
	MicroWaveOvens.increaseTemp();
	MicroWaveOvens.increaseTemp();
	
	MicroWaveOvens.decreaseTemp();
	MicroWaveOvens.decreaseTemp();
	MicroWaveOvens.decreaseTemp();
	MicroWaveOvens.decreaseTemp();
	MicroWaveOvens.decreaseTemp();
	MicroWaveOvens.decreaseTemp();
	display = MicroWaveOvens.onOrOff();
	System.out.println("the oven is displayed:" + display);
	
	System.out.println("main method ended");
}
}