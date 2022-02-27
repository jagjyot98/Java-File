package Patterns;

import java.util.*;

public class pattern_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        for(int i=n-1;i>=0;i--)
        {    for(int j=0;j<=i;j++)
                System.out.print("*\t");
        System.out.println();
        }
        scn.close();
    }
}