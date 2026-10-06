package app.nothatcher.terraria.patches.bootstrap

import app.morphe.patcher.Fingerprint

/**
 * The APKVISION-repacked Terraria build marks UnityPlayerActivity.onCreate(Bundle)
 * as native, so it has no DEX implementation to patch.
 *
 * The executable Java wrapper is onCreate$002(Activity, Bundle), which contains
 * real bytecode and is called from the native bridge.
 */
object UnityPlayerActivityOnCreateWrapperFingerprint : Fingerprint(
    definingClass = "Lcom/unity3d/player/UnityPlayerActivity;",
    name = "onCreate$002",
    returnType = "V",
    parameters = listOf(
        "Landroid/app/Activity;",
        "Landroid/os/Bundle;"
    )
)
