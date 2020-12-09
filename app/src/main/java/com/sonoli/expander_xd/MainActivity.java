package com.sonoli.expander_xd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = findViewById(R.id.expandableListView);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
      //  Call<List<Users>> call = jsonPlaceHolderApi.getUsers();

        HashMap<String, List<String>> item = new HashMap<>();
        ArrayList<String> linuxGroups = new ArrayList<>();
        linuxGroups.add("Ubuntu");
        linuxGroups.add("Ubuntu");
        linuxGroups.add("Ubuntu");
        linuxGroups.add("Ubuntu");
        linuxGroups.add("Ubuntu");
        item.put("Linux", linuxGroups);

        MyExpandableLisrAdapter myExpandableLisrAdapter = new MyExpandableLisrAdapter(item);
        expandableListView.setAdapter(myExpandableLisrAdapter);

    }
}