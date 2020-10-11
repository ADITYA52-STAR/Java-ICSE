import java.util.*;
public class ElectricMetre 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int nd,rf;
        System.out.println("Enter the no. days");
        nd=sc.nextInt();
        if(nd<=10)
        {
            rf=nd*50;
            System.out.println("The Rental Fair will be="+rf);
        }
        else if(nd<=20)
        {
            rf=(10*50)+(nd-10)*40;
            System.out.println("The Rental Fair will be="+rf);
        }
        else if(nd<=30)
        {
            rf=(10*50)+(20*40)+(nd-20)*55;
            System.out.println("The Rental Fair will be="+rf);
        }
        else
        {
            rf=((10*50)+(20*40)+(30*55)+(nd-30)*25)*(10/100);
            System.out.println("The Rental Fair will be="+rf);
        }
    }
}