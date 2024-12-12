public class testhund {
    public static void main(String[] args){
        Hund hund1 = new Hund();
        hund1.name = "Bert";

        Hund hund2 = new Hund();
        hund2.name = "Alpha";
        
        Hund[] meineHunde = new Hund[3];
        meineHunde[0] = new Hund();
        meineHunde[1] = hund2;
        meineHunde[2] = hund1;

        meineHunde[0].name = "Fred";

        int x = 0;
        while(x<meineHunde.length){
            meineHunde[x].bellen();
            meineHunde[x].essen();
            meineHunde[x].katzeJagend();
            System.out.println();
            x+=1;
        }


    }
}
