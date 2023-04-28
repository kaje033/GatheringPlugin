package com.qm.estella.System;

import com.qm.estella.Estella;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static com.qm.estella.Util.ReadJson.fati;
import static com.qm.estella.Util.ReadJson.fati2;
import static com.qm.estella.Util.WriteJson.fatiPut;

public class Fatigue extends JavaPlugin {
    public Fatigue(Estella plugin){
        this.plugin = plugin;
    }
    public static Estella plugin;

    @Override
    public void onEnable() {
        new BukkitRunnable() {
            @Override
            public void run() {
                LocalTime now = LocalTime.now();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");

                String formatedNow = now.format(formatter);

                System.out.println(formatedNow);

                if(formatedNow=="111600"){
                    String directory = "plugins/estella/player/";
                    File dir = new File(directory);

                    String[] filenames = dir.list();
                    for (String filename : filenames){
                        try {
                            fatiPut(filename,fati(filename),fati2(filename),0);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.runTaskTimer(plugin,0,0);
    }
}
