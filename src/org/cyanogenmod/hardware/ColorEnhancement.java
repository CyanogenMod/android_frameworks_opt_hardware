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

/**
 * Color enhancement support
 */
public class ColorEnhancement {

    /**
     * Whether device supports an color enhancement technology.
     *
     * @return boolean Supported devices must return always true
     */
    public static boolean isSupported() { return false; }

    /**
     * This method return the current activation status of the color enhancement technology.
     *
     * @return boolean Must be false when color enhancement is not supported or not activated, or
     * the operation failed while reading the status; true in any other case.
     */
    public static boolean isEnabled() { return false; }

    /**
     * This method allows to setup color enhancement technology status.
     *
     * @param status The new color enhancement status
     * @return boolean Must be false if adaptive backlight is not supported or the operation
     * failed; true in any other case.
     */
    public static boolean setEnabled(boolean status) { return false; }


    /**
     * Returns the default state of CE
     *
     * @return boolean True if CE should be enabled by default
     */
    public static boolean getDefaultValue() { return true; }

}
