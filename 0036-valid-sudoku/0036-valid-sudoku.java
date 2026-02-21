class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int row[][]=new int[9][9];
        int col[][]=new int[9][9];
        int box[][]=new int[9][9];

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.') continue;

                int pos=board[r][c]-'1';

                if(row[r][pos]==1){
                    return false;
                }
                row[r][pos]=1;

                if(col[c][pos]==1){
                    return false;
                }
                col[c][pos]=1;

                int boxPos=(r/3) * 3 +(c/3);
                if(box[boxPos][pos]==1){
                    return false;
                }
                box[boxPos][pos]=1;
            }
        }
        return true;

    }
}