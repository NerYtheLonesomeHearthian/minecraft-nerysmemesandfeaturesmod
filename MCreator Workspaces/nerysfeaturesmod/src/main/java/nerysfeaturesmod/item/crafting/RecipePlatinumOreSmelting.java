
package nerysfeaturesmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import nerysfeaturesmod.item.ItemPlatinumIngot;

import nerysfeaturesmod.block.BlockPlatinumOre;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class RecipePlatinumOreSmelting extends ElementsNerYsFeaturesMod.ModElement {
	public RecipePlatinumOreSmelting(ElementsNerYsFeaturesMod instance) {
		super(instance, 103);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPlatinumOre.block, (int) (1)), new ItemStack(ItemPlatinumIngot.block, (int) (1)), 2.8F);
	}
}
