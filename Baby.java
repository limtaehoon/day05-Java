package day05;

public class Baby {
   String name;//���� ����
   int  age;//���� ����
   public Baby() {
   }
   
   public Baby(String name) {
   //���´�
	   this.name=name;
   }
public void smile() {//�Լ�(�޼���)����
		System.out.println(name+"���´�");


}
//���
public void cry() {//�Լ� (�޼���)����
		System.out.println(name+"���");
}
	public static void main(String[]args) {
	/*Baby ��ü b1�� �����
	 * �̸����̺�1 ����2
	 * ���̺� 1�� ���´�
	 * 
	 * Baby ��ü b2�� �����
	 * ���̺�2 ���
	 */
	Baby b1=new Baby();
	 	b1.name="���̺�1";
	 	b1.age =2;
	 	b1.smile();
	 		
	 			
	 	
	 	
	 Baby b2=new Baby();
	 		b2.name="���̺�2";
	 		b2.age =1;
	 		b2.cry();
	 		
		 	
			





}




}
