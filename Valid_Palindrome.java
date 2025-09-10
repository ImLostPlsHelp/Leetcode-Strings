// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description

class Solution {
    public boolean isPalindrome(String s) {
        // Solusi 1 (Time complexity lebih lama karena replace all, toLowerCase, sama
        // StringBuilder ngebuat object baru yang nguras waktu sama memori)]
        // --------------------------------------------------------------
        // s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // StringBuilder sb = new StringBuilder(s);
        // String reversed = sb.reverse().toString();
        // System.out.println(reversed);
        // System.out.println(s);
        // return reversed.equals(s);

        int left = 0;
        int right = s.length() - 1;
        // Kita pakai 2 pointer buat ngecek satu satu character

        while (left < right) {
            char leftChar = s.charAt(left); // Kita ambil nilai character pada index kiri sama kanan
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) { // Kita cek apakah character alphanumeric (huruf atau angka)
                left++; // Kalau bukan langsung geser
            } else if (!Character.isLetterOrDigit(rightChar)) { // Kalau yang kiri ternyata alphanumeric, kita cek yang
                                                                // kanan
                right--;
            } else if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) { // Kalau dua duanya
                                                                                              // alphanumeric, kita
                                                                                              // bandingin apakah sama
                                                                                              // atau tidak, kalau tidak
                                                                                              // langsung false
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}