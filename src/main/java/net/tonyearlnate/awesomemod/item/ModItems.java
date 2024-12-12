package net.tonyearlnate.awesomemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.tonyearlnate.awesomemod.AwesomeMod;

public class ModItems {
    public static final Item COOL_ITEM = registerItem("cool_item", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AwesomeMod.MOD_ID,"cool_item")))));
    public static final Item BLUE_COOL_ITEM = registerItem("blue_cool_item", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AwesomeMod.MOD_ID,"blue_cool_item")))));
    public static final Item ENERGIZED_COOL_ITEM = registerItem("energized_cool_item", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AwesomeMod.MOD_ID,"energized_cool_item")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AwesomeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AwesomeMod.LOGGER.info("Registering Mod Items for " + AwesomeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COOL_ITEM);
            entries.add(BLUE_COOL_ITEM);
            entries.add(ENERGIZED_COOL_ITEM);
        });
    }
}