package tom.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import tom.world.biome.BiomeRuby;
import tom.world.biome.BiomeTitanium;


public class BiomeInit 
{
	public static final Biome RUBY = new BiomeRuby();
	public static final Biome TITANIUM = new BiomeTitanium();

	public static void registerBiomes()
	{
		initBiome(RUBY, "ruby", BiomeType.WARM, Type.DRY, Type.HILLS);
		initBiome(TITANIUM, "titanium", BiomeType.ICY, Type.DRY, Type.HILLS);
	}
	
	public static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		
		return biome;
	}
	
}
