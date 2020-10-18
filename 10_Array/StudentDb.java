 import java.util.*;
public class StudentDb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total size");
        int s=sc.nextInt();
        sc.nextLine();
        String firstname[]=new String[s];
        
        String secondname[]=new String[s];
        
        int marks[]=new int[s];
      
        int classi[]=new int[s];
    
        for(int i=0;i<s;i++)
        {
            System.out.println("Enter First Name");
            firstname[i]=sc.next();
            
            System.out.println("Enter Second Name");
            secondname[i]=sc.next();
            
            System.out.println("Enter the Marks");
            marks[i]=sc.nextInt();
            
            System.out.println("Enter the Class");
            classi[i]=sc.nextInt();
        }
        
        for(int i=s-1;i>=0;i--)
        {
              
            System.out.println((i+1)+" "+firstname[i]+"\t"+secondname[i]+"\t"+marks[i]+"\t"+classi[i]);
            
         
        }
    }
}
