import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
        ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

         */

        Scanner input = new Scanner(System.in);

        String message1, message2;
        int number1, number2;
        message1 = "Enter negative number : ";
        message2 = "Total : ";
        number2 = 0;

        do {
            System.out.print(message1);
            number1 = input.nextInt();

            if (number1 % 2 != 0) {
                number2 += number1;
            }
        } while (number1 > 0);

        System.out.println(message2 + number2);


    }
}