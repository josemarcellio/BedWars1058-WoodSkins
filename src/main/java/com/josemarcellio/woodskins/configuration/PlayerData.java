package com.josemarcellio.woodskins.configuration;

import org.bukkit.plugin.java.JavaPlugin;

public class PlayerData extends ConfigManager {

    public PlayerData(JavaPlugin plugin) {
        super(plugin, "playerdata.yml");
    }

}
