package OOP.Matrix;

import java.util.List;
import java.util.Map;

public class Task1 {
    private int stroki;
    private int stolbec;
    private int[][] matrix;
    private List li;
    private Map mp;

    public  Task1 (int stroki, int stolbec){
        this.stroki=stroki;
        this.stolbec=stolbec;
        matrix=new int [stroki][stolbec];
    }
    public void fullfill(){
        for (int i=0;i<stroki;i++){
            for (int j=0; j<stolbec;j++) {
                matrix[i][j]=(int)(Math.random()*10);
            }
        }
    }

    public void addMatrix(int a, int b) {
        int[][] ab = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ab[i][j] = (int) (Math.random() * 10);
            }
        }

    for (int i=0; i<stroki; i++) {
        for (int j = 0; j < stolbec; j++) {
            matrix[i][j]= ab[i][j] + matrix[i][j] ;
             }
    }
    }
    public void mnogitel( int b ) {
        for (int i=0; i<stroki; i++){
        for(int j=0; j<stolbec;j++){
            matrix[i][j]=matrix[i][j]*b;
        }
    }
    }
public void print(){
        for (int i=0; i<stroki; i++){
            for(int j=0; j<stolbec;j++){
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println();
        }
}

    public void setStolbec(int stolbec) {
        this.stolbec = stolbec;
    }

    public void setStroki(int stroki) {
        this.stroki = stroki;
    }

}
