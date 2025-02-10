/*
 * Copyright 2020 Russell Wolf
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.russhwolf.settings

import java.util.prefs.Preferences

class JvmNoArgTest : NoArgTest() {
    private val preferences by lazy { Preferences.userRoot() }

    override fun getString(key: String, defaultValue: String): String = preferences.get(key, defaultValue)
    override fun setString(key: String, value: String) = preferences.put(key, value)
}
