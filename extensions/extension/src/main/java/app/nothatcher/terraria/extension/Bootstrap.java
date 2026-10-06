package app.nothatcher.terraria.extension;

import android.app.Activity;
import android.widget.Toast;

@SuppressWarnings("unused")
public final class Bootstrap {
    private static boolean shown;

    private Bootstrap() {}

    public static void onTerrariaStart(Activity activity) {
        if (activity == null || shown) return;
        shown = true;

        activity.runOnUiThread(() ->
            Toast.makeText(
                activity,
                "Relics of Ruin loaded",
                Toast.LENGTH_LONG
            ).show()
        );
    }
}
