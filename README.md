# Relics of Ruin

Experimental Morphe patch source for **Terraria Android 1.4.5.8.5**.

Target:
- Package: `com.and.games505.TerrariaPaid`
- Version: `1.4.5.8.5`
- Engine: Unity / IL2CPP

## Stage 1 history

### 0.1.0
Targeted `UnityPlayerActivity.onCreate(Bundle)`, but that method is native in the inspected APK and has no DEX body.

### 0.1.1
Retargeted the executable wrapper:

`UnityPlayerActivity.onCreate$002(Activity, Bundle)`

The patch applied, but runtime testing showed Terraria crashed because the injected call was placed before the wrapper called `Activity.onCreate(Bundle)`.

### 0.1.2
The inspected wrapper contains only:

1. `invoke-super/range ... Activity.onCreate(Bundle)`
2. `return-void`

The bootstrap is now inserted **between those two instructions**. The extension was also simplified to a direct Toast using the application context.

Expected marker:

**Relics of Ruin loaded**

If Terraria launches and shows that marker, the Java-side Morphe bootstrap is stable and Stage 2 can move to IL2CPP gameplay hooks.

## Planned Stage 2

- IL2CPP bridge
- randomized Diablo-style weapon affixes
- rarity tiers
- legendary items
- elite enemy affixes
- loot notifications
- debug/config menu

This project does not modify licensing, Pairip, billing, ownership checks, or signature verification.
