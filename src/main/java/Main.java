public class Main {
    public static void main(String[] args) {

        String generatedPassword = PasswordGenerator.generatePassword(12);
        System.out.println(generatedPassword);
    }
}
