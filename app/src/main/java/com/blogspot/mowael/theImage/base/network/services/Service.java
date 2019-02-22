package com.blogspot.mowael.theImage.base.network.services;


import com.blogspot.mowael.theImage.base.network.RetrofitBase;
import com.blogspot.mowael.theImage.base.utils.Logger;
import com.google.gson.Gson;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;

import java.io.File;
import java.util.HashMap;

/**
 * Created by moham on 10/6/2017.
 */

public class Service<Response, RestClient> implements Callback<Response> {

    protected static final String MULTI_PART_FORM_DATA = "multipart/form-data";
    private Callback<Response> callback;
    private String TAG = Service.class.getName();

    /**
     * @param bodyMap body of the request
     * @return HashMap of String and RequestBody for the PartMap
     */
    public HashMap<String, RequestBody> createRequestBodyMap(HashMap<String, String> bodyMap) {
        HashMap<String, RequestBody> requestBodyMap = new HashMap<>();
        for (String key : bodyMap.keySet()) {
            requestBodyMap.put(key, createRequestBody(bodyMap.get(key)));
        }
        return requestBodyMap;
    }

    /**
     * @param content the content of the request
     * @return RequestBody with multipart/form-data as content type
     */
    public RequestBody createRequestBody(String content) {
        return RequestBody.create(MediaType.parse(MULTI_PART_FORM_DATA), content);
    }

    /**
     * @param file the content of the request
     * @return RequestBody with multipart/form-data as content type
     */
    public RequestBody createRequestBody(File file) {
        return RequestBody.create(MediaType.parse(MULTI_PART_FORM_DATA), file);
    }

    public MultipartBody.Part createMultiPart(String name, File file) {
        RequestBody requestBody = createRequestBody(file);
        return MultipartBody.Part.createFormData(name, file.getName(), requestBody);
    }

    public RestClient createRestClient(Class<RestClient> tClass) {
        return RetrofitBase.getInstance().createClient(tClass);
    }

    public Disposable sendAsync(Observable<Response> observable, Consumer<Response> responseConsumer, Consumer<Throwable> errorConsumer) {
        return appendSchedulers(observable).subscribe(responseConsumer, errorConsumer);
    }

    public void sendAsync(Observable<Response> observable, Observer<Response> observer) {
        appendSchedulers(observable).subscribe(observer);
    }

    public void sendAsync(Single<Response> observable, SingleObserver<Response> observer) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public Observable<Response> appendSchedulers(Observable<Response> observable) {
        return observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }


    public void sendAsync(Call<Response> call, Callback<Response> callback) {
        this.callback = callback;
        Logger.d("request", call.request().url().toString());
        Logger.d("body", call.request().body() != null ? call.request().body().toString() : "no body");
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
        Logger.d(TAG + " onResponse", response.toString());
        Logger.d(TAG + " onResponseMessage", response.message());
        Logger.d(TAG + " onResponseCode", response.code() + "");
        Logger.d(TAG + " onResponseErrorBody", response.errorBody() != null ? response.errorBody().toString() : "no Error");
        if (response.body() != null) {
            Gson gson = new Gson();
            String res = gson.toJson(response.body());
            Logger.d(TAG + " response", res);
        } else Logger.d(TAG + " response", "null body");
        if (callback != null) callback.onResponse(call, response);
    }

    @Override
    public void onFailure(Call<Response> call, Throwable t) {
        Logger.e(TAG + " onFailureMSG", t.getMessage());
        if (callback != null) callback.onFailure(call, t);
        t.printStackTrace();
    }


    public void onStopService() {
        callback = null;
    }

}
