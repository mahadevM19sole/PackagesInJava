
import java.util.*;
import p1.*;
import p3.*;
import p5.*;
public class TestDemo
{
    public static void main(String args[])
      {
          p1.I1 i1=p7.DM.getcon();
          p3.I2 i2=i1.m1();

           p5.I i=i2.m2();
             
         ArrayList<String> w=i.m3();

           System.out.println(w); 
      } 
}