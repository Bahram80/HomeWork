public class BankAccount {
    int id = 255;
    String name = "Ivan";
    double balance = 125.50;

    void popolnenieScheta(double summaPopolnenia) {
        System.out.println(balance += summaPopolnenia);

    }
    void snyatieSoScheta(double summaSnytia) {
        System.out.println(balance -= summaSnytia);
        System.out.println();

    }


}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();

        MyAccount.popolnenieScheta(125.50);
        MyAccount.snyatieSoScheta(125.5);
    }
}