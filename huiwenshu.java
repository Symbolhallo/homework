import java.util.Scanner;
public class huiwenshu{
	public static void main(String[] agrs){
		

System.out.println("������һ������");
  Scanner in = new Scanner(System.in);
  String number = in.next();
  System.out.println("���������"+number);
  boolean flag = true;
  for(int i=0;i<number.trim().length()/2;i++){
    if(!String.valueOf(number.charAt(i)).equals(String.valueOf(number.charAt(number.trim().length()-i-1)))){
    flag = false;
    break;
   }
  }
  if(flag){
   System.out.println("���ǻ�����");
   }
   else{
   System.out.println("�����ǻ�����");
  }
	}
}