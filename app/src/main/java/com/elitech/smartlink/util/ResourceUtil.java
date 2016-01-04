package com.elitech.smartlink.util;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by King on 2015/10/13.
 *
 */
public class ResourceUtil {

    public static int getBoolId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "bool",
                paramContext.getPackageName());
    }

    public static boolean getBool(Context paramContext, int resourceId) {
        return paramContext.getResources().getBoolean(resourceId);
    }

    public static String getString(Context paramContext, int resourceId) {
        return paramContext.getResources().getString(resourceId);
    }

    public static int getLayoutId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "layout",
                paramContext.getPackageName());
    }

    public static int getStringId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "string",
                paramContext.getPackageName());
    }

    public static int getDrawableId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "drawable", paramContext.getPackageName());
    }

    public static Drawable getDrawable(Context paramContext, int resourceId) {
        return paramContext.getResources().getDrawable(resourceId);
    }

    public static int getStyleId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "style", paramContext.getPackageName());
    }

    public static int getId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "id", paramContext.getPackageName());
    }

    public static int getColor(Context paramContext, int resourceId) {
        return paramContext.getResources().getColor(resourceId);
    }

    public static int getColorId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "color", paramContext.getPackageName());
    }

    public static int getColorId(Context paramContext, int resourceId) {
        return paramContext.getResources().getColor(resourceId);
    }

    public static int getArrayId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "array", paramContext.getPackageName());
    }

}
