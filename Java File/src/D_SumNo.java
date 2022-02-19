import java.util.*;
public class D_SumNo {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i]=scn.nextInt();
        }    
        System.out.print(sum);
        scn.close();
    }
}
