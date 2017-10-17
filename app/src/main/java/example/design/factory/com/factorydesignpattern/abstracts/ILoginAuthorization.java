package example.design.factory.com.factorydesignpattern.abstracts;

import android.content.Context;

import example.design.factory.com.factorydesignpattern.retrofitApi.GitHubClient;

/**
 * Created by Guest User on 10/16/2017.
 */

public interface ILoginAuthorization {
    void login(Context context, ILoginCallBack.ILogin iLogin);
}
