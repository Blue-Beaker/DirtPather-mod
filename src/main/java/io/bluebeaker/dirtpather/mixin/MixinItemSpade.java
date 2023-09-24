package io.bluebeaker.dirtpather.mixin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;

@Mixin(ItemSpade.class)
public abstract class MixinItemSpade {
    @ModifyVariable(method = "onItemUse",at=@At("STORE"),ordinal = 0,remap = false)
    public Block allowDirtToPath(Block block){
        if(block==Blocks.DIRT){
            return Blocks.GRASS;
        }
        else{
            return block;
        }
    }
}
