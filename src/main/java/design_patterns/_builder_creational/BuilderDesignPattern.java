package design_patterns._builder_creational;

import lombok.Getter;

@lombok.Builder
@Getter

public class BuilderDesignPattern {
    //Builder     -> Objective: Creating objects
    //                 Creating complex objects 'dot by dot'
    //       		 How do I access the currently used object,
    //        	 so after calling one method I am able to call another method on the same object?
    //                                                  this !


    //                        I will use @lombok and  call the methods @Builder amd @Getter
    private String lastName;
    private String firstName;
    private int id;
    private int age;
}



