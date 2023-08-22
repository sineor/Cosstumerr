import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Passport passport1 = new Passport(21, "Nurbol", "man");
        Passport passport2=new Passport(27, "Elmira", "woman");



        Bank bank = new Bank("Nurbol", 1234, 1000,5000);
        Bank bank1=new Bank("Elmira", 2345, 1000,5000);

        Product product1 = new Product("chokolate"," made In KG",60,50,2023,"No");
        Product product2 = new Product("kefir","  svejiy ",40,78,2023,"No");
        Product product3 = new Product("mushrooms"," iz gora",100,39,2023,"No");


        Product product4 = new Product("ice creem ","vkusnyi  ",25,20,2023,"No");
        Product product5 = new Product("bread","jumshak",19,40,2023,"No");
        Product product6 = new Product("vodka"," original ",800,10,2021,"Yes");
        Product [] products1 = {product1,product2,product3};
        Product [] products2={ product4,product5,product6};

        Costumer customer=new Costumer("Nurbol", products1, bank, passport1);
        Costumer customer1=new Costumer("Elmira", products2, bank1, passport2);

        System.out.println(" dobavlyaem product vodka ");
        System.out.println(Arrays.toString( customer1.addProduct(product6)));



        customer.getCustomerOfMyProducts("Elmira");
        System.out.println("-----------------------------");

        System.out.println("Я удаляю mushrooms , остается kefir  and chokolate ");
        customer.deleteProductByName("rice", "rice");
        System.out.println("------------------------------------------");






        System.out.println("Я удаляю bread , остается kefir and ice creem and vodka ");
        customer1.deleteProductByName("bread", "bread");
        System.out.println("--------------------------------------------");
        product1.checkPoint(products1);
        product1.checkPoint(products2);
        System.out.println("--------------------------------------");

        System.out.println(product1.checkPoint2(products1));
        System.out.println(product1.checkPoint2(products2));
        System.out.println("--------------------------------------");



        System.out.println(customer1.getAge2("Elmira"));
        System.out.println("-------------------------------");
        System.out.println("Vozrast moih klientov, pokupaiushih takie productu, mushrooms ,kefir,chokolate sostovlyaet");
        System.out.println(customer1.getAge(products2));
        System.out.println("Vozrast pokupatelei, pokupayushih takie producty, как vodka , bread i ice creem ,  sostovlyaet");

        System.out.println(customer.getAge(products1));

        System.out.println("------------------------------");
        System.out.println("oplata za producty Nurbola ");
        System.out.println(bank.makePayment("Nurbol",1234,550));
        System.out.println("oplata za producty Elmiry s kreditom  ");
        System.out.println(bank1.makePaymentWithCredit("Elmira",2345,1050));









    }
}