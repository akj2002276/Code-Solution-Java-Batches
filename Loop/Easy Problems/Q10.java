// Check if a number is palindrome
class Main {
 public static void main(String[] args) {
 int n = 121;
 int dummy = n;
 int rev = 0;
 while (n != 0) {
 int digit = n % 10;
 rev = rev * 10 + digit;
 n = n / 10;
 }
 if (dummy == rev)
 System.out.println("Palindrome");
 else
 System.out.println("Not Palindrome");
 }
}
