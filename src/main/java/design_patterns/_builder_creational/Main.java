package design_patterns._builder_creational;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        Product p1 = new Product.Build()
                .price(45)
                .build();

        Product p2 = new Product.Build()
                .name("Panda")
                .price(33)
                .color("blac and White")
                .build();

        Product p3 = new Product.Build()
                .name("PandaG")
                .color("black and Red")
                .build();


        Product p4 = Product.builder()
                .name("Fox")
                .color("red")
                .price(43)
                .build();

        System.out.println(p4.equals(p3));
        Product.builder();


        BuilderDesignPattern b1 = BuilderDesignPattern.builder()           // implementare cu @lombok
                .firstName("Alex")
                .lastName("Ene")
                .build();

        System.out.println(b1.getFirstName());               // @lombok -  am apelat @Getter cu @lombok in clasa BuilderDesignPattern



//  A Locale object represents a specific geographical, political, or cultural region.
//  An operation that requires a Locale to perform its task is called locale-sensitive
//  and uses the Locale to tailor information for the user.
        Locale e1 = new Locale.Builder()   // clasa  Locale are aceasi structura
                .setLanguage("en")
                .build();


    }
}
