public class Textsusu{
	public static void main(String agrs []){
		for(int i = 20160913;i <=30000000;i++){
			boolean b = false;
			for(int j = 2; j < i-1; j++){
				int k = i % j;
				if(k == 0){
					b = true;
				}
			}
			if(!b){
				System.out.println(i);
			}
		}
	}
}