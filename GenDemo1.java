class TwoGen<T,V>
{
 T ob1;
 V ob2;
 TwoGen(T O1,V O2)
{
 ob1=O1;
 ob2=O2;
}

T getob1()
{
 return ob1;
}
V getob2()
{
 return ob2;
}

void showType()
{
System.out.println("Type f T is"+ob1.getClass().getName());
System.out.println("Type f V is"+ob2.getClass().getName());
}
}

class GenDemo1{
public static void main(String args[])
{
TwoGen<Integer,Double>tgobj;
tgobj=new TwoGen<Integer,Double>(88,3.14);
tgobj.showType();
int v=tgobj.getob1();
System.out.println("Value is"+" "+v);
double d=tgobj.getob2();
System.out.println("Value is"+" "+d);

}
}
