class  Human {
	
	private String name;
	private int age;
    private String sex = "��";
	private String sex1 = "Ů";
	private int age1 = 18;
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return this.name;
	}
	void setAge(int age){
		this.age = age;
	}
	int age (){
		return this.age;
	}
	public void Introduce(){
		System.out.println("�ҵ����ֽ�:"+this.name +"�ҵ�������:"+ this.age +"�Ա�:"+sex);
	}
	public void Introduce1(){
		System.out.println("��λ�����:"+this.name + "����������:" + age1 +"�Ա�:"+ sex);
	}
	public void Introduce2(){
		System.out.println("��λŮ���:"+this.name + "����������:" + age1 +"�Ա�:"+ sex1);
	}
	public void daolao(){
		System.out.println("�����Ǻ��ҵĴ����ǣ�");
	}
	
}