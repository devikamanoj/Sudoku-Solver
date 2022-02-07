import java.util.*;

import java.io.*;
public class Players implements Serializable
{
    static Scanner in = new Scanner (System.in);
    String Username,Password,Name;
    static File f = new File("src\\Files\\Accounts.txt");
    static String account;
    static List<String> Acc_Details = new ArrayList<String>();
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

        account=Username+";"+Password+";"+name+"\n";
        
    }
    static void CheckPlayer(String User, String Pass)
    {
        readData();
        for(int i=0;i<Acc_Details.size();i++)
        {
            System.out.println(Acc_Details.get(i));
        }
    }
    static void WriteData()
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
    static void readData()
    {
        try 
        {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String details[]=line.split(";");
                Acc_Details=Arrays.asList(details);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
    public String toString() 
    {
        return"{Username: "+Username+" Name: "+Name+" }\n";
    }
}
