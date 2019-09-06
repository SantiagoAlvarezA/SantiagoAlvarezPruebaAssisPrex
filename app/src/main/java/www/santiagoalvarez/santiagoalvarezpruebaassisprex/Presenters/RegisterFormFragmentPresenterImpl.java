package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Presenters;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.RegisterFormFragment;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Models.RegisterFormFragmentModelImpl;

public class RegisterFormFragmentPresenterImpl implements RegisterFormFragment.Presenter {

    private RegisterFormFragment.View view;
    private RegisterFormFragment.Model model;

    public RegisterFormFragmentPresenterImpl(RegisterFormFragment.View view) {
        this.view = view;
        model = new RegisterFormFragmentModelImpl(this);
    }

    @Override
    public void navigateToProfilePresenter(String name, String email, String password, String phone) {
        if (view != null)
            view.navigateToProfileView(name, email, password, phone);
    }
}
