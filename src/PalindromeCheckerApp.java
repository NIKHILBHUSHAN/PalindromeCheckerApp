import java.util.*;

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

class UseCase4{
    boolean palindromeChecker(String text){
        char[] charArray = text.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
}

class UseCase5{
    boolean palindromeChecker(String text){
        Stack<Character> stack = new Stack<>();
        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }
        boolean palindrome = true;
        for (char ch : text.toCharArray()) {
            if(stack.pop() != ch){
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}

class UseCase6{
    boolean palindromeChecker(String text){
        Deque<Character> stack = new ArrayDeque<>();
        Queue<Character> queue = new ArrayDeque<>();
        for (char ch : text.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }
        boolean palindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()){
            if(stack.pop()!=queue.remove()){
                palindrome = false;
            }
        }
        return palindrome;
    }
}

class UseCase7{
    boolean palindromeChecker(String text){
        Deque<Character> dq = new ArrayDeque<>();
        for (char ch : text.toCharArray()) {
            dq.addLast(ch);
        }

        while (dq.size()>1){
            if(dq.removeFirst()!=dq.removeLast()){
              return false;
            }
        }
        return true;

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

        UseCase4 u4=new UseCase4();
        System.out.println("Is it a palindrome?(Usecase-4):"+u4.palindromeChecker(str));

        UseCase5 u5=new UseCase5();
        System.out.println("Is it a palindrome:(Usecase-5):"+u5.palindromeChecker(str));

        UseCase6 u6=new UseCase6();
        System.out.println("Is it a palindrome?:(UseCase-6):"+u6.palindromeChecker(str));

        UseCase7 u7=new UseCase7();
        System.out.println("Is it a palindrome?:(UseCase-7):"+u7.palindromeChecker(str));
    }
}
