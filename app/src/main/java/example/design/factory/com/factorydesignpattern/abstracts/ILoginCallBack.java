package example.design.factory.com.factorydesignpattern.abstracts;

import java.util.List;

import example.design.factory.com.factorydesignpattern.model.GitHubRepo;

/**
 * Created by Guest User on 10/16/2017.
 */

public interface ILoginCallBack {
    interface ILogin {
        /**
         * If user successfully login, you will receive true here otherwise false.
         * @param List of Github
         */
        void onLogin(String msg);
        void onLoginFail(String msg);
    }
}
