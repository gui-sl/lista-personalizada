package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillInMeme();
    }

    private void fillInMeme() {
        DtoFrame dtoFrame1 = new DtoFrame();

        dtoFrame1.setImageMeme(R.drawable.reactnative);
        dtoFrame1.setDescription("React Native");
        dtoFrame1.setDateCreating("React Native is an open-source UI software framework created by Meta Platforms, Inc. It is used to develop applications for Android, Android TV, iOS, macOS, tvOS, Web, Windows.");

        DtoFrame dtoFrame2 = new DtoFrame();

        dtoFrame2.setImageMeme(R.drawable.flutter);
        dtoFrame2.setDescription("Flutter");
        dtoFrame2.setDateCreating(" Flutter is Google's portable UI toolkit for crafting beautiful, natively compiled applications for mobile, web, and desktop from a single codebase");

        DtoFrame dtoFrame3 = new DtoFrame();

        dtoFrame3.setImageMeme(R.drawable.mobileangular);
        dtoFrame3.setDescription("Mobile Angular UI");
        dtoFrame3.setDateCreating("Mobile Angular UI is an open-source framework for developing hybrid mobile apps. This Framework makes use of Twitter Bootstrap and AngularJS that helps to create attractive HTML5 hybrid mobile and desktop apps.");

        DtoFrame dtoFrame4 = new DtoFrame();

        dtoFrame4.setImageMeme(R.drawable.ionic);
        dtoFrame4.setDescription("Ionic");
        dtoFrame4.setDateCreating("Ionic is a powerful HTML5 SDK that helps you build native-feeling mobile apps using web technologies like HTML, CSS, and Javascript.");

        ArrayList<DtoFrame> memeArrayList = new ArrayList<>();
        memeArrayList.add(dtoFrame1);
        memeArrayList.add(dtoFrame2);
        memeArrayList.add(dtoFrame3);
        memeArrayList.add(dtoFrame4);

        CustomListAdapter adapter = new CustomListAdapter(MainActivity.this, memeArrayList);

        ListView listView = findViewById(R.id.listViewFrame);
        listView.setAdapter(adapter);
    }

}