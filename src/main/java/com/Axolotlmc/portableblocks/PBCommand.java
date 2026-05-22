package com.Axolotlmc.portableblocks;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PBCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage("只有玩家可以使用这个命令！");
            return true;
        }

        if (args.length != 1) {
            player.sendMessage("用法: /pb <anvil|crafting|cartography|loom|grindstone|smithing>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "anvil" -> player.openAnvil(null, true);
            case "crafting" -> player.openWorkbench(null, true);
            case "cartography" -> player.openCartographyTable(null, true);
            case "loom" -> player.openLoom(null, true);
            case "grindstone" -> player.openGrindstone(null, true);
            case "smithing" -> player.openSmithingTable(null, true);
            default -> player.sendMessage("未知方块类型: " + args[0]);
        }

        return true;
    }
}