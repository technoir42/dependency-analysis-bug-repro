package com.app

import com.google.auto.factory.AutoFactory
import com.lib1.Lib1Interface

@AutoFactory
class Lib1InterfaceImpl : Lib1Interface {
    override fun foo() {
        println("Test")
    }
}
