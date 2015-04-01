package messageHelper;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by desmond on 01/04/15.
 */
public class MessegeHelper {

    public static void RequestLog(String message) {
        Log.d("ifame", message);
    }

    public static void RequestShortToast(Context c, String toast_message) {
        Toast.makeText(c, toast_message, Toast.LENGTH_SHORT).show();
    }

    public static void RequestLongToast(Context c, String toast_message) {
        Toast.makeText(c, toast_message, Toast.LENGTH_LONG).show();
    }

}
