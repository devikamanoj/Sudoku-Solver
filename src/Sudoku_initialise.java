public class Sudoku_initialise 
{
    
    static void initialise(int [][]Sudoku)
    {
        // row 1
        Sudoku[0][1]=1 ;Sudoku[0][2]=2 ; Sudoku[0][8]=5 ;

        //row 2
        Sudoku[1][5]=6 ;Sudoku[1][6]=1 ;Sudoku[1][7]=8 ;

        //row 3
        Sudoku[2][2]=4 ;Sudoku[2][4]=3 ;Sudoku[2][7]=7 ;

        //row 4
        Sudoku[3][1]=2 ;Sudoku[3][4]=8 ;Sudoku[3][7]=4 ;

        //row 5
        Sudoku[4][0]=9 ;Sudoku[4][1]=7 ;Sudoku[4][6]=3 ;Sudoku[4][7]=6 ;

        //row 6
        Sudoku[5][2]=6 ; Sudoku[5][4]=1 ; Sudoku[5][5]=9 ; Sudoku[5][6]=5 ;

        //row 7
        Sudoku[6][1]=9 ;Sudoku[6][3]=4 ;Sudoku[6][4]=7 ;

        //row 8
        Sudoku[7][0]=8 ;Sudoku[7][1]=5 ;Sudoku[7][6]=2 ;Sudoku[7][8]=4 ;
        
        //row 9
        Sudoku[8][2]=3 ;Sudoku[8][3]=9 ;Sudoku[8][4]=2 ;Sudoku[8][6]=8 ;
    }
    
    static void Print(int[][] Sudoku)
    {
        System.out.println(" ---------------------------------");
        // for box 1
        for(int i=0;i<9;i++)
        {
            if(i==3||i==6)
            {
                System.out.println(" ---------------------------------");
            }
            for(int j=0;j<9;j++)
            {
                if(j==0)
                {
                    System.out.print(" | "+Sudoku[i][j]+" ");
                }
                else if(j==2 ||j==5||j==8)
                {
                    System.out.print(" "+Sudoku[i][j]+" | ");
                }

                else
                {
                    System.out.print(" "+Sudoku[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println(" ---------------------------------");
    }
}
