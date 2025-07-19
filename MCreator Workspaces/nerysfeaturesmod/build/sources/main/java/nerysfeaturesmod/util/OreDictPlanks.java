
package nerysfeaturesmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import nerysfeaturesmod.block.BlockSakuraPlanks;
import nerysfeaturesmod.block.BlockFuturetreeplanks;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class OreDictPlanks extends ElementsNerYsFeaturesMod.ModElement {
	public OreDictPlanks(ElementsNerYsFeaturesMod instance) {
		super(instance, 79);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("planks", new ItemStack(BlockFuturetreeplanks.block, (int) (1)));
		OreDictionary.registerOre("planks", new ItemStack(BlockSakuraPlanks.block, (int) (1)));
	}
}
