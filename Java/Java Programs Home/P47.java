class P47
{
	public static void main(String args[])
	{
		String s1="madam";
		String s2="";
		String s3="madam";
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);		
		}
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s2);
	}
}

