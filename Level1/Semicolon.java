package Level1;

import java.sql.Array;

public class Semicolon {
    public static void main(String[] args) {
        String[][] array = {{"S"},{"e"},{"m"},{"i"},{"c"},{"o"},{"l"},{"o"},{"n"}};
        for (int i = 0; i < array.length ; i++) {
            System.out.print("");
            for (int j = 0; j < array[i].length ; j++) {
                System.out.println(array[i][j]);

            }

        }
    }
}
