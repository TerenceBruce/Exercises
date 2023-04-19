import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
//        LinkedList<String> al = new LinkedList<>(); WORKS AS THE SAME READ ABOUT DIFFERENCES

        //String is class not Primative Datatypes.
        // only object - wrapper classes premade objects

        //ADD
        //Create
        al.add("D");
        al.add("U");
        al.add("K");
        al.add("E");

        //PRINT
        //Read
        System.out.println(al + " " + "Size is " + al.size() + " Does this contain U: " + al.contains("U"));
        System.out.println(al);
        //REMOVE
        //Delete
        al.remove("D");
        al.remove(2);// removes wilma as her index changes from the removal of fred

//        ArrayList<String> al1 =al; to back up array
        System.out.println(al.size());
        System.out.println(al);
//        int x = al.size();
//        for (int i=0; i< x; i++){
//            System.out.println(al.size());
//            al.remove(i);
//
//        }
        while(al.size() >0){
            al.remove(0);
        }
        System.out.println(al);

        al.add("S");
    }
}