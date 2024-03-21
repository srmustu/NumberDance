import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        /*
        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */


        Scanner input = new Scanner(System.in);


        String message1;
        int number1, password, number2;

        password = 345;
        message1 = "Enter number : ";
        number2 = 0;

        do {
            System.out.print(message1);
            number1 = input.nextInt();

            if (number1 % 4 == 0) {
                number2 += number1;
            }


        } while (number1 != password);


        System.out.println("Total : " + number2);
    }

}
