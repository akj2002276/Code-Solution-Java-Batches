// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 12;
        int d1  = n;
        int d2 = n;
        int sum = 0;
        int count  = 0;
        while(n != 0){
            count++;
            n = n/ 10;
        }
        while(d1 != 0){
            int rem = d1 % 10; //rem = 3
            int ans = 1;
            for(int i = 1; i<=count; i++){
                ans = ans * rem;
            }
            sum = sum + ans;
            d1  = d1 / 10;
            
        }
        if(d2 == sum){
            System.out.print("Armstrong Number");
        }
        else{
            System.out.print("Not Armstrong number");
        }
    }
}
