public class StringPermutation {

  public static void main(String[] args) {
    perm("","abc");
  }

  public static void perm(String prefix, String temp) {
    if (temp.isEmpty()) {
      System.out.println(prefix);
    } 
    else {
      for (int i = 0; i < temp.length(); i++) {
        perm(prefix + temp.charAt(i), temp.substring(0,i) + temp.substring(i+1,temp.length()));
      }
    }
  }
}
  