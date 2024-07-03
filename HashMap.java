
public class HashMap {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        int ran[] = new int[26];
        int mag[] = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            ran[ransomNote.charAt(i) - 'a']++;
        }

        for (int j = 0; j < magazine.length(); j++) {
            mag[magazine.charAt(j) - 'a']++;
        }

        for (int k = 0; k < 26; k++) {
            if (ran[k] > mag[k]) {
                return false;
            }
        }

        return true;
    }
}
