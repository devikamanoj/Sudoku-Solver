public class Sudoku_Methods
{
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
        
    }
}
