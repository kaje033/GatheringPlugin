package com.qm.estella.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.util.StringUtil;

public class TabCompleter implements org.bukkit.command.TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if(args.length==1){
            List<String> tab = new ArrayList<>();
            tab.add("랭킹");

            return tab;
        }

        return null;
    }
}

