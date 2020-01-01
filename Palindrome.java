public class Palindrome { 
    static int isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
            while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return 0; 
             i++; 
            j--; 
        } 
        return 1; 
    } 
    public static void main(String[] args) 
    { 
        String str = "hello"; 
  
        if (isPalindrome(str)==1) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 