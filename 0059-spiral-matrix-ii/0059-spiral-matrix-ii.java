class Solution {
    public int[][] generateMatrix(int n) {
         int left=0,top=0;
         int a=1;
         int[][] matrix=new int[n][n];
        List<Integer> res=new ArrayList<>();
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        while(top<= bottom && left<=right){
            for(int c=left;c<=right;c++){
                    matrix[top][c]=a++;
            }
            top++;
            for(int r=top;r<=bottom;r++){
                matrix[r][right]=a++;
            }
            right--;
            if(top <= bottom){
                for(int c=right;c>=left;c--){
                    matrix[bottom][c]=a++;
                }
                bottom--;
            }
            if(left<=right){
                for(int r=bottom;r>=top;r--){
                    matrix[r][left]=a++;
                }
                left++;
            }

        }
        return matrix;
    }
}