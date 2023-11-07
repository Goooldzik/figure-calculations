import Exceptions.GreatherThanZeroException;
import Figures.Rectangle;
import Figures.Square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws GreatherThanZeroException {

        Scanner scanner = new Scanner(System.in);

        String newLine = System.lineSeparator();

        System.out.print(newLine);
        System.out.print("Wybierz co chcesz zrobić!" + newLine);

        System.out.print("1. Kwadrat i sześcian" + newLine);
        System.out.print("2. Prostokąt"+ newLine);
        //System.out.print("3. Trójkąty"+ newLine);
        //System.out.print("4. Koło"+ newLine);

        int option = scanner.nextInt();

        userOption(option);

    }

    public static void userOption(int option) throws GreatherThanZeroException {

        Scanner scanner = new Scanner(System.in);

        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        if (option == 1) {

            System.out.print("Podaj długość boku kwadratu wyrażoną w centymetrach: ");
            int length = scanner.nextInt();
            square.setSideLength(length);

            System.out.print("\n\nWybierz działanie, które chcesz wykonać \n");

            System.out.print("1. Oblicz obwód \n");
            System.out.print("2. Oblicz pole \n");
            System.out.print("3. Oblicz objętość sześcianu o podanym boku \n");
            System.out.print("4. Oblicz pole powierzchni sześcianu o podanym boku \n");
            System.out.print("5. Wszystkie powyższe \n\n");

            int opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("\n\nObwód kwadratu o podanym boku wynosi: " + square.circuit());
                    break;
                case 2:
                    System.out.print("\nPole kwadratu o podanym boku wynosi: " + square.field() + " cm2");
                    break;
                case 3:
                    System.out.print("\nObjętość sześcianu o podanym boku wynosi: " + square.capacity() + " cm3");
                    break;
                case 4:
                    System.out.print("\nPole powierzchni całkowitej sześcianu o podanym boku wynosi: " + square.area() + " cm2");
                    break;
                case 5:
                    System.out.print("\n\nObwód kwadratu o podanym boku wynosi: " + square.circuit() + " cm");
                    System.out.print("\nPole kwadratu o podanym boku wynosi: " + square.field() + " cm2");
                    System.out.print("\nObjętość sześcianu o podanym boku wynosi: " + square.capacity() + " cm3");
                    System.out.print("\nPole powierzchni całkowitej sześcianu o podanym boku wynosi: " + square.area() + " cm2\n");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór!");
                    break;
            };

        }

        if (option == 2) {

            System.out.print("Podaj długość pierwszego boku wyrażoną w centymetrach: ");
            int aLength = scanner.nextInt();

            System.out.print("Podaj długość drugiego boku wyrażoną w centymetrach: ");
            int bLength = scanner.nextInt();

            rectangle.setSidesLength(aLength, bLength);

            System.out.print("\n\nWybierz działanie, które chcesz wykonać \n");

            System.out.print("1. Oblicz obwód \n");
            System.out.print("2. Oblicz pole \n");
            System.out.print("3. Oblicz objętość prostopadłościanu o podanym boku \n");
            System.out.print("4. Oblicz pole powierzchni prostopadłościanu o podanym boku \n");
            System.out.print("5. Wszystkie powyższe \n\n");

            int opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Obwód prostokąta o podanym boku wynosi: " + rectangle.circuit());
                    break;
                case 2:
                    System.out.println("Pole prostokąta o podanym boku wynosi: " + rectangle.field() + " cm2");
                    break;
                case 3:
                    System.out.println("Aby obliczyć objętość musisz podać wysokość: ");

                    rectangle.setHeight(scanner.nextInt());

                    System.out.println("Objętość prostopadłościanu o podanym boku wynosi: " + rectangle.capacity() + " cm3");
                    break;
                case 4:
                    System.out.println("Aby obliczyć pole powierzchni musisz podać wysokość: ");

                    rectangle.setHeight(scanner.nextInt());

                    System.out.println("Pole powierzchni całkowitej prostopadłościanu o podanym boku wynosi: " + rectangle.area() + " cm2");
                    break;
                case 5:
                    System.out.println("Aby obliczyć objętość musisz podać wysokość: ");

                    rectangle.setHeight(scanner.nextInt());

                    System.out.println("Obwód prostokąta o podanym boku wynosi: " + rectangle.circuit() + " cm");
                    System.out.println("Pole prostokąta o podanym boku wynosi: " + rectangle.field() + " cm2");
                    System.out.println("Objętość prostopadłościanu o podanym boku wynosi: " + rectangle.capacity() + " cm3");
                    System.out.println("Pole powierzchni całkowitej prostopadłościanu o podanym boku wynosi: " + rectangle.area() + " cm2");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
            }

        }

    }
}