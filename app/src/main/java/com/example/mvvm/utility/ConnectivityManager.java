package com.example.mvvm.utility;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Jon on 9/23/2017.
 */

public class ConnectivityManager {

    public static String getGimmyoBidItem (String urlAddress) {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(urlAddress)
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
            }
        });

        return null;
    }
}
