import java.util.*;
import java.io.*;
public class Players
{
    static Scanner in = new Scanner (System.in);
    static String Username,Password,Name,account;
    static File f = new File("src\\Files\\Accounts.txt");
    static List<String> Acc_Details = new ArrayList<String>();
    
    static void addDetails()
    {
        System.out.print("\n Enter Name: ");
        String name=in.next();
        System.out.print("\n Enter Username: ");
        String Username=in.next();
        System.out.print("\n Enter password: ");
        String Password=in.next();

        account=Username+";"+Password+";"+name+"\n";
        
    }
    static void checkPlayer(String User, String Pass)
    {
        int count=0;
        try 
        {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(line.startsWith(User))
                {
                    count++;
                    String details[]=line.split(";");
                    Acc_Details=Arrays.asList(details);
                }
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("    FILE NOT FOUND !!!");
        }
        if(count ==0)
        {
            Sudoku.wait(1000);
            System.out.println("    Oops !!! Please Enter your Username and Password correctly !!!");
        }
        else
        {
            System.out.print("\n    LOADING.........");
            Sudoku.wait(1000);
            if(User.equals(Acc_Details.get(0)) && Pass.equals(Acc_Details.get(1)))
            {
                System.out.println("\n    YOU HAVE SUCCESSFULLY LOGGED IN !!!");

                System.out.print("\n Enter the level: ");
                int level=in.nextInt();
                Methods.run(level);
            }
            else
            {
                System.out.println("\n  USERNAME/PASSWORD IS INCORRECT");
            }
        }
    }
    static void writeData()
    {
        try 
        {
            FileWriter fw = new FileWriter(f, true);
            fw.write(account);
            fw.close();
        } 
        catch (FileNotFoundException e) 
        {
			System.out.println("    FILE NOT FOUND !!!");
		}
        catch (IOException e) 
        {
			e.printStackTrace();
		}
    }
}
