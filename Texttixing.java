public class Texttixing{
	public static void main(String agrs []){
		for(int i = 1;i <= 3;i++){
			for(int j = 0;j < 6 - 2*i;j++){
			    System.out.print(" ");
			}
			for(int k = 0;k < 3+2*i;k++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}