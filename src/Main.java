import java.util.Scanner;

public class Main
{
    public static void main(String args[] )
    {
        int balance = 1000000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("БАНКОМАТ");
            System.out.println("Введите 1 для снятия наличных");
            System.out.println("Введите 2 для пополнения баланса");
            System.out.println("Введите 3 для проверки баланса");
            System.out.println("Введите 4 для ВЫХОДА");
            System.out.print("Выберите операцию, которую хотите выполнить:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Введите сумму для вывода средств:");

                    withdraw = sc.nextInt();

                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Пожалуйста, заберите свои деньги");
                    }
                    else
                    {
                        System.out.println("Недостаточно средств");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Введите сумму для зачисления:");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Ваши деньги зачислены");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}