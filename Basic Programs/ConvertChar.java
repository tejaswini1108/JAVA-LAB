class ConvertChar{
public static void main(String args[]){
char t = 'a';
String str,st;
str = Character.toString(t);
System.out.println("CHAR TO STRING IS "+str);
int i,l;
char ch;
st = "tejaswini";
l = st.length();
for(i=0;i<l;i++)
{
ch = st.charAt(i);
System.out.println("char at pos "+ (i+1) +" is " +ch);
}
}
}
