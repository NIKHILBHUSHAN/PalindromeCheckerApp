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

class UseCase8{
    boolean palindromeChecker(String text){
        LinkedList<Character> firsthalf = new LinkedList<>();
        LinkedList<Character> secondhalf = new LinkedList<>();
        for (int i=0;i<=text.length()/2;i++){
            firsthalf.add(text.charAt(i));
        }
        for (int i=text.length()-1;i>=text.length()/2;i--){
            secondhalf.add(text.charAt(i));
        }
        return firsthalf.equals(secondhalf);
    }
}
class UseCase9{
    boolean palindromeChecker(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return palindromeChecker(str, start + 1, end - 1);
    }
}

class UseCase10{
    boolean palindromeChecker(String str){
        String normalize=str.replaceAll(" ","").toLowerCase();
        for(int i=0;i<normalize.length()/2;i++){
            if(normalize.charAt(i)!=normalize.charAt(normalize.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

class PalindromeService{
    public boolean palindromeChecker(String str){
        char[] charArray = str.toCharArray();
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

interface PalindromeStrategy{
    boolean palindromeChecker(String text);
}

class StackStrategy implements PalindromeStrategy{
    public boolean palindromeChecker(String text){
        Stack<Character> stack=new Stack<>();
        for (char c:text.toCharArray()){
            stack.push(c);
        }
        for (char c:text.toCharArray()){
            if(stack.pop()!=c){
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy{

    public boolean palindromeChecker(String text) {
        Deque<Character> deque=new ArrayDeque<>();
        for (char c:text.toCharArray()){
            deque.addLast(c);
        }
        while(deque.size()>1){
            if (deque.removeFirst()!=deque.removeLast())
                return false;
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

        long start2=System.nanoTime();
        System.out.println("Is it a palindrome?:"+u2.palindromeChecker(str));
        long end2=System.nanoTime();
        long duration2=end2-start2;
        System.out.println("Execution time:"+duration2+"ns");
        System.out.println();

        UseCase3 u3=new UseCase3();
        long start3=System.nanoTime();
        System.out.println("Is it a palindrome?(UseCase-3):"+u3.palindromeChecker(str));
        long end3=System.nanoTime();
        long duration3=end3-start3;
        System.out.println("Execution time:"+duration3+"ns");
        System.out.println();

        UseCase4 u4=new UseCase4();
        long start4=System.nanoTime();
        System.out.println("Is it a palindrome?(Usecase-4):"+u4.palindromeChecker(str));
        long end4=System.nanoTime();
        long duration4=end4-start4;
        System.out.println("Execution time:"+duration4+"ns");
        System.out.println();

        UseCase5 u5=new UseCase5();
        long start5=System.nanoTime();
        System.out.println("Is it a palindrome:(Usecase-5):"+u5.palindromeChecker(str));
        long end5=System.nanoTime();
        long duration5=end5-start5;
        System.out.println("Execution time:"+duration5+"ns");
        System.out.println();

        UseCase6 u6=new UseCase6();
        long start6=System.nanoTime();
        System.out.println("Is it a palindrome?:(UseCase-6):"+u6.palindromeChecker(str));
        long end6=System.nanoTime();
        long duration6=end6-start6;
        System.out.println("Execution time:"+duration6+"ns");
        System.out.println();

        UseCase7 u7=new UseCase7();
        long start7=System.nanoTime();
        System.out.println("Is it a palindrome?:(UseCase-7):"+u7.palindromeChecker(str));
        long end7=System.nanoTime();
        long duration7=end7-start7;
        System.out.println("Execution time:"+duration7+"ns");
        System.out.println();

        UseCase8 u8=new UseCase8();
        long start8=System.nanoTime();
        System.out.println("Is it a palindrome?:(UseCase-8):"+u8.palindromeChecker(str));
        long end8=System.nanoTime();
        long duration8=end8-start8;
        System.out.println("Execution time:"+duration8+"ns");
        System.out.println();

        UseCase9 u9=new UseCase9();
        long start9=System.nanoTime();
        System.out.println("Is it a palindrome?:(UseCase-9):"+u9.palindromeChecker(str,0,str.length()-1));
        long end9=System.nanoTime();
        long duration9=end9-start9;
        System.out.println("Execution time:"+duration9+"ns");
        System.out.println();

        System.out.print("Input Sentence: ");
        input.nextLine();
        String str1=input.nextLine();
        UseCase10 u10=new UseCase10();
        System.out.println("Is it a palindrome?:(UseCase-10):"+u10.palindromeChecker(str1));

        PalindromeService u11=new PalindromeService();
        long start10=System.nanoTime();
        System.out.println("Is it a palindrome?:(UseCase-11):"+u11.palindromeChecker(str));
        long end10=System.nanoTime();
        long duration10=end10-start10;
        System.out.println("Execution time:"+duration10+"ns");
        System.out.println();

        PalindromeStrategy stack=new StackStrategy();

        long start=System.nanoTime();
        System.out.println("Is it a palindrome?:(UseCase-12[StackStrategy]):"+stack.palindromeChecker(str));
        long end=System.nanoTime();
        long duration=end-start;
        System.out.println("Execution time of StackStrategy:"+ duration +"ns");

        PalindromeStrategy deque=new DequeStrategy();
        long start1=System.nanoTime();
        System.out.println("Is it a palindrome?:(UseCase-12[DequeStrategy]):"+deque.palindromeChecker(str));
        long end1=System.nanoTime();
        long duration1=end1-start1;
        System.out.println("Execution time of dequeStrategy:"+ duration1 +"ns");




    }
}
