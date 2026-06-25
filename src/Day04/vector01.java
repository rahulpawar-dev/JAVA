package Day04;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class vector01 {
    public static void main(String[] args) {

//        List<String> Stud = new Vector<>();
//
//        Stud.add("rahul");
//
//        System.out.println(Stud);

        Stack<String> Books = new Stack<String>();

//      the push() method is used to add the items at top of the stack
        Books.push("print " + " new");
        Books.push("new1");
        Books.push("new2");
        Books.push("new3");



//        the pop() method only delete the top of the elements of the list

        Books.pop();


//      the clear() method   is used to remove all the element of the Stack

        System.out.println(Books);

    }
}
