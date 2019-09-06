package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Models;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.MainActivity;

public class MainActivityModelImpl implements MainActivity.Model {

    private MainActivity.Presenter presenter;

    public MainActivityModelImpl(MainActivity.Presenter presenter) {
        this.presenter = presenter;
    }
}
