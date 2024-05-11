import java.util.Scanner;
public class sumof2matrices {
    //Scanner sc=new Scanner(System.in);
    public static void main(String[] args){

    
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int [][]a=new int[rows][cols];
    int [][]b=new int[rows][cols];
    int [][]c=new int[rows][cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){ 
            c[i][j]=a[i][j]+b[i][j];

        }
    }
}
static void matrixRead(int[][] mat){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            mat[i][j]=sc.nextInt();
        }
    }
}
}
