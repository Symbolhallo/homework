public class tixing{
	public static void main(String args[]){
		int g = 8;int t = 15;int h = 9;//改变g与t与h可以改变梯形形状
		for(int i = 1;i < g;i++){
			for(int j = 0;j < t - i;j++){
				System.out.print(" ");
			}
			for(int k = 0;k < h + i ;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}