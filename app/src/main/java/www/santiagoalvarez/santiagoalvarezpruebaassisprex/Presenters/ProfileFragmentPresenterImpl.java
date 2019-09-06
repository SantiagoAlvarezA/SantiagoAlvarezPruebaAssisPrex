package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Presenters;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.ProfileFragment;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Models.ProfileFragmentModelImpl;

public class ProfileFragmentPresenterImpl implements ProfileFragment.Presenter {

    private ProfileFragment.View view;
    private ProfileFragment.Model model;

    public ProfileFragmentPresenterImpl(ProfileFragment.View view) {
        this.view = view;
        model = new ProfileFragmentModelImpl(this);
    }

    @Override
    public void setNamePresenter(String name) {

        if (view != null)
            view.setNameView(name);
    }

    @Override
    public void setEmailPresenter(String email) {

        if (view != null)
            view.setEmailView(email);
    }

    @Override
    public void setPasswordPresenter(String password) {

        if (view != null)
            view.setPasswordView(password);
    }

    @Override
    public void setPhonePresenter(String phone) {

        if (view != null)
            view.setPhoneView(phone);
    }
}
