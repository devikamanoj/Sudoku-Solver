import java.util.*;
public class Sudoku
{
    static Scanner in = new Scanner(System.in);
    static String Username,Password;
    public static void main(String[] args) 
    {
        System.out.println("        ************************");
        System.out.println("        WELCOME TO SUDOKO SOLVER");
        System.out.println("        ************************");

        char bool='y';
        do
        {
            System.out.println("\n Are you a: ");
            System.out.println(" 1. New Player \n 2. Old Player");
            System.out.print("\n Enter your choice: ");
            int choice = in.nextInt();
        
            if(choice==1)
            {
                NewPlayer();
            }
            else if (choice==2)
            {
                OldPlayer();
            }
            else
            {
                System.out.println("\n    !!! INVALID CHOICE !!!");
            }
            System.out.print("\nDo you wish to continue? (Y/N) : ");
            bool=in.next().charAt(0);
            System.out.print("\n");
        }
        while(bool=='Y'||bool=='y');
    }
    static void NewPlayer()
    {
        Players.AddDetails();
        Players.WriteData();
        wait(2000);
        System.out.println("\n SUCCUSSFULLY SIGNED UP !!! \n PLEASE LOGIN IN TO PROCEED FURTHER !!!");
        Players.CheckPlayer(Username, Password);
    }
    static void OldPlayer()
    {
        System.out.print("\n Enter Username: ");
        String Username=in.next();
        System.out.print("\n Enter Password: ");
        String Password = in.next();
        wait(2000);
        Players.CheckPlayer(Username, Password);
    }
    static void wait(int ms)
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
}