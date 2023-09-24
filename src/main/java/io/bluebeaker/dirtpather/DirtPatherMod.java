package io.bluebeaker.dirtpather;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = DirtPatherMod.MODID, name = DirtPatherMod.NAME, version = DirtPatherMod.VERSION)
public class DirtPatherMod
{
    public static final String MODID = "dirtpather";
    public static final String NAME = "Dirt Pather";
    public static final String VERSION = "1.0";

    public DirtPatherMod() {
        MinecraftForge.EVENT_BUS.register(this);
        
    }
}