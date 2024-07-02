package Constructor;

public class customerMainMethod {
    public static void main(String[] args) {
        customer c = new customer("Shubham",100.00,"shubham@email");
        System.out.println(c.getName()+ "Having credit limit of"+c.getCreditLimit()+"And mail Id"+c.getEmail());
        customer c1 = new customer("priti",600.00,"priti@email");
        System.out.println(c1.getName()+ "Having credit limit of"+c1.getCreditLimit()+"And mail Id"+c1.getEmail());

        customer c2 = new customer();
        System.out.println(c2.getName()+ "having credit limit of"+c2.getCreditLimit()+"With mail id"+c2.getEmail());

        customer c3 = new customer("test4","test4@email");
        System.out.println(c3.getName()+ "having credit limit of"+c3.getCreditLimit()+"With mail id"+c3.getEmail());





    }
}
