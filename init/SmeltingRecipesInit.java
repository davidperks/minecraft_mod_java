package tom.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipesInit 
{
	public static void registerRecipes()
	{
		GameRegistry.addSmelting(BlockInit.ORE_OVERWORLD, new ItemStack(ItemInit.RUBY, 4), 10);
		GameRegistry.addSmelting(ItemInit.RUBY, new ItemStack(ItemInit.AXE_RUBY, 2), 10);
	}
}
