package com.example.NetsRecaps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wojder on 23.11.14.
 */
public class RecapsFragment extends Fragment {

    private TextView recapsView = null;
    private int recapsArrayLenght;
    private int mCurrIndex = -1;


    public int getShownIndex() {

        return mCurrIndex;

    }

    public void showRecapsOnIndex (int newIndex)
    {
        if (newIndex < 0 || mCurrIndex >= recapsArrayLenght)
            return;
        mCurrIndex = newIndex;
        recapsView.setText(MainActivity.recaps[mCurrIndex]);
        }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recaps_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recapsView = (TextView) getActivity().findViewById(R.id.recapsView);
        recapsArrayLenght = MainActivity.recaps.length;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
