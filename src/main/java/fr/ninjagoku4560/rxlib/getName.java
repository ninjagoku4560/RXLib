package fr.ninjagoku4560.rxlib;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class getName {
    public static String Entity(Entity entity) {
        if (entity instanceof PlayerEntity) {
            String EntityName = entity.getName().toString();
            String[] name = EntityName.split("\\.");
            return name[name.length-1];
        } else {
            String EntityName = entity.getType().toString();
            String[] name = EntityName.split("\\.");
            return name[name.length-1];
        }
    }
    public static String Item(Item item) {
        String ItemName = item.getTranslationKey();
        String[] name = ItemName.split("\\.");
        return name[name.length-1];
    }
    public static String Block(World world, BlockPos blockPos) {
        Block block = world.getBlockState(blockPos).getBlock();
        return block.getTranslationKey();
    }
}
