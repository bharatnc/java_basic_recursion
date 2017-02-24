public class TowersOfHanoi {

  public static void main(String[] args) {
    towersOfhanoi(5, "a", "b", "temp");
  }

  public static void printpattern(String a, String b){
    System.out.println("From " + a + " to " + b);
  }

  public static void towersOfhanoi(int  n, String from , String to, String temp){
    if (n == 1){
      printpattern(from,to);
      return;
    } if (n == 0){
      return;
    } else{
      towersOfhanoi(n-1, from, temp, to );
      towersOfhanoi(1,  from, to, temp );
      towersOfhanoi(n-1, temp, to, from );
    }
  }
}
