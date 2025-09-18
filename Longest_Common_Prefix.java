class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Kalau string prefix ada di dalam strs[i] (indexOf penting banget,
                                                   // baru tahu dia malah cari string secara kesuluruhan mulai dari
                                                   // awal),
                prefix = prefix.substring(0, prefix.length() - 1);// Kita kembaliin prefixnya
            }
            if (prefix.isEmpty()) {
                return ""; // Kalau ga ada, automatis pasti kosong
            }
        }
        return prefix;
    }
}