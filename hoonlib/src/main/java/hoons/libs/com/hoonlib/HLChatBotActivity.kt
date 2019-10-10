package hoons.libs.com.hoonlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_hlchat_bot.*

class HLChatBotActivity : AppCompatActivity() {

    companion object {
        val INTENT_KEY_URL_S: String = "HLChatBotActivity_INTENT_KEY_URL"
    }



    var loadUrl: String = "https://bot.istore.camp/index.html?origin=http%3A%2F%2Fm.superbeeracing.com&referer=http%3A%2F%2Fm.superbeeracing.com%2F&mallId=8"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hlchat_bot)

        loadUrl = intent.getStringExtra(INTENT_KEY_URL_S)

        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        buttonBack.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()

        webView.loadUrl(loadUrl)
    }

}
