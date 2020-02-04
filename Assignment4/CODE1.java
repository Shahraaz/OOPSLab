
/**
 * Bank
 */
class Bank {

    int balance;

    Bank() {
        balance = 0;
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return 0;
    }

    /**
     * @param balance the balance to set
     */
    void setBalance(int balance) {
        this.balance = balance;
    }
}

/**
 * BankA
 */
class BankA extends Bank {
    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return balance;
    }

    BankA() {
        super();
        setBalance(1000);
    }
}

/**
 * BankA
 */
class BankB extends Bank {
    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return balance;
    }

    BankB() {
        super();
        setBalance(1500);
    }
}

/**
 * BankC
 */
class BankC extends Bank {
    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return balance;
    }

    BankC() {
        super();
        setBalance(2000);
    }
}

/**
 * CODE1
 */
public class CODE1 {
    public static void main(String[] args) {
        BankA A = new BankA();
        BankB B = new BankB();
        BankC C = new BankC();
        System.out.println(A.getBalance());
        System.out.println(B.getBalance());
        System.out.println(C.getBalance());            
    }
}