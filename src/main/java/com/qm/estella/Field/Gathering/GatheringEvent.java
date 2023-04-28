package com.qm.estella.Field.Gathering;

import com.qm.estella.Util.Hash;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static com.qm.estella.Field.Gathering.Message.*;

public class GatheringEvent{

    public static void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent e){
        Player p = e.getPlayer();
        
        if(Hash.getValue("point",p)==null){
            Hash.addValue("point",p,0);
        }

        if(e.getRightClicked().getType().equals(EntityType.ARMOR_STAND)){
            if(p.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_SHOVEL)) {
                if (p.getInventory().getItemInMainHand().getItemMeta().hasCustomModelData()) {
                    if (p.getInventory().getItemInMainHand().getItemMeta().getCustomModelData() == 1) {

                        ArmorStand stand = (ArmorStand) e.getRightClicked();

                        if(stand.getHelmet().getItemMeta().hasCustomModelData()){
                            if(stand.getHelmet().getItemMeta().getCustomModelData()==1){
                                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,2));

                                Mushroom(p);
                                e.getRightClicked().remove();
                            }

                            if(stand.getHelmet().getItemMeta().getCustomModelData()==2){
                                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,2));

                                Bush(p);
                                e.getRightClicked().remove();
                            }

                            if(stand.getHelmet().getItemMeta().getCustomModelData()==3){
                                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,2));

                                Star(p);
                                e.getRightClicked().remove();
                            }

                            if(stand.getHelmet().getItemMeta().getCustomModelData()==4){
                                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,2));

                                Flower(p);
                                e.getRightClicked().remove();
                            }

                            if(stand.getHelmet().getItemMeta().getCustomModelData()==5){
                                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,2));

                                Fragments(p);
                                e.getRightClicked().remove();
                            }

                            if(stand.getHelmet().getItemMeta().getCustomModelData()==6){
                                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,2));

                                Crack(p);
                                e.getRightClicked().remove();
                            }

                            if(stand.getHelmet().getItemMeta().getCustomModelData()==7){
                                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,2));

                                Cube(p);
                                e.getRightClicked().remove();
                            }
                        }
                    }
                }
            }
            else {
                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO,10,1);
                p.sendMessage("§6§l[ ! ] §f채집도구§7를 들고 채집해주세요.");
            }
        }
    }
}

