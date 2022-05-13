package Tree;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class EdgeCountApp
{

    public TreeNode{
        int nodeNumber;
        int left;
        int right;
    }

    public static int diameter(int N,int coordinates[][]){

        for (int i = 0; )


            return result;
    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //INPUT [uncomment & modify if required]
        int N=sc.nextInt();
        int M=2;

        int[][] coordinates=new int[N-1][2];

        for(int i=0;i<N-1;i++){
            for(int j=0;j<2;j++){
                coordinates[i][j]=sc.nextInt();
            }
        }

        sc.close();

        //OUTPUT [uncomment & modify if required]
        System.out.println(diameter(N,coordinates));
    }
}