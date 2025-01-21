package JavaConcept;

public class WrapperClass {
	public static void main(String[] args) {
	
	Integer i =90;
	i.compareTo(i);
	
	//Autoboxing 
	//String to int
	String s1 = "10";
	String s2 = "20";
	
	int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
	System.out.println(sum);
	
	//int to String
	
	int x =0;
	String.valueOf(x);

}}
