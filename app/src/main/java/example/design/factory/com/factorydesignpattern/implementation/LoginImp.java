package example.design.factory.com.factorydesignpattern.implementation;

import android.content.Context;

import java.util.List;
import java.util.StringTokenizer;

import example.design.factory.com.factorydesignpattern.abstracts.ILoginAuthorization;
import example.design.factory.com.factorydesignpattern.abstracts.ILoginCallBack;
import example.design.factory.com.factorydesignpattern.abstracts.ILoginCallBack.ILogin;
import example.design.factory.com.factorydesignpattern.model.GitHubRepo;
import example.design.factory.com.factorydesignpattern.retrofitApi.ApiClient;
import example.design.factory.com.factorydesignpattern.retrofitApi.GitHubClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Guest User on 10/16/2017.
 */

public class LoginImp implements ILoginAuthorization {
    private  ApiClient apiClient;

    @Override
    public void login(Context context, final ILoginCallBack.ILogin iLoginCallBack) {
        //iLoginCallBack.onLogin("Sucess");
        iLoginCallBack.onLoginFail("failed");




    }
}
