public class Main {
    public static void main(String[] args) {

        int Clientaccount = 100; // Сумма на счете клиента
        int Accountadd = 200; // Сумма пополнения
        int Bonus = 0;// Бонусные рубли
        boolean replenishes = true;

        int Sum = Clientaccount + Accountadd;
        Clientaccount = Sum;

        if (Accountadd > 100) {
            Bonus = Accountadd / 100;
        } else {

        }
        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        System.out.println(Clientaccount + " Счет клиента ");
        System.out.println(Bonus + " Бонусы ");
    }
}
