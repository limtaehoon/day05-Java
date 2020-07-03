package day05;

public class Baby {
   String name;//변수 선언
   int  age;//변수 선언
   public Baby() {
   }
   
   public Baby(String name) {
   //웃는다
	   this.name=name;
   }
public void smile() {//함수(메서드)생성
		System.out.println(name+"웃는다");


}
//운다
public void cry() {//함수 (메서드)생성
		System.out.println(name+"운다");
}
	public static void main(String[]args) {
	/*Baby 객체 b1을 만들고
	 * 이름베이비1 나이2
	 * 베이비 1이 웃는다
	 * 
	 * Baby 객체 b2을 만들고
	 * 베이비2 운다
	 */
	Baby b1=new Baby();
	 	b1.name="베이비1";
	 	b1.age =2;
	 	b1.smile();
	 		
	 			
	 	
	 	
	 Baby b2=new Baby();
	 		b2.name="베이비2";
	 		b2.age =1;
	 		b2.cry();
	 		
		 	
			





}




}
