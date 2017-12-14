package com.example.dell.a5cards_prototype_1.utility;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by DELL on 11/27/2017.
 */

public interface RetrofitClient {

    @GET("PRODUCTS")
    Call<ArrayList<Response>> getallProducts();


     @GET("PRODUCTS?where=FEATURED%3Dtrue")
     Call<ArrayList<FeaturedResponse>> getallFeaturedProducts();


   // @GET("PRODUCTS")
    //Call<ArrayList<FeaturedResponse>> getallFeaturedProducts (@Query("where") String WhereClause);


}
