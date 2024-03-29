
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.economics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.economics.block.TestBlockBlock;
import net.mcreator.economics.EconomicsMod;

public class EconomicsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EconomicsMod.MODID);
	public static final RegistryObject<Block> TEST_BLOCK = REGISTRY.register("test_block", () -> new TestBlockBlock());
}
