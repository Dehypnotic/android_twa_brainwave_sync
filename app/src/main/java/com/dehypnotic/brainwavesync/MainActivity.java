package com.dehypnotic.brainwavesync;

import android.os.Bundle;
import com.google.androidbrowserhelper.trusted.LauncherActivity;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;

public class MainActivity extends LauncherActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
