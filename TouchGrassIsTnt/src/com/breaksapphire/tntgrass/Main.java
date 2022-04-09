package com.breaksapphire.tntgrass;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.breaksapphire.tntgrass.listeners.WhenPlayerJoins;
import com.breaksapphire.tntgrass.listeners.OnTouchGrass;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new WhenPlayerJoins(), this);
		getServer().getPluginManager().registerEvents(new OnTouchGrass(), this);
		
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[GRASS SPAWNS TNT] Plugin Enabled!");
		
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[GRASS SPAWNS TNT] Plugin Disabled! Thanks for playing!");
	}
	
}
