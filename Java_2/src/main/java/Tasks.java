import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Tasks {

    public void task1(int workingMode) throws FileNotFoundException {

        double a;

        double b;

        double c;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            a = scanner.nextInt();

            System.out.println("Введите b ");

            b = scanner.nextInt();

            System.out.println("Введите c ");

            c = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z1.txt";

            Scanner scanner = new Scanner(new File(path));

            a = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + a);

            b = scanner.nextInt();

            System.out.println("Ввод b из файла, b=" + b);

            c = scanner.nextInt();

            System.out.println("Ввод c из файла, c=" + c);

        }

        System.out.println("Результат равен "+ ((b+Math.sqrt((b*b)+(4*a*c)))/(2*a)-a*a*a*c+(1/(double)(b*b))));

    }

    public void task2(int workingMode) throws FileNotFoundException {

        double a;

        double b;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            a = scanner.nextInt();

            System.out.println("Введите b ");

            b = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z2.txt";

            Scanner scanner = new Scanner(new File(path));

            a = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + a);

            b = scanner.nextInt();

            System.out.println("Ввод b из файла, b=" + b);

        }

        System.out.println("P= "+ (a+b+Math.sqrt((a*a)+(b*b))));

        System.out.println("S= "+(a*b/2));

    }

    public void task4(int workingMode) throws FileNotFoundException {

        double a;

        double b;

        double c;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            a = scanner.nextInt();

            System.out.println("Введите b ");

            b = scanner.nextInt();

            System.out.println("Введите c ");

            c = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z4.txt";

            Scanner scanner = new Scanner(new File(path));

            a = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + a);

            b = scanner.nextInt();

            System.out.println("Ввод b из файла, b=" + b);

            c = scanner.nextInt();

            System.out.println("Ввод c из файла, c=" + c);

        }

        if(a<b&&b<c){

            a=a*2;

            b=b*2;

            c=c*2;

        }

        else {

            a=Math.abs(a);

            b=Math.abs(b);

            c=Math.abs(c);

        }

        System.out.println("a= "+ a + " b= " + b + " c= " + c);

    }

    public void task3(int workingMode) throws FileNotFoundException {

        double a;

        double b;

        double c;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            a = scanner.nextInt();

            System.out.println("Введите b ");

            b = scanner.nextInt();

            System.out.println("Введите c ");

            c = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z3.txt";

            Scanner scanner = new Scanner(new File(path));

            a = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + a);

            b = scanner.nextInt();

            System.out.println("Ввод b из файла, b=" + b);

            c = scanner.nextInt();

            System.out.println("Ввод c из файла, c=" + c);

        }

        if(a>0){

            a=a*a;

        }

        else {

            a= (int) Math.pow(a,4);

        }

        if(b>0){

            b=b*b;

        }

        else {

            b= (int) Math.pow(b,4);

        }

        if(c>0){

            c=c*c;

        }

        else {

            c= (int) Math.pow(c,4);

        }

        System.out.println("a= "+ a + " b= " + b + " c= " + c);

    }

    public void task5(int workingMode) throws FileNotFoundException {

        int a;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            a = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z5.txt";

            Scanner scanner = new Scanner(new File(path));

            a = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + a);

        }

        switch (a) {

            case 1: System.out.println("5 уроков");

                break;

            case 2: System.out.println("7 уроков");

                break;

            case 3: System.out.println("6 уроков");

                break;

            case 4: System.out.println("8 уроков");

                break;

            case 5: System.out.println("9 уроков");

                break;

            case 6: System.out.println("3 урока");

                break;

            case 7: System.out.println("4 урока");

                break;

            default:

                break;

        }

    }

    public void task6(int workingMode) throws FileNotFoundException {

        int n;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            n = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z6.txt";

            Scanner scanner = new Scanner(new File(path));

            n = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + n);

        }

        int summ=0;

        summ=n%10;

        do {

            n = n / 10;

        }

        while (n>10);

        summ = summ + n;

        System.out.println("summ= "+ summ );

    }

    public void task7(int workingMode) throws FileNotFoundException {

        int n;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            n = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z7.txt";

            Scanner scanner = new Scanner(new File(path));

            n = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + n);

        }

        int i;

        int f=1;

        n=n/3;

        for(i=0; i<n; i++)

        {

            f=f*2;

        }

        System.out.println("амеб " + f );

    }

    public void task8(int workingMode) throws FileNotFoundException {

        int n;

        if (workingMode == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");

            n = scanner.nextInt();

        }

        else {

            String path = "C:\\lifirenko\\z8.txt";

            Scanner scanner = new Scanner(new File(path));

            n = scanner.nextInt();

            System.out.println("Ввод a из файла, a=" + n);

        }

        int i=1;

        float res=1;

        while (i<=n) {

            res *= (float) (2 * i) / (2 * i + 1);

            i++;

        }

        System.out.println("результат " + res );

    }}
