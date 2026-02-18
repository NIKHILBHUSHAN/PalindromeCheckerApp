class UseCase1{
    void display(){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version:1.0");
        System.out.println("System Initialized Successfully");
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        UseCase1 u1=new UseCase1();
        u1.display();
    }
}
