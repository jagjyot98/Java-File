package Patterns;

import java.util.*;

public class pattern_3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        for(int i=1;i<=n;i++)
        {    
            for(int j=0;j<n-i;j++)
                System.out.print("\t");

            for(int k=0;k<i;k++)
                System.out.print("*\t");
            
            System.out.println();
        
        }
        scn.close();
    }
}