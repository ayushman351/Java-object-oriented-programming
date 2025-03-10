package Level2;

public class PalindromeString {
public static void main(String[] args) {
    PalindromeChecker case1=new PalindromeChecker();
    case1.text="ABABA";

    case1.display(case1.checkPalindrome());
    
}
    
}

class PalindromeChecker{
    String text;

    boolean checkPalindrome(){
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
               return false;
            }
        }return true;
    }
    void display(boolean result ){
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}