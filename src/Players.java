import java.util.*;
import java.io.*;
public class Players implements Serializable
{
    static Scanner in = new Scanner (System.in);
    String Username,Password,Name;
    static File f = new File("src\\Files\\Accounts.dat");
	static ObjectOutputStream out = null;
    static ArrayList<Players> playerList = new ArrayList();
    Players(String Username, String Password, String Name)
    {
        super();
        this.Username=Username;
        this.Password=Password;
        this.Name=Name;
    }
    static void AddDetails()
    {
        System.out.print("\n Enter Name: ");
        String name=in.next();
        System.out.print("\n Enter Username: ");
        String Username=in.next();
        System.out.print("\n Enter password: ");
        String Password=in.next();

        for(Players players: playerList)
        {
            if(players.Username==Username)
            {
                System.out.print("\n Player "+name+" already exists. \n Please join with your existing account");
            }
        }
        Players play = new Players(Username, Password, name);
        playerList.add(play);
    }
    static void CheckPlayer(String Username, String Password)
    {
        for(int i=0;i<=Players.playerList.size();i++)
        {
            if(Players.playerList.get(i).getUsername().contains(Username) && Players.playerList.get(i).getPassword().contains(Password))
            {
                Sudoku.wait(2000);
                System.out.print("\n LOGGIN SUCCESSFULL !!!");

                System.out.print("\n Name: "+ Players.playerList.get(i).Name);

            }
            else
            {
                System.out.println("    PLAYER NOT AVAILABLE ");
            }
        }
    }
    static void WriteData()
    {
        try 
        {
            out = new ObjectOutputStream(new FileOutputStream(f));
            for(Players i: playerList)
            {
                out.writeObject(i);
            }
            out.close();
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
    public String toString() 
    {
        return"{Username: "+Username+" Name: "+Name+" }\n";
    }
    public  String getUsername()
    {
        return Username;
    }

    public String getPassword()
    {
        return Password;
    }
}
