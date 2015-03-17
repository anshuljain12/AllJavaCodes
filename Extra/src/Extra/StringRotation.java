package Extra;

public class StringRotation 
{
	public static void main(String[] args)
	{
		String a="waterbottle";
		String b=null;
		
		if(isRotation(a,b))
			System.out.println("Rotations");
		else
			System.out.println("Not Rotations");
	}
	
	public static boolean isRotation(String a, String b)
	{
		if(b==null)
			return true;
		
		if(a==null || a.length()!=b.length())
			return false;
		
		String str=a+a;
		if(str.contains(b))
			return true;
		
		return false;
	}
}
