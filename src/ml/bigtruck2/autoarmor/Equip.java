package ml.bigtruck2.autoarmor;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.scheduler.BukkitRunnable;

public class Equip implements Listener {
    @EventHandler
    public void Chest(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        if(e.getClickedInventory() instanceof PlayerInventory){
            return;
        }
        Material material = e.getCurrentItem().getType();
        equip(e,player,material);
    }
    @EventHandler
    public void playerPickup(PlayerPickupItemEvent e){
        Player player = e.getPlayer();
        Material material = e.getItem().getItemStack().getType();
        equip(e,player,material);
    }
    public void equip(PlayerPickupItemEvent e,Player player,Material material){

        int currentHead = 0;
        int currentlLeg = 0;
        int currentChest = 0;
        int currentBoots = 0;
        int newHead = 0;
        int newlLeg = 0;
        int newChest = 0;
        int newBoots = 0;
        if(material == Material.LEATHER_CHESTPLATE || material == Material.LEATHER_HELMET || material == Material.LEATHER_BOOTS||material == Material.LEATHER_LEGGINGS || material == Material.IRON_CHESTPLATE || material == Material.IRON_HELMET || material == Material.IRON_BOOTS||material == Material.IRON_LEGGINGS || material == Material.GOLD_CHESTPLATE || material == Material.GOLD_HELMET || material == Material.GOLD_BOOTS||material == Material.GOLD_LEGGINGS || material == Material.CHAINMAIL_CHESTPLATE || material == Material.CHAINMAIL_HELMET || material == Material.CHAINMAIL_BOOTS||material == Material.CHAINMAIL_LEGGINGS || material == Material.DIAMOND_CHESTPLATE || material == Material.DIAMOND_HELMET || material == Material.DIAMOND_BOOTS||material == Material.DIAMOND_LEGGINGS){
            ItemStack itemStack = e.getItem().getItemStack();
            if(material == Material.LEATHER_HELMET){
                newHead = 1;
            }else if (material == Material.GOLD_HELMET){
                newHead = 2;
            }else if (material == Material.CHAINMAIL_HELMET){
                newHead = 3;
            } else if (material == Material.IRON_HELMET){
                newHead = 4;
            } else if (material == Material.DIAMOND_HELMET){
                newHead = 5;
            }
            if(material == Material.LEATHER_LEGGINGS){
                newlLeg = 1;
            }else if (material == Material.GOLD_LEGGINGS){
                newlLeg = 2;
            }else if (material == Material.CHAINMAIL_LEGGINGS){
                newlLeg = 3;
            } else if (material == Material.IRON_LEGGINGS){
                newlLeg = 4;
            } else if (material == Material.DIAMOND_LEGGINGS){
                newlLeg = 5;
            }
            if(material == Material.LEATHER_CHESTPLATE){
                newChest = 1;
            }else if (material == Material.GOLD_CHESTPLATE){
                newChest = 2;
            }else if (material == Material.CHAINMAIL_CHESTPLATE){
                newChest = 3;
            } else if (material == Material.IRON_CHESTPLATE){
                newChest = 4;
            } else if (material == Material.DIAMOND_CHESTPLATE){
                newChest = 5;
            }
            if(material == Material.LEATHER_BOOTS){
                newBoots = 1;
            }else if (material == Material.GOLD_BOOTS){
                newBoots = 2;
            }else if (material == Material.CHAINMAIL_BOOTS){
                newBoots = 3;
            } else if (material == Material.IRON_BOOTS){
                newBoots = 4;
            } else if (material == Material.DIAMOND_BOOTS){
                newBoots = 5;
            }

            if(player.getEquipment().getHelmet() != null) {
                ItemStack itemStack1 = player.getEquipment().getHelmet();
                if (itemStack1.getType() == Material.LEATHER_HELMET) {
                    currentHead = 1;
                } else if (itemStack1.getType() == Material.GOLD_HELMET) {
                    currentHead = 2;
                } else if (itemStack1.getType() == Material.CHAINMAIL_HELMET) {
                    currentHead = 3;
                } else if (itemStack1.getType() == Material.IRON_HELMET) {
                    currentHead = 4;
                } else if (itemStack1.getType() == Material.DIAMOND_HELMET) {
                    currentHead = 5;
                }
                if(newHead > currentHead){
                    player.getEquipment().setHelmet(itemStack);
                    player.getInventory().addItem(itemStack1);
                    e.getItem().remove();
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Helmet");
                }
            }
            if(player.getEquipment().getLeggings() != null) {
                ItemStack itemStack2 = player.getEquipment().getLeggings();
                if (itemStack2.getType() == Material.LEATHER_LEGGINGS) {
                    currentlLeg = 1;
                } else if (itemStack2.getType() == Material.GOLD_LEGGINGS) {
                    currentlLeg = 2;
                } else if (itemStack2.getType() == Material.CHAINMAIL_LEGGINGS) {
                    currentlLeg = 3;
                } else if (itemStack2.getType() == Material.IRON_LEGGINGS) {
                    currentlLeg = 4;
                } else if (itemStack2.getType() == Material.DIAMOND_LEGGINGS) {
                    currentlLeg = 5;
                }
                if(newlLeg > currentlLeg){
                    player.getEquipment().setLeggings(itemStack);
                    player.getInventory().addItem(itemStack2);
                    e.getItem().remove();
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Leggings");
                }
            }
            if(player.getEquipment().getChestplate() != null) {
                ItemStack itemStack3 = player.getEquipment().getChestplate();
                if (itemStack3.getType() == Material.LEATHER_CHESTPLATE) {
                    currentChest = 1;
                } else if (itemStack3.getType() == Material.GOLD_CHESTPLATE) {
                    currentChest = 2;
                } else if (itemStack3.getType() == Material.CHAINMAIL_CHESTPLATE) {
                    currentChest = 3;
                } else if (itemStack3.getType() == Material.IRON_CHESTPLATE) {
                    currentChest = 4;
                } else if (itemStack3.getType() == Material.DIAMOND_CHESTPLATE) {
                    currentChest = 5;
                }
                if(newChest > currentChest){
                    player.getEquipment().setChestplate(itemStack);
                    player.getInventory().addItem(itemStack3);
                    e.getItem().remove();
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Chestplate");
                }
            }
            if(player.getEquipment().getBoots() != null) {
                ItemStack itemStack4 = player.getEquipment().getBoots();
                if (itemStack4.getType() == Material.LEATHER_BOOTS) {
                    currentBoots = 1;
                } else if (itemStack4.getType() == Material.GOLD_BOOTS) {
                    currentBoots = 2;
                } else if (itemStack4.getType() == Material.CHAINMAIL_BOOTS) {
                    currentBoots = 3;
                } else if (itemStack4.getType() == Material.IRON_BOOTS) {
                    currentBoots = 4;
                } else if (itemStack4.getType() == Material.DIAMOND_BOOTS) {
                    currentBoots = 5;
                }
                if (newBoots > currentBoots) {
                    player.getEquipment().setBoots(itemStack);
                    player.getInventory().addItem(itemStack4);
                    e.getItem().remove();
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Boots");
                }
            }
            if(newBoots != 0 && currentBoots == 0){
                player.getEquipment().setBoots(itemStack);
                e.getItem().remove();
                e.setCancelled(true);
                player.sendMessage("Automatically equipped Boots");
            }else if (newChest != 0 && currentChest == 0){
                player.getEquipment().setChestplate(itemStack);
                e.getItem().remove();
                e.setCancelled(true);
                player.sendMessage("Automatically equipped a Chestplate");
            }else if (newHead != 0 && currentHead == 0){
                player.getEquipment().setHelmet(itemStack);
                e.getItem().remove();
                e.setCancelled(true);
                player.sendMessage("Automatically equipped a Helmet");
            }else if(newlLeg != 0 && currentlLeg == 0){
                player.getEquipment().setLeggings(itemStack);
                e.getItem().remove();
                e.setCancelled(true);
                player.sendMessage("Automatically equipped Leggings");
            }

        }
    }
    public void equip(InventoryClickEvent e,Player player,Material material) {

        int currentHead = 0;
        int currentlLeg = 0;
        int currentChest = 0;
        int currentBoots = 0;
        int newHead = 0;
        int newlLeg = 0;
        int newChest = 0;
        int newBoots = 0;
        if (material == Material.LEATHER_CHESTPLATE || material == Material.LEATHER_HELMET || material == Material.LEATHER_BOOTS || material == Material.LEATHER_LEGGINGS || material == Material.IRON_CHESTPLATE || material == Material.IRON_HELMET || material == Material.IRON_BOOTS || material == Material.IRON_LEGGINGS || material == Material.GOLD_CHESTPLATE || material == Material.GOLD_HELMET || material == Material.GOLD_BOOTS || material == Material.GOLD_LEGGINGS || material == Material.CHAINMAIL_CHESTPLATE || material == Material.CHAINMAIL_HELMET || material == Material.CHAINMAIL_BOOTS || material == Material.CHAINMAIL_LEGGINGS || material == Material.DIAMOND_CHESTPLATE || material == Material.DIAMOND_HELMET || material == Material.DIAMOND_BOOTS || material == Material.DIAMOND_LEGGINGS) {
            ItemStack itemStack = e.getCurrentItem();
            if (material == Material.LEATHER_HELMET) {
                newHead = 1;
            } else if (material == Material.GOLD_HELMET) {
                newHead = 2;
            } else if (material == Material.CHAINMAIL_HELMET) {
                newHead = 3;
            } else if (material == Material.IRON_HELMET) {
                newHead = 4;
            } else if (material == Material.DIAMOND_HELMET) {
                newHead = 5;
            }
            if (material == Material.LEATHER_LEGGINGS) {
                newlLeg = 1;
            } else if (material == Material.GOLD_LEGGINGS) {
                newlLeg = 2;
            } else if (material == Material.CHAINMAIL_LEGGINGS) {
                newlLeg = 3;
            } else if (material == Material.IRON_LEGGINGS) {
                newlLeg = 4;
            } else if (material == Material.DIAMOND_LEGGINGS) {
                newlLeg = 5;
            }
            if (material == Material.LEATHER_CHESTPLATE) {
                newChest = 1;
            } else if (material == Material.GOLD_CHESTPLATE) {
                newChest = 2;
            } else if (material == Material.CHAINMAIL_CHESTPLATE) {
                newChest = 3;
            } else if (material == Material.IRON_CHESTPLATE) {
                newChest = 4;
            } else if (material == Material.DIAMOND_CHESTPLATE) {
                newChest = 5;
            }
            if (material == Material.LEATHER_BOOTS) {
                newBoots = 1;
            } else if (material == Material.GOLD_BOOTS) {
                newBoots = 2;
            } else if (material == Material.CHAINMAIL_BOOTS) {
                newBoots = 3;
            } else if (material == Material.IRON_BOOTS) {
                newBoots = 4;
            } else if (material == Material.DIAMOND_BOOTS) {
                newBoots = 5;
            }

            if (player.getEquipment().getHelmet() != null) {
                ItemStack itemStack1 = player.getEquipment().getHelmet();
                if (itemStack1.getType() == Material.LEATHER_HELMET) {
                    currentHead = 1;
                } else if (itemStack1.getType() == Material.GOLD_HELMET) {
                    currentHead = 2;
                } else if (itemStack1.getType() == Material.CHAINMAIL_HELMET) {
                    currentHead = 3;
                } else if (itemStack1.getType() == Material.IRON_HELMET) {
                    currentHead = 4;
                } else if (itemStack1.getType() == Material.DIAMOND_HELMET) {
                    currentHead = 5;
                }
                if (newHead > currentHead) {
                    player.getEquipment().setHelmet(itemStack);
                    player.getInventory().addItem(itemStack1);
                    remove(player,e);
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Helmet");
                }
            }
            if (player.getEquipment().getLeggings() != null) {
                ItemStack itemStack2 = player.getEquipment().getLeggings();
                if (itemStack2.getType() == Material.LEATHER_LEGGINGS) {
                    currentlLeg = 1;
                } else if (itemStack2.getType() == Material.GOLD_LEGGINGS) {
                    currentlLeg = 2;
                } else if (itemStack2.getType() == Material.CHAINMAIL_LEGGINGS) {
                    currentlLeg = 3;
                } else if (itemStack2.getType() == Material.IRON_LEGGINGS) {
                    currentlLeg = 4;
                } else if (itemStack2.getType() == Material.DIAMOND_LEGGINGS) {
                    currentlLeg = 5;
                }
                if (newlLeg > currentlLeg) {
                    player.getEquipment().setLeggings(itemStack);
                    player.getInventory().addItem(itemStack2);
                    remove(player,e);
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Leggings");
                }
            }
            if (player.getEquipment().getChestplate() != null) {
                ItemStack itemStack3 = player.getEquipment().getChestplate();
                if (itemStack3.getType() == Material.LEATHER_CHESTPLATE) {
                    currentChest = 1;
                } else if (itemStack3.getType() == Material.GOLD_CHESTPLATE) {
                    currentChest = 2;
                } else if (itemStack3.getType() == Material.CHAINMAIL_CHESTPLATE) {
                    currentChest = 3;
                } else if (itemStack3.getType() == Material.IRON_CHESTPLATE) {
                    currentChest = 4;
                } else if (itemStack3.getType() == Material.DIAMOND_CHESTPLATE) {
                    currentChest = 5;
                }
                if (newChest > currentChest) {
                    player.getEquipment().setChestplate(itemStack);
                    player.getInventory().addItem(itemStack3);
                    remove(player,e);
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Chestplate");
                }
            }
            if (player.getEquipment().getBoots() != null) {
                ItemStack itemStack4 = player.getEquipment().getBoots();
                if (itemStack4.getType() == Material.LEATHER_BOOTS) {
                    currentBoots = 1;
                } else if (itemStack4.getType() == Material.GOLD_BOOTS) {
                    currentBoots = 2;
                } else if (itemStack4.getType() == Material.CHAINMAIL_BOOTS) {
                    currentBoots = 3;
                } else if (itemStack4.getType() == Material.IRON_BOOTS) {
                    currentBoots = 4;
                } else if (itemStack4.getType() == Material.DIAMOND_BOOTS) {
                    currentBoots = 5;
                }
                if (newBoots > currentBoots) {
                    player.getEquipment().setBoots(itemStack);
                    player.getInventory().addItem(itemStack4);
                    remove(player,e);
                    e.setCancelled(true);
                    player.sendMessage("Automatically equipped better Boots");
                }
            }
            if (newBoots != 0 && currentBoots == 0) {
                player.getEquipment().setBoots(itemStack);
                remove(player,e);
                e.setCancelled(true);
                player.sendMessage("Automatically equipped Boots");
            } else if (newChest != 0 && currentChest == 0) {
                player.getEquipment().setChestplate(itemStack);
                remove(player,e);
                e.setCancelled(true);
                player.sendMessage("Automatically equipped a Chestplate");
            } else if (newHead != 0 && currentHead == 0) {
                player.getEquipment().setHelmet(itemStack);
                remove(player,e);
                e.setCancelled(true);
                player.sendMessage("Automatically equipped a Helmet");
            } else if (newlLeg != 0 && currentlLeg == 0) {
                player.getEquipment().setLeggings(itemStack);
                remove(player,e);
                e.setCancelled(true);
                player.sendMessage("Automatically equipped Leggings");
            }

        }
    }
    public void remove(Player player, InventoryClickEvent e){
        new BukkitRunnable(){
            @Override
            public void run(){
                player.updateInventory();
                e.getClickedInventory().removeItem(e.getCurrentItem());
               player.getInventory().removeItem(e.getCurrentItem());
            }
        }.runTaskLater(AutoArmor.plugin, 1L);
    }

}
