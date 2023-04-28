package com.qm.estella;

import com.qm.estella.System.Command.GatheringCommand;
import com.qm.estella.System.EventListener;
import com.qm.estella.Util.TabCompleter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
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

public final class Estella extends JavaPlugin {

    ConsoleCommandSender consol = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        consol.sendMessage(ChatColor.GOLD+"\n\n에스텔라 서버 플러그인이 활성화 되었습니다\n"+ChatColor.RED+"made by question_mark33\n\n");
        getServer().getPluginManager().registerEvents(new EventListener(this),this);
        registerCommand();
        newFile();
    }

    @Override
    public void onDisable() {
        consol.sendMessage(ChatColor.GOLD+"\n\n에스텔라 서버 플러그인이 비활성화 되었습니다\n"+ChatColor.RED+"made by question_mark33\n\n");

    }

    private void registerCommand(){
        getCommand("채집").setExecutor(new GatheringCommand());
        getCommand("채집").setTabCompleter(new TabCompleter());
    }

    private void newFile(){
        try {
            File f = new File("plugins/estella");

            f.mkdirs();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            File f = new File("plugins/estella/estella.json");

            f.createNewFile();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void a(){
        new BukkitRunnable() {
            @Override
            public void run() {
                LocalTime now = LocalTime.now();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");

                String formatedNow = now.format(formatter);

                if(formatedNow.equalsIgnoreCase("000000")){
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
        }.runTaskTimer(this,0,0);
    }
}
