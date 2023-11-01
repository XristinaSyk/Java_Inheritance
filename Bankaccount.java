public class Bankaccount {
    private int accountnum;
    private int balance;
    private String custname;
    private String email;
    private int phonenum;

    public int getAccountnum() {
        return accountnum;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustname() {
        return custname;
    }

    public String getEmail() {
        return email;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setAccountnum(int accountnum) {
        this.accountnum = accountnum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public  void money_depositing(int fund){
        balance += fund;
        System.out.println("The new balance= "+balance);
    }

    public void money_withdrawing(int fund){
        if ((balance- fund)>0 || (balance-fund)==0) {
            balance = balance - fund;
            System.out.println("SUCCESS");
            System.out.println("The new balance= "+balance);
        }
        else
            System.out.println("ERROR");

    }

    public Bankaccount(){

    }

    public Bankaccount(int accountnum, int balance, String custname, String email, int phonenum){

    }
}


