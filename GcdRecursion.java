public class GcdRecursion {

 public static void main(String[] args) {
  System.out.println(gcdRecursion(50,5));
 }

 public static int gcdRecursion (int p, int q){
  //Base case
  if (q == 0 ){
   return p;
  } else { 
   return gcdRecursion(q , p%q);
  }
 }
}
