package lesson1;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(1);
		Cat cat3 = new Cat(2, "Vaska");
		Cat cat4 = new Cat(2, "Semen");
		Cat cat5 = new Cat(2, "Pushok");
		Cat cat6 = new Cat(2, "Odin");
		Cat cat7 = new Cat(2, "Tima");

		cat3.sleep();
		cat4.eat();
		cat2.grow(1);

		int cat2Age = cat2.getAge();
		System.out.println(cat2Age);
		String cat3Nickname = cat3.getNickname();
		System.out.println(cat3Nickname);

		System.out.println(cat2.getAge());
		cat2.setAge(100);
		System.out.println(cat2.getAge());

		System.out.println(cat3.getNickname());
		cat3.setNickname("Mashka");
		System.out.println(cat3.getNickname());

		int i = 32;
		boolean m = false;

		if (i % 2 == 0)
			System.out.println("����� ������");
		else
			System.out.println("����� ��������");

		if (m & 1 == 0)
			System.out.println("����� ������");
		else
			System.out.println("����� ��������");

		int a = 5, b = 7;
		if (a > b)
			System.out.println("������� ����� a");
		else
			System.out.println("������� ����� b");

		if (b > a) {
			System.out.println("������� ����� b");
		} else
			System.out.println("������� ����� a");

		System.out.println("������� ��������������:" + (a + b) / 2);

	}

}
