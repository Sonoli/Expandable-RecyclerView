package com.sonoli.expander_xd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = findViewById(R.id.expandableListView);

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