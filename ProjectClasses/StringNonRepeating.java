package JavaProjects.ProjectClasses;

import java.util.HashSet;
import java.util.Set;

public class StringNonRepeating {

//    Given a string s, find the length of the longest
//            substring
//    without repeating characters.
//    Example 1:
//
//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.
//    Example 2:
//
//    Input: s = "bbbbb"
//    Output: 1
//    Explanation: The answer is "b", with the length of 1.
//    Example 3:
//
//    Input: s = "pwwkew"
//    Output: 3
//    Explanation: The answer is "wke", with the length of 3.

    public static int getNonRepeatingString(String s){
        Set<Character> charSet = new HashSet<>();
        int maxLength=0, index=0;
        for(int i = 0 ;i<s.length();i++){
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - index + 1);
            } else {
                while (charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(index));
                    index++;
                }
                charSet.add(s.charAt(i));
            }
        }
        return maxLength;
    }

}
