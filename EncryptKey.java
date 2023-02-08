public class EncryptKey{

    public static String Ciphered(String chiphermessage){
        String Cipheredtext = "";
        char character;
        for(int i = 0; i < chiphermessage.length(); i ++){
            character = chiphermessage.charAt(i);
            if(Character.isUpperCase(character)){
            character = (char)('A'+((character-'A'-3+26)%26));
        }
        Cipheredtext += character;
    }
            return Cipheredtext;
    }

    public static void main(String[]args){
        String message = "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG";
        System.out.println("Message: " + message);
        System.out.println("Ciphered Message: " + Ciphered(message));
    }
}


