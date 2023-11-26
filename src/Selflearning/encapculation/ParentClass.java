package Selflearning.encapculation;

public class ParentClass {
	
	private final int field;
	private String field2;
	
	ParentClass(int field){
		this.field = field;
	}
	
	ParentClass(String field) { 
		this(20);
		this.field2 = field;
	}
	

	public int getField() {
		return field;
	}
	
	public void setValue(String field2) {
		this.field2 = field2;
	}

	
	

}
