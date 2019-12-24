class Test
{
	static public int=10;
	static protected int=20;
	static int=30;
	static private int=40;
	public static void main(String[] args)
	{
		System.out.println(Test.a);
		System.out.println(Test.b);
		System.out.println(Test.c);
		System.out.println(Test.d);
		class Demo
		{
			public static void main(String[] args)
			 {
				System.out.println(Test.a);
				System.out.println(Test.b);
				System.out.println(Test.c);
			}
		}
	}

}
