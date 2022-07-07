package net.xalcon.oif.registration;

import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.xalcon.oif.Constants;

public class ModRegistry
{
    /**
     * The provider for items
     */
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registry.ITEM_REGISTRY, Constants.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE = ITEMS.register("example", () -> new Item(new Item.Properties().fireResistant().stacksTo(12)));

    // Called in the mod initializer / constructor in order to make sure that items are registered
    public static void initialize() { }
}
