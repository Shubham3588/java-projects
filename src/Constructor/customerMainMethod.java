package Constructor;

public class customerMainMethod {
    public static void main(String[] args) {
        customer c = new customer("Shubham",100.00,"shubham@email");
        System.out.println(c.getName()+ "Having credit limit of"+c.getCreditLimit()+"And mail Id"+c.getEmail());
        customer c1 = new customer("priti",600.00,"priti@email");
        System.out.println(c1.getName()+ "Having credit limit of"+c1.getCreditLimit()+"And mail Id"+c1.getEmail());




    }
}
