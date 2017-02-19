public class Problem2 {
    public static void main(String[] args) {
        long sum = 0;
        int a = 0;
        int b = 1;
        while ((a + b) <= 4000000) {
            if ((a + b) % 2 == 0) {
                sum += (a + b);
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(sum);
        
    }


    //unhelpful ------
    public static int fibonacci(int fibo) {
        if (fibo == 0) {
            return 0;
        } else if (fibo == 1) {
            return 1;
        } else {
            return (fibonacci(fibo - 1) + fibonacci(fibo - 2));
        }
    }
}