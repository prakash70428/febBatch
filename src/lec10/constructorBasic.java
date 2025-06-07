package lec10;

public class constructorBasic {
	public static class Person{
		String name;
		int age;
		
		public void saysHi() {
			System.out.println(name + "@" + age + " says Hi");
		}
		
		//default constructor
		public Person() {
			
		}
		
		//parametrized constructor
		public Person(String name,int age) {
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("A",10);
		p1.saysHi();
		
		Person p2 = new Person("B",20);
		p2.saysHi();
	}

}
