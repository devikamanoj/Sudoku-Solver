import java.util.*;
public class Sudoku
{
    static int[][] Sudoku=new int[9][9];
    static int[][] Sudoku_New=new int[9][9];
    static HashMap <Integer,String> Username= new HashMap<Integer,String>();
    static HashMap <Integer,String> Password= new HashMap<Integer,String>();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {

        System.out.println("        ************************");
        System.out.println("        WELCOME TO SUDOKO SOLVER");
        System.out.println("        ************************");

        System.out.println(" Are you a Admin or a Player");
        System.out.println(" 1. Admin \n 2. Player");

        int choice=in.nextInt();
        if(choice==1)
        {
            adminLogin();
        }
        else if(choice==2)
        {
            UserLogin();
        }
        else
        {
            System.out.println(" INVALID CHOICE !!!");
        }

        in.close();
    }
    static void adminLogin()
    {
        System.out.println(" Are you a New User or an Old User ?");
        System.out.println(" 1. New User \n 2. Old User");
        int choice =in.nextInt();

        if(choice ==1)
        {
            NewUser();
        }
        else if(choice ==2)
        {
            OldUser();
        }
        else
        {
            System.out.println(" INVALID CHOICE !!!");
        }
    }
    static void OldUser()
    {
        System.out.println();
        System.out.println(" Enter Username: ");
        String user=in.next();
        System.out.println(" Enter Password: ");
        String pass=in.next();
        checkUserPresent(user, pass);
    }
    static void checkUserPresent(String user,String Pass)
    {
        String name,pass;
        for(int i=0;i<Username.size();i++)
        {
            name = Username.get(i);
            if(name.equals(user))
            {
                pass = Password.get(i);
                if(Pass.equals(pass))
                {
                    wait(2000);
                    System.out.println(" LOGGED IN");
                    wait(1000);
                    UserLogin();
                }
            }
        }
    }
    static void NewUser()
    {

    }
    public static void wait(int ms)
	{
		try
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
    static void UserLogin()
    {
        int row,column,number;
        
        System.out.print("Enter the row: ");
        row=in.nextInt();
        System.out.print("\n Enter the column: ");
        column=in.nextInt();

        while(Sudoku_Methods.ElementZero(Sudoku))
        {
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

            if(Sudoku[row-1][column-1]==0 &&!Sudoku_Methods.IsRepeatingCol(Sudoku, number) && !Sudoku_Methods.IsRepeatingRow(Sudoku, number))
            {
                Sudoku[row-1][column-1]=number;
            }
            else
            {
                System.out.println(" Oops !!! The number has been repeated !!!");
            }
        }

        Sudoku_initialise.Print(Sudoku);
    }
}