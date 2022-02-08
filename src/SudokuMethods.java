import java.util.*;
public class SudokuMethods
{
    static int[][] Sudoku=new int[9][9];
    static int[][] SudokuNew=new int[9][9];
    static Scanner in = new Scanner(System.in);
    static int level;
    static boolean elementZero(int [][] Sudoku, int row,int col)
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
    static boolean isRepeatingRow(int [][] Sudoku,int number,int row)
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
    static boolean isRepeatingCol(int [][] Sudoku,int number,int col)
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
            Sudoku=SudokuInitialise.initialiseL1(Sudoku);
            SudokuNew=SudokuInitialise.initialiseL1(Sudoku);
            elementAdd();
        }
        else if(level==2)
        {
            SudokuInitialise.initialiseL2(Sudoku);
            SudokuNew=SudokuInitialise.initialiseL2(Sudoku);
            elementAdd();
        }
        else if(level==3)
        {
            SudokuInitialise.initialiseL3(Sudoku);
            SudokuNew=SudokuInitialise.initialiseL3(Sudoku);
            elementAdd();
        }
        else if(level==4)
        {
            SudokuInitialise.initialiseL4(Sudoku);
            SudokuNew=SudokuInitialise.initialiseL4(Sudoku);
            elementAdd();
        }
        else if(level==5)
        {
            SudokuInitialise.initialiseL5(Sudoku);
            SudokuNew=SudokuInitialise.initialiseL5(Sudoku);
            elementAdd();
        }
        else
        {
            System.out.println("\n    END OF GAME !!!");
            System.out.println("\n    YOU MAY RESTART THE GAME !!!");
        }
    }
    static void elementAdd()
    {
        System.out.println("\n Here is your puzzle:  ");
        SudokuInitialise.print(Sudoku);
        System.out.print("\n Enter the number: ");
        int num = in.nextInt();
        int row,col;
        if(correctNum(num))
        {
            System.out.print("\n Enter the row: ");
            row = in.nextInt();
            System.out.print("\n Enter the column: ");
            col = in.nextInt();
            while(!ifSolved(Sudoku))
            {
                if(!isRepeatingCol(Sudoku, num, col) && !isRepeatingRow(Sudoku, num, row) && elementZero(Sudoku, row, col) && !checkMainElem(row, col))
                {
                    Sudoku[row][col]=num;
                    SudokuInitialise.print(Sudoku);
                }
                if(ifSolved(Sudoku))
                {
                    System.out.println("    YOU HAVE SUCCESSFULLY SOLVED THE PUZZLE !!!");
                    SudokuInitialise.print(Sudoku);
                }
            }

        }
    }
    static boolean correctNum(int num)
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
    static boolean checkMainElem(int row, int col)
    {
        if(SudokuNew[row][col]!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static boolean ifSolved(int [][] Sudoku)
    {
        int count=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(Sudoku[i][j]!=0)
                {
                    count++;
                }
            }
        }
        if(count==81)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
