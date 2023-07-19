package com.example.basic

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import io.mockk.MockKAnnotations
import io.mockk.spyk
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class MainActivityTest {

    private val subject by lazy { spyk(MainActivity()) }

    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
    }

    @Test
    fun `modifyNumber - WHEN isAdd is false THEN should value will be subtract`() {

        val result = subject.modifyNumber(5,2, false)
        assertEquals(3,result)
    }
}