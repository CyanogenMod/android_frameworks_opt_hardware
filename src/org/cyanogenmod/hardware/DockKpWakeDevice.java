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

import android.content.Context;

/**
 * Support for wake up the device by pressing any key of the dock keypad.
 */
public class DockKpWakeDevice {

    /**
     * Whether device supports wake up the device by pressing any key of the dock keypad.
     *
     * @return boolean Supported devices must return always true.
     */
    public static boolean isSupported(Context ctx) { return false; }

    /**
     * Returns whether a dock keypad keypress event will wake up the device.
     *
     * @return boolean Must be false when is not supported or wake up is not enabled, or
     * when the operation failed while reading the status; true in any other case.
     */
    public static boolean isEnabled(Context ctx) { return false; }

    /**
     * Sets whether a dock keypad keypress event will wake up the device.
     *
     * @param enabled The new value.
     * @return boolean Must be false if is not supported or the operation failed; true
     * in any other case.
     */
    public static boolean setEnabled(Context ctx, boolean enabled) { return false; }

}
