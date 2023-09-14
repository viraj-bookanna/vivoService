package lk.live.vivo.service;
 
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

public class MainActivity extends Activity { 
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
		Uri uri = Uri.fromParts("package", "com.vivo.daemonService", null);
		intent.setData(uri);
		startActivity(intent);
		System.exit(0);
    }
	
} 
/* MODDED BY MASKED_MODDER*/
