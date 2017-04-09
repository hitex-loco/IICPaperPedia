package udsc.iic.iicpaperpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class It15Activity extends AppCompatActivity {

    WebView wv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it15);

        wv5 = (WebView) findViewById(R.id.webview2);

        wv5.getSettings().setJavaScriptEnabled(true);

//      wv5.getSettings().setPluginState(WebSettings.PluginState.ON);

        wv5.setWebViewClient(new It15Activity.Callback());

        String pdfURL = "https://dl.dropboxusercontent.com/s/8f6vtqb7taayun1/IT%2015%20Papers.pdf";

        wv5.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfURL);

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {
            return(false);
        }
    }
}
