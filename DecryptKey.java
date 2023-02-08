public class DecryptKey{

    public static String Deciphered(String dechiphermessage){
        String Decipheredtext = "";
        char character;
        for(int i = 0; i < dechiphermessage.length(); i ++){
            character = dechiphermessage.charAt(i);
            if(Character.isUpperCase(character)){
            character = (char)('A'+((character-'A'+3+26)%26));
        }
        Decipheredtext += character;
    }
            return Decipheredtext;
    }

    public static void main(String[]args){
        String message = "QEB NRFZH YOLTK CLU GRJMBA LSBO QEB IXWV ALD";
        System.out.println("Message: " + message);
        System.out.println("Deciphered Message: " + Deciphered(message));
    }
}

