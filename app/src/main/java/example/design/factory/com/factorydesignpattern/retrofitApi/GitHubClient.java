package example.design.factory.com.factorydesignpattern.retrofitApi;

import java.util.List;

import example.design.factory.com.factorydesignpattern.model.GitHubRepo;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Guest User on 9/27/2017.
 */

public interface GitHubClient {
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(
            @Path("user") String user
    );

}
