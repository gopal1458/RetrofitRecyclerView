package twilight.example.com.retrofitrecyclerview.WebService;

import retrofit2.Call;
import retrofit2.http.GET;
import twilight.example.com.retrofitrecyclerview.Model.JSONResponse;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
