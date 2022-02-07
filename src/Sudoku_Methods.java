public class Sudoku_Methods
{
    static int[][] Sudoku=new int[9][9];
    static int[][] Sudoku_New=new int[9][9];

    static boolean ElementZero(int [][] Sudoku)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(Sudoku[i][j]==0)
                {
                    return true;
                }
            }
        }
        return false;
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

    }
}
