class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
    int aa1[][]=new int[n][n];
    int aa=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            aa1[i][j]=aa++;
        }
    }
    int a=0,b=0;
    for(String s: commands ){
        if(s.equals("RIGHT")){
    a++;
} else if(s.equals("LEFT")){
    a--;
} else if(s.equals("UP")){
    b--;
} else if(s.equals("DOWN")){
    b++;
}

    }
    return aa1[b][a];
        
    }
}