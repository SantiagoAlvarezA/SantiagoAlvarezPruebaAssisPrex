package www.santiagoalvarez.santiagoalvarezpruebaassisprex.VIews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.MainActivity;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Presenters.MainActivityPresenterImpl;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.R;

public class MainActivityViewImpl extends AppCompatActivity implements MainActivity.View {

    private MainActivity.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenterImpl(this);
        presenter.showFormFragmentPresenter();

    }

    @Override
    public void showFormFragmentView() {
        Fragment fragment = new RegisterFormFragmentViewImpl();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_fragment, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(fragment.getClass().getName())
                .commit();
    }


    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }

    }
}
