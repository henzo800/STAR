package me.minecraft.star.setup;

import me.minecraft.star.STAR;
import me.minecraft.star.blocks.BlockSimple;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class BlockRegister {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, STAR.MODID);
	public static final RegistryObject<Block> BLOCKSIMPLE = BLOCKS.register(BlockSimple.REG, BlockSimple::new);
}
