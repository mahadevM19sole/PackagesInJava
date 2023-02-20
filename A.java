package p2;
import p1.*;
import p4.*;
public class A implements p1.I1
{
    public p3.I2 m1()
     {
          p4.B b=new p4.B();
           
          p3.I2 i2=b;
          return i2;   
     }
}

