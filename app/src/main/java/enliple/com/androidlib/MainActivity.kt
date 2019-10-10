package enliple.com.androidlib

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import hoons.libs.com.hoonlib.HLActivityPresenter
import hoons.libs.com.hoonlib.HLChatBotActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)

        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        webView.loadUrl("http://superbeeracing.com")


        fab.setOnClickListener {
//            startActivity(Intent(this@MainActivity, SubActivity::class.java))
            HLActivityPresenter.shared.presentChatbotActivity(
                this@MainActivity,
                "https://bot.istore.camp/index.html?origin=http%3A%2F%2Fm.superbeeracing.com&referer=http%3A%2F%2Fm.superbeeracing.com%2F&mallId=8"
            )
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when(item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
