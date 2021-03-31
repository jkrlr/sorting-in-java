// Java Program to sorting a List in Descending Order
import java.util.ArrayList ;
import java.util.Collections ;

public class SortingInDecendingOrder {
    public static void main(String[] args){
        // Create a list of Integers 
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(33);
        arr.add(15);
        arr.add(20);
        arr.add(34);
        arr.add(8);
        arr.add(12);
        
        System.out.println("List before sorting :\n" + arr);
        System.out.println("-------------------------------");
        
        
        Collections.sort(arr, Collections.reverseOrder());  // Sort arr elements in decending order 
        
        System.out.println("List after sorting :\n" + arr);
    }
}