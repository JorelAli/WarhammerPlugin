package io.github.Skepter.Warhammer;

import io.github.skepter.allassets.api.CustomItem;
import io.github.skepter.allassets.api.utils.Sphere;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("deprecation")
public class MassBlockRemoverItem extends CustomItem {

	public MassBlockRemoverItem(Warhammer plugin, ItemStack itemStack, String itemName) {
		super(plugin, itemStack, itemName);
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
		removeBlocks(player);
		return true;
	}

	@Override
	public boolean rightClickBlock(Player player) {
		removeBlocks(player);
		return true;
	}

	private void removeBlocks(Player player) {
		Location loc = player.getTargetBlock(null, 256).getLocation();
		Sphere sphere = new Sphere(loc, 7);
		for (Block b : sphere.getBlocks()) 
			b.setType(Material.AIR);
	}
}
