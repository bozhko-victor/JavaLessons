package guru.qa.lesson1.hw;

public class Card {
    private String cardSystem; //Visa, MasterCard, Mir
    private String cardType; // debit, credit
    private String userName;
    private long cardNumber;
    private double balance;
    private int validMonth;
    private int validYear;
    private boolean chipNFC;

    public Card(String cardSystem, String cardType, String userName, long cardNumber, double balance, int validMonth, int validYear, boolean chipNFC) {
        this.cardSystem = cardSystem;
        this.cardType = cardType;
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.validMonth = validMonth;
        this.validYear = validYear;
        this.chipNFC = chipNFC;
    }

    public Card(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public void refillCard (double sum) {   //пополнение
        balance = balance + sum;
    }

    public void withdrawalCard (double sum) {  //снятие
        if (balance >= sum) {
            balance = balance - sum;
        } else {
            System.out.println("Недостаточно средств на карте для совершения операции");
        }
    }

    public double getBalance() {
        return balance;
    }
}
