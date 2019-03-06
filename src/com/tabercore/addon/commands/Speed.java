package com.tabercore.addon.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.samtaber.base.Base;

public class Speed implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("tabercore.speed")) {
			
			if(label.equalsIgnoreCase("speed")) {
				
				if(args.length == 0) {
					
					player.sendMessage(Base.globalPrefix + "Missing variable $TYPE and value $AMOUNT");
					
				}else if(args.length == 1) {
					
					player.sendMessage(Base.globalPrefix + "Missing variable $TYPE and/or value $AMOUNT");
					
				}else if(args.length == 2) {
				
					
				}
				
			}
			
		}
		return false;
	}
	
	public void setWalkSpeed(Player player, float speed) {
		
		player.setWalkSpeed(speed);
		
		
	}

}
