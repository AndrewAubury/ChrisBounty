package me.aubury;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Random;

public class OnEventHandleThing extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Guild guild = event.getGuild(); // Get the guild that the user joined.
        User user = event.getAuthor();    // Get the user that joined.

        if(guild.getIdLong() != 751931164306178078l){
            return;
        }

        if(user.getIdLong() != 422532713665527841l){
            return;
        }
        Random rand = new Random();
        float r = rand. nextFloat();
        float g = rand. nextFloat();
        float b = rand. nextFloat();
        Color randomColor = new Color(r, g, b);
        System.out.println("Changing colour");
        guild.getRoleById(751946648896274512l).getManager().setColor(randomColor).queue();
    }
}