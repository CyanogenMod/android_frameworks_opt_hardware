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
 * USB charging support.
 */
public class UsbCharging {

    /*
     * All HAF classes should export this boolean.
     * Real implementations must, of course, return true
     */
    public static boolean isSupported() { return false; }

    /**
     * This method return the current activation status of USB charging.
     *
     * @return boolean Must be false when USB charging is not supported or not activated, or
     * the operation failed while reading the status; true in any other case.
     */
    public static boolean isEnabled() { return false; }

    /**
     * This method allows to setup USB charging status.
     *
     * @param status The new USB charging status
     * @return boolean Must be false if USB charging is not supported or the operation
     * failed; true in any other case.
     */
    public static boolean setEnabled(boolean status) { return false; }

}
