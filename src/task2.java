import java.util.Scanner;

public class task2 {

    public static void main(String args[]){
        System.out.println("Enter an integer:");
        int n = new Scanner(System.in).nextInt();
        String w = Integer.toString(n);
        if(w.length()==3) {
            String numbers[] = {w.charAt(0) + "" + w.charAt(1) + "" + w.charAt(2),
                    w.charAt(1) + "" + w.charAt(2) + "" + w.charAt(0),
                    w.charAt(2) + "" + w.charAt(0) + "" + w.charAt(1),
                    w.charAt(2) + "" + w.charAt(1) + "" + w.charAt(0),
                    w.charAt(1) + "" + w.charAt(0) + "" + w.charAt(2),
                    w.charAt(0) + "" + w.charAt(2) + "" + w.charAt(1)
            };

            int maximum = Integer.parseInt(numbers[0]);
            for (int i = 1; i < 6; i++) {
                int num = Integer.parseInt(numbers[i]);
                if (maximum < num) {
                    maximum = num;
                }
            }
            System.out.println("Maximum number:" + maximum);
        }else{
            System.out.println("Please enter a 3 digit number.");
        }
    }
}
