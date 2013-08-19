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
 * Exports methods to configure the touchbutton backlight timeout delay
 */

public class TouchButtonLights {

    /*
     * All HAF classes should export this boolean.
     * Real implementations must, of course, return true
     */

    public static boolean isSupported() {
        return false;
    }


    /*
     * Set the state of the touch button lights
     */
    public static boolean setEnabled(boolean enabled) {
        throw new UnsupportedOperationException();
    }

    /*
     * Set the backlight timeout delay
     */

    public static boolean setBacklightTimeout(int timeout) {
        throw new UnsupportedOperationException();
    }

    /*
     * What's the maximum integer value in seconds we can delay for
     */

    public static int getMaxValue() {
        return -1;
    }

    /*
     * What is the defualt integer value in seconds that we delay for
     */
    public static int getDefaultTimeout() {
        return -1;
    }

    /*
     * What's the current delay time
     */

    public static int getCurBacklightTimeout() {
        return 0;
    }
}
