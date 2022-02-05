import java.util.*;

public class Sudoku
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("        SUDOKO");
        System.out.println("        ------");
        int[][] Sudoku=new int[9][9];
        Sudoku_initialise.initialise(Sudoku);
        Sudoku_initialise.Print(Sudoku);

        in.close();
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
}