package com.qm.estella.Field.Gathering;

import com.qm.estella.Util.Hash;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.security.SecureRandom;

import static com.qm.estella.Field.Gathering.Item.Item.*;
import static com.qm.estella.System.EventListener.plugin;
import static com.qm.estella.Util.WriteJson.jPut;

public class Message {

    static SecureRandom rand = new SecureRandom();

    public static void Mushroom(Player p){
        if(Hash.getValue("f",p)==null){
            Hash.addValue("f",p,0);
        }
        if(Hash.getValue("point",p)==null){
            Hash.addValue("point",p,0);
        }

        p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.sendTitle("§6§l채집중...","§f§l조금만 기다려주세요 !");
                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
                                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                            @Override
                                            public void run() {
                                                p.sendTitle("","");

                                                int i = rand.nextInt(1000);

                                                if(i <= 700){
                                                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_BELL,10,1);
                                                    jelly(p,false);
                                                    melang(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+5);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 975){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,10,1);
                                                    p.sendMessage("§6§l[ ! ] §7채집에 실패하였습니다..");
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+1);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 1000){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,10,1);
                                                    jelly(p,true);
                                                    melang(p,true);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+20);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                jPut(p.getUniqueId(),Hash.getValue("point",p),Hash.getValue("f",p));
                                            }
                                        },20);
                                    }
                                },20);
                            }
                        },20);
                    }
                },20);
            }
        },20);
    }

    public static void Bush(Player p){
        p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.sendTitle("§6§l채집중...","§f§l조금만 기다려주세요 !");
                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
                                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                            @Override
                                            public void run() {
                                                p.sendTitle("","");

                                                int i = rand.nextInt(1000);

                                                if(i <= 500){
                                                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_BELL,10,1);
                                                    shiny(p,false);
                                                    dew(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+5);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 965){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,10,1);
                                                    p.sendMessage("§6§l[ ! ] §7채집에 실패하였습니다..");
                                                    Benergy(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+1);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 1000){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,10,1);
                                                    shiny(p,true);
                                                    dew(p,true);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+20);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                jPut(p.getUniqueId(),Hash.getValue("point",p),Hash.getValue("f",p));
                                            }
                                        },20);
                                    }
                                },20);
                            }
                        },20);
                    }
                },20);
            }
        },20);
    }

    public static void Star(Player p){
        p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.sendTitle("§6§l채집중...","§f§l조금만 기다려주세요 !");
                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
                                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                            @Override
                                            public void run() {
                                                p.sendTitle("","");

                                                int i = rand.nextInt(1000);

                                                if(i <= 500){
                                                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_BELL,10,1);
                                                    shard(p,false);
                                                    powder(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+10);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 965){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,10,1);
                                                    p.sendMessage("§6§l[ ! ] §7채집에 실패하였습니다..");
                                                    Benergy(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+3);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 1000){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,10,1);
                                                    shard(p,true);
                                                    powder(p,true);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+40);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                jPut(p.getUniqueId(),Hash.getValue("point",p),Hash.getValue("f",p));
                                            }
                                        },20);
                                    }
                                },20);
                            }
                        },20);
                    }
                },20);
            }
        },20);
    }

    public static void Flower(Player p){
        p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.sendTitle("§6§l채집중...","§f§l조금만 기다려주세요 !");
                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
                                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                            @Override
                                            public void run() {
                                                p.sendTitle("","");

                                                int i = rand.nextInt(1000);

                                                if(i <= 300){
                                                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_BELL,10,1);
                                                    fatal(p,false);
                                                    prism(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+20);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 955){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,10,1);
                                                    p.sendMessage("§6§l[ ! ] §7채집에 실패하였습니다..");
                                                    Aenergy(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+5);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 1000){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,10,1);
                                                    fatal(p,true);
                                                    prism(p,true);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+80);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                jPut(p.getUniqueId(),Hash.getValue("point",p),Hash.getValue("f",p));
                                            }
                                        },20);
                                    }
                                },20);
                            }
                        },20);
                    }
                },20);
            }
        },20);
    }

    public static void Fragments(Player p){
        p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.sendTitle("§6§l채집중...","§f§l조금만 기다려주세요 !");
                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
                                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                            @Override
                                            public void run() {
                                                p.sendTitle("","");

                                                int i = rand.nextInt(1000);

                                                if(i <= 300){
                                                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_BELL,10,1);
                                                    fragments(p,false);
                                                    decision(p,false);
                                                    marble(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+20);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 655){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,10,1);
                                                    p.sendMessage("§6§l[ ! ] §7채집에 실패하였습니다..");
                                                    Aenergy(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+5);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 1000){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,10,1);
                                                    fragments(p,true);
                                                    decision(p,true);
                                                    marble(p,true);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+80);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                jPut(p.getUniqueId(),Hash.getValue("point",p),Hash.getValue("f",p));
                                            }
                                        },20);
                                    }
                                },20);
                            }
                        },20);
                    }
                },20);
            }
        },20);
    }

    public static void Crack (Player p){
        p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.sendTitle("§6§l채집중...","§f§l조금만 기다려주세요 !");
                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
                                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                            @Override
                                            public void run() {
                                                p.sendTitle("","");

                                                int i = rand.nextInt(1000);

                                                if(i <= 100){
                                                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_BELL,10,1);
                                                    particle(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+50);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 995){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,10,1);
                                                    p.sendMessage("§6§l[ ! ] §7채집에 실패하였습니다..");
                                                    Senergy(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+5);
                                                }
                                                else if(i <= 1000){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,10,1);
                                                    particle(p,true);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+200);
                                                }
                                                jPut(p.getUniqueId(),Hash.getValue("point",p),Hash.getValue("f",p));
                                            }
                                        },20);
                                    }
                                },20);
                            }
                        },20);
                    }
                },20);
            }
        },20);
    }

    public static void Cube(Player p){
        p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.sendTitle("§6§l채집중...","§f§l조금만 기다려주세요 !");
                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.sendTitle("§6§l채집중.","§f§l조금만 기다려주세요 !");
                                p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                    @Override
                                    public void run() {
                                        p.sendTitle("§6§l채집중..","§f§l조금만 기다려주세요 !");
                                        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK,10,1);

                                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                                            @Override
                                            public void run() {
                                                p.sendTitle("","");

                                                int i = rand.nextInt(1000);

                                                if(i <= 10){
                                                    p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_BELL,10,1);
                                                    cube(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+50);
                                                    Hash.addValue("f",p,(int) Hash.getValue("f",p)+1);
                                                }
                                                else if(i <= 999){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,10,1);
                                                    p.sendMessage("§6§l[ ! ] §7채집에 실패하였습니다..");
                                                    Senergy(p,false);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+5);
                                                }
                                                else if(i <= 1000){
                                                    p.playSound(p.getLocation(),Sound.ENTITY_PLAYER_LEVELUP,10,1);
                                                    cube(p,true);
                                                    Hash.addValue("point",p,(int) Hash.getValue("point",p)+200);
                                                }
                                                jPut(p.getUniqueId(),Hash.getValue("point",p),Hash.getValue("f",p));
                                            }
                                        },20);
                                    }
                                },20);
                            }
                        },20);
                    }
                },20);
            }
        },20);
    }
}
