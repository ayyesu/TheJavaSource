package src.sandbox.datatypes;

import src.sandbox.objecttype.Gender;
import src.sandbox.objecttype.Performer;

public class PerformerArrayDemo {
    public static void main(String[] args) {
        Performer[] performer = new Performer[2];
        for (int i=0; i< performer.length; i++){
            System.out.println("Performer of index [" + i + "] " + "has the element "+ performer[i]);
        }
        performer[0] = new Performer("Daniel Kissiedu", 20, 2.1f, Gender.MALE);
        performer[1] = new Performer("John Joker", 30, 1.2f, Gender.MALE);
        for (int i =0; i< performer.length; i++){
            System.out.println("Name of performers " + performer[i].getName());
        }
    }
}
