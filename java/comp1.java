class comp 
{
int rp;
int ip;
comp(int x,int y) //parameterized constructor
{
rp=x;
ip=y;
}
comp() //default constructor
{
rp=0;
ip=0;
}
void write()
{
  System.out.println(rp+" +i"+ip);
}
comp add1(comp c1,comp c2)
{
comp c3=new comp();
c3.rp=c2.rp+c1.rp;
c3.ip=c2.ip+c1.ip;
return(c3);
}
static comp add(comp c1,comp c2)
{comp c3=new comp();
   c3.rp=c2.rp+c1.rp;
   c3.ip=c2.ip+c1.ip;
return(c3);
}	
 comp add(comp c1)
{comp c3=new comp();
   c3.rp=rp+c1.rp;
   c3.ip=ip+c1.ip;
return(c3);
}
}


class comp1
{
  public static void main(String args[])
   {
      comp c1=new comp(4,5);
      comp c2=new comp(7,8);
      comp c3;
   	c3=c1.add1(c1,c2); // object passing method can pass c1. or c2.
	c3.write();
c3=comp.add(c1,c2); //static method
c1.write();
c2.write();
c3.write();
c3=c2.add(c1);  //this method //c2+c1
c3.write();
}}
