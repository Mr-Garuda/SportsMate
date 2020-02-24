package mr_garuda.sportsmate.ui.match;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Brian on Feb 23
 */
public class MatchViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MatchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is match fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
