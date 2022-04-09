package com.example.test_1

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlin.math.abs
import kotlin.math.max

class ZoomOutTransformer :ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.apply {
            when {
                position<-1 -> {
                    alpha= 0F
                }
                position<1 -> {
                    alpha= max(0.3f,1- abs(position))
                    scaleX=max(0.85f,1- abs(position))
                    scaleY=max(0.85f,1- abs(position))
                    val vertMargin = height * (1 - scaleX) / 2
                    val horzMargin = width * (1 - scaleX) / 2
                    translationX = if (position < 0) {
                        horzMargin - vertMargin / 2
                    } else {
                        horzMargin + vertMargin / 2
                    }
                }
                else -> {
                    alpha=0f
                }
            }
        }
    }
}