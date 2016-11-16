import java.util.Scanner;
public class huiwenshu{
	public static void main(String[] agrs){
		

System.out.println("请输入一个数字");
  Scanner in = new Scanner(System.in);
  String number = in.next();
  System.out.println("您输入的是"+number);
  boolean flag = true;
  for(int i=0;i<number.trim().length()/2;i++){
    if(!String.valueOf(number.charAt(i)).equals(String.valueOf(number.charAt(number.trim().length()-i-1)))){
    flag = false;
    break;
   }
  }
  if(flag){
   System.out.println("它是回文数");
   }
   else{
   System.out.println("它不是回文数");
  }
	}
}