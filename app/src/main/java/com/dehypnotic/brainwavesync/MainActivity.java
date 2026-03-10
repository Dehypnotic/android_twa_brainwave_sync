package com.dehypnotic.brainwavesync;

import android.os.Bundle;
import android.content.pm.ActivityInfo;
import com.google.androidbrowserhelper.trusted.LauncherActivity;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;

public class MainActivity extends LauncherActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected TrustedWebActivityDisplayMode getDisplayMode() {
        return new TrustedWebActivityDisplayMode.ImmersiveMode(
            true, // isSticky
            0 // layoutInDisplayCutoutMode (0 = DEFAULT)
        );
    }
}
