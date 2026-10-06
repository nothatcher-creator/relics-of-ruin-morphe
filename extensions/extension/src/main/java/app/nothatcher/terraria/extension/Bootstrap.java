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

        // This wrapper runs on the Activity startup path, so avoid extra
        // runOnUiThread/lambda machinery and keep Stage 1 as small as possible.
        Toast.makeText(
            activity.getApplicationContext(),
            "Relics of Ruin loaded",
            Toast.LENGTH_LONG
        ).show();
    }
}
