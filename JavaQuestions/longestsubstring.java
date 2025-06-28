package JavaQuestions;

public class longestsubstring {
  
    public static String findLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int maxLen = 0;
        int endIndex = 0;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return str1.substring(endIndex - maxLen, endIndex);
    }

    public static void main(String[] args) {

        String str1 = "codingisfun";
        String str2 = "kingisawesome";

        String lcs = findLCS(str1, str2);
        System.out.println("Longest Common Substring: " + lcs);
    }


  
}
