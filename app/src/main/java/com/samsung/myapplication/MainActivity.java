package com.samsung.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.UserHandle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button button;

    class Staff {
        public String name;
//        @SerializedName("my_age")
        private int age;
        public String position;
        public BigDecimal salary;
        public List<String> skills;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Staff s = new Staff();
                String str = new Gson().toJson(s);
                System.out.println(str);
//                String str = "{\"name\":\"Anton\",\"age\":15,\"position\":\"Junior\",\"salary\":100,\"skills\":[\"java\",\"xml\",\"python\",\"Android\"]}";
//                Staff staff = new Gson().fromJson(str, Staff.class);
//                return staff.skills.size()

//                System.out.println(staff);
            }
        });

//        FirebaseDatabase.getInstance().getReference()
//                        .setValue("32435y65y");

//        ArrayList<UserHandle> userHandles = new ArrayList<>();
//
//        FirebaseDatabase.getInstance()
//                .getReference()
//                .child("users")
//                .orderByChild("creationDate")
//                .addChildEventListener(new ChildEventListener() {
//                    @Override
//                    public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
//                        UserHandle user = snapshot.getValue(UserHandle.class);
//                        userHandles.add(user);
//                    }
//
//                    @Override
//                    public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
//
//                    }
//
//                    @Override
//                    public void onChildRemoved(@NonNull DataSnapshot snapshot) {
//
//                    }
//
//                    @Override
//                    public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
//
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                })
//                .addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                        // user obj
//                        UserHandle s = snapshot.getValue(HashMap<String, UserHandle>.class);
//                        // -MyDLYfWY7YZmJa2u8u3
//                        String s1 = snapshot.getKey();
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                });
    }
}