package brocode.datastructures;

import java.util.Stack;

public class StackDs {
    public static void main(String[] args) {

        Stack<String> ds = new Stack<String>();
//        System.out.println(ds.empty());
        ds.push("Cricket)7");
        ds.push("Crick2k9");
        ds.push("Prince of Persian");
        ds.push("God of War");

        ds.pop();
        System.out.println(ds);
    }
}
