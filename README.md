# "Hello, world!" mods for ***all*** Minecraft versions

The sole goal of this repository is to provides mods that print "Hello, world!", for ***all*** Minecraft versions, using as limited a number of frameworks as possible.

For example, because Minecraft Forge supports a wider range of Minecraft versions than Fabric, this repository won't provide any Fabric (nor NeoForge) mods.

For Alpha and Beta-era modding, ModLoader seems like the best option, while Forge covers every Minecraft version after that.

## Usage

You use this repository by `cd`ing into one of its game version directories in VS Code, and then running `./gradlew runClient` to launch the mod.

Older Minecraft Forge versions didn't use Gradle, so for those you'll need to follow the steps in the `README.md` of the game version directory instead.

All of the game version directories are self-contained, meaning they are completely independent from each other and the rest of the repository.

## Progress

| Emoji | Meaning          |
|-------|------------------|
| ❌    | Not started      |
| 🚧    | Doesn't work yet |
| 🐘    | Not minimized    |
| ✅    | Done             |

| MC version directory     | Status | Windows | Linux | Mac |
|--------------------------|--------|---------|-------|-----|
| 2012_04_04-1.2.5         | 🚧     | ❌      | 🚧    | ❌  |
| 2024_04_29-1.20.6        | 🐘     | ❌      | ✅    | ❌  |

## Troubleshooting

### BUG! exception in phase 'semantic analysis' in source unit '_BuildScript_' Unsupported class file major version 68

I personally use Java version 24 (OpenJDK 24.0.1), but if you're using a different version, you'll likely get this error.

1. Inside of your current game version directory, like `2024_04_29-1.20.6`, open `gradle/wrapper/gradle-wrapper.properties`.
2. Change its `distributionUrl` value, using the table from [this Stack Overflow answer](https://stackoverflow.com/a/75117113/13279557), based on what running `java --version` in a terminal prints for you.

For example, Java 23 requires `distributionUrl=https\://services.gradle.org/distributions/gradle-8.10-all.zip`, whereas Java 24 requires `distributionUrl=https\://services.gradle.org/distributions/gradle-8.14-all.zip`.

### Running `./gradlew runClient` hangs indefinitely on `> :compileJava > Resolve dependencies of :compileClasspath`

It is fixed by running this:

```sh
./gradlew --stop && \
rm -rf ~/.gradle/caches/ && \
./gradlew --refresh-dependencies
```

## To do

- Set up a CI that automatically checks that every mod prints "Hello, world!" on Windows, Linux, and Mac.
