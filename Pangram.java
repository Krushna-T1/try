import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class Pangram {
    public static void main(String[] args)
    {
        boolean flag=true;
       String s;
       char missing=' ';
       System.out.println("Enter Your Text");
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       String[] ch=s.split("");
       List<String> l=Arrays.asList(ch);
    for(char i='a';i <= 'z';i++)
    {
        if(!l.contains(String.valueOf(i)))
        {
            flag=false;
            missing=i;
            break;
        }
       
       
    }
    if(flag)
    {
        System.out.println("Entered Text is Pangram");
    }
    else{
        System.out.println("Entered Text missing latter "+ missing + " in it.\n It is Not Pangram ");
    }
    
   
    
    }
    
    
}
