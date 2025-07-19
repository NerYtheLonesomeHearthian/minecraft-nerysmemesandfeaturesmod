
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
public class ItemDarkDiamondArmor extends ElementsNerYsFeaturesMod.ModElement {
	@GameRegistry.ObjectHolder("nerysfeaturesmod:darkdiamondarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:darkdiamondarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:darkdiamondarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nerysfeaturesmod:darkdiamondarmorboots")
	public static final Item boots = null;
	public ItemDarkDiamondArmor(ElementsNerYsFeaturesMod instance) {
		super(instance, 166);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DARKDIAMONDARMOR", "nerysfeaturesmod:darkdiamond", 60, new int[]{8, 20, 24, 8},
				36, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_elytra")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("darkdiamondarmorhelmet")
				.setRegistryName("darkdiamondarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("darkdiamondarmorbody")
				.setRegistryName("darkdiamondarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("darkdiamondarmorlegs")
				.setRegistryName("darkdiamondarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("darkdiamondarmorboots")
				.setRegistryName("darkdiamondarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("nerysfeaturesmod:darkdiamondarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("nerysfeaturesmod:darkdiamondarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("nerysfeaturesmod:darkdiamondarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nerysfeaturesmod:darkdiamondarmorboots", "inventory"));
	}
}
