package day05;

public class Student {

	int StudentID;// �й�
	String name;// �̸�
	int graed;//����
	String address;//�ּ�

	// �����ϴ�(����)->�޼���
	public void study() {
		System.out.println(name +"�����ϴ�");
	}

	public static void main(String[] args) {
		Student s1=new Student();		
			
		s1.StudentID=100;
		s1.name="ȫ�浿";
		s1.graed=1;
		s1.address="�λ�";
		System.out.println("s1 �̸�:"+s1.name);
		
		Student s2=new Student();
		s2.StudentID=200;
		s2.name="�̼���";
		s2.graed=4;
		s2.address="����";
		System.out.println("s2 �̸�:"+s2.name);
				/*�̸��� �������̰� 3�г⿡ ��õ�� ��� �л�s3�� 
				 * �����ϰ�  s3�� �̸��� �ּҸ� ����Ͻÿ�
				 *
				 */
		Student s3=new Student();
	    s3.name="������";
	    s3.graed=3;
		s3.address="��õ";
		System.out.println("s3 �̸�:"+s3.name);
		System.out.println("s3 �ּ�:"+s3.address);
		//ȫ�浿�� �����ϴ�
						s1.study();
		//�������� �����ϴ� 
						s3.study();
					
		//�л��� play()��� �Լ��� ������ �ְ�	
		//���⿡�� �̸� ��Ѵٶ�� ���� ����ϱ�
	   
		
		
	
	}

}
