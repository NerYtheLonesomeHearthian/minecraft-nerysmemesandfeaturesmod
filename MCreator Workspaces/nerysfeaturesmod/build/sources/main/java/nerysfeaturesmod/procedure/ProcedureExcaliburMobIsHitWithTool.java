package nerysfeaturesmod.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class ProcedureExcaliburMobIsHitWithTool extends ElementsNerYsFeaturesMod.ModElement {
	public ProcedureExcaliburMobIsHitWithTool(ElementsNerYsFeaturesMod instance) {
		super(instance, 47);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ExcaliburMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure ExcaliburMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) 99999);
		itemstack.setItemDamage((int) 0);
	}
}
