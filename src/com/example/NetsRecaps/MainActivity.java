package com.example.NetsRecaps;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements ScoresFragment.ListSelectorListener {

    private static final int MATCH_PARENT = LinearLayout.LayoutParams.MATCH_PARENT;
    public static String[] scores;
    public static String[] recaps;
    private RecapsFragment singleRecapFragment = new RecapsFragment();
    private ScoresFragment singleScoreFragment;
    private FrameLayout singleRecapFragmentLayout;
    private FrameLayout singleScoreFragmentLayout;
    private FragmentManager fragmentManager;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        scores = getResources().getStringArray(R.array.Scores);
        recaps = getResources().getStringArray(R.array.Recaps);

        setContentView(R.layout.main);
        singleRecapFragmentLayout = (FrameLayout)findViewById(R.id.recapsFragment);
        singleScoreFragmentLayout = (FrameLayout) findViewById(R.id.scoresFragment);

        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.scoresFragment, new ScoresFragment());
        fragmentTransaction.commit();
        
        fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                setLayout();
            }
        });
    }

    private void setLayout() {

        if (!singleRecapFragment.isAdded()) {

            singleScoreFragmentLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT));
            singleRecapFragmentLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT));

        } else {

            singleScoreFragmentLayout.setLayoutParams(new LinearLayout.LayoutParams(0,MATCH_PARENT, 1f));
            singleRecapFragmentLayout.setLayoutParams(new LinearLayout.LayoutParams(0,MATCH_PARENT, 2f));

        }

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSelection(int index) {
        if (!singleRecapFragment.isAdded()) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.recapsFragment, singleRecapFragment);

            fragmentTransaction.addToBackStack(null);

            fragmentTransaction.commit();
            fragmentManager.executePendingTransactions();

        }

        if (singleRecapFragment.getShownIndex() != index) {

            singleRecapFragment.showRecapsOnIndex(index);

        }
    }
}
