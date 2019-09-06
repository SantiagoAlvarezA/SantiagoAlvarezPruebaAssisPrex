package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Models;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.RegisterFormFragment;

public class RegisterFormFragmentModelImpl implements RegisterFormFragment.Model {

    private RegisterFormFragment.Presenter presenter;

    public RegisterFormFragmentModelImpl(RegisterFormFragment.Presenter presenter) {
        this.presenter = presenter;
    }
}
