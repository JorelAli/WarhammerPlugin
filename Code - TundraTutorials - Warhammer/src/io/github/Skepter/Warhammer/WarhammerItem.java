package io.github.Skepter.Warhammer;

import io.github.Skepter.AllAssets.API.CustomItem;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("deprecation")
public class WarhammerItem extends CustomItem {

	public WarhammerItem(JavaPlugin plugin, ItemStack itemStack, String itemName, String permission) {
		super(plugin, itemStack, itemName, permission);
	}

	@Override
	public void leftClickAir(Player player) {
	}

	@Override
	public void leftClickBlock(Player player) {
	}

	@Override
	public void rightClickAir(Player player) {
		createExplosion(player);
	}

	@Override
	public void rightClickBlock(Player player) {
		createExplosion(player);
	}

	private void createExplosion(Player player) {
		Location loc = player.getTargetBlock(null, 256).getLocation();
		player.getWorld().createExplosion(loc, 6.0F);
		for (int i = 0; i < 10; i++)
			player.getWorld().strikeLightning(loc);
	}

}
