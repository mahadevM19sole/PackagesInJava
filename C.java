package p6;
import p5.*;
import java.util.*;
public class C implements I
{
    public ArrayList<String> m3()
      {
         Scanner sc=new Scanner(System.in);
  
         System.out.println("Enter first String");
          String s1=sc.nextLine();

         
         System.out.println("Enter second String");
          String s2=sc.nextLine();

         
         System.out.println("Enter third String");
          String s3=sc.nextLine(); 

         ArrayList<String> al=new ArrayList<String> ();
         
          al.add(s1);
          al.add(s2);
          al.add(s3);
         
          return al;
        
      }
}

