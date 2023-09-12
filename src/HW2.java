/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
В противном случае, программа должна выводить сообщение "Число корректно".
*/

/*
import java.util.Scanner;

class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        
        try {
            checkNumber(number);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void checkNumber(int number) {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }
}
*/

/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
 В противном случае, программа должна выводить результат деления.
Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception. 
Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.
*/

/*
import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Деление на ноль недопустимо");
    }
}

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();
            
            double result = divideNumbers(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divideNumbers(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException();
        }

        return (double) num1 / num2;
    }
}
*/