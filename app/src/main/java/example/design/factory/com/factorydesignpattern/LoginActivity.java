package example.design.factory.com.factorydesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import example.design.factory.com.factorydesignpattern.abstracts.ILoginAuthorization;
import example.design.factory.com.factorydesignpattern.abstracts.ILoginCallBack;
import example.design.factory.com.factorydesignpattern.abstracts.Shape;
import example.design.factory.com.factorydesignpattern.factoryclass.ShapeFactory;
import example.design.factory.com.factorydesignpattern.model.GitHubRepo;
import example.design.factory.com.factorydesignpattern.retrofitApi.GitHubClient;

public class LoginActivity extends AppCompatActivity implements ILoginCallBack.ILogin{
    private int units = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Login");
        shape1.draw();

        ILoginAuthorization iLogin = shapeFactory.getLogin("Login");
        iLogin.login(LoginActivity.this, (ILoginCallBack.ILogin) LoginActivity.this);

    }

    @Override
    public void onLogin(String msg) {
        Log.d("gitHubRepos",msg);
    }

    @Override
    public void onLoginFail(String msg) {
        Log.d("gitHubRepos",msg);
    }
}
