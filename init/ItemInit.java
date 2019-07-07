package tom.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import tom.objects.armour.ArmourBase;
import tom.objects.items.ItemBase;
import tom.objects.tools.ToolAxe;
import tom.objects.tools.ToolHoe;
import tom.objects.tools.ToolPickaxe;
import tom.objects.tools.ToolShovel;
import tom.objects.tools.ToolSword;
import tom.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby", 2, 180, 5.0f, 1.5f, 5);
	public static final ArmorMaterial AMOUR_RUBY = EnumHelper.addArmorMaterial("armour_ruby", Reference.MODID + ":ruby", 15, new int[] {1, 4, 5, 2}, 12, SoundEvents.BLOCK_ANVIL_LAND, 0.0f);
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	//Tools
	public static final Item AXE_RUBY = new ToolAxe("axe_ruby", TOOL_RUBY);
	public static final Item HOE_RUBY = new ToolHoe("hoe_ruby", TOOL_RUBY);
	public static final Item SWORD_RUBY = new ToolSword("sword_ruby", TOOL_RUBY);
	public static final Item PICKAXE_RUBY = new ToolPickaxe("pickaxe_ruby", TOOL_RUBY);
	public static final Item SHOVEL_RUBY = new ToolShovel("shovel_ruby", TOOL_RUBY);
	
	//Amour
	public static final Item HELMET_RUBY = new ArmourBase("helmet_ruby", AMOUR_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_RUBY = new ArmourBase("chestplate_ruby", AMOUR_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_RUBY = new ArmourBase("leggings_ruby", AMOUR_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_RUBY = new ArmourBase("boots_ruby", AMOUR_RUBY, 1, EntityEquipmentSlot.FEET);
}
