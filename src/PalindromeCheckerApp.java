import java.util.Scanner;
class UseCase1{
    void display(){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version:1.0");
        System.out.println("System Initialized Successfully");
    }
}
class UseCase2{
    boolean palindromeChecker(String text){
        boolean palindrome = true;
        for(int i = 0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-i-1)){
                palindrome = false;
            }
        }
        return palindrome;
    }
}

class UseCase3{
    String reverse="";
    boolean palindromeChecker(String text){
        for(int i=text.length()-1;i>=0;i--)
            reverse+=text.charAt(i);

        return text.equals(reverse);
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        UseCase1 u1=new UseCase1();
        u1.display();

        Scanner input=new Scanner(System.in);
        UseCase2 u2=new UseCase2();
        System.out.print("Input Text: ");
        String str=input.next();
        System.out.println("Is it a palindrome?:"+u2.palindromeChecker(str));

        UseCase3 u3=new UseCase3();
        System.out.println("Is it a palindrome?(UseCase-3):"+u3.palindromeChecker(str));
    }
}
