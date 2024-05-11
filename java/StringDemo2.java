class StringDemo2
{
	public static void main(String args[])
	{
		String strOb1="First String";
		String strOb2="Second String";
		String strOb3=strOb1;
		
	System.out.println("Length of obj1:"+strOb1.length());
System.out.println("char at index 3 in obj1 :" + strOb1.charAt(3));
		
		if(strOb1==strOb2)
		   System.out.println("strOb1 == strOb2");
		else
		   System.out.println("strOb1 != strOb2");

		if(strOb1.equals(strOb3))
		   System.out.println("strOb1 == strOb3");
		else
		   System.out.println("strOb1 != strOb3");
           byte b[]=new byte[3];
	b[0]=65;  
	b[1]=66;  
	b[2]=68; 
	String s2=new String(b);
	System.out.println(s2);

        String s="This is the test";
		String s1="   THIS IS THE test one  ";
		
		
		System.out.println("\tOriginal String s="+s);
		System.out.println("\tOriginal String s1="+s1);
		System.out.println("s.substring(2) ="+s.substring(2));
        System.out.println("s.substring(2,10) ="+s.substring(2,10)); // end=end-1 means 2 to 9

//System.out.println("s.substring(2,20) ="+s.substring(2,20)); // Error : StringIndexOutOfBoundsException

/*		String s1="Niraj".concat("Hi"); 
		System.out.println(s1); 
			or both are rigth */
		System.out.println("\"Niraj\".concat(\"Hi\") ="+"Niraj".concat(" Hi")); 

		System.out.println("s.concat(\"Hello\") ="+s.concat(" Hello")); 
		System.out.println("s+ \" Hello\" ="+s + " Hello"); 
		
		System.out.println("s.replace(\'i\',\'Z\') ="+s.replace('i','Z')); 

		System.out.println("s1.trim() ="+s1.trim()); 

		System.out.println("s1.toUpperCase() ="+s1.toUpperCase()); 
		System.out.println("s1.toLowerCase() ="+s1.toLowerCase()); 
	}
}
