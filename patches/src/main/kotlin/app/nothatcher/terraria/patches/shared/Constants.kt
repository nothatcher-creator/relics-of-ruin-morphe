package app.nothatcher.terraria.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_TERRARIA = Compatibility(
        name = "Terraria",
        packageName = "com.and.games505.TerrariaPaid",
        apkFileType = ApkFileType.APK,
        appIconColor = 0xC96B32,
        targets = listOf(
            AppTarget(version = "1.4.5.8.5")
        )
    )
}
