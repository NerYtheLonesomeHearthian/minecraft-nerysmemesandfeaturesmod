package nerysfeaturesmod.procedure;

import net.minecraft.entity.Entity;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class ProcedureThePowerOfTheSunMobIsHitWithTool extends ElementsNerYsFeaturesMod.ModElement {
	public ProcedureThePowerOfTheSunMobIsHitWithTool(ElementsNerYsFeaturesMod instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ThePowerOfTheSunMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.world.removeEntity(entity);
	}
}
