public class Customer {
    private String name;
    private int creditlimit;

    private String email;

    public String getName() {
        return name;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name, int creditlimit, String email){
        this.name=name;
        this.creditlimit=creditlimit;
        this.email=email;

    }
    public Customer(){
        this("Xristina",800, "xristina@gmail.com");

    }

    public Customer(String name, String email){
        this(name,500, email);
    }
}
