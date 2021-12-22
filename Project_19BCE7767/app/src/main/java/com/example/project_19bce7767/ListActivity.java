package com.example.project_19bce7767;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {
    static final String names[] = {"Apple", "Banana", "Oranges", "grapes", "kiwi"};
    static final String desc[] = {"Apple varieties", "Banana varieties", "Oranges varieties", "grapes varieties", "kiwi varieties"};
    static final int fruits[] = {R.drawable.apple, R.drawable.banana, R.drawable.orange, R.drawable.grapes, R.drawable.kiwi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView lv = findViewById(R.id.listview);
        lv.setAdapter(new MyAdapter(this));
       Intent intent = getIntent();
    }
        private class MyAdapter extends BaseAdapter {
            Context c;
            public MyAdapter(ListActivity mainActivity) {
                c = mainActivity;
            }

            @Override
            public int getCount() {
                return names.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = LayoutInflater.from(c).inflate(R.layout.mylistitem, parent, false);
                TextView t1 = view.findViewById(R.id.textView);
                TextView t2 = view.findViewById(R.id.textView2);
                ImageView I1 = view.findViewById(R.id.imageView);
                Button b1 = view.findViewById(R.id.button);
                t1.setText(names[position]);
                t2.setText(desc[position]);
                I1.setImageResource(fruits[position]);
                b1.setText("Click");
                return view;
            }
        }
    }