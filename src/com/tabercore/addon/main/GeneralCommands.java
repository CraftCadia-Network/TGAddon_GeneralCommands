package com.tabercore.addon.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import com.tabercore.addon.commands.Fly;
import com.tabercore.addon.commands.Gamemode;

public class GeneralCommands extends JavaPlugin{

	public static GeneralCommands instance;
	
	public void onEnable() {
		instance = this;
		this.getCommand("fly").setExecutor((CommandExecutor)new Fly());
		this.getCommand("gamemode").setExecutor((CommandExecutor)new Gamemode());
	}
	
	public void onDisable() {
		instance = null;
		
		
	}
	

	
	
}
