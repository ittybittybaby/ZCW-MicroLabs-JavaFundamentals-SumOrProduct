import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Calculator calc = new Calculator();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number to be calculated >> ");
        calc.setNumber(keyboard.nextInt());

        System.out.print("Enter '+' to return a sum or '*' to return a product >> ");
        calc.setOperator(keyboard.next().charAt(0));

        calc.giveAnswer();



    }
}
