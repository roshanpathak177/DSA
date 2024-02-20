class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n= matrix[0].length;
        // int matrix2[][]= new int[m][n];
        // for(int i=0; i<m; i++){
        //     for( int j =0; j<n; j++)
        //         matrix2[i][j]= matrix[i][j];
        // }

        // for(int i =0; i < m; i++){
        //     for(int j =0; j<n; j++){
        //         if(matrix[i][j] == 0){
        //             for(int k=0; k<n; k++)
        //                 matrix2[i][k]= 0;

        //             for(int k=0; k<m; k++)
        //                 matrix2[k][j]= 0;
        //         }
        //     }
        // }

        // for(int i=0; i <m; i++){
        //     for(int j=0; j<n; j++)
        //         matrix[i][j]= matrix2[i][j];
        // }
        // int rowsArray[] = new int[m];
        // int colsArray[] = new int[n];

        // Arrays.fill(rowsArray,1);
        // Arrays.fill(colsArray,1);

        // for(int i=0; i <m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j]== 0){
        //             rowsArray[i]=0;
        //             colsArray[j]=0;
        //         }
        //     }
        // }

        // for(int i= 0; i<m; i++){
        //     for(int j= 0; j<n; j++){
        //         if(rowsArray[i]==0 || colsArray[j]==0)
        //             matrix[i][j]=0;
        //     }
        // }
        boolean isRow0 =false, isCol0= false;

        for(int j=0; j<n; j++){
            if (matrix[0][j] == 0)
                isRow0 = true;
        }
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0)
                isCol0 = true;

        }
        for (int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i =1; i< m; i++){
            for(int j=1; j<n; j++){
                if(matrix[0][j]== 0 || matrix[i][0]==0)
                    matrix[i][j] =0;
            }
        }
        if(isRow0){
            for(int j=0;j<n;j++)
                matrix[0][j]=0;
        }

        if(isCol0){
            for(int i=0;i<m;i++)
                matrix[i][0]=0;
        }
    }
}