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
        int row,column,number;
        System.out.print("Enter the row: ");
        row=in.nextInt();
        System.out.print("\n Enter the column: ");
        column=in.nextInt();

        // checks if the above mentioned position is occupied or not
        if(Sudoku[row-1][column-1]!=0)
        {
            System.out.println(" Oops !!! The given position is occupied !!!");
            number=Sudoku[row-1][column-1];
        }
        else
        {
            System.out.print("\n Enter the number: ");
            number=in.nextInt();
        }

        if(Sudoku[row-1][column-1]==0 &&!IsRepeatingCol(Sudoku, number) && !IsRepeatingRow(Sudoku, number))
        {
            Sudoku[row-1][column-1]=number;
        }
        else
        {
            System.out.println(" Oops !!! The number has been repeated !!!");
        }
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