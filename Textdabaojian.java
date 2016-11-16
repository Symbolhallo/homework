public class Textdabaojian{
	public static void main(String agrs []){
		for(int i = 1;i <= 7;i++){
			for(int j = 0;j < 11 - i;j++){
			    System.out.print(" ");
			}
			for(int k = 0;k < i;k++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int a = 0;a <=20;a++){
				for(int b =0;b < 4;b++){
				System.out.print(" ");
			 	 
			}
			for(int c =0;c < 7;c++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int d = 1;d <= 3;d++){
			for(int e = 0;e < 2*d - 2;e++){
				System.out.print(" ");
			}
			for(int e = 0;e < 13 - 2*d;e++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for( int f = 0;f <=10;f++){
			for(int g = 0;g < 8;g++){
				System.out.print(" ");
			}
			for(int h = 0;h < 3;h++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}