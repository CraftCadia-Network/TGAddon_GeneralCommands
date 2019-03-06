package com.tabercore.addon.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.samtaber.base.Base;

public class Fly implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if(player.hasPermission("tabercore.fly")) {
			
			if(label.equalsIgnoreCase("fly")) {
				
				if(args.length == 0) {
					
					if(player.isFlying() == false || player.getGameMode() == GameMode.SURVIVAL || player.getGameMode() == GameMode.ADVENTURE) {
						
						player.setFlying(true);
						player.sendMessage(Base.globalPrefix + "Set boolean $FLY to TRUE for player " + player.getName());
						
					}else if(player.isFlying() == true || player.getGameMode() == GameMode.SURVIVAL || player.getGameMode() == GameMode.ADVENTURE) {
						
						player.setFlying(false);
						player.sendMessage(Base.globalPrefix + "Set boolean $FLY to FALSE for player " + player.getName());
						
					}
					
				}else if(args.length == 1) {
					
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
					if(targetPlayer.isFlying() == false) {
						
						targetPlayer.setFlying(true);
						player.sendMessage(Base.globalPrefix + "Set boolean $FLY to TRUE for player " + targetPlayer.getName());
						targetPlayer.sendMessage(Base.globalPrefix + "Set boolean $FLY to TRUE for player " + targetPlayer.getName());
					}else if(targetPlayer.isFlying() == true) {
						
						targetPlayer.setFlying(false);
						player.sendMessage(Base.globalPrefix + "Set boolean $FLY to FALSE for player " + targetPlayer.getName());
						targetPlayer.sendMessage(Base.globalPrefix + "Set boolean $FLY to FALSE for player " + targetPlayer.getName());
					}
				}
				
			}
			
		}
		
		return false;
	}

}
