package com.praire.fire.okhttp.APIThread;

import com.praire.fire.data.CommonUrl;

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

public class RegisterThread implements Callable {

    String tel, pwd,cookie,managertel;

    public RegisterThread(String tel, String pwd, String managertel, String cookie) {
        this.tel = tel;
        this.pwd = pwd;
        this.cookie = cookie;
        this.managertel = managertel;
    }

    @Override
    public Object call() throws Exception {

        final OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("tel", tel)
                .add("pwd", pwd)
                .add("managertel", managertel)
                .build();
        Request request = new Request.Builder()
                .url(CommonUrl.register)
                .post(formBody)
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