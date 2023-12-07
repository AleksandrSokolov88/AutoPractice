import model.GeneratedUser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
GeneratedUser generatedUser = new GeneratedUser(true,true);
System.out.println(generatedUser.getMonthOfBirth());
System.out.println(generatedUser.getTitle());


    }
}
