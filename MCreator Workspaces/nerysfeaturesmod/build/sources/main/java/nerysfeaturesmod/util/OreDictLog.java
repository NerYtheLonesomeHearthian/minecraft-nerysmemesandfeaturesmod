
package nerysfeaturesmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import nerysfeaturesmod.block.BlockSakuraLog;
import nerysfeaturesmod.block.BlockFuturetreewood;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class OreDictLog extends ElementsNerYsFeaturesMod.ModElement {
	public OreDictLog(ElementsNerYsFeaturesMod instance) {
		super(instance, 237);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("log", new ItemStack(BlockSakuraLog.block, (int) (1)));
		OreDictionary.registerOre("log", new ItemStack(BlockFuturetreewood.block, (int) (1)));
		OreDictionary.registerOre("log", new ItemStack(Blocks.LOG, (int) (1), 0));
		OreDictionary.registerOre("log", new ItemStack(Blocks.LOG, (int) (1), 1));
		OreDictionary.registerOre("log", new ItemStack(Blocks.LOG, (int) (1), 2));
		OreDictionary.registerOre("log", new ItemStack(Blocks.LOG, (int) (1), 3));
		OreDictionary.registerOre("log", new ItemStack(Blocks.LOG2, (int) (1), 0));
		OreDictionary.registerOre("log", new ItemStack(Blocks.LOG2, (int) (1), 1));
	}
}
