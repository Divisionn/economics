
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.economics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.economics.EconomicsMod;

public class EconomicsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EconomicsMod.MODID);
	public static final RegistryObject<Item> WETAWDED = block(EconomicsModBlocks.WETAWDED);
	public static final RegistryObject<Item> TEST_BLOCK = block(EconomicsModBlocks.TEST_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
