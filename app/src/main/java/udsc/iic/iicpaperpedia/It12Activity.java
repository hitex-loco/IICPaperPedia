package udsc.iic.iicpaperpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class It12Activity extends AppCompatActivity {

    WebView wv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it12);

        wv2 = (WebView) findViewById(R.id.webview2);

        wv2.getSettings().setJavaScriptEnabled(true);

//      wv2.getSettings().setPluginState(WebSettings.PluginState.ON);

        wv2.setWebViewClient(new It12Activity.Callback());

        String pdfURL = "https://dl.dropboxusercontent.com/";

        wv2.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfURL);

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {
            return(false);
        }
    }
}
