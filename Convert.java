import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Convert {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roman Number");
        String num=sc.next().toUpperCase();

        Map<Character,Integer>con =new HashMap<>();
        con.put('I',1);
        con.put('V',5);
        con.put('X',10);
        con.put('L',50);
        con.put('C',100);
        con.put('D',500);
        con.put('M',1000);
      int result=0;
      int prev=0;
        for(int i=0;i<num.length();i++)
        {
            char a=num.charAt(i);
            int number=con.get(a);
           if(number<prev)
           {
            result -=number;
            
           }
           else{
            result +=number;

           }
           prev=number;  

        }
        System.out.println(result);



    }
    
}
