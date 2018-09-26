package me.afua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Asking the user to enter name and add it
        System.out.println("Enter parent Name");
        String parentName = input.nextLine();
        Person theParent = new Person();
        theParent.setName(parentName);

//        Adding children here

        System.out.println("How many Children do you have?");
        int numberOfChildren = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfChildren; i++) {
            System.out.println("Enter child Name");
            String childrenName = input.nextLine();
            Person child = new Person();
            child.setName(childrenName);
            theParent.addAChild(child);

        }
        System.out.println("-----------Names--------");
        //printing the names of the  children's in loop
        ArrayList<String> theirNames = new ArrayList<>();
        for (Person eachChild : theParent.getMyChildren()) {

            theirNames.add(eachChild.getName());

            System.out.println(theParent.getName() + "'s child is " + eachChild.getName());
        }
        //printing in ascending order
        Collections.sort(theirNames);
        System.out.println("Sorted Names:\n");
        for (String aName : theirNames) {
            System.out.println(aName);
        }


    }
}
