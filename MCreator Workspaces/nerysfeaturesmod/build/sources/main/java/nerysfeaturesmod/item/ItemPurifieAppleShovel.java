
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
public class ItemPurifieAppleShovel extends ElementsNerYsFeaturesMod.ModElement {
	@GameRegistry.ObjectHolder("nerysfeaturesmod:purified_apple_shovel")
	public static final Item block = null;
	public ItemPurifieAppleShovel(ElementsNerYsFeaturesMod instance) {
		super(instance, 353);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("PURIFIED_APPLE_SHOVEL", 8, 1802, 14f, 4f, 57)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 8);
				return ret.keySet();
			}
		}.setUnlocalizedName("purified_apple_shovel").setRegistryName("purified_apple_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("nerysfeaturesmod:purified_apple_shovel", "inventory"));
	}
}
