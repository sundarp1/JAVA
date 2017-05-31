public class demo2
{
  public static void main(String args[])
  { 
    System.out.println("The Pattern is");
    for(int i=1;i<=10;i++)
    { 
 	for(int j=i;j<=10;j++)
	{
		System.out.print(" ");
	}
		for(int k=1;k<(2*i);k++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
	}
}
}