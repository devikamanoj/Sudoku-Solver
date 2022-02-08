import java.util.*;
public class Sudoku_Methods
{
    static int[][] Sudoku=new int[9][9];
    static int[][] Sudoku_New=new int[9][9];
    static Scanner in = new Scanner(System.in);

    static boolean ElementZero(int [][] Sudoku, int row,int col)
    {
        if(Sudoku[row][col]!=0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    static boolean IsRepeatingRow(int [][] Sudoku,int number,int row)
    {
        for(int i=0;i<9;i++)
        {
            if(Sudoku[row][i]==number)
            {
                return true;
            }
        }
        return false;
    }
    static boolean IsRepeatingCol(int [][] Sudoku,int number,int col)
    {
        for(int i=0;i<9;i++)
        {
            if(Sudoku[i][col]==number)
            {
                return true;
            }
        }
        return false;
    }
    static void run(int level)
    {
        if(level==1)
        {
            Sudoku=Sudoku_initialise.initialise_L1(Sudoku);
            Sudoku_New=Sudoku_initialise.initialise_L1(Sudoku);
            ElementAdd();
        }
        else if(level==2)
        {
            Sudoku_initialise.initialise_L2(Sudoku);
            Sudoku_New=Sudoku_initialise.initialise_L2(Sudoku);
            ElementAdd();
        }
        else if(level==3)
        {
            Sudoku_initialise.initialise_L3(Sudoku);
            Sudoku_New=Sudoku_initialise.initialise_L3(Sudoku);
            ElementAdd();
        }
        else if(level==4)
        {
            Sudoku_initialise.initialise_L4(Sudoku);
            Sudoku_New=Sudoku_initialise.initialise_L4(Sudoku);
            ElementAdd();
        }
        else if(level==5)
        {
            Sudoku_initialise.initialise_L5(Sudoku);
            Sudoku_New=Sudoku_initialise.initialise_L5(Sudoku);
            ElementAdd();
        }
        else
        {
            System.out.println("\n    END OF GAME !!!");
            System.out.println("\n    YOU MAY RESTART THE GAME !!!");
        }
    }
    static void ElementAdd()
    {
        System.out.print("\n Enter the number: ");
        int num = in.nextInt();
        int row,col;
        if(CorrectNum(num))
        {
            System.out.print("\n Enter the row: ");
            row = in.nextInt();
            System.out.print("\n Enter the column: ");
            col = in.nextInt();

            if(!IsRepeatingCol(Sudoku, num, col) && !IsRepeatingRow(Sudoku, num, row) && ElementZero(Sudoku, row, col) && !CheckMainElem(row, col))
            {
                Sudoku[row][col]=num;
            }
        }
    }
    static boolean CorrectNum(int num)
    {
        if(num>0 && num<=9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static boolean CheckMainElem(int row, int col)
    {
        if(Sudoku_New[row][col]!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
