package com.Axolotlmc.portableblocks;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("pb").setExecutor(new PBCommand());
        getLogger().info("AXPortableBlocks 已启用！");
    }

    @Override
    public void onDisable() {
        getLogger().info("AXPortableBlocks 已禁用！");
    }
}