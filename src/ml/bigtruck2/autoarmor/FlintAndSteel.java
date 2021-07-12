package ml.bigtruck2.autoarmor;

import org.bukkit.Material;
import org.bukkit.entity.Damageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlintAndSteel implements Listener {
    @EventHandler
    public void useFlintAndSteel(PlayerInteractEvent e){
        System.out.println("e");
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            System.out.println("e2");
            ItemStack itemStack = e.getItem();
            if (itemStack.getType() == Material.FLINT_AND_STEEL) {
                System.out.println(itemStack.getDurability());
               if(itemStack.getDurability() < (short) 61){
                   System.out.println("e4");
                   ItemMeta itemMeta = itemStack.getItemMeta();
                   itemStack.setDurability((short) 61);
                   e.getPlayer().setItemInHand(itemStack);
                }
            }
        }
    }
}
