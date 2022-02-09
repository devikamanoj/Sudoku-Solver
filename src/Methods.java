import java.util.*;
public class Methods
{
    static int[][] sudoku=new int[9][9];
    static int[][] sudokuNew=new int[9][9];
    static Scanner in = new Scanner(System.in);
    static int level;
    static boolean isRepeatingRow(int [][] sudoku,int number,int row)
    {
        for(int i=0;i<9;i++)
        {
            if(sudoku[row][i]==number)
            {
                return true;
            }
        }
        return false;
    }
    static boolean isRepeatingCol(int [][] sudoku,int number,int col)
    {
        for(int i=0;i<9;i++)
        {
            if(sudoku[i][col]==number)
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
            sudoku=SudokuInitialise.initialiseL1(sudoku);
            sudokuNew=SudokuInitialise.initialiseL1(sudokuNew);
            elementAdd();
        }
        else if(level==2)
        {
            sudoku=SudokuInitialise.initialiseL2(sudoku);
            sudokuNew=SudokuInitialise.initialiseL2(sudokuNew);
            elementAdd();
        }
        else if(level==3)
        {
            sudoku=SudokuInitialise.initialiseL3(sudoku);
            sudokuNew=SudokuInitialise.initialiseL3(sudokuNew);
            elementAdd();
        }
        else if(level==4)
        {
            sudoku=SudokuInitialise.initialiseL4(sudoku);
            sudokuNew=SudokuInitialise.initialiseL4(sudokuNew);
            elementAdd();
        }
        else if(level==5)
        {
            sudoku=SudokuInitialise.initialiseL5(sudoku);
            sudokuNew=SudokuInitialise.initialiseL5(sudokuNew);
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
        SudokuInitialise.print(sudoku);
        int row,col,num;
        while(!ifSolved(sudoku))
        {
            System.out.print("\n Enter the number: ");
            num = in.nextInt();
            if(correctNum(num))
            {
                System.out.print("\n Enter the row: ");
                row = in.nextInt();
                System.out.print("\n Enter the column: ");
                col = in.nextInt();
                if(!isRepeatingCol(sudoku, num, col-1) && !isRepeatingRow(sudoku, num, row-1)  && !checkMainElem(row-1, col-1))
                {
                    sudoku[row-1][col-1]=num;
                    System.out.println("Sudoku: ");
                    SudokuInitialise.print(sudoku);
                }
                else
                {
                    System.out.print("\n Oops!!! There is some problem in the number or the place in which the number has to be added !!!");
                }
            }
        }
        if(ifSolved(sudoku))
        {
            System.out.println("    YOU HAVE SUCCESSFULLY SOLVED THE PUZZLE !!!");
            SudokuInitialise.print(sudoku);

            System.out.print("\n Do you wish to continue? (Y/N) : ");
            String choice=in.next();

            if(choice.equals("Y")||choice.equals("y"))
            {
                Sudoku.oldPlayer();
            }
            else if(choice.equals("N")||choice.equals("n"))
            {
                System.out.println(" !!! THANKYOU !!!");
            }
            else
            {
                System.out.println("    INVALID OPTION");
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
        if(sudokuNew[row][col]!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static boolean ifSolved(int [][] sudoku)
    {
        int count=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(sudoku[i][j]!=0)
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
