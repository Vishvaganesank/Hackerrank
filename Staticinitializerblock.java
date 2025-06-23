import java.io.*;
import java.util.*;

public class Solution {

    static  int a;
    static  int b;

    static {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }
    public static void main(String[] args) {
        try {
            if (a > 0 && b > 0) {
                System.out.println(a * b);
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getName()+ ": " + e.getMessage());
        }
    }
}
