package JavaConcept;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      division();

	}
	public static void division() {
		int i =10;
		try {
			int k=i/0;
			System.out.println("inside try block");
		}
		catch(NullPointerException e){  //scn 1 : when write wrong exception (NullPointerException : it will not execute)
			System.out.println("inside catch block"); //catch block
			//scn 2 : when write correct exception Arithemtic exp : will run catch block
			
		}
		finally {
			System.out.println("it will run anyhow");
		}
	}

}
