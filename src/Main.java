public class Main {
    public static void main(String[] args) {

        int clientAccount = 100; // Сумма на счете клиента
        int accountAdd = 2000; // Сумма пополнения
        int bonus = 0;// Бонусные рубли
        boolean replenishes = true;

        int sum = clientAccount + accountAdd;
        clientAccount = sum;

        if (accountAdd > 1000) {
            bonus = accountAdd / 100;
        } else {

        }
        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        System.out.println(clientAccount + " Счет клиента ");
        System.out.println(bonus + " Бонусы ");
    }
}
