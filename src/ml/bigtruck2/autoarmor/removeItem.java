package ml.bigtruck2.autoarmor;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class removeItem {
    public static void premove(Player player, ItemStack itemStack){
        new BukkitRunnable(){

            @Override
            public void run() {
                System.out.println(itemStack);
                System.out.println(player.getInventory().contains(itemStack));
            }
        }.runTaskLater(AutoArmor.plugin, 20);
    }
}
