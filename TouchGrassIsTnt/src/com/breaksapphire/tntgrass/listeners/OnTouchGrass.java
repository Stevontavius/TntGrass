package com.breaksapphire.tntgrass.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class OnTouchGrass implements Listener {
	@EventHandler
	public static void touchDiamond(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		Location loc = p.getLocation();
		World w = p.getWorld();
		
		int x = p.getLocation().getBlockX();
		int y = p.getLocation().getBlockY();
		int z = p.getLocation().getBlockZ();
		
		Material GRASS = p.getWorld().getBlockAt(x, y-1, z).getType();
		if (GRASS == Material.GRASS_BLOCK) {
			for(int i = 0; i < 1; i++) {
				w.spawnEntity(loc, EntityType.PRIMED_TNT);
			}
		}
	}
}
