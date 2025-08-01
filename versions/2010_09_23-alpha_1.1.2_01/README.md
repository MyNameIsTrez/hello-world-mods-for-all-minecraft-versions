# Context

I'm currently investigating RetroMCP.

## RetroMCP

# TODO: Finish writing these instructions

```sh
git clone https://github.com/MCPHackers/RetroMCP-Java
cp ~/.local/share/multimc/libraries/com/mojang/minecraft/a1.1.2_01/minecraft-a1.1.2_01-client.jar retro/clients/a1.1.2_01/minecraft.jar
./gradlew build
./gradlew tasks
./gradlew run
```

- In the top-right corner, click the `Current version` dropdown menu, and select `Alpha 1.1.2_01`.
- It'll ask "Are you sure you want to run setup for selected version?". Click `Yes`.
- In the top-left corner, click the `Decompile` button.
- In the top-left corner, click on the `MCP` dropdown menu, and then press the `Launch client` option.

The decompiled output can be found in the RetroMCP directory you cloned, in `gui/test/`.

Now close the game.

Go to `gui/test/minecraft/src/net/minecraft/src/BlockLog.java`, and change this:

```java
	public int quantityDropped(Random var1) {
		return 1;
	}
```

to this:

```java
	public int quantityDropped(Random var1) {
		return 1000;
	}
```

Hit the `Recompile` button in RetroMCP and then `Launch client`, and you should see that each log block now drops 1000 log items.

In RetroMCP, hit `Create Patch` to generate `gui/test/patches/client.patch`, which is a diff file that you can share with others:

```diff
--- net/minecraft/src/BlockLog.java
+++ net/minecraft/src/BlockLog.java
@@ -9,7 +9,7 @@
 	}

 	public int quantityDropped(Random var1) {
-		return 1;
+		return 1000;
 	}

 	public int idDropped(int var1, Random var2) {
```

# TODO: Remove this Mongster section and directory eventually
## Mongster's a1.1.2_01

These instructions are based on the YouTube video [Want to try Alpha? Watch this first.](https://www.youtube.com/watch?v=Wizn86AWJEc) by Mongster.

In the description of his video is the link to his Discord server, where you can ask for help. His server's `#alpha-1-1-2-01-instance-download` channel links [this MultiMC zip](https://drive.google.com/file/d/1oAtdkg6cOnBuIqcrZukYGmqaQpmwTTuO/view), which I've unzipped into this directory and trimmed down to the bare minimum.

The zip has some simple mods bundled with it, like adding charcoal to the game (which was added in Beta 1.2).

# Steps

1. [Download MultiMC](https://multimc.org/#Download).
2. Drag `Mongster's a1.1.2_01.zip` on top of MultiMC, and a `New Instance` window will pop up. Press `OK`.
3. Press the `Launch` button on the right side.
  - If you get the error `The java binary "" couldn't be found. Please fix the java path override in the instance's settings or disable it.` at the bottom of the log, go to `Settings`, and click `Auto-detect` under the `Java` tab. Press `OK`, and then `Launch` again.
4. Check that the game launches properly.

TODO: Add hello world mod
TODO: Explain needing to zip
TODO: Minimize the unzipped dir. I need to do this for legal reasons too.
