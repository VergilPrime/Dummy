/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.vergilprime.blankplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Brandon Barker
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Performed when the plugin is enabled
        getLogger().info("Plugin has been enabled");
    }

    @Override
    public void onDisable() {
        // Performed when the plugin is disabled
        getLogger().info("Plugin has been disabled");
    }

}
