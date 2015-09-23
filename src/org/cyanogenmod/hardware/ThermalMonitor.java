package org.cyanogenmod.hardware;

import android.content.Context;
import android.hardware.ThermalListenerCallback;

import android.hardware.IThermalListenerCallback;

public class ThermalMonitor {
    public ThermalMonitor(Context context) {
    }

    public boolean isSupported() {
        return false;
    }

    public boolean registerListener(IThermalListenerCallback callback) {
        return false;
    }

    public boolean unRegisterListener(IThermalListenerCallback callback) {
        return false;
    }

    public int getThermalState() {
        return ThermalListenerCallback.State.STATE_UNKNOWN;
    }
}
