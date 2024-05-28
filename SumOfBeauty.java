public class SumOfBeauty {
    public static int sumueaty(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int freq[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int min = getMin(freq);
                int max = getMax(freq);
                int beauty = max - min;
                ans += beauty;
            }
        }
        return ans;
    }
    public static int getMin(int freq[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<26; i++) {
            if(freq[i] != 0) {
                min = Math.min(min, freq[i]);
            }
        }
        return min;
    } 
    public static int getMax(int freq[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<26; i++) {
            if(freq[i] != 0) {
                max = Math.max(max, freq[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "aaac";
        System.out.println(sumueaty(s));
    }
}
