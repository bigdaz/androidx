/*
 * Copyright 2021 The Android Open Source Project
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

package androidx.wear.compose.integration.demos

import android.text.format.DateFormat
import androidx.compose.runtime.Composable
import androidx.wear.compose.foundation.BasicCurvedText
import androidx.wear.compose.foundation.CurvedTextStyle
import androidx.wear.compose.material.ExperimentalWearMaterialApi
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.material.TimeTextDefaults
import java.util.Locale

@OptIn(ExperimentalWearMaterialApi::class)
@Composable
fun TimeTextClockOnly() {
    TimeText()
}

@OptIn(ExperimentalWearMaterialApi::class)
@Composable
fun TimeTextWithLeadingText() {
    val textStyle = TimeTextDefaults.timeTextStyle(color = AlternatePrimaryColor1)
    TimeText(
        leadingLinearContent = {
            Text(
                text = "ETA 12:48",
                style = textStyle
            )
        },
        leadingCurvedContent = {
            BasicCurvedText(
                text = "ETA 12:48",
                style = CurvedTextStyle(textStyle)
            )
        }
    )
}

@OptIn(ExperimentalWearMaterialApi::class)
@Composable
fun TimeTextWithLocalisedFormat() {
    TimeText(
        timeSource = TimeTextDefaults.timeSource(
            DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyy.MM.dd HH:mm:ss")
        )
    )
}
