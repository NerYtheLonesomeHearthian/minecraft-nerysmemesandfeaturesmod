
package nerysfeaturesmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import nerysfeaturesmod.block.BlockSakuraLeaves;
import nerysfeaturesmod.block.BlockNewtreeleaves;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class OreDictLeaves extends ElementsNerYsFeaturesMod.ModElement {
	public OreDictLeaves(ElementsNerYsFeaturesMod instance) {
		super(instance, 50);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("leaves", new ItemStack(BlockSakuraLeaves.block, (int) (1)));
		OreDictionary.registerOre("leaves", new ItemStack(BlockNewtreeleaves.block, (int) (1)));
	}
}
