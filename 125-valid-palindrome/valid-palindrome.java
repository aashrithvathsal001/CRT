class Solution {
    public boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int left, int right) {
        if (left >= right) return true;

        char l = s.charAt(left);
        char r = s.charAt(right);

        if (!Character.isLetterOrDigit(l)) {
            return check(s, left + 1, right);
        }

        if (!Character.isLetterOrDigit(r)) {
            return check(s, left, right - 1);
        }

        if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
            return false;
        }

        return check(s, left + 1, right - 1);
    }
}
