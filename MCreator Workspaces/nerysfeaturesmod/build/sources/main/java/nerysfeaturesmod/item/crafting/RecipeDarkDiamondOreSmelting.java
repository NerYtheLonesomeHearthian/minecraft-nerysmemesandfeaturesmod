
package nerysfeaturesmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import nerysfeaturesmod.item.ItemDarkDiamondGem;

import nerysfeaturesmod.block.BlockDarkDiamondOre;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class RecipeDarkDiamondOreSmelting extends ElementsNerYsFeaturesMod.ModElement {
	public RecipeDarkDiamondOreSmelting(ElementsNerYsFeaturesMod instance) {
		super(instance, 151);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDarkDiamondOre.block, (int) (1)), new ItemStack(ItemDarkDiamondGem.block, (int) (1)), 2.8F);
	}
}
