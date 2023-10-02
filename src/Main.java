import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String newLine = System.lineSeparator();

        System.out.print(newLine);
        System.out.print("Wybierz co chcesz zrobić!" + newLine);

        System.out.print("1. Kwadrat i sześcian" + newLine);
        System.out.print("2. Prostokąt"+ newLine);
        System.out.print("3. Trójkąty"+ newLine);
        System.out.print("4. Koło"+ newLine);

        int option = scanner.nextInt();

        userOption(option);

    }

    public static void userOption(int option) {

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

            if (opt == 1) {

                System.out.print("\n\nObwód kwadratu o podanym boku wynosi: " + square.circuit());

            }

            if (opt == 2) {

                System.out.print("\nPole kwadratu o podanym boku wynosi: " + square.field() + " cm2");

            }

            if (opt == 3) {

                System.out.print("\nObjętość sześcianu o podanym boku wynosi: " + square.capacity() + " cm3");

            }

            if (opt == 4) {

                System.out.print("\nPole powierzchni całkowitej sześcianu o podanym boku wynosi: " + square.area() + " cm2");

            }

            if (opt == 5) {

                System.out.print("\n\nObwód kwadratu o podanym boku wynosi: " + square.circuit() + " cm");
                System.out.print("\nPole kwadratu o podanym boku wynosi: " + square.field() + " cm2");
                System.out.print("\nObjętość sześcianu o podanym boku wynosi: " + square.capacity() + " cm3");
                System.out.print("\nPole powierzchni całkowitej sześcianu o podanym boku wynosi: " + square.area() + " cm2\n");

            }

        }

        if (option == 2) {

            System.out.print("Podaj długość pierwszego boku wyrażoną w centymetrach: ");
            int aLength = scanner.nextInt();

            System.out.print("Podaj długość drugiego boku wyrażoną w centymetrach: ");
            int bLength = scanner.nextInt();

            rectangle.setSideALength(aLength);
            rectangle.setSideBLength(bLength);

            System.out.print("\n\nWybierz działanie, które chcesz wykonać \n");

            System.out.print("1. Oblicz obwód \n");
            System.out.print("2. Oblicz pole \n");
            System.out.print("3. Oblicz objętość prostopadłościanu o podanym boku \n");
            System.out.print("4. Oblicz pole powierzchni prostopadłościanu o podanym boku \n");
            System.out.print("5. Wszystkie powyższe \n\n");

            int opt = scanner.nextInt();

            if (opt == 1) {

                System.out.print("\n\nObwód prostokąta o podanym boku wynosi: " + rectangle.circuit());

            }

            if (opt == 2) {

                System.out.print("\nPole prostokąta o podanym boku wynosi: " + rectangle.field() + " cm2");

            }

            if (opt == 3) {

                System.out.print("Aby obliczyć objętość musisz podać wysokość: \n");
                int cLength = scanner.nextInt();

                System.out.print("\nObjętość prostopadłościanu o podanym boku wynosi: " + rectangle.capacity(cLength) + " cm3");

            }

            if (opt == 4) {

                System.out.print("Aby obliczyć objętość musisz podać wysokość: \n");
                int cLength = scanner.nextInt();

                System.out.print("\nPole powierzchni całkowitej prostopadłościanu o podanym boku wynosi: " + rectangle.area(cLength) + " cm2");

            }

            if (opt == 5) {

                System.out.print("Aby obliczyć objętość musisz podać wysokość: \n");
                int cLength = scanner.nextInt();

                System.out.print("\n\nObwód prostokąta o podanym boku wynosi: " + rectangle.circuit() + " cm");
                System.out.print("\nPole prostokąta o podanym boku wynosi: " + rectangle.field() + " cm2");
                System.out.print("\nObjętość prostopadłościanu o podanym boku wynosi: " + rectangle.capacity(cLength) + " cm3");
                System.out.print("\nPole powierzchni całkowitej prostopadłościanu o podanym boku wynosi: " + rectangle.area(cLength) + " cm2\n");

            }

        }

    }
}