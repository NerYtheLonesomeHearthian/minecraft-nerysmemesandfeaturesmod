
package nerysfeaturesmod.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import nerysfeaturesmod.block.BlockNewtreeleaves;
import nerysfeaturesmod.block.BlockFuturetreewood;

import nerysfeaturesmod.ElementsNerYsFeaturesMod;

import java.util.Random;

@ElementsNerYsFeaturesMod.ModElement.Tag
public class BiomeFuture extends ElementsNerYsFeaturesMod.ModElement {
	@GameRegistry.ObjectHolder("nerysfeaturesmod:future")
	public static final BiomeGenCustom biome = null;
	public BiomeFuture(ElementsNerYsFeaturesMod instance) {
		super(instance, 260);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.MESA, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL,
				BiomeDictionary.Type.MUSHROOM, BiomeDictionary.Type.SWAMP);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 1));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("The Future").setRainfall(0.1F).setBaseHeight(0.1F).setWaterColor(-52429).setHeightVariation(2F)
					.setTemperature(0.5F));
			setRegistryName("future");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 3;
			decorator.grassPerChunk = 2;
			decorator.deadBushPerChunk = 1;
			decorator.mushroomsPerChunk = 5;
			decorator.bigMushroomsPerChunk = 2;
			decorator.reedsPerChunk = 1;
			decorator.cactiPerChunk = 3;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityEnderman.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityIllusionIllager.class, 40, 1, 5));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -10066177;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -10066177;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -16711733;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return new CustomTree();
		}
	}

	static class CustomTree extends WorldGenAbstractTree {
		CustomTree() {
			super(false);
		}

		@Override
		public boolean generate(World world, Random rand, BlockPos position) {
			int height = rand.nextInt(5) + 8;
			boolean spawnTree = true;
			if (position.getY() >= 1 && position.getY() + height + 1 <= world.getHeight()) {
				for (int j = position.getY(); j <= position.getY() + 1 + height; j++) {
					int k = 1;
					if (j == position.getY())
						k = 0;
					if (j >= position.getY() + height - 1)
						k = 2;
					for (int px = position.getX() - k; px <= position.getX() + k && spawnTree; px++) {
						for (int pz = position.getZ() - k; pz <= position.getZ() + k && spawnTree; pz++) {
							if (j >= 0 && j < world.getHeight()) {
								if (!this.isReplaceable(world, new BlockPos(px, j, pz))) {
									spawnTree = false;
								}
							} else {
								spawnTree = false;
							}
						}
					}
				}
				if (!spawnTree) {
					return false;
				} else {
					Block ground = world.getBlockState(position.add(0, -1, 0)).getBlock();
					Block ground2 = world.getBlockState(position.add(0, -2, 0)).getBlock();
					if (!((ground == Blocks.GRASS.getDefaultState().getBlock() || ground == Blocks.DIRT.getStateFromMeta(0).getBlock())
							&& (ground2 == Blocks.GRASS.getDefaultState().getBlock() || ground2 == Blocks.DIRT.getStateFromMeta(0).getBlock())))
						return false;
					IBlockState state = world.getBlockState(position.down());
					if (position.getY() < world.getHeight() - height - 1) {
						world.setBlockState(position.down(), Blocks.DIRT.getStateFromMeta(0), 2);
						for (int genh = position.getY() - 3 + height; genh <= position.getY() + height; genh++) {
							int i4 = genh - (position.getY() + height);
							int j1 = (int) (1 - i4 * 0.5);
							for (int k1 = position.getX() - j1; k1 <= position.getX() + j1; ++k1) {
								for (int i2 = position.getZ() - j1; i2 <= position.getZ() + j1; ++i2) {
									int j2 = i2 - position.getZ();
									if (Math.abs(position.getX()) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i4 != 0) {
										BlockPos blockpos = new BlockPos(k1, genh, i2);
										state = world.getBlockState(blockpos);
										if (state.getBlock().isAir(state, world, blockpos) || state.getBlock().isLeaves(state, world, blockpos)
												|| state.getBlock() == Blocks.VINE.getDefaultState().getBlock()
												|| state.getBlock() == BlockNewtreeleaves.block.getDefaultState().getBlock()) {
											this.setBlockAndNotifyAdequately(world, blockpos, BlockNewtreeleaves.block.getDefaultState());
										}
									}
								}
							}
						}
						for (int genh = 0; genh < height; genh++) {
							BlockPos genhPos = position.up(genh);
							state = world.getBlockState(genhPos);
							if (state.getBlock().isAir(state, world, genhPos) || state.getBlock() == Blocks.VINE.getDefaultState().getBlock()
									|| state.getBlock() == BlockNewtreeleaves.block.getDefaultState().getBlock()) {
								this.setBlockAndNotifyAdequately(world, position.up(genh), BlockFuturetreewood.block.getDefaultState());
							}
						}
						if (rand.nextInt(4) == 0 && height > 5) {
							for (int hlevel = 0; hlevel < 2; hlevel++) {
								for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
									if (rand.nextInt(4 - hlevel) == 0) {
										EnumFacing enumfacing1 = enumfacing.getOpposite();
										this.setBlockAndNotifyAdequately(world,
												position.add(enumfacing1.getFrontOffsetX(), height - 5 + hlevel, enumfacing1.getFrontOffsetZ()),
												Blocks.COCOA.getDefaultState());
									}
								}
							}
						}
						return true;
					} else {
						return false;
					}
				}
			} else {
				return false;
			}
		}

		private void addVines(World world, BlockPos pos) {
			this.setBlockAndNotifyAdequately(world, pos, Blocks.VINE.getDefaultState());
			int i = 5;
			for (BlockPos blockpos = pos.down(); world.isAirBlock(blockpos) && i > 0; --i) {
				this.setBlockAndNotifyAdequately(world, blockpos, Blocks.VINE.getDefaultState());
				blockpos = blockpos.down();
			}
		}

		@Override
		protected boolean canGrowInto(Block blockType) {
			return blockType.getDefaultState().getMaterial() == Material.AIR || blockType == BlockFuturetreewood.block.getDefaultState().getBlock()
					|| blockType == BlockNewtreeleaves.block.getDefaultState().getBlock() || blockType == Blocks.GRASS.getDefaultState().getBlock()
					|| blockType == Blocks.DIRT.getStateFromMeta(0).getBlock();
		}

		@Override
		protected void setDirtAt(World world, BlockPos pos) {
			if (world.getBlockState(pos).getBlock() != Blocks.DIRT.getStateFromMeta(0).getBlock())
				this.setBlockAndNotifyAdequately(world, pos, Blocks.DIRT.getStateFromMeta(0));
		}

		@Override
		public boolean isReplaceable(World world, BlockPos pos) {
			net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
			return state.getBlock().isAir(state, world, pos) || canGrowInto(state.getBlock()) || state.getBlock().isReplaceable(world, pos);
		}
	}
}
