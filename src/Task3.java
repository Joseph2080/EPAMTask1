import java.util.Scanner;

public class Task3 {
    public static void main(String args[]){
        System.out.println("Enter a positive integer:");
        int n = new Scanner(System.in).nextInt();
        if(n>0) {
            String w = Integer.toString(n);
            int sum = 0;
            for (int i = 0; i < w.length(); i++) {
                int num = Integer.parseInt(w.charAt(i) + "");
                if (num % 2 != 0) {
                    sum += num;
                }
            }
            System.out.println(sum);
        }else{
            System.out.println("Please enter a positive number!");
        }
    }
}
