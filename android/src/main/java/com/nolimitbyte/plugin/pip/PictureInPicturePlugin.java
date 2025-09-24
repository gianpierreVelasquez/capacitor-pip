package com.nolimitbyte.plugin.pip;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Rational;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "PictureInPicture")
public class PictureInPicturePlugin extends Plugin {

    @PluginMethod
    public void isPiPAvailable(PluginCall call) {
        boolean available = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O;
        JSObject ret = new JSObject();
        ret.put("available", available);
        call.resolve(ret);
    }

    @PluginMethod
    public void isPipEnable(PluginCall call) {
        boolean enable = true;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                try {
                    AppOpsManager appOps = (AppOpsManager) getContext().getSystemService(Context.APP_OPS_SERVICE);
                    int mode = appOps.unsafeCheckOpNoThrow("android:picture_in_picture", android.os.Process.myUid(), getContext().getPackageName());
                    enable = (mode == AppOpsManager.MODE_ALLOWED);
                } catch (Exception e) {
                    enable = false;
                }
            } else {
                enable = getContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_PICTURE_IN_PICTURE);
            }
        } else {
            enable = false;
        }

        JSObject ret = new JSObject();
        ret.put("enable", enable);
        call.resolve(ret);
    }

    @PluginMethod
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void startPiPMode(PluginCall call) {
        Activity activity = getActivity();
        if (activity == null) {
            call.reject("No active activity");
            return;
        }

        int width = call.getInt("width", 16);
        int height = call.getInt("height", 9);

        Rational aspectRatio = new Rational(width, height);
        PictureInPictureParams params = new PictureInPictureParams.Builder()
                .setAspectRatio(aspectRatio)
                .build();

        activity.enterPictureInPictureMode(params);

        JSObject ret = new JSObject();
        ret.put("success", true);
        call.resolve(ret);
    }

    @PluginMethod
    public void openSettings(PluginCall call) {
        Context context = getContext();
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

        call.resolve();
    }
}
