package io.github.Skepter.Warhammer;

import io.github.Skepter.AllAssets.API.CustomItem;

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
	public void leftClickBlock(Player paramPlayer) {		
	}

	@Override
	public void rightClickBlock(Player paramPlayer) {
		kill(paramPlayer);
	}

	@Override
	public void leftClickAir(Player paramPlayer) {		
	}

	@Override
	public void rightClickAir(Player paramPlayer) {
		kill(paramPlayer);
	}
	
	private void kill(Player player) {
		for(Entity e : player.getNearbyEntities(40, 40, 40)) {
			if(e instanceof Monster){
				player.getWorld().strikeLightning(e.getLocation());
				player.getWorld().createExplosion(e.getLocation(), 6.0F);}
		}
	}

}
