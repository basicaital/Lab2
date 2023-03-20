package Examples;

import org.w3c.dom.ls.LSOutput;

public class BinToDec {
    public static void binToDec(int n){
        if(n==0){
            System.out.println("0");
        }
        System.out.println(n%2);
        binToDec(n/2);
    }
}
