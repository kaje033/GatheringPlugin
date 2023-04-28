package com.qm.estella.Field.Gathering.Item;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Item {
    static SecureRandom rand = new SecureRandom();

    public static void jelly(Player p,Boolean big){
        ItemStack jelly = new ItemStack(Material.FEATHER);
        List<String> jellyLore = new ArrayList<>();
        ItemMeta jellyMeta = jelly.getItemMeta();
        jellyMeta.setDisplayName("§a§l젤리 머쉬룸");
        jellyMeta.setCustomModelData(8);
        jellyLore.add("§7말랑말랑한 젤리 머쉬룸이다.");
        jellyMeta.setLore(jellyLore);
        jelly.setItemMeta(jellyMeta);

        if(rand.nextInt(100) <= 75){
            p.sendMessage("§6§l[ ! ] §f젤리 머쉬룸 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f젤리 머쉬룸 1개 §7획득 !");
                p.getInventory().addItem(jelly);
                p.getInventory().addItem(jelly);
            }else {
                p.getInventory().addItem(jelly);
            }
        }
        if(rand.nextInt(100) <= 30){
            p.sendMessage("§6§l[ ! ] §f젤리 머쉬룸 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f젤리 머쉬룸 1개 §7획득 !");
                p.getInventory().addItem(jelly);
                p.getInventory().addItem(jelly);
            }else {
                p.getInventory().addItem(jelly);
            }
        }
        if(rand.nextInt(100)<=100){
            p.sendMessage("§6§l[ ! ] §f젤리 머쉬룸 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f젤리 머쉬룸 1개 §7획득 !");
                p.getInventory().addItem(jelly);
                p.getInventory().addItem(jelly);
            }else {
                p.getInventory().addItem(jelly);
            }
        }
    }

    public static void melang(Player p,Boolean big){
        ItemStack melang = new ItemStack(Material.FEATHER);
        List<String> melangLore = new ArrayList<>();
        ItemMeta melangMeta = melang.getItemMeta();
        melangMeta.setDisplayName("§c§l멜랑 머쉬룸");
        melangMeta.setCustomModelData(9);
        melangLore.add("§7메론맛이 날 거 같은 머쉬룸이다.");
        melangMeta.setLore(melangLore);
        melang.setItemMeta(melangMeta);

        if(rand.nextInt(100) <= 25){
            p.sendMessage("§6§l[ ! ] §f멜랑 머쉬룸 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f멜랑 머쉬룸 1개 §7획득 !");
                p.getInventory().addItem(melang);
                p.getInventory().addItem(melang);
            }else {
                p.getInventory().addItem(melang);
            }
        }
        if(rand.nextInt(100) <= 50) {
            p.sendMessage("§6§l[ ! ] §f멜랑 머쉬룸 1개 §7획득 !");
            if (big) {
                p.sendMessage("§6§l[ ! ] §f멜랑 머쉬룸 1개 §7획득 !");
                p.getInventory().addItem(melang);
                p.getInventory().addItem(melang);
            } else {
                p.getInventory().addItem(melang);

            }
        }
        if(rand.nextInt(100)<= 75) {
            p.sendMessage("§6§l[ ! ] §f멜랑 머쉬룸 1개 §7획득 !");
            if (big) {
                p.sendMessage("§6§l[ ! ] §f멜랑 머쉬룸 1개 §7획득 !");
                p.getInventory().addItem(melang);
                p.getInventory().addItem(melang);
            } else {
                p.getInventory().addItem(melang);

            }
        }
    }

    public static void shiny(Player p,Boolean big){
        ItemStack shiny = new ItemStack(Material.FEATHER);
        List<String> shinyLore = new ArrayList<>();
        ItemMeta shinyMeta = shiny.getItemMeta();
        shinyMeta.setDisplayName("§a§l샤이니 §2§l허브");
        shinyMeta.setCustomModelData(10);
        shinyLore.add("§7젖어있는데도 이슬이 빛나는 허브이다.");
        shinyMeta.setLore(shinyLore);
        shiny.setItemMeta(shinyMeta);

        if(rand.nextInt(1000) <= 1000){
            p.sendMessage("§6§l[ ! ] §f샤이니 허브 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f샤이니 허브 1개 §7획득 !");
                p.getInventory().addItem(shiny);
                p.getInventory().addItem(shiny);
            }else {
                p.getInventory().addItem(shiny);
            }
        }
        if(rand.nextInt(1000) <= 600){
            p.sendMessage("§6§l[ ! ] §f샤이니 허브 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f샤이니 허브 1개 §7획득 !");
                p.getInventory().addItem(shiny);
                p.getInventory().addItem(shiny);
            }else {
                p.getInventory().addItem(shiny);
            }
        }
        if(rand.nextInt(1000)<= 225){
            p.sendMessage("§6§l[ ! ] §f샤이니 허브 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f샤이니 허브 1개 §7획득 !");
                p.getInventory().addItem(shiny);
                p.getInventory().addItem(shiny);
            }else {
                p.getInventory().addItem(shiny);
            }
        }
    }

    public static void dew(Player p,Boolean big){
        ItemStack dew = new ItemStack(Material.FEATHER);
        List<String> dewLore = new ArrayList<>();
        ItemMeta dewMeta = dew.getItemMeta();
        dewMeta.setDisplayName("§b§l맑은 이슬");
        dewMeta.setCustomModelData(11);
        dewLore.add("§7투명해 속이 비치는 맑은 이슬이다.");
        dewMeta.setLore(dewLore);
        dew.setItemMeta(dewMeta);

        if(rand.nextInt(100) <= 65){
            p.sendMessage("§6§l[ ! ] §f맑은 이슬 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f맑은 이슬 1개 §7획득 !");
                p.getInventory().addItem(dew);
                p.getInventory().addItem(dew);
            }else {
                p.getInventory().addItem(dew);
            }
        }
        if(rand.nextInt(100) <= 35){
            p.sendMessage("§6§l[ ! ] §f맑은 이슬 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f맑은 이슬 1개 §7획득 !");
                p.getInventory().addItem(dew);
                p.getInventory().addItem(dew);
            }else {
                p.getInventory().addItem(dew);
            }
        }
        if(rand.nextInt(100)<= 10){
            p.sendMessage("§6§l[ ! ] §f맑은 이슬 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f맑은 이슬 1개 §7획득 !");
                p.getInventory().addItem(dew);
                p.getInventory().addItem(dew);
            }else {
                p.getInventory().addItem(dew);
            }
        }
    }

    public static void shard(Player p,Boolean big){
        ItemStack shard = new ItemStack(Material.FEATHER);
        List<String> shardLore = new ArrayList<>();
        ItemMeta shardMeta = shard.getItemMeta();
        shardMeta.setDisplayName("§e§l트윙클 샤드");
        shardMeta.setCustomModelData(12);
        shardLore.add("§7빛이 남아있는 별의 파편이다.");
        shardMeta.setLore(shardLore);
        shard.setItemMeta(shardMeta);

        if(rand.nextInt(1000) <= 1000){
            p.sendMessage("§6§l[ ! ] §f트윙클 샤드 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f트윙클 샤드 1개 §7획득 !");
                p.getInventory().addItem(shard);
                p.getInventory().addItem(shard);
            }else {
                p.getInventory().addItem(shard);
            }
        }
        if(rand.nextInt(1000) <= 300){
            p.sendMessage("§6§l[ ! ] §트윙클 샤드 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f트윙클 샤드 1개 §7획득 !");
                p.getInventory().addItem(shard);
                p.getInventory().addItem(shard);
            }else {
                p.getInventory().addItem(shard);
            }
        }
        if(rand.nextInt(1000)<= 750){
            p.sendMessage("§6§l[ ! ] §f트윙클 샤드 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f트윙클 샤드 1개 §7획득 !");
                p.getInventory().addItem(shard);
                p.getInventory().addItem(shard);
            }else {
                p.getInventory().addItem(shard);
            }
        }
    }

    public static void powder(Player p,Boolean big){
        ItemStack powder = new ItemStack(Material.FEATHER);
        List<String> powderLore = new ArrayList<>();
        ItemMeta powderMeta = powder.getItemMeta();
        powderMeta.setDisplayName("§e§l스파클링 파우더");
        powderMeta.setCustomModelData(13);
        powderLore.add("§7별똥별에서 떨어지는 별가루의 일부분이다.");
        powderMeta.setLore(powderLore);
        powder.setItemMeta(powderMeta);

        if(rand.nextInt(1000) <= 300){
            p.sendMessage("§6§l[ ! ] §f스파클링 파우더 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f스파클링 파우더 1개 §7획득 !");
                p.getInventory().addItem(powder);
                p.getInventory().addItem(powder);
            }else {
                p.getInventory().addItem(powder);
            }
        }
        if(rand.nextInt(1000) <= 125){
            p.sendMessage("§6§l[ ! ] §f스파클링 파우더 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f스파클링 파우더 1개 §7획득 !");
                p.getInventory().addItem(powder);
                p.getInventory().addItem(powder);
            }else {
                p.getInventory().addItem(powder);
            }
        }
        if(rand.nextInt(1000)<= 250){
            p.sendMessage("§6§l[ ! ] §f스파클링 파우더 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f스파클링 파우더 1개 §7획득 !");
                p.getInventory().addItem(powder);
                p.getInventory().addItem(powder);
            }else {
                p.getInventory().addItem(powder);
            }
        }
    }

    public static void fatal(Player p,Boolean big){
        ItemStack fatal = new ItemStack(Material.FEATHER);
        List<String> fatalLore = new ArrayList<>();
        ItemMeta fatalMeta = fatal.getItemMeta();
        fatalMeta.setDisplayName("§e§l§b§l프리징 §9§l페이탈");
        fatalMeta.setCustomModelData(14);
        fatalLore.add("§7차가운 냉기를 뿜는 꽃잎이다.");
        fatalMeta.setLore(fatalLore);
        fatal.setItemMeta(fatalMeta);

        if(rand.nextInt(1000) <= 1000){
            p.sendMessage("§6§l[ ! ] §f프리징 페이탈 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f프리징 페이탈 1개 §7획득 !");
                p.getInventory().addItem(fatal);
                p.getInventory().addItem(fatal);
            }else {
                p.getInventory().addItem(fatal);
            }
        }
        if(rand.nextInt(1000) <= 200){
            p.sendMessage("§6§l[ ! ] §f프리징 페이탈 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f프리징 페이탈 1개 §7획득 !");
                p.getInventory().addItem(fatal);
                p.getInventory().addItem(fatal);
            }else {
                p.getInventory().addItem(fatal);
            }
        }
        if(rand.nextInt(1000)<= 250){
            p.sendMessage("§6§l[ ! ] §f프리징 페이탈 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f프리징 페이탈 1개 §7획득 !");
                p.getInventory().addItem(fatal);
                p.getInventory().addItem(fatal);
            }else {
                p.getInventory().addItem(fatal);
            }
        }
    }

    public static void prism(Player p,Boolean big){
        ItemStack prism = new ItemStack(Material.FEATHER);
        List<String> prismLore = new ArrayList<>();
        ItemMeta prismMeta = prism.getItemMeta();
        prismMeta.setDisplayName("§b§l아이스 §9§l프리즘");
        prismMeta.setCustomModelData(15);
        prismLore.add("§7유리처럼 투명하고 날카로운 프리즘이다.");
        prismMeta.setLore(prismLore);
        prism.setItemMeta(prismMeta);

        if(rand.nextInt(1000) <= 725){
            p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
            if(big){
                p.getInventory().addItem(prism);
                p.getInventory().addItem(prism);
            }else {
                p.getInventory().addItem(prism);
            }
        }
        if(rand.nextInt(1000) <= 150){
            p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
            if(big){
                p.getInventory().addItem(prism);
                p.getInventory().addItem(prism);
            }else {
                p.getInventory().addItem(prism);
            }
        }
        if(rand.nextInt(1000)<= 250){
            p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
            if(big){
                p.getInventory().addItem(prism);
                p.getInventory().addItem(prism);
            }else {
                p.getInventory().addItem(prism);
            }
        }
    }

    public static void fragments(Player p,Boolean big){
        ItemStack fragments = new ItemStack(Material.FEATHER);
        List<String> fragmentsLore = new ArrayList<>();
        ItemMeta fragmentsMeta = fragments.getItemMeta();
        fragmentsMeta.setDisplayName("§b§l얼음 결정");
        fragmentsMeta.setCustomModelData(16);
        fragmentsLore.add("§7녹아내릴 거 같은 자그마한 얼음결정이다.");
        fragmentsMeta.setLore(fragmentsLore);
        fragments.setItemMeta(fragmentsMeta);

        if(rand.nextInt(1000) <= 1000){
            p.sendMessage("§6§l[ ! ] §f얼음 결정 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f얼음 결정 1개 §7획득 !");
                p.getInventory().addItem(fragments);
                p.getInventory().addItem(fragments);
            }else {
                p.getInventory().addItem(fragments);
            }
        }
        if(rand.nextInt(1000) <= 255){
            p.sendMessage("§6§l[ ! ] §f얼음 결정 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f얼음 결정 1개 §7획득 !");
                p.getInventory().addItem(fragments);
                p.getInventory().addItem(fragments);
            }else {
                p.getInventory().addItem(fragments);
            }
        }
        if(rand.nextInt(1000)<= 50){
            p.sendMessage("§6§l[ ! ] §f얼음 결정 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f얼음 결정 1개 §7획득 !");
                p.getInventory().addItem(fragments);
                p.getInventory().addItem(fragments);
            }else {
                p.getInventory().addItem(fragments);
            }
        }
    }

    public static void decision(Player p,Boolean big){
        ItemStack decision = new ItemStack(Material.FEATHER);
        List<String> decisionLore = new ArrayList<>();
        ItemMeta decisionMeta = decision.getItemMeta();
        decisionMeta.setDisplayName("§b§l얼음 파편");
        decisionMeta.setCustomModelData(17);
        decisionLore.add("§7얼음파편을 그대로 보존한 파편이다.");
        decisionMeta.setLore(decisionLore);
        decision.setItemMeta(decisionMeta);

        if(rand.nextInt(1000) <= 1000){
            p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
                p.getInventory().addItem(decision);
                p.getInventory().addItem(decision);
            }else {
                p.getInventory().addItem(decision);
            }
        }
        if(rand.nextInt(1000) <= 255){
            p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
                p.getInventory().addItem(decision);
                p.getInventory().addItem(decision);
            }else {
                p.getInventory().addItem(decision);
            }
        }
        if(rand.nextInt(1000)<= 50){
            p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f얼음 파편 1개 §7획득 !");
                p.getInventory().addItem(decision);
                p.getInventory().addItem(decision);
            }else {
                p.getInventory().addItem(decision);
            }
        }
    }

    public static void marble(Player p,Boolean big){
        ItemStack marble = new ItemStack(Material.FEATHER);
        List<String> marbleLore = new ArrayList<>();
        ItemMeta marbleMeta = marble.getItemMeta();
        marbleMeta.setDisplayName("§9§l냉기 구슬 §b§l★");
        marbleMeta.setCustomModelData(18);
        marbleLore.add("§7낮은 확률로 얻을 수 있는 냉기를 간직한 구슬이다.");
        marbleMeta.setLore(marbleLore);
        marble.setItemMeta(marbleMeta);

        if(rand.nextInt(1000) <= 100){
            p.sendMessage("§6§l[ ! ] §f냉기 구슬 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f냉기 구슬 1개 §7획득 !");
                p.getInventory().addItem(marble);
                p.getInventory().addItem(marble);
            }else {
                p.getInventory().addItem(marble);
            }
        }
        if(rand.nextInt(1000) <= 150){
            p.sendMessage("§6§l[ ! ] §f냉기 구슬 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f냉기 구슬 1개 §7획득 !");
                p.getInventory().addItem(marble);
                p.getInventory().addItem(marble);
            }else {
                p.getInventory().addItem(marble);
            }
        }
    }

    public static void particle(Player p,Boolean big){
        ItemStack particle = new ItemStack(Material.FEATHER);
        List<String> particleLore = new ArrayList<>();
        ItemMeta particleMeta = particle.getItemMeta();
        particleMeta.setDisplayName("§6§l쓸만한 기계부품");
        particleMeta.setCustomModelData(19);
        particleLore.add("§7기계 무더기에서 발견한 쓸만해보이는 부품이다.");
        particleMeta.setLore(particleLore);
        particle.setItemMeta(particleMeta);

        if(rand.nextInt(100) <= 30){
            p.sendMessage("§6§l[ ! ] §f쓸만한 기계부품 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f쓸만한 기계부품 1개 §7획득 !");
                p.getInventory().addItem(particle);
                p.getInventory().addItem(particle);
            }else {
                p.getInventory().addItem(particle);
            }
        }
    }

    public static void cube(Player p,Boolean big){
        ItemStack cube = new ItemStack(Material.FEATHER);
        List<String> cubeLore = new ArrayList<>();
        ItemMeta cubeMeta = cube.getItemMeta();
        cubeMeta.setDisplayName("§6§l녹슨 §e§l태엽장치");
        cubeMeta.setCustomModelData(20);
        cubeLore.add("§7감시로봇 속에 들어있던 녹슨 태엽이다.");
        cubeMeta.setLore(cubeLore);
        cube.setItemMeta(cubeMeta);

        if(rand.nextInt(100) <= 100){
            p.sendMessage("§6§l[ ! ] §f녹슨 태엽장치 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f녹슨 태엽장치 1개 §7획득 !");
                p.getInventory().addItem(cube);
                p.getInventory().addItem(cube);
            }else {
                p.getInventory().addItem(cube);
            }
        }
        if(rand.nextInt(100) <= 20){
            p.sendMessage("§6§l[ ! ] §f녹슨 태엽장치 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f녹슨 태엽장치 1개 §7획득 !");
                p.getInventory().addItem(cube);
                p.getInventory().addItem(cube);
            }else {
                p.getInventory().addItem(cube);
            }
        }
        if(rand.nextInt(100)<= 10){
            p.sendMessage("§6§l[ ! ] §f녹슨 태엽장치 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f녹슨 태엽장치 1개 §7획득 !");
                p.getInventory().addItem(cube);
                p.getInventory().addItem(cube);
            }else {
                p.getInventory().addItem(cube);
            }
        }
    }

    public static void Benergy(Player p,Boolean big){
        ItemStack benergy = new ItemStack(Material.FEATHER);
        List<String> BenergyLore = new ArrayList<>();
        ItemMeta BenergyMeta = benergy.getItemMeta();
        BenergyMeta.setDisplayName("§e§l별의 기운 §f§l★");
        BenergyMeta.setCustomModelData(21);
        BenergyLore.add("§7§l점점 죽어가는 별의 기운이다.");
        BenergyMeta.setLore(BenergyLore);
        benergy.setItemMeta(BenergyMeta);

        if(rand.nextInt(100) <= 30){
            p.sendMessage("§6§l[ ! ] §f별의 기운 1개 §7획득 !");
            if(big){
                p.sendMessage("§6§l[ ! ] §f별의 기운 1개 §7획득 !");
                p.getInventory().addItem(benergy);
                p.getInventory().addItem(benergy);
            }else {
                p.getInventory().addItem(benergy);
            }
        }
    }

    public static void Aenergy(Player p,Boolean big){
        ItemStack Aenergy = new ItemStack(Material.FEATHER);
        List<String> AenergyLore = new ArrayList<>();
        ItemMeta AenergyMeta = Aenergy.getItemMeta();
        AenergyMeta.setDisplayName("§e§l별의 기운 §f§l★");
        AenergyMeta.setCustomModelData(21);
        AenergyLore.add("§7§l점점 죽어가는 별의 기운이다.");
        AenergyMeta.setLore(AenergyLore);
        Aenergy.setItemMeta(AenergyMeta);

        if(rand.nextInt(100) <= 50){
            p.sendMessage("§6§l[ ! ] §f별의 기운 1개 §7획득 !");
            p.getInventory().addItem(Aenergy);
        }
    }

    public static void Senergy(Player p,Boolean big){
        ItemStack Senergy = new ItemStack(Material.FEATHER);
        List<String> SenergyLore = new ArrayList<>();
        ItemMeta SenergyMeta = Senergy.getItemMeta();
        SenergyMeta.setDisplayName("§e§l별의 기운 §f§l★");
        SenergyMeta.setCustomModelData(21);
        SenergyLore.add("§7§l점점 죽어가는 별의 기운이다.");
        SenergyMeta.setLore(SenergyLore);
        Senergy.setItemMeta(SenergyMeta);

        if(rand.nextInt(100) <= 70){
            p.sendMessage("§6§l[ ! ] §f별의 기운 1개 §7획득 !");
            if(big){
                p.getInventory().addItem(Senergy);
                p.getInventory().addItem(Senergy);
            }else {
                p.getInventory().addItem(Senergy);
            }
        }


    }
}
