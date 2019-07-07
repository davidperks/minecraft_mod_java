package tom.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBlueBox extends BlockBase
{
	public static final AxisAlignedBB BLUEBOX = new AxisAlignedBB(0.25D, 0, 0.25D, 0.75D, 0.0625D, 0.75D);

	public BlockBlueBox(String name) 
	{
		super(name, Material.CAKE);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return BLUEBOX;
	}
}
