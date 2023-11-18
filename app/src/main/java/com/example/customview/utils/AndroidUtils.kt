package com.example.customview.utils

import android.content.Context
import kotlin.math.ceil

object AndroidUtil {
    fun dp(context: Context, dp: Int) = ceil(context.resources.displayMetrics.density * dp).toInt()
}