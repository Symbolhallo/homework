class Person1{
	double a;
	double b;
	double c;
	double p;
	double area;
	Person1(double a,double b,double c){
		double p =(a + b + c)/2;
		double area = Math.sqrt(p * (p - a)*(p - b)*(p - c));
		System.out.println("�����ε������:"+area);
		
		}
	Person1(double a){
		double area = a * a;
		System.out.println("�����ε�����ǣ�"+area);
	}
	Person1(double a,double b){
		double area = a * b * b;
		System.out.println("Բ�ε�����ǣ�"+area);
	}
}