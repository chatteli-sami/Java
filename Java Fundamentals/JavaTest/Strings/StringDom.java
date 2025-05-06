public class StringDom {
    public static void main(String[] args) {

        // ! --------length

        String ninja = "coding dojo is Awesome !";
        int length = ninja.length();
        System.out.println("String length is " + length);

        // ! --------Concatenate

        String string1 = "My name is ";
        String string2 = "Chatteli Sami";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        // ! --------Format

        String Ninjja = String.format("Hi %s, you owe me $%.2f !", "jack", 25.0);
        System.out.println(Ninjja);

        // ! --------IndexOf

        String Samurai = "Welcome to Coding dojo";
        int a = Samurai.indexOf("Coding");
        int b = Samurai.indexOf("co");
        int c = Samurai.indexOf("dojo");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ! -------Trim

        String sentence = "     space everywhere !     ";
        System.out.println(sentence.trim());

        // ! -------Uppercase and Lowercase

        String hello = "Hello";
        String world = "world";

        System.out.println(hello.toLowerCase());
        System.out.println(world.toUpperCase());

        // ! -------Equality

        String Asame = "same string";
        String Bsame = "same string";
        System.out.println(Asame == Bsame);

        Asame = new String("same letters");
        Bsame = new String("same letters");
        // System.out.println(Asame == Bsame);
        System.out.println(Asame.equals(Bsame));

        // ! trying simple code

        String message;
        String output;
        message = "Hello there!";
        output = String.format("Message %d: %s", 1, message.concat(" How are you doing today?"));
        System.out.println(output);
    }
}