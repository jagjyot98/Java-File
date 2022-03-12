package LinkList;

import java.util.LinkedList;
// import java.util.List;

public class C_Array2LinkList {
    public static void main(String[] args) 
        {
            String[] courses = {"Java","PHP","Hadoop","DevOps","Python"};
            LinkedList<String> coursesList = new LinkedList<>();
            for(String s : courses){
                coursesList.add(s);
            }
            System.out.println("The array of popular courses is: " + coursesList);
        }
}
