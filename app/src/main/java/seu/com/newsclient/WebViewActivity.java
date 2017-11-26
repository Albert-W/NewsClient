package seu.com.newsclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import seu.com.newsclient.Bean.Json_NewsInfo;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        Json_NewsInfo json_NewsInfo = JsonUtil.parse(Constant.JSON_NEWS, Json_NewsInfo.class);
        webView.loadDataWithBaseURL(null,json_NewsInfo.getNewsInfo().getContent(),"text/html", "utf-8", null);

    }
}
