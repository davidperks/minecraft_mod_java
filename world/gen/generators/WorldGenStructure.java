package tom.world.gen.generators;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import tom.util.Reference;
import tom.util.interfaces.IStructure;

public class WorldGenStructure extends WorldGenerator implements IStructure
{
	public static String structureName;
	
	public WorldGenStructure(String name) 
	{
		this.structureName = name;
	}
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) 
	{	
		this.generateStructure(worldIn, position);
		return true;
	}
	
	public static void generateStructure(World world, BlockPos position)
	{
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldserver.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(Reference.MODID, structureName);
		Template template = manager.get(mcServer, location);
		
		if(template != null)
		{
			IBlockState state = world.getBlockState(position);
			world.notifyBlockUpdate(position, state, state, 3);
			template.addBlocksToWorldChunk(world, position, settings);
		}
	}
}
