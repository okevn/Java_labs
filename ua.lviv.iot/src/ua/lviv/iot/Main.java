package ua.lviv.iot;

public class Main {
	public static void main(String[] args) {
		Notebook firstNotebook = new Notebook();
		Notebook secondNotebook = new Notebook("Black", 100, 20, "Soft");
		Notebook thirdNotebook = new Notebook("Red", 80, 15, "Hard", "China", 5);

		System.out.println(firstNotebook.toString());
		System.out.println(secondNotebook.toString());
		System.out.println(thirdNotebook.toString());

		System.out.println("Printing static int Size: " + firstNotebook.printSize());
		System.out.println("Printing static int Size: " + secondNotebook.printSize());
		System.out.println("Printing static int Size: " + thirdNotebook.printSize());
	}
}
