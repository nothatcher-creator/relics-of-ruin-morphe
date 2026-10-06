package app.nothatcher.terraria.patches.bootstrap

import app.morphe.patcher.extensions.InstructionExtensions.addInstruction
import app.morphe.patcher.patch.bytecodePatch
import app.nothatcher.terraria.patches.shared.Constants.COMPATIBILITY_TERRARIA

private const val EXTENSION_CLASS = "Lapp/nothatcher/terraria/extension/Bootstrap;"

@Suppress("unused")
val relicsOfRuinBootstrapPatch = bytecodePatch(
    name = "Relics of Ruin - Bootstrap",
    description = "Injects a startup marker after Activity.onCreate in Terraria 1.4.5.8.5.",
    default = true
) {
    compatibleWith(COMPATIBILITY_TERRARIA)

    extendWith("extensions/extension.mpe")

    execute {
        val method = UnityPlayerActivityOnCreateWrapperFingerprint.method

        // The inspected wrapper contains:
        // 0: invoke-super/range {p0, p1}, Activity->onCreate(Bundle)
        // 1: return-void
        //
        // Insert AFTER Activity.onCreate and BEFORE return-void.
        method.addInstruction(
            1,
            "invoke-static {p0}, $EXTENSION_CLASS->onTerrariaStart(Landroid/app/Activity;)V"
        )
    }
}
