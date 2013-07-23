package org.cyanogenmod.hardware;

public class VibratorHW {

    public static boolean isSupported() { return false; }

    public static int getMaxIntensity()  {
        return -1;
    }
    public static int getMinIntensity()  {
        return -1;
    }
    public static int getWarningThreshold()  {
        return -1;
    }
    public static int getCurIntensity()  {
        return -1;
    }
    public static boolean setIntensity(int intensity)  {
        throw new UnsupportedOperationException();
    }
    public static int getDefaultIntensity()  {
        return -1;
    }
}
