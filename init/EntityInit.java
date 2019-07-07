package tom.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import tom.Main;
import tom.objects.entity.EntityCentaur;
import tom.util.Reference;

public class EntityInit 
{
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colour1, int colour2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, colour1, colour2);
	}
	
	public static void registerEntities()
	{
		registerEntity("centaur", EntityCentaur.class, Reference.ENTITY_CENTAUR, 50, 4707980, 14566955);
	}
}
