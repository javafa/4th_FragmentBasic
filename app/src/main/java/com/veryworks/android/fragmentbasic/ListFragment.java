package com.veryworks.android.fragmentbasic;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
        // 여기는 코드를 작성하면 안된다
    }

    @Override
    public void onAttach(Context context) {
        Log.d("Fragment","==========onAttach()");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.d("Fragment","==========onDetach()");
        super.onDetach();
    }

    // 얘는 액티비티에 부착되면서 동작시작
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        // 프래그먼트 화면에 값을 세팅하는 로직은 이 사이에서
        Log.d("Fragment","==========onCreateView()");

        return view;
    }

    @Override
    public void onStart() {
        Log.d("Fragment","==========onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("Fragment","==========onResume()");
        super.onResume();
    }
}
