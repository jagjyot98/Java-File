package Patterns;

import java.util.*;

public class pattern_4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<i;j++)        //no. of spaces = ith row
                System.out.print("\t");
            
            for(int j=0;j<n-i;j++)      //no of starrs = n-ith row
                System.out.print("*\t");
            System.out.println();
        }
        scn.close();
    }
}