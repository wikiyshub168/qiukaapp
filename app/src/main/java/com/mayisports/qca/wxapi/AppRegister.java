package com.mayisports.qca.wxapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.mayisports.qca.utils.Constant;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class AppRegister extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		final IWXAPI api = WXAPIFactory.createWXAPI(context, null);
		// 注册
		api.registerApp(Constant.APP_ID_WEPAY);
	}
}
