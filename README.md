# Android Web View Demo
You can show any website in your app. To show the url, add a webview in your layout file:

   
      <WebView  
      android:id="@+id/myWebView"  
      android:layout_width="fill_parent"  
      android:layout_height="fill_parent" />

After that, you can show the website by setting the url:

    webView = (WebView) findViewById(R.id.myWebView);  
    webView.loadUrl("https://jakir.me");  
    webView.setWebViewClient(new WebViewClient());

**Full MainActivity.java:**

    import android.os.Bundle;  
    import android.webkit.WebView;  
    import android.webkit.WebViewClient;  
      
    import androidx.appcompat.app.AppCompatActivity;  
      
    public class MainActivity extends AppCompatActivity {  
          
       private WebView webView;        
       public void onCreate(Bundle savedInstanceState) {  
          super.onCreate(savedInstanceState);  
          setContentView(R.layout.activity_main);       
          webView = (WebView) findViewById(R.id.myWebView);  
          webView.loadUrl("https://jakir.me");  
          webView.setWebViewClient(new WebViewClient());   
      
       }  
    }
