package io.dcloud.kotlinmodule

import android.util.Log
import com.alibaba.fastjson.JSONObject
import io.dcloud.feature.uniapp.annotation.UniJSMethod
import io.dcloud.feature.uniapp.bridge.UniJSCallback
import io.dcloud.feature.uniapp.common.UniModule

class WifiModule : UniModule() {


    operator fun UniJSCallback.invoke(param:Any) {
        this.invoke(param)
    }


    //run ui thread
    @UniJSMethod(uiThread = true)
    fun testAsyncFunc(options: JSONObject, callback: UniJSCallback?) {
        Log.e("dqqdo", "testAsyncFunc worked --$options")
        if (callback != null) {
            val data = JSONObject()
            data["code"] = "success"
            data["time"] = System.currentTimeMillis()
            callback(data);

        }
    }






}