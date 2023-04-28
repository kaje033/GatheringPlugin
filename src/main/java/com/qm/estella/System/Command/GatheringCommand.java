package com.qm.estella.System.Command;

import com.qm.estella.Util.Hash;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GatheringCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        if(args.length==0){
            p.sendMessage(ChatColor.GREEN+"-----------------------------");
            p.sendMessage(ChatColor.GOLD+"/채집 랭킹\n채집 랭킹 및 자신의 숙련도를 확인합니다.");
            p.sendMessage(ChatColor.GREEN+"-----------------------------");
            return false;
        }

        if(args.length>=2){
            return false;
        }

        switch (args[0]){

            case "랭킹": {
                if(Hash.getValue("point",p)==null){
                    Hash.addValue("point",p,0);
                }

                Inventory inv = Bukkit.createInventory(null,54,"채집");

                ItemStack player = new ItemStack(Material.PLAYER_HEAD);
                SkullMeta playerMeta =(SkullMeta) player.getItemMeta();
                playerMeta.setDisplayName(ChatColor.GOLD+p.getName());
                List<String> playerLore = new ArrayList<String>();
                playerLore.add(ChatColor.GREEN+"숙련도: "+Hash.getValue("point",p));
                playerLore.add(ChatColor.GREEN+"랭킹: ");
                playerMeta.setOwner(p.getName());
                playerMeta.setLore(playerLore);
                player.setItemMeta(playerMeta);

                inv.setItem(49,player);

                p.openInventory(inv);

                break;
            }

            default:{
                p.sendMessage(ChatColor.RED+"등록되지 않은 명령어를 사용했습니다");
                break;
            }
        }
        return false;
    }
}
