package mr_garuda.sportsmate.ui.myProfile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Brian on Feb 23
 */
public class MyProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is myProfile fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
