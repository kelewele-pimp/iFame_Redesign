package preference_helper;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by desmond on 01/04/15.
 */
public class SharedPreferenceHelper {

    private static final String PREF_FILE_NAME = "ifame_preferences_file";

    public static void saveToSharedPreference(Context context, String preferenceKey, String prefrenceValue) {
        SharedPreferences pref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(preferenceKey, prefrenceValue).commit();
    }

    public static String readFromPreferences(Context context, String preferenceKey, String defaultValue) {
        SharedPreferences pref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return pref.getString(preferenceKey, defaultValue);
    }
}
