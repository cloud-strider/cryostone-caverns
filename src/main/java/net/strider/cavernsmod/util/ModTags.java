package net.strider.cavernsmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.strider.cavernsmod.CavernsMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_CRYOSTONE_TOOL = tag("needs_cryostone_tool");



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CavernsMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CavernsMod.MOD_ID, name));
        }
    }
}