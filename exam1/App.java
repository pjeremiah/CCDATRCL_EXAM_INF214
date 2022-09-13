import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)
    System.out.println("======================================================");
    // 1. Create an array of characters of your SURNAME.
    char[] pagarigan = {'P','A','G','A','R','I','G','A','N'};

    // 2. Display each character of your SURNAME on each line.
    for (int i = 0; i < pagarigan.length; i++) {
        System.out.println(pagarigan[i]);
    }

    // 3. Display the first character of your SURNAME.
    System.out.println(pagarigan[0]);

    // 4. Display the last character of your SURNAME.
    System.out.println(pagarigan[8]);

    // 5. Display the character of your SURNAME in reverse order.
    for (int i = pagarigan.length -1; i>=0; i--) {
        System.out.println(pagarigan[i]);
    }

    // LINKED LIST (25 points)
    System.out.println("======================================================");
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    LinkedList<String> StudentNumber = new LinkedList<>();

    StudentNumber.add("1");
    StudentNumber.add("0");
    StudentNumber.add("9");
    StudentNumber.add("4");
    StudentNumber.add("1");
    StudentNumber.add("4");

    System.out.println(StudentNumber);

    // 2. Add an asterisk (*) to the head/front of the Linked list.
    StudentNumber.addFirst("*");

    // 3. Add an asterisk (*) to the tail/end of the Linked list.
    StudentNumber.addLast("*");
  
    // 4. Display the Linked list.

    System.out.println(StudentNumber);

    // 5. Display the last character of the Linked list.

    System.out.println(StudentNumber.get(7));
  
    // 6. Replace the last character of the Linked list with the exclamation symbol (!).

    StudentNumber.set(7, "!");

    // 7. Remove the first character of the Linked list.

    StudentNumber.remove(0);

    // 8. Display the LinkedList.

    System.out.println(StudentNumber);

    // STACK (25 points)
    System.out.println("======================================================");
    // 1. Create a Stack of characters of your SURNAME.
    Stack<String> surname = new Stack<>();

    surname.push("P");
    surname.push("A");
    surname.push("G");
    surname.push("A");
    surname.push("R");
    surname.push("I");
    surname.push("G");
    surname.push("A");
    surname.push("N");

    // 2. Print the Stack.
    System.out.println(surname); 

    // 3. Add a "INF214" to the stack.
    surname.push("");
    surname.push("I");
    surname.push("N");
    surname.push("F");
    surname.push("2");
    surname.push("1");
    surname.push("4");


    // 4. Print the Stack.
    System.out.println(surname);

    // 5. Remove "INF214".
    surname.pop();
    surname.pop();
    surname.pop();
    surname.pop();
    surname.pop();
    surname.pop();

    // 6. Add "CCDATRCL-INF214".
    surname.push("C");
    surname.push("C");
    surname.push("D");
    surname.push("A");
    surname.push("T");
    surname.push("R");
    surname.push("C");
    surname.push("L");
    surname.push("-");
    surname.push("I");
    surname.push("N");
    surname.push("F");
    surname.push("2");
    surname.push("1");
    surname.push("4");

    // 7. Print the Stack.

    System.out.println(surname);

    }
}
