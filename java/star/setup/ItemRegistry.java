package star.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import star.Main;
import star.items.BlockSimple;
import star.items.SimpleItem;
import star.tools.SimplePickaxe;
import star.tools.SimpleSword;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	public static final RegistryObject<Item> simpleItem = ITEMS.register(SimpleItem.REG, SimpleItem::new);
	public static final RegistryObject<Item> simpleBlock = ITEMS.register(BlockSimple.REG, BlockSimple::new);
	public static final RegistryObject<Item> simplePickaxe = ITEMS.register(SimplePickaxe.REG, SimplePickaxe::new);
	public static final RegistryObject<Item> simpleSword = ITEMS.register(SimpleSword.REG, SimpleSword::new);
}
