package Exercise3;

public class StringOutput {
    void methodSplitString (String s1) {
       String [] s2  = s1.split(" ", 2);
        for (String i:s2) {
            System.out.println(i);
        }
    }
}
