package udsc.iic.iicpaperpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class It13Activity extends AppCompatActivity {

    WebView wv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it13);

        wv3 = (WebView) findViewById(R.id.webview2);

        wv3.getSettings().setJavaScriptEnabled(true);

//      wv3.getSettings().setPluginState(WebSettings.PluginState.ON);

        wv3.setWebViewClient(new It13Activity.Callback());

        String pdfURL = "https://dl.dropboxusercontent.com/s/aoxhuhac2ez4xbz/IT%2013%20Papers.pdf";

        wv3.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfURL);

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {
            return(false);
        }
    }
}
