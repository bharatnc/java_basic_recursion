public class FibonacciRecursion {

 public static void main(String[] args) {
  System.out.println(fibonacciRecursion(2));
 }

 public static int fibonacciRecursion(int num){
  if(num<=2){
   return num;
  } else {
   return fibonacciRecursion(num-1) +fibonacciRecursion(num-2);
  }
 }
}
