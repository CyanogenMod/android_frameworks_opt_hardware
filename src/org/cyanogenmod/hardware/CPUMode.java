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
 * Hardware support for special CPU modes.
 */
public class CPUMode {

    /**
     * Whether device supports special CPU modes.
     *
     * @return boolean Supported devices must return always true.
     */
    public static boolean isSupported() { return false; }

    /**
     * Implementations MUST return and array with some of the existing
     * cpu_entry_modes in Settings/res/values/cm_strings.xml. Labels in this
     * file should be named with starting with "hw_cpu_mode_".
     *
     * @return String[] An string array with all the available CPU modes keys
     * supported by the real implementation.
     */
    public static String[] getAvailableCPUModes() {
        return null;
    }

    /**
     * Implementations MUST return one of the available modes returned by
     * {@see #getAvailableCPUModes()).
     *
     * @return String The default CPU mode.
     */
    public static String getDefaultCPUMode() {
        return null;
    }

    /**
     * Returns the current CPU mode (MUST be one of the available modes returned by
     * {@see #getAvailableCPUModes())
     *
     * @return String The current CPU mode.
     */
    public static String getCPUMode() {
        return null;
    }

    /**
     * Sets the current CPU mode ({@code mode} MUST be one of the available modes
     * returned by {@see #getAvailableCPUModes())
     *
     * @param String The current CPU mode.
     */
    public static void setCPUMode(String mode) {
        // Empty implementation
    }
}
