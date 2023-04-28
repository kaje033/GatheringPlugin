package com.qm.estella.System;

import com.qm.estella.Estella;
import com.qm.estella.Field.Gathering.GatheringEvent;
import com.qm.estella.User.UserData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class EventListener implements Listener {

    public EventListener(Estella plugin){
        this.plugin = plugin;
    }
    public static Estella plugin;

    @EventHandler
    public void onPlayerInteractAtEntityEvent(org.bukkit.event.player.PlayerInteractAtEntityEvent e){
        GatheringEvent.onPlayerInteractAtEntityEvent(e);
    }

     @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
         try {
             UserData.onPlayerjoin(e,e.getPlayer());
         } catch (IOException ex) {
             throw new RuntimeException(ex);
         } catch (ParseException ex) {
             throw new RuntimeException(ex);
         }
     }
}
