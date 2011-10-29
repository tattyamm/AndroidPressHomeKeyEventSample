package jp.sample.AndroidPressHomeKeyEventSample;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	@Override
	public void onUserLeaveHint(){
		//Activityが切り替わるタイミングで呼ばれる
		Toast.makeText(getApplicationContext(), "Good bye!" , Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch(keyCode){
		case KeyEvent.KEYCODE_BACK:
			//戻るボタンが押された時の処理
			Toast.makeText(this, "Back button!" , Toast.LENGTH_SHORT).show();
			finish();
			return true;
		}
		return false;
	}
}