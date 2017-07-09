public class House {
	int floors;
	String color;
	int bedrooms;
	String neighborhood;

	public House(int floors, String color, int bedrooms, String neighborhood) {
		this.floors = floors;
		this.color = color;
		this.bedrooms = bedrooms;
		this.neighborhood = neighborhood;
	}

	public void temp(int degrees) {
		System.out.println("The temperature of the house is " + degrees + " degrees.");
	}

	public static void print() {
		System.out.println("vroom");
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		House h1 = new House(2, "red", 5, "PQ");
		h1.temp(70);
		print();
		h1.setColor("white");
	}

}
