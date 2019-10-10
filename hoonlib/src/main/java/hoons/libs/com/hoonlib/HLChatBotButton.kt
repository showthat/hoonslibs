package hoons.libs.com.hoonlib

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import android.widget.RelativeLayout


class HLChatBotButton @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : RelativeLayout(context, attrs, defStyleAttr) {

    var buttonIbot:ImageButton? = null
    var expandView:View? = null


    init {
        buttonIbot = ImageButton(context)
        buttonIbot?.layoutParams = LayoutParams(height, height)

        expandView = LayoutInflater.from(context).inflate(R.layout.hlchat_bot_button, this, false)

        this.addView(buttonIbot)
        this.addView(expandView, 0)
    }


    private fun dpToPixels(dp: Float) : Int {
        return (int)(resources.displayMetrics.density * dp)
    }
}
