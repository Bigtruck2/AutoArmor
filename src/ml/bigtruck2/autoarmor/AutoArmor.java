package ml.bigtruck2.autoarmor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoArmor extends JavaPlugin {
    public static AutoArmor plugin;
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new Equip(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new FlintAndSteel(), this);
        plugin = this;
    }

    @Override
    public void onDisable() {

    }

}
