public class unionintersion {

    public static void main(String[] args) {
        int [] [] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    System.out.println("not Diangol");
                }
            }
            System.out.println();

        }
       


        
    }
    
}
