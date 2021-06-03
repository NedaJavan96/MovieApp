package com.example.movieapp.util

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class FontIconTextView : AppCompatTextView {

    constructor(context: Context) : super(context) {
        setCustomTypeface(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setCustomTypeface(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        setCustomTypeface(context)
    }


    private fun setCustomTypeface(context: Context) {
        this.typeface = Typeface.createFromAsset(context.assets, "font/font_icon")
    }
}