public class Solution3614 {
    public static char processStr(String s, long k) {
        long len = 0;
        //compute final length
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                if(len > 0) len--;
            }
            else if(ch == '#'){
                len = len * 2;
            }
            //if(char == '%') reverse string has same len, so no change
            else if(ch == '%') continue;
            else{
                len++;
            }
        }
        if(k >= len) return '.';

        //Backward pass
        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);

            if(ch == '*'){
                len++;
            }
            else if(ch == '#'){
                len = len/2;
                if(k >= len){
                    k = k-len;
                }
            }
            else if(ch == '%'){
                k = len-1-k;
            }
            else{
                len--;
                if(k == len){
                    return ch;
                }
            }
        }
        return '.';
    }

    public static void main(String[] args) {
        String s = "a#b%*";
        long k = 1;
        System.out.println(processStr(s,k));
    }
}

/*
Input: s = "a#b%*", k = 1
Output: "a"
Explanation:

i	s[i]	Operation	         Current result
0	'a'	    Append 'a'	             "a"
1	'#'	    Duplicate result	    "aa"
2	'b'	    Append 'b'	            "aab"
3	'%'	    Reverse result	        "baa"
4	'*'	    Remove the last char	"ba"
The final result is "ba". The character at index k = 1 is 'a'.
 */