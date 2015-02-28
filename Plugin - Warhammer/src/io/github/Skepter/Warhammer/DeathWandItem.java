package io.github.Skepter.Warhammer;

import io.github.skepter.allassets.api.CustomItem;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathWandItem extends CustomItem {

	public DeathWandItem(JavaPlugin plugin, ItemStack itemStack, String itemName) {
		super(plugin, itemStack, itemName);
	}

	@Override
	public boolean leftClickBlock(Player paramPlayer) {
		return false;
	}

	@Override
	public boolean rightClickBlock(Player paramPlayer) {
		kill(paramPlayer);
		return true;
	}

	@Override
	public boolean leftClickAir(Player paramPlayer) {
		return false;
	}

	@Override
	public boolean rightClickAir(Player paramPlayer) {
		kill(paramPlayer);
		return true;
	}
	
	private void kill(Player player) {
		for(Entity e : player.getNearbyEntities(40, 40, 40)) {
			if(e instanceof Monster){
				player.getWorld().strikeLightning(e.getLocation());
				player.getWorld().createExplosion(e.getLocation(), 6.0F);}
		}
	}

}
