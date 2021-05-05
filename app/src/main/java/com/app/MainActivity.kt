package com.app

import android.app.Activity
import android.os.Bundle
import com.lib1.Lib1TypeAlias

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val action: Lib1TypeAlias = {
            println("Test")
        }
        action()
    }
}
