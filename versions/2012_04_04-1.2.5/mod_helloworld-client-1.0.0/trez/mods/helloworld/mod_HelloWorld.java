package trez.mods.helloworld;

import forge.NetworkMod;

public class mod_HelloWorld extends NetworkMod {
    public static mod_HelloWorld instance;

    public mod_HelloWorld() {
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public void load() {
        instance = this;

        System.out.println("[HelloWorld] Hello from Tekkit Classic mod! :)");
    }

    @Override
    public void modsLoaded() {
        System.out.println("[HelloWorld] modsLoaded() called");
    }

    @Override
    public boolean clientSideRequired() {
        return true;
    }

    @Override
    public boolean serverSideRequired() {
        return false;
    }
}
