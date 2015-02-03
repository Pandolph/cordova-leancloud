package org.alin.leancloud;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import com.avos.avoscloud.feedback.FeedbackAgent;

import android.annotation.SuppressLint;
import android.content.Context;



@SuppressLint("DefaultLocale")
public class Leancloud extends CordovaPlugin {
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		System.out.println("mos:"+action);
		System.out.println(args);
		Context context = this.cordova.getActivity().getApplicationContext();
		if("feedback".equalsIgnoreCase(action)){
			feedback(context);
		}
		return true;
	}

	private void feedback(Context context){
		System.out.println("do feedback android");
		
        FeedbackAgent agent = new FeedbackAgent(context);
       	agent.startDefaultThreadActivity();
	}
}