package com.shakuurdev.publishsubjectrxjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.reactivex.subjects.PublishSubject;

public class MainActivity extends AppCompatActivity {
    final StringBuilder result1 = new StringBuilder();
    final StringBuilder result2 = new StringBuilder();
    final StringBuilder result3 = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PublishSubject<String> subject = PublishSubject.create();

        subject.subscribe(value -> result1.append(value));
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.subscribe(value -> result2.append(value));
        subject.onNext("d");
        subject.subscribe(value -> result3.append(value));
        subject.onNext("e");


        System.out.println("result of result 1 is " + result1);
        System.out.println("result of result 2 is " + result2);
      System.out.println("result  of result 3 is " + result3);
    }
}