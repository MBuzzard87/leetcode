public class PalindromeNumber {



    public boolean isPalindrome(int x) {

        int num = x;
        int revInt = 0;
        System.out.println("Original: " + num);
        if (x < 0) {
            return false;
        } else {
            while(num != 0) {
                int digit = num % 10;
                revInt = revInt * 10 + digit;
                num /= 10;
            }
            return x == revInt;
        }


    }


}
