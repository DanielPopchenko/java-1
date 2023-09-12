public class Variables {
    public static void main(String[] args) {
    // ! Java Variables

    // In Java, there are different types of variables, for example:

    // String - stores text, such as "Hello". String values are surrounded by double quotes
    // int - stores integers such as 123 or -123
    // float - stores floating numbers, such as 19.99 or -19.99
    // char - stores single characters, such as 'a' or 'B'. Char write with single quotes
    // boolean - stores values: true or false
    String name = "Anton";
    int number = 10;
    // final - создает константу которую нельзя переписать 
    final int myNum = 47;
    // ! В конце добавлять f 
    float floatNumber = 10.5f;
    // float floatNumber =  (float) 10.5;
    char myLetter = 'D';

    // ! Создать несколько переменных одного типа
    int a = 10, b = 5, c = 7;

    // ! Создать несколько переменных одного типа c одним значением 
    int x, y, z;
    x = y = z = 50;
    System.out.println(a+b+c);
    System.out.println(x+y+z);

    }
}
