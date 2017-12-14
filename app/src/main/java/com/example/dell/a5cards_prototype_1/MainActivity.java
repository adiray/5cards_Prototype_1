package com.example.dell.a5cards_prototype_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.dell.a5cards_prototype_1.utility.FeaturedResponse;
import com.example.dell.a5cards_prototype_1.utility.Response;
import com.example.dell.a5cards_prototype_1.utility.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

     TextView featuredItemName;
    TextView featuredItemPrice;
    ImageView featuredItem ;
    ArrayList<Response> dataout  = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.backendless.com/54158ACA-8614-7763-FF72-3BFBF61B4600/167C910C-C110-5D40-FF09-C8621E23B700/data/")
                .addConverterFactory(GsonConverterFactory.create());


        Retrofit myretrofit = builder.build();
        String whereclause = "FEATURED%3Dtrue";

        RetrofitClient mywebclient = myretrofit.create(RetrofitClient.class);
        retrofit2.Call<ArrayList<Response>> mycall = mywebclient.getallProducts();
        retrofit2.Call<ArrayList<FeaturedResponse>> myFeaturedItemsCall = mywebclient.getallFeaturedProducts();


        myFeaturedItemsCall.enqueue(new Callback<ArrayList<FeaturedResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<FeaturedResponse>> call, retrofit2.Response<ArrayList<FeaturedResponse>> response) {

                ArrayList<FeaturedResponse> data = response.body();
                String msg = data.get(0).getPRODUCTNAME();

                Log.d("comms success", msg);

                featuredItemName = MainActivity.this.findViewById(R.id.item_name);
                featuredItemPrice = MainActivity.this.findViewById(R.id.item_price);
                featuredItem = MainActivity.this.findViewById(R.id.featured_item_image);

                Glide.with(MainActivity.this).load(data.get(0).getPRODUCTIMAGEREFERENCE()).apply(RequestOptions.noTransformation()).into(featuredItem);
                featuredItemPrice.setText(response.body().get(0).getPRODUCTPRICE());
                featuredItemName.setText(response.body().get(0).getPRODUCTNAME());

            }

            @Override
            public void onFailure(Call<ArrayList<FeaturedResponse>> call, Throwable t) {

                Log.d("comms error1", "onResponse:the operation failed ");
                t.printStackTrace();

            }
        });


        mycall.enqueue(new Callback<ArrayList<Response>>() {


            @Override
            public void onResponse(Call<ArrayList<Response>> call, retrofit2.Response<ArrayList<Response>> response) {

                ArrayList<Response> rawData = response.body();

                dataout = rawData;
                RecyclerView myrecview = findViewById(R.id.browse_recycler_view);
                myrecview.setHasFixedSize(true);
                myrecview.setLayoutManager(new GridLayoutManager(MainActivity.this,2,1,false));

                RecyclerView.Adapter myadapter = new myAdapter(rawData,MainActivity.this);
                myrecview.setAdapter(myadapter);

            }

            @Override
            public void onFailure(Call<ArrayList<Response>> call, Throwable t) {


                Log.d("comms error2", "onResponse:the operation failed ");
                t.printStackTrace();


            }
        });

       /* RecyclerView.Adapter myadapter = new myAdapter(dataout,MainActivity.this);
        myrecview.setAdapter(myadapter);*/

}


}
