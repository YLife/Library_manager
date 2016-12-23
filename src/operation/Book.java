package operation;

public class Book {
	private String number;
	private String name;
	private String state;
	
	public static final String LEND = "½è³ö";
	public static final String NOT_LEND = "Î´½è³ö";
	
	
	public Book() {
		super();
	}
	
	
	public Book(String number, String name, String state) {
		super();
		this.number = number;
		this.name = name;
		this.state = state;
	}


	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
