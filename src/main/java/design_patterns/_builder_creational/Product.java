package design_patterns._builder_creational;

public class Product {                                       // clasa produsului meu

    private String name;
    private String color;
    private Integer price;
//more attribute
    private Product(){

    }


    public static class Build {                                    // construiesc o clasa statica in clasa produslui meu
        private  final Product product =  new Product();                    // instantiez clasa Product in clasa Build

        public Build name(String name){                                     // construiesc metode pentru  fiecare camp din clasa Product.
            product.name =name;
            return this;
        }
        public Build color(String color){                                   // se foloseste verb la meotda insa aici avem clasa Build care deja face ceva .  insa daca se insista se poate pune un Set.
            product.color = color;
            return this;
        }
        public Build price (Integer price){
            product.price = price;
            return this;
        }

       public Product build (){
            return  product;
       }
    }
    public static   Build builder(){
        return new Build();
    }

}
