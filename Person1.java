class Person1{
	double a;
	double b;
	double c;
	double p;
	double area;
	Person1(double a,double b,double c){
		double p =(a + b + c)/2;
		double area = Math.sqrt(p * (p - a)*(p - b)*(p - c));
		System.out.println("三角形的面积是:"+area);
		
		}
	Person1(double a){
		double area = a * a;
		System.out.println("正方形的面积是："+area);
	}
	Person1(double a,double b){
		double area = a * b * b;
		System.out.println("圆形的面积是："+area);
	}
}