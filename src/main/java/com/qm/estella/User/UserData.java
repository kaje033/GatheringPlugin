package com.qm.estella.User;

import com.qm.estella.Util.Hash;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static com.qm.estella.Util.ReadJson.Data;
import static com.qm.estella.Util.ReadJson.Data2;

public class UserData {
    public static void onPlayerjoin(PlayerJoinEvent e, Player p) throws IOException, ParseException {
        Hash.addValue("point",p,Data(p.getUniqueId()));
        Hash.addValue("f",p,Data2(p.getUniqueId()));
    }
}
