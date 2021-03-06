package com.praire.fire.okhttp.APIThread;

import com.praire.fire.common.ConstanUrl;

import java.io.IOException;
import java.util.concurrent.Callable;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by sunlo on 2017/12/29.
 */

public class GetBusinessOrderListThread implements Callable {


    public GetBusinessOrderListThread(String status, String cookie, String p) {
        this.status = status;
        this.cookie = cookie;
        this.p = p;
    }

    /**
     * Created by domain on 2017/12/29.
     */



    String status;
    String cookie;
    String p;

    @Override
    public Object call() throws Exception {

        final OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .build();
        Request request = new Request.Builder()
                .url(ConstanUrl.GET_BUSINESS_ORDER_LIST+"?status="+status+"&p="+p)
                .get()
                .addHeader("cookie",cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }
        String cookie = response.headers("set-cookie").get(0);
        String result = response.body().string();
        return result;
    }
}
