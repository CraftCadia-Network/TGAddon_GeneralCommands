package com.tabercore.addon.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Fly implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(label.equalsIgnoreCase("fly")) {
		
			if(player.hasPermission("tabercore.fly")) {
				if(player.getGameMode() != GameMode.CREATIVE) {
					
				player.setAllowFlight(true);
					
				}
				
				if(args.length == 0) {
					if(player.isFlying()) {
	
						player.setFlying(false);
						player.sendMessage("Set boolean $FLY to FALSE");
						
					}else if(!player.isFlying()) {
						
						player.setFlying(true);
						player.sendMessage("Set boolean $FLY to TRUE");
						
					}
				}else if(args.length == 1) {
					
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
					if(targetPlayer.isFlying() == false) {
						
						targetPlayer.setFlying(true);
						player.sendMessage("Set boolean $FLY to TRUE for player " + targetPlayer.getName());
						targetPlayer.sendMessage("Set boolean $FLY to TRUE for player " + targetPlayer.getName());
					}else if(targetPlayer.isFlying() == true) {
						
						targetPlayer.setFlying(false);
						player.sendMessage("Set boolean $FLY to FALSE for player " + targetPlayer.getName());
						targetPlayer.sendMessage("Set boolean $FLY to FALSE for player " + targetPlayer.getName());
					}
				}
				
			}else {
				
				player.sendMessage(ChatColor.RED + "no perms");
				
			}
			
		}
		
		return false;
	}

}
