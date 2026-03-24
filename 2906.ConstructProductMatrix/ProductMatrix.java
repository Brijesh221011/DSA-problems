// 2906. Construct Product Matrix
//time=O(n*m),where n and m are the dimensions of the grid
//space=O(n*m)


class ProductMatrix{

    int MOD=12345;

    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int k=n*m;
        int[] temp=new int[k];
        int indx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[indx++]=grid[i][j]%MOD;
            }
        }

        int[]pref=new int[k];
        pref[0]=1;

        for(int i=1;i<k;i++){
            pref[i]=(pref[i-1]*temp[i-1])%MOD;
        }

        int[]suff=new int[k];
        suff[k-1]=1;
         
        for(int i=k-2;i>=0;i--){
            suff[i]=(suff[i+1]*temp[i+1])%MOD;
        }


        int res[][]=new int[n][m];

        for(int i=0;i<k;i++){
            res[i/m][i%m]=(pref[i]*suff[i])%MOD;
        }

        return res;
    }
}