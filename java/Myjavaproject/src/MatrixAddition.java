public class MatrixAddition {
    public static void main(String [] args){

        int [][] num1={
                {1,2,3},
                {4,5,6},
                {8,9,0}
        };
        int [][] num2 ={{2,1,3},{6,5,4},{9,7,5}};
        int [][] sum=new int [3][3];

        for(int i=0;i<num1.length;i++){
            for(int j=0;j< num2.length;j++){
                sum[i][j]=num1[i][j] + num2[i][j];
            }
        }
        System.out.println("sum of two matrices :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
