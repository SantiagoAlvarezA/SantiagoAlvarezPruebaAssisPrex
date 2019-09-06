package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Presenters;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.MainActivity;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Models.MainActivityModelImpl;

public class MainActivityPresenterImpl implements MainActivity.Presenter {

    private MainActivity.View view;
    private MainActivity.Model model;

    public MainActivityPresenterImpl(MainActivity.View view) {
        this.view = view;
        model = new MainActivityModelImpl(this);
    }

    @Override
    public void showFormFragmentPresenter() {
        if (view != null)
            view.showFormFragmentView();
    }
}
