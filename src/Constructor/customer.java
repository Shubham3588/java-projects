package Constructor;

public class customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmail(){
        return email;
    }

    public customer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public customer(){
        this("test1",123.90,"test1@email");
    }
    public customer(String name,String email){
        this(name,123.89,email);
    }
}
