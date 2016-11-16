public class Text01{
	public static void main(String agrs []){
		int score = 60;
		if(score >85 && score <= 100){
		    System.out.println("成绩为优");
		}
		else if(score > 75 && score <= 85){
			System.out.println("成绩为良");
		}
		else if(score > 60 && score <=75){
			System.out.println("成绩为合格");
		}
		else if(score <=60 && score >= 0){
			System.out.println("成绩为不乐观");
		}
		else if(score > 100 || score < 0){
			System.out.println("该生有天赋");
		}
	}
}