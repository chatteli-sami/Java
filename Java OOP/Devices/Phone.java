public class Phone extends Devices {
    
    public void makeCall(){
        battery -= 5;
        System.out.println("You made a call");
        status();

        if (battery < 10){
            System.out.println("Battery critical");
        }
    }

    public void playGame(){
        if (battery < 25){
            System.out.println("Not eenough battery to play game");
            status();
            return;
        }
        battery -= 20;
        System.out.println("You play a game");
        status();
        if (battery < 10){
            System.out.println("Battery critical");
        }
    }

    public void charge(){
        battery += 50;
        System.out.println("You charge the phone");
        status();
    }
}
