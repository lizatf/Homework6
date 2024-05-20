package bank;

import java.util.Scanner;

public class QA_27_6_1_Tuflina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard firstCard = new CreditCard(1,"1224 5556 6954 4235", 2250.5);
        CreditCard secondCard = new CreditCard(2,"8877 2200 3547 7458", 1560);
        CreditCard thirdCard = new CreditCard(3, "5555 0000 1111 2222", 200.5);
        firstCard.statusOfAccount();
        secondCard.statusOfAccount();
        thirdCard.statusOfAccount();

        System.out.print("Сумму, которую хотите внести на 1 карту: ");
        firstCard.accrualAmount(scanner.nextInt());

        System.out.print("Сумму, которую хотите внести на 2 карту: ");
        secondCard.accrualAmount(scanner.nextInt());

        System.out.print("Сумму, которую хотите снять с 3 карты: ");
        thirdCard.withdrawalAmount(scanner.nextInt());

        scanner.close();
    }
}
