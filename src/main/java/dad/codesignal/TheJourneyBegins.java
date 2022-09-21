package dad.codesignal;

public class TheJourneyBegins {
    
    public int add(int param1, int param2) {
        return param1 + param2;
    }

    public int centuryFromYear(int year) {
        int century;
        if(year % 100 == 0) {
            century = year / 100;
        } else {
            century = year / 100 + 1;
        }
        return century;
    }

    public boolean checkPalindrome(String inputString) {
        String reversed = "";
        boolean isPalindrome;
        for(int i = 0; i < inputString.length(); i++) {
            reversed = inputString.charAt(i) + reversed;
        }
        if (reversed.equals(inputString))
            isPalindrome = true;
        else
            isPalindrome = false;
        return isPalindrome;
    }
}