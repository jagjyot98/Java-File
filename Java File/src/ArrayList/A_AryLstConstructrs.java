package ArrayList;

import java.util.ArrayList;
import java.lang.String;
import java.util.List;

public class A_AryLstConstructrs {
    public static void main(String args[]){ 
        ArrayList a = new ArrayList(); // Creating a new ArrayList
         
          int counter = 0;
          for(String: a ) {
            counter++;
         }
        System.out.println("No arguments: (can't obtain)" + counter);
        ArrayList b = new ArrayList(41); // Initializing capacity to ArrayList
        counter = 0;
        for(String: b ) {
         counter++;
        }
         
        System.out.println("Argument with capacity: (can't obtain)" + counter);
        System.out.println();
        String sArray[] = {"Bangalore", "Delhi", "Mumbai", "Pune", "Kerala", "Gujurat"};
        List list = Arrays.asList(sArray);
        ArrayList c = new ArrayList(list);
        c.add("Dharwad");
        for(String s: c) {
        System.out.println("ArrayList c element:" + s);
        }
        System.out.println(c);
        }
}
