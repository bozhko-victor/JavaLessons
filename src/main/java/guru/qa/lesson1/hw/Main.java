package guru.qa.lesson1.hw;

public class Main {
    public static void main(String[] args) {

        Card card1 = new Card("Egor Sidorov", 23674.18);
        System.out.println(card1.getBalance());
        card1.refillCard(15000.00);
        System.out.println(card1.getBalance());
        card1.withdrawalCard(117964.38);
        System.out.println(card1.getBalance());
        card1.withdrawalCard(11729.54);
        System.out.println(card1.getBalance());

    }
}
