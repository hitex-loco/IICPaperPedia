package udsc.iic.iicpaperpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class It14Activity extends AppCompatActivity {

    WebView wv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it14);

        wv4 = (WebView) findViewById(R.id.webview2);

        wv4.getSettings().setJavaScriptEnabled(true);

//      wv4.getSettings().setPluginState(WebSettings.PluginState.ON);

        wv4.setWebViewClient(new It14Activity.Callback());

        String pdfURL = "https://dl.dropboxusercontent.com/";

        wv4.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfURL);

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {
            return(false);
        }
    }
}
