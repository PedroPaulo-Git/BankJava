package entites;

public class bank {
    private int numberAccount;
    private String holderAccount;
    private double balanceAccount;

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(double balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public bank(int numberAccount, String holderAccount, double balanceAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        this.balanceAccount = balanceAccount;
    }
}
