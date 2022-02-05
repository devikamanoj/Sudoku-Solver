public class Sudoko_initialise 
{
    
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
}
