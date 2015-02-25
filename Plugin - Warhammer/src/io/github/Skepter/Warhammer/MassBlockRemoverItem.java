package io.github.Skepter.Warhammer;

import io.github.Skepter.AllAssets.API.CustomItem;
import io.github.Skepter.AllAssets.API.Utils.Sphere;

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
	public void leftClickAir(Player player) {
	}

	@Override
	public void leftClickBlock(Player player) {
	}

	@Override
	public void rightClickAir(Player player) {
		removeBlocks(player);
	}

	@Override
	public void rightClickBlock(Player player) {
		removeBlocks(player);
	}

	private void removeBlocks(Player player) {
		Location loc = player.getTargetBlock(null, 256).getLocation();
		Sphere sphere = new Sphere(loc, 7);
		for (Block b : sphere.getBlocks()) 
			b.setType(Material.AIR);
	}
}
