import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.util.Scanner;
public class WordStory {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name, day,time,year,adjective1,action,adjective2,adjective3,adjective4,adjective5;
        System.out.println("What is your name: ");
        name = keyboard.nextLine();

        System.out.println("Enter a Day: ");
        day = keyboard.nextLine();

        System.out.println("Enter Time: ");
        time = keyboard.nextLine();

        System.out.println("Enter Year: ");
        year = keyboard.nextLine();

        System.out.println("Enter Adjective: ");
        adjective1 = keyboard.nextLine();

        System.out.println("Enter Adjective: ");
        adjective2 = keyboard.nextLine();

        System.out.println("Enter Adjective: ");
        adjective3 = keyboard.nextLine();

        System.out.println("Enter Adjective: ");
        adjective4 = keyboard.nextLine();

        System.out.println("Enter Adjective: ");
        adjective5 = keyboard.nextLine();

        System.out.println(name + " is his name.He was born on" +day +"at" +time +"and he is" +year +"old." +
                "He likes" +adjective1 +"He always wake up" +adjective2 +"and got to bed" +adjective3 +"For that matter he is always" +adjective4 +
                        "to school.However he is a " +adjective5 +"so his teachers loves him so much.");

    }
}
