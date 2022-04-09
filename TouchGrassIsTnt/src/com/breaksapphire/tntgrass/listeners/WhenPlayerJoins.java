package com.breaksapphire.tntgrass.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WhenPlayerJoins implements Listener {
	
	
	@EventHandler
	public static void onPlayerJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		p.sendMessage(ChatColor.GREEN + "Touching a grass block will spawn ignited TNT!!");
		p.sendMessage(ChatColor.BLUE + "https://github.com/breaksapphire");
	}
}
