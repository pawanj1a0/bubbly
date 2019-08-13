package InterfaceExamples;

interface  interfaceP2 {

	public  void greek() ;
	
}


interface  interfaceQ2 {

	public  void greek();

	
}


class Sample3 implements interfaceP2,interfaceQ2
{
	
	public static void main(String args[])
	{
	
		interfaceQ2 Q2= new Sample3();
		Q2.greek();
	}
	
/
	
	public void greek()
	{
		
		System.out.println("Hello 123");
	
	}
	
	
}




