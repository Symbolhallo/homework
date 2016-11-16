class  Human {
	
	private String name;
	private int age;
    private String sex = "男";
	private String sex1 = "女";
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
		System.out.println("我的名字叫:"+this.name +"我的年龄是:"+ this.age +"性别:"+sex);
	}
	public void Introduce1(){
		System.out.println("这位大神叫:"+this.name + "他的年龄是:" + age1 +"性别:"+ sex);
	}
	public void Introduce2(){
		System.out.println("这位女神叫:"+this.name + "她的年龄是:" + age1 +"性别:"+ sex1);
	}
	public void daolao(){
		System.out.println("下面是红岩的大佬们：");
	}
	
}