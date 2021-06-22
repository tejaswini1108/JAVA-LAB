class Sample{
void First(int a,int b)
{
int ans;
ans = a+b;
System.out.println("first :"+ans);
}
void First(int c,int d,int e)
{
int res;
res = c+d+e;
System.out.println("second :"+res);
}
}
class PolyDemo{
public static void main(String[] args){
Sample o = new Sample();
o.First(20,30);
o.First(40,50,60);
}
}


