package Assignment02;

public class solution01 
{

	private static Singleton obj=null;
		public String s;
		private Singleton()
		{
			s="Hello CG!";
		}
		public static Singleton getInstance()
		{
			if(obj==null)
			{
				obj=new Singleton();
			}
			return obj;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Singleton obj1=Singleton.getInstance();
	    Singleton obj2=Singleton.getInstance();
	    Singleton obj3=Singleton.getInstance();
	    
	    System.out.println(obj1.s);
	    
	    obj1.s="Hello world";
	    System.out.println(obj2.s);
	    System.out.println(obj3.s);
   	 } 
}