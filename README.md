# Relics of Ruin

Experimental Morphe patch source for **Terraria Android 1.4.5.8.5**.

Target:
- Package: `com.and.games505.TerrariaPaid`
- Version: `1.4.5.8.5`
- Engine: Unity / IL2CPP

## Stage 1

The original 0.1.0 build targeted:

`UnityPlayerActivity.onCreate(Bundle)`

In the inspected APK that method is **native** and has no DEX bytecode body, so Morphe could not inject an instruction into it.

Version **0.1.1** instead targets the APK's executable Java wrapper:

`UnityPlayerActivity.onCreate$002(Activity, Bundle)`

and injects a tiny runtime extension that displays:

**Relics of Ruin loaded**

If that appears and Terraria still launches, the Morphe bytecode hook and extension injection are working.

## Planned Stage 2

- IL2CPP bridge
- randomized Diablo-style weapon affixes
- rarity tiers
- legendary items
- elite enemy affixes
- loot notifications
- debug/config menu

This project does not modify licensing, Pairip, billing, ownership checks, or signature verification.
