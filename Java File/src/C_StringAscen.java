import java.util.*;
public class C_StringAscen {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		
		int n=scn.nextInt();
		
		String[] arr=new String[n+1]; //taking n-1 elements for n, so used n+1
		
		for(int i=0;i<=n;i++)			// loops are running for n+1 elements
			arr[i]=scn.nextLine();
		
		for(int i=0;i<=n;i++)
		{	for(int j=i+1;j<=n;j++)
			{	if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<=n;i++)			
			System.out.print(arr[i]+" ");
		
		scn.close();
	}
}
