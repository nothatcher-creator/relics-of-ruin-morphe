package app.nothatcher.terraria.patches.bootstrap

import app.morphe.patcher.patch.bytecodePatch
import app.nothatcher.terraria.patches.shared.Constants.COMPATIBILITY_TERRARIA

/**
 * Diagnostic build 0.1.3.
 *
 * This patch intentionally changes no bytecode, resources, native libraries,
 * licensing code, or application behavior. It exists only to test whether
 * Morphe's rebuild/re-sign process can produce a Terraria APK that launches.
 */
@Suppress("unused")
val relicsOfRuinNoOpPatch = bytecodePatch(
    name = "Relics of Ruin - No-op compatibility test",
    description = "Makes no game changes; tests whether a Morphe-rebuilt Terraria APK can launch.",
    default = true
) {
    compatibleWith(COMPATIBILITY_TERRARIA)
}
