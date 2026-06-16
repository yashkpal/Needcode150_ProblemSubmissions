class Solution {
    public boolean isValidSudoku(char[][] board) {
        // valide the rows
        for(char[] row : board){
            Set<Character> seen = new HashSet<>();
            for(char val : row){
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }

        for(int i=0 ;i <9 ;i++){
            Set<Character> seen = new HashSet<>();
            for(int j =0 ;j<9;j++){
                char val = board[j][i];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }

        Set<Character> seen = new HashSet<>();
        for(int i=0 ;i <3 ;i++){
            for(int j =0 ;j<3;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }
        seen.clear();
        for(int i=3 ;i <6 ;i++){
            for(int j =0 ;j<3;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }

        seen.clear();
        for(int i=6 ;i <9 ;i++){
            for(int j =0 ;j<3;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }
        seen.clear();
        for(int i=0 ;i <3 ;i++){
            for(int j =3 ;j<6;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }
        seen.clear();
        for(int i=0 ;i <3 ;i++){
            for(int j =6 ;j<9;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }

        seen.clear();
        for(int i=3 ;i <6 ;i++){
            for(int j =3 ;j<6;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }

        seen.clear();
        for(int i=3 ;i <6 ;i++){
            for(int j =6 ;j<9;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }

        seen.clear();
        for(int i=6 ;i <9 ;i++){
            for(int j =3 ;j<6;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }

        seen.clear();
        for(int i=6 ;i <9 ;i++){
            for(int j =6 ;j<9;j++){
                char val = board[i][j];
                if(val !='.' && seen.contains(val)){
                    return false;
                }else{
                    seen.add(Character.valueOf(val));
                }
            }
        }
        return true;
    }
}
