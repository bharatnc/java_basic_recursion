public class FactorialRecursion {

 public static void main(String[] args){
  System.out.println(factorialRecursion(4));
 }

 public static long factorialRecursion(int n){
  if (n <= 1 ){
   return n;
  } else {
   return n * factorialRecursion(n-1);
  }
 }
}
