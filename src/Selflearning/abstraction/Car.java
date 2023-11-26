package Selflearning.abstraction;

abstract class Car {
	
	protected int wheels;
	protected String color;
	private String steering;
	
	abstract void driveCar();
	
	void windowOperation() {
		System.out.println("Window operation");
		
	}
	
	public String getSteering() {
		return this.steering;
	}

}
