/*
 * Copyright (C) 2013 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cyanogenmod.hardware;

/* 
 * Vibrator intensity adjustment
 *
 * Exports methods to get the valid value boundaries, the
 * default and current intensities, and a method to set
 * the vibrator.
 *
 * Values exported by min/max can be the direct values required
 * by the hardware, or a local (to VibratorHW) abstraction that's
 * internally converted to something else prior to actual use. The
 * Settings user interface will normalize these into a 0-100 (percentage)
 * scale before showing them to the user, but all values passed to/from
 * the client (Settings) are in this class' scale.
 */

/* This would be just "Vibrator", but it conflicts with android.os.Vibrator */
public class VibratorHW {

    private static final String LEVEL_PATH = "/sys/class/timed_output/vibrator/pwm_value";
    private static final String LEVEL_MAX_PATH = "/sys/class/timed_output/vibrator/pwm_max";
    private static final String LEVEL_MIN_PATH = "/sys/class/timed_output/vibrator/pwm_min";
    private static final String LEVEL_DEFAULT_PATH = "/sys/class/timed_output/vibrator/pwm_default";
    private static final String LEVEL_THRESHOLD_PATH = "/sys/class/timed_output/vibrator/pwm_threshold";

    /*
     * All HAF classes should export this boolean. 
     * Real implementations must, of course, return true 
     */

    public static boolean isSupported() {
        return (new File(LEVEL_MAX_PATH).exists()&& new File(LEVEL_PATH).exists() && new File(LEVEL_MIN_PATH).exists() && new File(LEVEL_DEFAULT_PATH).exists() && new File(LEVEL_THRESHOLD_PATH).exists());
    }


    /*
     * Set the vibrator intensity to given integer input. That'll
     * be a value between the boundaries set by get(Max|Min)Intensity
     * (see below), and it's meant to be locally interpreted/used.
     */

    public static boolean setIntensity(int intensity)  {
        File f = new File(LEVEL_PATH);

        if(f.exists()) {
            return FileUtils.writeLine(LEVEL_PATH, String.valueOf(intensity));
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /*
     * What's the maximum integer value we take for setIntensity()?
     */

    public static int getMaxIntensity()  {
        File f = new File(LEVEL_MAX_PATH);

        if(f.exists()) {
            return Integer.parseInt(FileUtils.readOneLine(LEVEL_MAX_PATH));
        } else {
            return -1;
        }
    }

    /* 
     * What's the minimum integer value we take for setIntensity()?
     */

    public static int getMinIntensity()  {
        File f = new File(LEVEL_MIN_PATH);

        if(f.exists()) {
            return Integer.parseInt(FileUtils.readOneLine(LEVEL_MIN_PATH));
        } else {
            return -1;
        }
    }

    /*
     * Is there a value between the 2 above which is considered
     * the safe max? If not, return anything < 0
     */

    public static int getWarningThreshold()  {
        File f = new File(LEVEL_THRESHOLD_PATH);

        if(f.exists()) {
            return Integer.parseInt(FileUtils.readOneLine(LEVEL_THRESHOLD_PATH));
        } else {
            return -1;
        }
    }

    /* 
     * What's the current intensity value?
     */

    public static int getCurIntensity()  {
        File f = new File(LEVEL_PATH);

        if(f.exists()) {
            return Integer.parseInt(FileUtils.readOneLine(LEVEL_PATH));
        } else {
            return -1;
        }
    }

    /* 
     * What's the shipping intensity value?
     */
    
    public static int getDefaultIntensity()  {
        File f = new File(LEVEL_DEFAULT_PATH);

        if(f.exists()) {
            return Integer.parseInt(FileUtils.readOneLine(LEVEL_DEFAULT_PATH));
        } else {
            return -1;
        }
    }
}