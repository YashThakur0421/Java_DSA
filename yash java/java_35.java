// import java.util.Scanner;

// public class java_35 {
//     // public static int printhelloworls(){
//     // System.out.println("Hello world");
//     // System.out.println("Hello world");
//     // System.out.println("Hello world");
//     // return 3;

//     // }
//     // public static int calculatesum(int num1 , int num2){
//     // int sum = num1 + num2;
//     // return sum;

//     // }
//     // public static void main(String[] args) {
//     // Scanner sc = new Scanner(System.in);
//     // int a= sc.nextInt();
//     // int b = sc.nextInt();
//     // int sum = calculatesum(a,b);
//     // System.out.println("sum is :" + sum);
//     // }
//     // public static void main(String[] args) {
//     // System.out.println("Hello world");
//     // }

//     // public static int multiply(int a, int b) {
//     // int product = a * b;
//     // return product;
//     // }

//     // public static void main(String[] args) {
//     // int a = 2;
//     // int b = 3;
//     // int prod = multiply(a, b);
//     // System.out.println("a*b =" + prod);

//     public static int factorial(int n) {
//         int f = 1;

//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     // public static void main(String args[]) {
//     //     System.out.println(factorial(4));
//     // }

//     public static int bincoeff(int n , int r) {
//         int fact_n=factorial(n);
//         int fact_r=factorial(r);
//         int fact_nmr=factorial(n-r);

//         int bincoeff=fact_n/(fact_r*fact_nmr);
//         return bincoeff;
        
//     }

//     public static void main(String[] args) {
//         System.out.println(bincoeff(5, 2));
//     }
// }