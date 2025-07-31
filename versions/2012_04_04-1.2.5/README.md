# Context

This tutorial was written for Arch Linux, but the steps should roughly work for any other popular Linux distribution, like Ubuntu.

## Steps

1. Download the [Technic Launcher](https://www.technicpack.net/download)
2. Test that the Tekkit Classic modpack launches properly.
3. Copy the `mod_helloworld-client-1.0.0` directory into `~/.technic/modpacks/tekkit/mods/mod_helloworld-client-1.0.0`
4. This command compiles the mod's `.java` files into `.class` files. It places the `.class` files directly next to the `.java` files:
```sh
javac -classpath ~/.technic/modpacks/tekkit/bin/modpack.jar ~/.technic/modpacks/tekkit/mods/mod_helloworld-client-1.0.0/trez/mods/helloworld/*.java -d ~/.technic/modpacks/tekkit/mods/mod_helloworld-client-1.0.0
```

## Troubleshooting

Here's the longer, ostensibly more correct version of the command that compiles `.java` files into `.class` files:
```sh
javac -source 1.6 -target 1.6 -classpath ~/.technic/modpacks/tekkit/bin/minecraft.jar:~/.technic/modpacks/tekkit/bin/modpack.jar ~/.technic/modpacks/tekkit/mods/mod_helloworld-client-1.0.0/trez/mods/helloworld/*.java -d ~/.technic/modpacks/tekkit/mods/mod_helloworld-client-1.0.0
```
