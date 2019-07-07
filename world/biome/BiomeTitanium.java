package tom.world.biome;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import tom.init.BiomeInit;
import tom.init.BlockInit;
import tom.world.gen.generators.WorldGenRubyTree;
import tom.world.gen.generators.WorldGenTitaniumTree;

public class BiomeTitanium extends Biome 
{
	public static final WorldGenAbstractTree TREE = new WorldGenTitaniumTree();

	public BiomeTitanium() 
	{
		super(new BiomeProperties("titanium").setBaseHeight(1.0f).setTemperature(0.0f));
		
		topBlock = BlockInit.DIRT_TITANIUM.getDefaultState();
		fillerBlock = BlockInit.ORE_OVERWORLD.getDefaultState();
		
		this.decorator.treesPerChunk = 2;
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}

}
