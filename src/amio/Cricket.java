/*******************************************************************************************************************
 * Amio Dey
 * ID: 2012020268
 * Sec: F
 * Email: cse_2012020268@lus.ac.bd
 * Date: 8-9-21
 * ******************************************************************************************************
 */


package amio;

public class Cricket extends Sports {

    String matchType;
    int over;
    Player player;

    Cricket(String matchType,int over,Player player){

        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void display()
    {
        System.out.println("Match type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player.playerName);
        System.out.println("Jersey number of a player: "+player.jerseyNumber);

    }
}
