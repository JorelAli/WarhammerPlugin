package io.github.Skepter.Warhammer;

import io.github.skepter.allassets.api.CustomItem;

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
	public boolean leftClickAir(Player player) {
		return false;
	}

	@Override
	public boolean leftClickBlock(Player player) {
		return false;
	}

	@Override
	public boolean rightClickAir(Player player) {
		createExplosion(player);
		return true;
	}

	@Override
	public boolean rightClickBlock(Player player) {
		createExplosion(player);
		return true;
	}

	private void createExplosion(Player player) {
		Location loc = player.getTargetBlock(null, 256).getLocation();
		player.getWorld().createExplosion(loc, 6.0F);
		for (int i = 0; i < 10; i++)
			player.getWorld().strikeLightning(loc);
	}

}
