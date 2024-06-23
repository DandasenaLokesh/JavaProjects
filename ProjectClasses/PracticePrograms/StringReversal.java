package JavaProjects.ProjectClasses.PracticePrograms;

public class StringReversal {
//    Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
//    If the character ch does not exist in word, do nothing.
//    For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
//    Return the resulting string.
    public static String reversePrefix(String word, char ch) {
        String reverseWord = "";
        String newWord = "";
        int breakLoop = 0;

        for (int i = 0; i < word.length(); i++) {
            char chr;
            if (word.charAt(i) == ch && breakLoop == 0) {
                for(int j = 0; j <= i; j++) {
                    chr = word.charAt(j);
                    reverseWord = chr + reverseWord;
                }
                breakLoop = 1;
            } else if(breakLoop == 1) {
                chr = word.charAt(i);
                newWord = newWord + chr;
            }
        }
        String result = reverseWord+newWord;
        if(result.equals("")){//In Java, the == operator is used to compare object references.to compare the same value strings we should use equals()
            result = word;
        }
        return result;
    }
}
