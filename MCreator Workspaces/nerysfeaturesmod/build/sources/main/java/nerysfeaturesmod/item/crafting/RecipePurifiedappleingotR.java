
package nerysfeaturesmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import nerysfeaturesmod.item.ItemPurifiedapplefragment;
import nerysfeaturesmod.item.ItemAppleingot;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class RecipePurifiedappleingotR extends ElementsNerYsFeaturesMod.ModElement {
	public RecipePurifiedappleingotR(ElementsNerYsFeaturesMod instance) {
		super(instance, 337);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemAppleingot.block, (int) (1)), new ItemStack(ItemPurifiedapplefragment.block, (int) (1)), 1F);
	}
}
