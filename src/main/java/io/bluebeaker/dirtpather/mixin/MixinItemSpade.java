package io.bluebeaker.dirtpather.mixin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;

@Mixin(ItemSpade.class)
public abstract class MixinItemSpade {
    @ModifyVariable(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;",at=@At("STORE"),ordinal = 0,remap = true)
    public Block allowDirtToPath(Block block){
        if(block==Blocks.DIRT){
            return Blocks.GRASS;
        }
        else{
            return block;
        }
    }
}
