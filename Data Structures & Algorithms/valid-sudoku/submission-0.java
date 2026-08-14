class Solution {
    //check row 
    //check col
    //check box (2d coord)
    //everything push into 1 string => store in set 

//set.add exist => return false 
//set.add not exist => return true 
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < 9; row ++){
            for (int col = 0; col < 9; col ++){
                char c = board[row][col];
                if (c == '.'){
                    continue;
                }
                if (
                    (set.add( c + "row" + row ) == false)||
                    (set.add(c + "col" + col) == false)||
                    (set.add(c + "box" + row/3 + col/3) == false)
                ){
                    return false;
                }

            }
        }
        return true;
    }
}
