import java.util.*;
import java.io.*;
public class Sudoku
{
    static int[][] Sudoku=new int[9][9];
    static int[][] Sudoku_New=new int[9][9];
    static Scanner in = new Scanner(System.in);
    
    static String Username,Password;
    public static void main(String[] args) 
    {

        System.out.println("        ************************");
        System.out.println("        WELCOME TO SUDOKO SOLVER");
        System.out.println("        ************************");
        while(true)
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
        }
    }
    static void NewPlayer()
    {
        Players.AddDetails();
        Players.WriteData();
        wait(2000);
        System.out.println("\n SUCCUSSFULLY SIGNED UP !!! \n PLEASE LOGIN IN TO PROCEED FURTHER !!!");
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