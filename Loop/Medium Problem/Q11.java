import java.util.*;
class Main {
    public static void main(String[] args) {
       int a = 10;
       int b = 2;
       //a ^ b
       int pow = 1;
       for(int i = 1; i<=b; i++){
           pow = pow * a;
       }
       System.out.print(pow);
    }
}
