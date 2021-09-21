/*******************************************************************************************************************
 * Amio Dey
 * ID: 2012020268
 * Sec: F
 * Email: cse_2012020268@lus.ac.bd
 * Date: 8-9-21
 * ******************************************************************************************************
 */

package amio;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Shakib", 75);
        Cricket cricket = new Cricket("International match", 20, player);

        cricket.display();

        Football football = new Football();
    }
}
