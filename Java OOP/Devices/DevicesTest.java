public class DevicesTest {
    public static void main(String[] args) {
        Phone phone = new Phone();

        // call the makecall method three times
        phone.makeCall();
        phone.makeCall();
        phone.makeCall();

        // call the playgame methode twice
        phone.playGame();
        phone.playGame();

        // lastly call the charger methode once
        phone.charge();

    }
}
