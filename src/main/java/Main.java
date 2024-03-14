import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        final String TOKEN = ""; // Token should be into an enviroment variable as it is not wise to leave token in source code.
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);

        jdaBuilder.build();
    }
}
