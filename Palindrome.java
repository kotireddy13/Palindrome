import java.util.Scanner;
public class Palindrome{
  public static boolean isPalindrome(String a){
    int i = 0, j = a.length()-1;
    while (i<j){
      if(a.charAt(i) != a.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String b = sc.nextLine();
  if (isPalindrome(b)){
    System.out.println("The string "+b+" is a palindrome.");
  }
  else{
    System.out.println("The string "+b+" is not a palindrome.");
  }
 }
}
 
    