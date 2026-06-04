class Solution {
    public int totalWaviness(int num1, int num2) {

        int count = 0;
        for (int i = num1; i <= num2; i++) {

            String str = Integer.toString(i);
            int m = str.length();
            if (m > 2) {

                for (int j = 1; j < m - 1; j++) {
                    char l = str.charAt(j - 1);
                    char mi = str.charAt(j);
                    char h = str.charAt(j + 1);
                    boolean isPeak = (mi > l && mi > h);
                    boolean isValley = (mi < l && mi < h);
                    if (isPeak || isValley) {
                        count++;
                    }

                }
            }

        }
        return count;
    }
}