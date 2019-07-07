package tom.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import tom.util.Reference;

public class SoundHandler 
{
	public static SoundEvent ENTITY_CENTAUR_AMBIENT, ENTITY_CENTAUR_HURT, ENTITY_CENTAUR_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_CENTAUR_AMBIENT = registerSound("entity.centaur.ambient.ogg");
		ENTITY_CENTAUR_HURT = registerSound("entity.centaur.hurt.ogg");
		ENTITY_CENTAUR_DEATH = registerSound("entity.centaur.death.ogg");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		
		return event; 
	}
}
