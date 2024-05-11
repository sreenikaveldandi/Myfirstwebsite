import java.lang.Exception;

class exception3 extends Exception
{
 	exception3( String message) //constructor of above class
	{
		super(message);
	}
}

class TestMyException
{
	public static void main(String args[])
	{
		int  x = 5 ,  y = 1000;
		try
		{
		  	  float  z = (float) x / (float) y; 
			if(z<0.01)
			{
				throw new exception3("Number is too small");
			}
}
		catch(exception3 e)
		{
			System.out.println("Caught my exception");
			System.out.println(e.getMessage( ) );
		}
		finally
		{
        System.out.println("I am always executed");
		}
	}
}