package nerysfeaturesmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class ProcedureThePowerOfTheSunRightClickedOnBlock extends ElementsNerYsFeaturesMod.ModElement {
	public ProcedureThePowerOfTheSunRightClickedOnBlock(ElementsNerYsFeaturesMod instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ThePowerOfTheSunRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ThePowerOfTheSunRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ThePowerOfTheSunRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ThePowerOfTheSunRightClickedOnBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
				world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
	}
}
