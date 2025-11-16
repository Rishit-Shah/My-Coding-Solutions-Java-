class Solution {
    public String frequencySort(String s) {
  if (s == null || s.isEmpty()) return s;

    // Create an array to store character frequencies.
    int[] charFreq = new int[128]; // Assuming ASCII characters

    // Calculate character frequencies.
    for (char c : s.toCharArray()) {
        charFreq[c]++;
    }

    // Sort characters based on frequency.
    StringBuilder sortedString = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        char maxChar = 0;
        int maxFreq = 0;
        for (char c = 0; c < 128; c++) {
            if (charFreq[c] > maxFreq) {
                maxFreq = charFreq[c];
                maxChar = c;
            }
        }
        if (maxFreq > 0) {
            sortedString.append(String.valueOf(maxChar).repeat(maxFreq));
            charFreq[maxChar] = 0; // Mark as processed
        }
    }
    

    return sortedString.toString();
    
}
}
