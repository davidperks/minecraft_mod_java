package tom.world.types;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import tom.init.BiomeInit;

public class WorldTypeRuby extends WorldType
{

	public WorldTypeRuby() 
	{
		super("ruby");
	}

	@Override
	public BiomeProvider getBiomeProvider(World world) 
	{
		return new BiomeProviderSingle(BiomeInit.RUBY);
	}
}
