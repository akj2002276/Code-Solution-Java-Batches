// Find the product of digits of a number
class Main {
 public static void main(String[] args) {
 int n = 1234;
 int product = 1;
 while (n != 0) {
 int digit = n % 10;
 product = product * digit;
 n = n / 10;
 }
 System.out.println("Product of digits = " + product);
 }
}
