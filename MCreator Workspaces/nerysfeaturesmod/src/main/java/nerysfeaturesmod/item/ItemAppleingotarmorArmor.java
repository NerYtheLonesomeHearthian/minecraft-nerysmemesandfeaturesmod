
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
public class ItemAppleingotarmorArmor extends ElementsNerYsFeaturesMod.ModElement {
	@GameRegistry.ObjectHolder("nerysfeaturesmod:appleingotarmorarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:appleingotarmorarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:appleingotarmorarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:appleingotarmorarmorboots")
	public static final Item boots = null;
	public ItemAppleingotarmorArmor(ElementsNerYsFeaturesMod instance) {
		super(instance, 129);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("APPLEINGOTARMORARMOR", "nerysfeaturesmod:appleingotarmor", 55,
				new int[]{8, 18, 22, 8}, 27,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_elytra")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("appleingotarmorarmorhelmet")
				.setRegistryName("appleingotarmorarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("appleingotarmorarmorbody")
				.setRegistryName("appleingotarmorarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("appleingotarmorarmorlegs")
				.setRegistryName("appleingotarmorarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("appleingotarmorarmorboots")
				.setRegistryName("appleingotarmorarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("nerysfeaturesmod:appleingotarmorarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("nerysfeaturesmod:appleingotarmorarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("nerysfeaturesmod:appleingotarmorarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nerysfeaturesmod:appleingotarmorarmorboots", "inventory"));
	}
}
