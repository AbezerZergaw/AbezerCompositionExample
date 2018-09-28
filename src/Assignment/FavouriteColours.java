package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class FavouriteColours {

    public static void main(String[] args) {
        //instantiation of person class as HashSet
        HashSet<PersonInfo> myProfile = new HashSet<>();


        print("-----Profile-----");
        Scanner input = new Scanner(System.in);

        // print("Enter your name");

        String data;
        //Filling out name, email and fav color
        //do while loop till we say no
        do {
            print("Enter your name");
            PersonInfo person = new PersonInfo();
            String userName = input.nextLine();
            person.setName(userName);

            print("Enter your Email Address");

            String userEmail = input.nextLine();
            person.setEmailAddress(userEmail);

            print("Enter your Favourite colour ");

            String favColor = input.nextLine();
            person.setFavouriteColour(favColor);
            myProfile.add(person);

            print("Do we have next person? Yes or AnyKey");
            data = input.nextLine();


        } while (data.equalsIgnoreCase("Yes"));

        //printing the input using enhanced for loop
        for (PersonInfo obj : myProfile) {

            print("Name: " + obj.getName() + "\n" + "Email: " + obj.getEmailAddress() + "\n" +
                    "Favourite Color: " + obj.getFavouriteColour() + "\n");
        }
        print("----------------------");
        ArrayList<String> myNames = new ArrayList<>();

        //Searching for person who have same fav color in a loop
        print("Search for color, so you can see a contact list of people with the same color");

        String color = input.nextLine();
        for (PersonInfo obj : myProfile) {
            if (color.equalsIgnoreCase(obj.getFavouriteColour())) {

                myNames.add(obj.getName());

            }

        }
        for (String names: myNames) {
            print(names);
        }

        if(color.equalsIgnoreCase("Grey")){
            print("Ok");
        }
        else if(color.equalsIgnoreCase("Blue")){
            print("That's a nice colour!" );
        }else if(color.equalsIgnoreCase("Red")){
            print("It's pops");
        }else {
            String [] random={"Nice choice", "Bad choice", "Cool color"};
            Random ran = new Random();
            String coloName = random[ran.nextInt(random.length)];
            FeedBack newfeedback = new FeedBack();
            newfeedback.setFeedBack(coloName);
            print(newfeedback.getFeedBack());



        }





    }


    private static void print(String s) {
        System.out.println(s);
    }

}
