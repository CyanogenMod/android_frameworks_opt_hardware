/*
 * Copyright (C) 2016 The CyanogenMod Project
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
 * Generate a unique but deterministic ID for this hardware, based on unchangeable
 * hardware serial numbers.
 */
public class UniqueDeviceId {

    /**
     * Whether device supports reporting a unique device id.
     *
     * @return boolean Supported devices must return always true
     */
    public static boolean isSupported() { return false; }

    /**
     * This method retreives a unique ID for the device.
     *
     * @return String The unique device ID
     */
    public static String getUniqueDeviceId() { return null; }
}
