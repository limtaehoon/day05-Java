package day05;

public class TV {
	String maker;
	int yaer,inch;
	public TV(String maker,int yaer,int inch){
		this.maker=maker;
		this.yaer=yaer;
		this.inch=inch;
	
	}
	public void show() {
		System.out.println(maker+"���� ����"+yaer+"�� ��"+inch+"��ġ tv");
	
	}
	
	public static void main(String[] args) {
		TV tv=new TV("lg",2020,60);
		tv.show();//lg���� ���� 2020���� 60��ġ tv
		
		TV mytv=new TV("�Ｚ",2019,55);
		mytv.show();//�Ｚ���� ���� 2019���� 55��ġ tv
	}

}
