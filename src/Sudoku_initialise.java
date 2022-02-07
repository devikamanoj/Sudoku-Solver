public class Sudoku_initialise 
{
    static int[][] initialise_L1(int [][]Sudoku)
    {
        // row 1
        Sudoku[0][1]=2 ;Sudoku[0][3]=7 ; Sudoku[0][4]=1 ;

        //row 2
        Sudoku[1][0]=8 ;Sudoku[1][2]=3 ;Sudoku[1][3]=9 ;Sudoku[1][4]=5 ;

        //row 3
        Sudoku[2][1]=4 ;Sudoku[2][2]=9 ;Sudoku[2][3]=6 ;Sudoku[2][5]=2 ;Sudoku[2][6]=1 ;Sudoku[2][7]=8 ;

        //row 4
        Sudoku[3][1]=9 ;Sudoku[3][2]=7 ;Sudoku[3][3]=5 ;Sudoku[3][4]=8 ;Sudoku[3][6]=4 ;Sudoku[3][8]=3 ;

        //row 5
        Sudoku[4][1]=8 ;Sudoku[4][4]=4 ;Sudoku[4][6]=6 ;Sudoku[4][7]=5 ;

        //row 6
        Sudoku[5][2]=6 ; Sudoku[5][5]=3 ; Sudoku[5][7]=2 ; Sudoku[5][8]=7 ;

        //row 7
        Sudoku[6][0]=5 ;Sudoku[6][4]=7 ;Sudoku[6][6]=2 ;Sudoku[6][7]=4 ;

        //row 8
        Sudoku[7][0]=1 ;Sudoku[7][2]=2 ;Sudoku[7][6]=9 ;Sudoku[7][7]=3 ;
        
        //row 9
        Sudoku[8][1]=3 ;Sudoku[8][2]=4 ;Sudoku[8][3]=8 ;Sudoku[8][5]=1 ;Sudoku[8][8]=6 ;

        return Sudoku;
    }
    static int[][] initialise_L2(int [][]Sudoku)
    {
        // row 1
        Sudoku[0][2]=6 ;Sudoku[0][8]=8 ;

        //row 2
        Sudoku[1][1]=9 ;Sudoku[1][4]=4 ;Sudoku[1][7]=6 ;

        //row 3
        Sudoku[2][1]=5 ;Sudoku[2][3]=1 ;Sudoku[2][4]=3 ;Sudoku[2][7]=7 ;

        //row 4
        Sudoku[3][2]=7 ;Sudoku[3][5]=9 ;Sudoku[3][7]=2 ;

        //row 5
        Sudoku[4][1]=1 ;Sudoku[4][2]=2 ;Sudoku[4][7]=4 ;

        //row 6
        Sudoku[5][0]=3 ; Sudoku[5][3]=8 ; Sudoku[5][6]=5 ; Sudoku[5][8]=9 ;

        //row 7
        Sudoku[6][1]=7 ;Sudoku[6][7]=9 ;Sudoku[6][8]=1 ;

        //row 8
        Sudoku[7][4]=2 ;Sudoku[7][5]=5 ;Sudoku[7][8]=3 ;
        
        //row 9
        Sudoku[8][0]=8 ;Sudoku[8][4]=6 ;Sudoku[8][8]=4 ;

        return Sudoku;
    }
    static int[][] initialise_L3(int [][]Sudoku)
    {
        // row 1
        Sudoku[0][0]=3 ;Sudoku[0][2]=9 ; Sudoku[0][6]=6 ;

        //row 2
        Sudoku[1][2]=2 ;Sudoku[1][6]=9 ;Sudoku[1][8]=4 ;

        //row 3
        Sudoku[2][4]=2 ;

        //row 4
        Sudoku[3][4]=8 ;Sudoku[3][7]=7 ;

        //row 5
        Sudoku[4][1]=5 ;Sudoku[4][5]=1 ;Sudoku[4][7]=6 ;

        //row 6
        Sudoku[5][4]=5 ; Sudoku[5][8]=9 ;

        //row 7
        Sudoku[6][2]=3 ;Sudoku[6][3]=7 ;Sudoku[6][4]=6 ;

        //row 8
        Sudoku[7][1]=6 ;Sudoku[7][2]=4 ;Sudoku[7][7]=5 ;
        
        //row 9
        Sudoku[8][1]=8 ;Sudoku[8][4]=1 ;Sudoku[8][5]=9 ;

        return Sudoku;
    }
    static int[][] initialise_L4(int [][]Sudoku)
    {
        // row 1
        Sudoku[0][5]=8 ;Sudoku[0][6]=2 ; Sudoku[0][8]=9 ;

        //row 2
        Sudoku[1][0]=7 ;Sudoku[1][6]=5 ;

        //row 3
        Sudoku[2][2]=2 ;Sudoku[2][4]=4 ;

        //row 4
        Sudoku[3][1]=5 ;Sudoku[3][3]=6 ;Sudoku[3][6]=9 ;Sudoku[3][8]=7 ;

        //row 5
        Sudoku[4][2]=9 ;Sudoku[4][6]=3 ;

        //row 6
        Sudoku[5][3]=7 ; Sudoku[5][5]=5 ; Sudoku[5][8]=4 ;

        //row 7
        Sudoku[6][5]=4 ;Sudoku[6][7]=1 ;

        //row 8
        Sudoku[7][0]=4 ;Sudoku[7][6]=6 ;
        
        //row 9
        Sudoku[8][1]=1 ;Sudoku[8][2]=8 ;Sudoku[8][7]=2 ;

        return Sudoku;
    }
    static int[][] initialise_L5(int [][]Sudoku)
    {
        // row 1
        Sudoku[0][0]=1 ;Sudoku[0][2]=8 ; Sudoku[0][3]=3 ;Sudoku[0][7]=9 ;

        //row 2
        Sudoku[1][1]=4 ;Sudoku[1][5]=5 ;

        //row 3
        Sudoku[2][5]=5 ;

        //row 4
        Sudoku[3][5]=7 ;Sudoku[3][6]=4 ;Sudoku[3][7]=5 ;

        //row 5
        Sudoku[4][3]=1 ;Sudoku[4][4]=2 ;

        //row 6
        Sudoku[5][2]=7 ; Sudoku[5][6]=6 ;

        //row 7
        Sudoku[6][2]=3 ;Sudoku[6][5]=4 ;Sudoku[6][7]=7 ;Sudoku[6][8]=2 ;

        //row 8
        Sudoku[7][4]=6 ;
        
        //row 9
        Sudoku[8][0]=8 ;Sudoku[8][2]=2 ;Sudoku[8][5]=3 ;

        return Sudoku;
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
