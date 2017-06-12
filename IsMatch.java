//Implement regular expression matching with support for '.' and '*'.
public class IsMatch {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        boolean[][] table = new boolean[m+1][n+1];
        
        //NULL == NULL, true
        table[0][0] = true;
        
        for(int i = 0; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(p.charAt(j-1) == '*') { //character at p.[j-1] is boolean checked with the bool at table[x][j].
                    table[i][j] = table[i][j - 2] || (i > 0 && (s.charAt(i-1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') && table[i - 1][j]); 
                }
                else {
                    table[i][j] = i > 0 && table[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
                }
            }
        }
        
        return table[m][n];
        
    }
}
