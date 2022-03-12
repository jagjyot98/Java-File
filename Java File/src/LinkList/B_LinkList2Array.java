package LinkList;

import java.util.Arrays;
import java.util.LinkedList;
// import java.util.List;

public class B_LinkList2Array {
    public static void main(String[] args) 
    {       
        LinkedList<String> courseList = new LinkedList<>();
        courseList.add("Java");
        courseList.add("Python");
        courseList.add("DevOps");
        courseList.add("Hadoop");
        courseList.add("AWS");
        int size = courseList.size(); 
        System.out.println("Size of linked list = " + size);
        String[] numbers = new String[size];
         
        numbers = courseList.toArray(numbers);
        
        System.out.println("Elements of array are:");
        System.out.println(Arrays.toString(numbers));
 
    }
}
