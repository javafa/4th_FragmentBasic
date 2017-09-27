package com.veryworks.android.fragmentbasic;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initFragment(View view){
        // 1. 프래그먼트 매니저
        FragmentManager manager = getSupportFragmentManager();
        // 2. 트랜잭션 처리자
        FragmentTransaction transaction = manager.beginTransaction(); // 프래그먼트를 처리하기 위한 트랜잭션을 시작
        // 3. 액티비티 레이아웃에 프래그먼트를 부착하고
        Log.d("Activity","==========before add()");
        transaction.add(R.id.container, new ListFragment());
        Log.d("Activity","==========after add()");
        // 4. 커밋해서 완료
        transaction.commit();
        Log.d("Activity","==========after commit");
    }

    @Override
    protected void onStart() {
        Log.d("Activity","==========onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("Activity","==========onResume()");
        super.onResume();
    }
}
