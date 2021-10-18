package no.hvl.dat100.filer.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	private static ArrayList<String> todos = new ArrayList<>();

	
	
	public static void main(String[] args) {
		boolean isRunnig = true;
		Scanner scanner = new Scanner(System.in);
		while (isRunnig) {
			printMenu();
			int choice = -1;
			String input = scanner.nextLine();
			try {
				choice = Integer.parseInt(input.trim());
			} catch (NumberFormatException e) {
				choice = -1;
			}
			System.out.println();
			switch (choice) {
			case 1:
				createNewTodo(scanner);
				break;
			case 2:
				showTodos();
				break;
			case 3: 
				finishTodo(scanner);
				break;
			case 4:
				isRunnig = false;
				break;
			default:
				System.out.println("Unknown option '" + input + "'");
				break;
			}	
		}
		scanner.close();
	}



	private static void finishTodo(Scanner scanner) {
		System.out.println("Enter the number of the ToDo that you just finished");
		String in = scanner.nextLine();
		int idx = -1;
		try {
			Integer.parseInt(in);
		} catch (NumberFormatException e) {
			idx = -1;
		}
		if (idx < 1 || idx > todos.size()) {
			System.out.println("ToDo with number " + idx + " does not exist");
		} else {
			todos.remove(idx -1);
		}
		
		
	}



	private static void showTodos() {
		if (todos.isEmpty()) {
			System.out.println("No open ToDos!!!");
		} else {
			System.out.println("Open ToDos:");
			for (int i=0;i<todos.size();i++) {
				System.out.println((i +1) + ": \"" + todos.get(i) +"\"");
			}	
		}
			
		System.out.println("\n");
	}



	private static void createNewTodo(Scanner scanner) {
		System.out.println("Enter description");
		String text = scanner.nextLine();
		todos.add(text);
		
	}



	private static void printMenu() {
		System.out.println("ToDo List App v.1.0");
		System.out.println("(1) Create new ToDo");
		System.out.println("(2) Show open ToDo's");
		System.out.println("(3) Mark ToDo as done");
		System.out.println("(4) Quit application");
		System.out.print("Choose option: ");
	}

}
