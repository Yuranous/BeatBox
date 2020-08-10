package android.bignerdranch.com;

import android.bignerdranch.com.BeatBoxFragment;
import android.bignerdranch.com.SingleFragmentActivity;

import androidx.fragment.app.Fragment;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}