// ! Название класса в название файла 
public class Main {
  // !Каждая программа должна содержать метод main()
  public static void main(String[] args) {
    // ? System - built-in class in Java
    // ? println(...) - print line метод вывода информации в консоль 
    // ! println(...) - Текст внутри - только в "" скобках
    System.out.println("Hello World");
    System.out.println("I am learning Java");
    // ! System.out.print() - тоже выводит строки, но не ставит в конце пробел 
    // System.out.print("null");
    // System.out.print("null"); // ! nullnull

    System.out.println(1 + 1);
    System.out.println(10 * 3);

    // ! char
    // ? also can be used as ASCII values, you can use those to display certain characters

    char first = 60, second = 61, third = 62;

    System.out.println(first); // <
    System.out.println(second); // =
    System.out.println(third); // >
  }  

}

