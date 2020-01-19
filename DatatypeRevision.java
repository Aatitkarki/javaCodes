/*
Total Points: 70
isEven() : 10
isDivisible() : 10
divide() : 10
isEqual() : 20
isPalindrome() : 20
 */

public class DatatypeRevision {

    // returns true if num is even, otherwise returns false
    public boolean isEven(int num) {
        // write your code here
        boolean isEven;
        if(num%2==0){
            isEven=true;
        }
        else{
            isEven=false;
        }
        return isEven;

    }
    // returns true if num is divisible by both 4 and 5, otherwise returns false
    public boolean isDivisible(int num) {
        // write your code here
        boolean isDivisible;
        if(num%4==0 && num%5==0){
            isDivisible=true;

        }
        else{
            isDivisible=false;}
        return isDivisible;
    }
    // returns the result of a/b [NOTE: also do exception handling]
    // return -1 if there occured any exception
    public int divide(int a, int b) {
        // write your code here
        int result;
        //Since the returned value is in int the result variable is in int
        try{
            result = a/b;
        }
        catch(ArithmeticException ae){
            result=-1;
        }
        return result;

    }

    /* returns true if both strings are same, otherwise returns false
    NOTE:
    APPLE is not equal to apple
    DO NOT USE IN-BUILT FUNCTIONS LIKE equals(), equalsIgnoreCase() or comparesTo()
     */
    public boolean isEqual(String str1, String str2) {
        // write your code here
        boolean isEqual=false;
        if(str1.length()==str2.length()){
            int i=0;
            while(i<str1.length()){
                if(str1.charAt(i)==str2.charAt(i)){
                    isEqual=true;
                }   
                else{
                    isEqual=false;
                    break;
                }
                i++;
            }
        }
        return isEqual;

    }

    /* 
    returns true if str1 and str2 is palindrome
    NOTE: a string is palindrome if the reverse of the string is same as the original string
    Example: apple is not palindrome, nayan is palindrome
     */
    public boolean isPalindrome(String str1, String str2) {
        // write your code here
        boolean isPalindrome=false;
        int l1=str1.length();
        int l2=str2.length();
        if(l1==l2){
            int i=0;
            while(i<l1){
                if(str1.charAt(i)==str2.charAt(l2-1)){
                isPalindrome=true;
                }
                else{
                isPalindrome=false;
                break;
                }
                i++;
                l2--;
            }
        }
        return isPalindrome;

    }

    // DO NOT MODIFY THIS CODE
    public static void main(String[] args) {
        DatatypeRevision dr = new DatatypeRevision();
        System.out.println("isEven: " + dr.isEven(2378));
        System.out.println("isEven: " + dr.isEven(271));
        System.out.println("isDivisible: " + dr.isDivisible(2780));
        System.out.println("isDivisible: " + dr.isDivisible(270));
        System.out.println("divide: " + dr.divide(280, 5));
        System.out.println("divide: " + dr.divide(280, 0));
        System.out.println("isEqual: " + dr.isEqual("Apple", "Apple"));
        System.out.println("isEqual: " + dr.isEqual("apple", "ball"));
        System.out.println("isEqual: " + dr.isEqual("apolo", "apple"));
        System.out.println("isPalindrome: " + dr.isPalindrome("Apple", "Apple"));
        System.out.println("isPalindrome: " + dr.isPalindrome("nayan", "nayan"));
        System.out.println("isPalindrome: " + dr.isPalindrome("appa", "appaa"));
    }

}