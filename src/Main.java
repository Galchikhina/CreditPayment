public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        System.out.println();
        System.out.println("сумма 1 млн,срок 12 месяцев, ставка 9,99%)");
        System.out.println(service.calculate(1000000, 12, 9.99));

        System.out.println();
        System.out.println("сумма 1 млн,срок 24 месяца, ставка 9,99%)");
        System.out.println(service.calculate(1000000, 24, 9.99));

        System.out.println();
        System.out.println("сумма 1 млн,срок 36 месяцев, ставка 9,99%)");
        System.out.println(service.calculate(1000000, 36, 9.99));
    }

}
