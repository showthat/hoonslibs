package hoons.libs.com.hoonlib

import android.content.Context
import android.content.Intent


class HLActivityPresenter {

    companion object {
        val shared = HLActivityPresenter()
    }


    fun presentChatbotActivity(context: Context, url:String) {
        context.startActivity(Intent(context, HLChatBotActivity::class.java).apply {
            this.putExtra(HLChatBotActivity.INTENT_KEY_URL_S, url)
        })
    }



}