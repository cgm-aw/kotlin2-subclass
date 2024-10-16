package de.apwolf.kotlin2subclass

import kotlin.test.Test

class KotlinCallSubclassTest {

    @Test
    fun `Call must invoke subclass method`() {
        val test = CaseInsensitiveWithOverride<String>()
        test.get("test");

        val test2 = CaseInsensitiveMapNoOverride<String>()
        test2.get("test");

    }
}