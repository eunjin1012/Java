package week12;

class Person{
	String name;
	String address;
	String phone;
	public Person(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	
	
}

class Customer extends Person{
	int customerNumber;
	int mileage;
	public Customer(String name, String address, String phone) {
		super(name, address, phone);
		this.name=name;
		this.address=address;
		this.phone=phone;
		System.out.println("객체 1 :");
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("전화번호 : "+phone);
		System.out.println("고객번호 : "+customerNumber);
		System.out.println("마일리지 : "+mileage);
	}
	public Customer(String name, String address, int customerNumber, int mileage) {
		super(name, address);
		this.name=name;
		this.address=address;
		this.customerNumber = customerNumber;
		this.mileage = mileage;
		System.out.println("객체 2 :");
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("전화번호 : "+phone);
		System.out.println("고객번호 : "+customerNumber);
		System.out.println("마일리지 : "+mileage);
	}
	public Customer(String name)
	{
		super(name);
		this.name=name;
		
	}
}
