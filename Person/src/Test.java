
public class Test {

	public static void main(String[] args){

		Person taro1=new Person();
		Person taro2=new Person();
		Robot aibo=new Robot();
		Robot asimo=new Robot();
		Robot pepper=new Robot();

		taro1.name="木村次郎";
		taro1.age=18;
		taro1.phoneNumber="03-0000-0000";
		taro1.address="東京都";

		taro2.name="鈴木花子";
		taro2.age=16;
		taro2.phoneNumber="090-0000-0000";
		taro2.address="神奈川県";

		aibo.name="アイボ";

		asimo.name="アシモ";

		pepper.name="ペッパー";


		System.out.println(taro1.name);
		System.out.println(taro1.age);
		System.out.println(taro1.phoneNumber);
		System.out.println(taro1.address);
		taro1.talk();
		taro1.walk();

		System.out.println(taro2.name);
		System.out.println(taro2.age);
		System.out.println(taro2.phoneNumber);
		System.out.println(taro2.address);
		taro2.run();

		aibo.walk();

		asimo.run();

		pepper.talk();

	}

}
