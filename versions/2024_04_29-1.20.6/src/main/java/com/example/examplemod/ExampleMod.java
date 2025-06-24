package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("examplemod")
public class ExampleMod
{
    public ExampleMod(FMLJavaModLoadingContext context)
    {
        System.out.println("\n\nHello, world!\n\n");
    }
}
