package Selflearning;
// 1. no argument user defined constructor :
public class Constructor {
private String name;
private int id;
//	Constructor (){
//		System.out.println("no arg constructor");
//	}
//	
//	public static void main(String[] args) {
//		
//		
//		
//		Constructor c = new Constructor();
//		
//	
//		
	

//2.parametrized constructor :
	
	//class employee {
		{String name;
		int id;
		}
		Constructor(String name, int id)
		{
		this.name=name;
		this.id=id;
		}
		public static  void main(String[] args){
			
		Constructor e1 = new Constructor("vihan",1);
		Constructor e2 = new Constructor("mahek",2);
			System.out.println("Employe 1:"  +e1.name);
			
		}
	}

