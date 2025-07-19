
package nerysfeaturesmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

import java.util.Set;
import java.util.HashMap;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class ItemPlatinumShovel extends ElementsNerYsFeaturesMod.ModElement {
	@GameRegistry.ObjectHolder("nerysfeaturesmod:platinum_shovel")
	public static final Item block = null;
	public ItemPlatinumShovel(ElementsNerYsFeaturesMod instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("PLATINUM_SHOVEL", 32, 9192, 42f, 28f, 224)) {
			{
				this.attackSpeed = -2f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 32);
				return ret.keySet();
			}
		}.setUnlocalizedName("platinum_shovel").setRegistryName("platinum_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("nerysfeaturesmod:platinum_shovel", "inventory"));
	}
}
