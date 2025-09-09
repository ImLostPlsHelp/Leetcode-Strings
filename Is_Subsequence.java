// 392. Is Subsequence
// https://leetcode.com/problems/is-subsequence/description

class Solution {
    public boolean isSubsequence(String s, String t) {
        int searchFromIndex = 0;
        boolean isSubsequence = true;
        int locations[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            locations[i] = t.indexOf(s.charAt(i), searchFromIndex);
            // System.out.print(locations[i]);
            if (i > 0 && locations[i] <= locations[i - 1]) {
                isSubsequence = false;
                break;
            } else if (locations[i] == -1) {
                isSubsequence = false;
                break;
            }
            searchFromIndex = locations[i] + 1;
        }

        return isSubsequence;
    }
}

// Solution
// 1. Kita buat tiga variabel, search from index (sebagia pointer), is
// subsequemce, sama location
// 2. For loop isi dari s terus kita cari indexnya di t kalau ada terus kita
// simpan di locations
// (Kenapa kita pakais searchfromindex itu karena bisa aja elemen di s itu ada
// yang sama jadi nanti kedetect di posisi yang sama di index t)
// 3. Terus kita cek apakah i lebih gede dari 0 (soalnya kalau gak ketemu metode
// indexof bakal ngasih -1) terus kita cek apakah index sekarang di locations
// lebnih gede dari index sebelumnya
// 4. Kalau gak kita set ke false terus break

// P.S = lebih enak asumsi isSubsequence true daripada false, soalnya ifnya
// lebih banyak kalau kita asumsiin belum ada sama sekali
// jadi kalau kedetect sekali aja langsung di end loopnya

// 5. Kita tambahin else if locations == -1 karena bisa aja elemen s cuman satu
// terus gak ketemu di t
// 6. Kita update searchFromIndex ke locations[i] + 1 buat update pointernya