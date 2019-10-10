package enliple.com.androidlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.activity_sub.webView

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)


        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        webView.loadUrl("http://www.naver.com")

        buttonBack.setOnClickListener {
            finish()
        }
    }
}
