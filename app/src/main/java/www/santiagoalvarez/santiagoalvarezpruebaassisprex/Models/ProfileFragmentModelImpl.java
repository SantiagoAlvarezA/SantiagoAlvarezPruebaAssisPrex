package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Models;


import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.ProfileFragment;

public class ProfileFragmentModelImpl implements ProfileFragment.Model {

    private ProfileFragment.Presenter presenter;

    public ProfileFragmentModelImpl(ProfileFragment.Presenter presenter) {
        this.presenter = presenter;
    }
}
