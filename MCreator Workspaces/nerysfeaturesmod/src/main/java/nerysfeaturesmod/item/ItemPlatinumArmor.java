
package nerysfeaturesmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class ItemPlatinumArmor extends ElementsNerYsFeaturesMod.ModElement {
	@GameRegistry.ObjectHolder("nerysfeaturesmod:platinumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:platinumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:platinumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:platinumarmorboots")
	public static final Item boots = null;
	public ItemPlatinumArmor(ElementsNerYsFeaturesMod instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PLATINUMARMOR", "nerysfeaturesmod:platinum", 50, new int[]{16, 40, 48, 16}, 25,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_elytra")),
				4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("platinumarmorhelmet")
				.setRegistryName("platinumarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("platinumarmorbody")
				.setRegistryName("platinumarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("platinumarmorlegs")
				.setRegistryName("platinumarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("platinumarmorboots")
				.setRegistryName("platinumarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("nerysfeaturesmod:platinumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("nerysfeaturesmod:platinumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("nerysfeaturesmod:platinumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nerysfeaturesmod:platinumarmorboots", "inventory"));
	}
}
