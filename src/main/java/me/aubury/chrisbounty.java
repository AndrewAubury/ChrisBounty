package me.aubury;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class chrisbounty {
    public static void main(String[] args) throws LoginException {
        if(args.length != 1){
            System.exit(-1);
        }
        String token = args[0];

        JDA bot = JDABuilder.createDefault(token).addEventListeners(new OnEventHandleThing()).build();
    }
}
