public class demo7
{
	public static void main(String args[])
	{
	java.util.Scanner scn=new java.util.Scanner(System.in);
	System.out.println("type weekly number");
	int n=scn.nextInt( );
	switch(n)
	{
		case 1:
		System.out.println("monday");
		break;
		case 2:
		System.out.println("tuesday");
		break;
		case 3:
		System.out.println("wednesday");
		break;
		case 4:
		System.out.println("thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		default:
		System.out.println("Unknown ");
		break;
	}
		
}
}
		
