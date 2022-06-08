class Solution {
    public void setZeroes(int[][] matrix) {
        boolean  col=true;
        int row=matrix.length;
        int cols=matrix[0].length;
        
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                col=false;
            }
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
        for(int i=row-1;i>=0;i--){
            for(int j=cols-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col==false){
                matrix[i][0]=0;
            }
        }
        System.out.println(matrix);
    }
}

               //another approach
// class Solution {
//   public void setZeroes(int[][] matrix) {
//     int R = matrix.length;
//     int C = matrix[0].length;
//     Set<Integer> rows = new HashSet<Integer>();
//     Set<Integer> cols = new HashSet<Integer>();

//     // Essentially, we mark the rows and columns that are to be made zero
//     for (int i = 0; i < R; i++) {
//       for (int j = 0; j < C; j++) {
//         if (matrix[i][j] == 0) {
//           rows.add(i);
//           cols.add(j);
//         }
//       }
//     }

//     // Iterate over the array once again and using the rows and cols sets, update the elements.
//     for (int i = 0; i < R; i++) {
//       for (int j = 0; j < C; j++) {
//         if (rows.contains(i) || cols.contains(j)) {
//           matrix[i][j] = 0;
//         }
//       }
//     }
//   }
// }
