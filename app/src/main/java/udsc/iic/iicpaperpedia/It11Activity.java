package udsc.iic.iicpaperpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class It11Activity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it11);

        wv = (WebView) findViewById(R.id.webview);

        wv.getSettings().setJavaScriptEnabled(true);

//      wv.getSettings().setPluginState(WebSettings.PluginState.ON);

        wv.setWebViewClient(new Callback());

        String pdfURL = "https://dl.dropboxusercontent.com/s/1nt7oxkbdkgst4l/IT%2011%20Papers.pdf";

        wv.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfURL);

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {
            return(false);
        }
    }
}
