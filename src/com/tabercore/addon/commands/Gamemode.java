package com.tabercore.addon.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.samtaber.base.Base;

public class Gamemode implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		if(label.equalsIgnoreCase("gamemode")) {
			
			if(player.hasPermission("tabercore.gamemode")) {
				
				if(args.length == 1) {
					
					String gamemode = args[0];
					if(gamemode.equalsIgnoreCase("creative") || gamemode.equalsIgnoreCase("c") || gamemode.equalsIgnoreCase("1")) {
						
						player.setGameMode(GameMode.CREATIVE);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to CREATIVE for player " + player.getName());
						
					}else if(gamemode.equalsIgnoreCase("survival") || gamemode.equalsIgnoreCase("s") || gamemode.equalsIgnoreCase("0")) {
						
						player.setGameMode(GameMode.SURVIVAL);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to SURVIVAL for player " + player.getName());
						
					}else if(gamemode.equalsIgnoreCase("adventure") || gamemode.equalsIgnoreCase("a") || gamemode.equalsIgnoreCase("2")) {
						
						player.setGameMode(GameMode.ADVENTURE);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to ADVENTURE for player " + player.getName());
						
					}else if(gamemode.equalsIgnoreCase("spectator") || gamemode.equalsIgnoreCase("sp") || gamemode.equalsIgnoreCase("3")) {
						
						player.setGameMode(GameMode.SPECTATOR);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to SPECTATOR for player " + player.getName());
						
					}
					
				}else if(args.length == 0) {
					
					player.sendMessage(Base.globalPrefix + "Invalid Argument(s). Missing value $TYPE and/or value $PLAYER");
					player.sendMessage(Base.globalPrefix + "Usage: /gamemode <gamemode> [player]");
			
				}else if(args.length == 2) {
					
					Player targetPlayer = Bukkit.getServer().getPlayer(args[2]);
					String gamemode = args[0];
					if(gamemode.equalsIgnoreCase("creative") || gamemode.equalsIgnoreCase("c") || gamemode.equalsIgnoreCase("1")) {
						
						targetPlayer.setGameMode(GameMode.CREATIVE);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to CREATIVE for player " + player.getName());
						targetPlayer.sendMessage(Base.globalPrefix + "Value $TYPE has been set to CREATIVE for player " + player.getName());
						
					}else if(gamemode.equalsIgnoreCase("survival") || gamemode.equalsIgnoreCase("s") || gamemode.equalsIgnoreCase("0")) {
						
						targetPlayer.setGameMode(GameMode.SURVIVAL);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to SURVIVAL for player " + player.getName());
						targetPlayer.sendMessage(Base.globalPrefix + "Value $TYPE has been set to SURVIVAL for player " + player.getName());
						
					}else if(gamemode.equalsIgnoreCase("adventure") || gamemode.equalsIgnoreCase("a") || gamemode.equalsIgnoreCase("2")) {
						
						targetPlayer.setGameMode(GameMode.ADVENTURE);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to ADVENTURE for player " + player.getName());
						targetPlayer.sendMessage(Base.globalPrefix + "Value $TYPE has been set to ADVENTURE for player " + player.getName());
						
					}else if(gamemode.equalsIgnoreCase("spectator") || gamemode.equalsIgnoreCase("sp") || gamemode.equalsIgnoreCase("3")) {
						
						targetPlayer.setGameMode(GameMode.SPECTATOR);
						player.sendMessage(Base.globalPrefix + "Value $TYPE has been set to SPECTATOR for player " + player.getName());
						targetPlayer.sendMessage(Base.globalPrefix + "Value $TYPE has been set to SPECTATOR for player " + player.getName());
						
					}
					
				}
				
			}
			
		}
		
		return false;
	}
	
}
