import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task 1
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = num.nextInt();
//        int[] arr = new int[number];
//        int smallest = 0;
//        for (int i = 1; i <= number; i++) {
//            arr[i - 1] = num.nextInt();
//        }
//
//        for (int i = 0; i < number; i++) {
//            if (i + 1 == number) {
//                break;
//            }
//            else if (arr[i] < arr[i + 1]) {
//                smallest = arr[i];
//            } else {
//                smallest = arr[i + 1];
//            }
//        }
//        System.out.println(smallest);

//        task 2
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = in.nextInt();
//        int[] arr = new int[number];
//        double avg = 0;
//        for (int i = 1; i <= number; i++) {
//            arr[i - 1] = in.nextInt();
//        }
//
//        for (int i = 0; i < number; i++) {
//            avg += arr[i];
//        }
//
//        System.out.println(avg / number);

//        task 3
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = in.nextInt();
//
//        int temp = 0;
//
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                temp++;
//            }
//        }
//
//        if (temp == 2) {
//            System.out.println("Prime number");
//        }
//        else {
//            System.out.println("Not Prime number");
//        }

//        task 4
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = in.nextInt();
//        int result = factorial(number);
//        System.out.println(result);

//        task 5
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = in.nextInt();
//        int result = fibonacci(number);
//        System.out.println(result);

//        task 6
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter numbers: ");
//        int numb1 = in.nextInt();
//        int numb2 = in.nextInt();
//        int result = degree(numb1, numb2);
//        System.out.println(result);

//        task 7
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = in.nextInt();
//        recursion(number, in);

//        task 8
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter string: ");
//        String smthn = in.nextLine();
//        System.out.println(findNumber(smthn));

//        task 9
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter num n: ");
//        int n = in.nextInt();
//        System.out.println("Enter num k: ");
//        int k = in.nextInt();
//        System.out.println(binomial(n, k));

//        task 10
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter num a: ");
//        int a = in.nextInt();
//        System.out.print("Enter num b: ");
//        int b = in.nextInt();
//        System.out.println(gcd(a, b));
    }

    public static int factorial(int n) {
        int fact = 1;
        if (n - 1 != 0) {
            fact = n * factorial(n - 1);
        }
        return fact;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int degree(int n, int d) {
        int num = 1;
        if (d != 0) {
            num = n * degree(n, d - 1);
        }
        return num;
    }

    public static void recursion(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int num = scanner.nextInt();
        recursion(n - 1, scanner);
        System.out.print(num + " ");
    }

    public static String findNumber(String smthn) {
        for (char c : smthn.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                return "No";
            }
        }
        return "Yes";
    }

    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}