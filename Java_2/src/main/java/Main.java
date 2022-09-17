import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Если вы желаете вводить данные в ручную то нажмите цифру 1." +
                " Если вы желаете что бы программа использовала данные по умолчанию нажмите цифру 2.");
        Scanner scanner = new Scanner(System.in);
        int workingMode = scanner.nextInt();

        if (workingMode == 1 || workingMode == 2) {
            Tasks tasks = new Tasks();
            tasks.task1(workingMode);
            tasks.task2(workingMode);
            tasks.task3(workingMode);
            tasks.task4(workingMode);
            tasks.task5(workingMode);
            tasks.task6(workingMode);
            tasks.task7(workingMode);
            tasks.task8(workingMode);

        }

        else {
            System.out.println("Введите значение заново!");
        }
    }

}

