package basics.OOPS;

public class AccessSpecifiers {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount();

        accountOne.username = "Shradha";
        System.out.println(accountOne.username);

        accountOne.setPassword("fhvnfvef");
        System.out.println(accountOne.getPassword());

        // Below code will give error

        // accountOne.password = "fdhvfdnvfd";
        // System.out.println(accountOne.password);
    }
}

class BankAccount {
    public String username;
    private String password;

    // setting password
    public void setPassword(String pwd) {
        password = pwd;
    }

    // getting password
    public String getPassword() {
        return password;
    }
}
