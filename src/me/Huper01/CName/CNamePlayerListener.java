package me.Huper01.CName;

import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Coloured Names Plugin Player Listener
 * @author Huper01
 */
public class CNamePlayerListener extends PlayerListener {
    public static CName plugin;

    public CNamePlayerListener(CName instance) {
        plugin = instance;
    }
    
    
    public void onPlayerChat(PlayerChatEvent event) {
    		Player player = event.getPlayer();
    		String pName = player.getName();
    		String msg = event.getMessage();
    		int gColour;
    		if (CName.permissionHandler.inGroup("world", pName, "admins")){
    				gColour = 4;
    		} else if( CName.permissionHandler.inGroup("world", pName, "Admin2")){
    				gColour = 6;
    		} else if ( CName.permissionHandler.inGroup("world", pName, "Admin1")){
    				gColour = 2;
    		} else if ( CName.permissionHandler.inGroup("world", pName, "Moderator")){
    				gColour = 3;
    		} else {
    				gColour = 9;
    		}
    		
    		event.setFormat(ChatColor.getByCode(gColour) + pName+ChatColor.GREEN + ": " + ChatColor.getByCode(7) + msg);
    		
    }
    public void onPlayerJoin(PlayerJoinEvent event){
    		Player player = event.getPlayer();
    		String pName = player.getName();
    		int gColour;
    		if (CName.permissionHandler.inGroup("world", pName, "admins")){
				gColour = 4;
    		} else if( CName.permissionHandler.inGroup("world", pName, "Admin2")){
				gColour = 6;
    		} else if ( CName.permissionHandler.inGroup("world", pName, "Admin1")){
    			gColour = 2;
    		} else if ( CName.permissionHandler.inGroup("world", pName, "Moderator")){
    			gColour = 3;
    		} else {
				gColour = 7;
    		}	
    		
    		event.setJoinMessage(ChatColor.getByCode(gColour) + pName + ChatColor.GREEN + " joined the game");
    }
    	public void onPlayerQuit(PlayerQuitEvent event){
    		Player player = event.getPlayer();
    		String pName = player.getName();
    		int gColour;
    		if (CName.permissionHandler.inGroup("world", pName, "admins")){
    			gColour = 4;
    		} else if( CName.permissionHandler.inGroup("world", pName, "Admin2")){
    			gColour = 6;
    		} else if ( CName.permissionHandler.inGroup("world", pName, "Admin1")){
    			gColour = 2;
    		} else if ( CName.permissionHandler.inGroup("world", pName, "Moderator")){
    			gColour = 3;
    		} else {
    			gColour = 7;
    		}	
		
    		event.setQuitMessage(ChatColor.getByCode(gColour) + pName + ChatColor.GREEN + " left the game");
    	}
}