/*
 * Valid Parentheses
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "()"
 * Output: true
 * Example 2:
 * 
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * 
 * Input: s = "(]"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 * 
 * https://leetcode.com/problems/valid-parentheses/
 */

import java.util.*;
class Solution {
    public boolean isValid(String s) {
       Stack<Character> st= new Stack<>();  
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                st.push(s.charAt(i));
            else if(st.isEmpty())
				return false;
            
            else if(s.charAt(i)==')')
             {
				 if(st.pop()!='(')
				 	return false;
			 }
			 else if(s.charAt(i)=='}')
             {
				 if(st.pop()!='{')
				 	return false;
			 }
			 else
             {
				 if(st.pop()!='[')
				 	return false;
			 }
        }
		if(st.empty())
			return true;
		
		return false;
    }
}