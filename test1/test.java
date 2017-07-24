import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = number(a);
        System.out.print(count);
    }


    public static int number(int a) {
        int count = 0;
        while(a!=0){
            a = a / 10;
            count++;
        }
        return count;
    }
}
