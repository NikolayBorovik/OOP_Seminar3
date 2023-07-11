package OOP_Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import OOP_Seminar3.*;

public class Program {
    public static void main(String[] args) {
        DogDrug dogDrug = new DogDrug(1);
        dogDrug.addComponent(new Water("water", "1", 1));
        dogDrug.addComponent(new ActiveIngr("Penicilin", "2", 6667));
        dogDrug.addComponent(new Flavour("Orange", "3", 3));

        // Iterator<Component> iter = dogDrug;
        // while(iter.hasNext()){                   // WHILE В СЛУЧАЕ IMPLEMENTS ITERATOR
        //     System.out.println(iter.next());
        // }

        // for (var component : dogDrug) {      // foreach в случае iterable
        //     System.out.println(component);
        // }

        DogDrug dogdrug2 = new DogDrug(2);
        dogdrug2.addComponent(new Water("water2", "", 1));
        dogdrug2.addComponent(new ActiveIngr("Ibuklin", "2", 109));
        dogdrug2.addComponent(new Flavour("Lemon", "3", 2));
        
        DogDrug dogdrug3 = new DogDrug(3);
        dogdrug3.addComponent(new Water("water3", "1", 1));
        dogdrug3.addComponent(new ActiveIngr("Nurofen", "2", 555));
        dogdrug3.addComponent(new Flavour("Watermelon", "3", 2));
        
        DogDrug dogdrug4 = new DogDrug(4);
        dogdrug4.addComponent(new Water("water4", "1", 1));
        dogdrug4.addComponent(new ActiveIngr("Nurofen", "2", 109));
        dogdrug4.addComponent(new Flavour("Watermelon", "3", 2));


        List <Drug> drugs = new ArrayList<>();
        drugs.add(dogDrug);
        drugs.add(dogdrug2);
        drugs.add(dogdrug3);
        drugs.add(dogdrug4);

        // for (Drug drug : drugs) {
        //     System.out.println(drug);
        // }
        
        // System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        // Collections.sort(drugs);

        // for (Drug drug : drugs) {
        //     System.out.println(drug);
        // }

        

        // Home task 1
        Set<Drug> result = new HashSet<>();
        result.add(dogDrug);
        result.add(dogdrug2);
        result.add(dogdrug3);
        result.add(dogdrug4);
        // System.out.println(result.size());

        // Home task 2

        for (Drug drug : drugs) {
            System.out.println(drug);
        }
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        Collections.sort(drugs);

        for (Drug drug : drugs) {
            System.out.println(drug);
        }
;
    
    }
}
