package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    private String type, name;
    private int age, mice;
    private boolean friend;
    private ArrayList zoo;
   public UserInput (String userType, ArrayList zoo) {
       this.type = userType;
       this.zoo = zoo;
       if (type.equalsIgnoreCase("cat")) {
            ifCat();
       } else if (type.equalsIgnoreCase("dog")) {
            ifDog();
       } else if (type.equalsIgnoreCase("teacher")){
          ifTeacher();
       }
   }
   public void ifTeacher() {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter the name");
       name = keyboard.nextLine();
       System.out.println("Enter the age");
       age = Integer.parseInt(keyboard.nextLine());
       Teacher newPerson = new Teacher(age, name);
       zoo.add(newPerson);
   }
    public void ifDog() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name");
        name = keyboard.nextLine();
        System.out.println("Enter if friendly");
        friend = Boolean.parseBoolean(keyboard.nextLine());
        Dog newDog = new Dog(friend, name);
        zoo.add(newDog);
    }
    public void ifCat() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name");
        name = keyboard.nextLine();
        System.out.println("Enter how many mice its killed");
        mice = Integer.parseInt(keyboard.nextLine());
        Cat newCat = new Cat(mice, name);
        zoo.add(newCat);
    }


}
