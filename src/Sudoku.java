import java.util.*;

public class Sudoku
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("        SUDOKO");
        System.out.println("        ------");
        int[][] Sudoku=new int[9][9];
        
        for(int i=0;i<9;i++)
        {
            System.out.print("Enter element to row "+(i+1)+": ");
            for(int j=0;j<9;j++)
            {
                Sudoku[i][j]=in.nextInt();
            }
        }

    }
    static void initialise(int [][]Sudoko)
    {
        // row 1
        Sudoko[0][1]=1 ;Sudoko[0][2]=2 ; Sudoko[0][8]=5 ;

        //row 2
        Sudoko[1][5]=6 ;Sudoko[1][6]=1 ;Sudoko[1][7]=8 ;

        //row 3
        Sudoko[2][2]=4 ;Sudoko[2][4]=3 ;Sudoko[2][7]=7 ;

        //row 4
        Sudoko[3][1]=2 ;Sudoko[3][4]=8 ;Sudoko[3][7]=4 ;

        //row 5
        Sudoko[4][5]=6 ;Sudoko[4][5]=6 ;Sudoko[4][5]=6 ;Sudoko[4][5]=6 ;

        //row 6
        Sudoko[5][5]=6 ; Sudoko[5][5]=6 ; Sudoko[5][5]=6 ; Sudoko[5][5]=6 ;

        //row 7
        Sudoko[6][5]=6 ;Sudoko[6][5]=6 ;Sudoko[6][5]=6 ;

        //row 8
        Sudoko[7][5]=6 ;Sudoko[7][5]=6 ;Sudoko[7][5]=6 ;Sudoko[7][5]=6 ;
        
        //row 9
        Sudoko[8][5]=6 ;Sudoko[8][5]=6 ;Sudoko[8][5]=6 ;Sudoko[8][5]=6 ;
    }
    static boolean IsRepeatingRow(int [][] Sudoku,int number)
    {
        for(int i=0;i<9;i++)
        {
            int row=i;
            for(int j=0;j<9;j++)
            {
                if(Sudoku[row][j]==number)
                {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean IsRepeatingCol(int [][] Sudoku,int number)
    {
        for(int i=0;i<9;i++)
        {
            int col=i;
            for(int j=0;j<9;j++)
            {
                if(Sudoku[j][col]==number)
                {
                    return true;
                }
            }
        }
        return false;
    }
    static void Print(int[][] Sudoku)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(Sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
}