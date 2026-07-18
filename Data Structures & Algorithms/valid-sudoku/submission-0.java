class Solution {
    public boolean isValidSudoku(char[][] board) {
         for(int row=0;row<9;row++){
            HashSet<Character> set = new HashSet<>();
            for(int col=0;col<9;col++){
                char ch = board[row][col];
                if(ch=='.')
                continue;

                if(set.contains(ch))
                return false;
                set.add(ch);
            }
        }

        for(int col=0;col<9;col++){
            HashSet<Character> set = new HashSet<>();
            for(int row = 0;row<9;row++){
            char ch = board[row][col];
             if(ch=='.')
             continue;

             if(set.contains(ch))
             return false;

             set.add(ch);
            }
        }

        for(int boxRow=0;boxRow<3;boxRow++){
            for(int boxCol = 0 ; boxCol<3;boxCol++){
                HashSet<Character> set = new HashSet<>();

                int startrow= boxRow*3;
                int startcol= boxCol*3;

                for(int i= startrow;i<startrow+3;i++){
                    
                    for (int j = startcol; j < startcol + 3; j++) {

                        char ch = board[i][j];

                        if (ch == '.')
                            continue;

                        if (set.contains(ch))
                            return false;

                        set.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
