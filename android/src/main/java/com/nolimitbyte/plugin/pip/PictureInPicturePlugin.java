package com.nolimitbyte.plugin.pip;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.os.Build;
import android.util.Rational;

import androidx.annotation.RequiresApi;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "PictureInPicture")
public class PictureInPicturePlugin extends Plugin {

    @PluginMethod
    public void isPiPAvailable(PluginCall call) {
        boolean available = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O;
        call.resolve(new com.getcapacitor.JSObject().put("available", available));
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
        call.resolve(new com.getcapacitor.JSObject().put("success", true));
    }
}
