//https://leetcode.com/problems/zigzag-conversion/description/
//6. Zigzag Conversion

// Input: s = "PAYPALISHIRING", numRows = 3

/*
 *  P   A   H   N
 *  A P L S I I G
 *  Y   I   R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 */

class Solution {
    public String convert(String s, int numRows) {
        // We make a two dimensional array. then we iterate through the row index and
        // fill it with our string, then we iterate through the column index and fill it
        // with our zig zag, then we continue to do this until we reach the end of the
        // string.

        if (numRows == 1)
            return s;

        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
            // rows = ["", "", ""]
        }

        int currentRow = 0;
        boolean changeDirection = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                changeDirection = !changeDirection;
            }
            currentRow += changeDirection ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

/*
 * Example steps
 * Step 1: rows[0] = ["P", "", ""], currentRow + 1 = 1 karena changeDirection
 * true, changeDirection = true
 * Step 2: rows[1] = ["P", "A", ""], currentRow + 1 = 2 karena changeDirection
 * true, changeDirection = true
 * Step 3: rows[2] = ["P", "A", "Y"], currentRow - 1 = 1 karena currentRow udah
 * nyentuh numRows - 1, changeDirection = false
 * Step 4: rows[1] = ["P", "AP", "Y"], currentRow - 1 = 0 karena changeDirection
 * false, changeDirection = false
 * Step 5: rows[0] = ["PA", "AP", "Y"], currentRow + 1 = 1 karena currentRow
 * udah nyentuh 0, changeDirection = true
 * Step 6: etc
 */

/*
 * 1. Buat stringbuilder array rows, terus dibuat elemen stringbuilder
 * sesuai dengan jumlah row yang dibutuhin
 * 2. Kita buat currentRow but ngecek row berapa sekarang, terus boolean
 * changeDirection buat nentuin turun atau ga
 * 3. Kita append karakter ke index currentRow, terus di cek apakah currentRow 0
 * atau nyentuh numRows - 1, kalau nilainya dibalik
 * 4. Terus currentRow ditambah 1 atau dikurang 1 tergantung dengan true atau
 * false si changeDirection
 * 5. Kita satuin semua rows di result, lalu diubah ke string
 */