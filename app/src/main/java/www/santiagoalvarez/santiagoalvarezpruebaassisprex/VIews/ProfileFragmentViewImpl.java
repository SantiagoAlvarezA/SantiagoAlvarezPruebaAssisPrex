package www.santiagoalvarez.santiagoalvarezpruebaassisprex.VIews;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.ProfileFragment;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Presenters.ProfileFragmentPresenterImpl;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragmentViewImpl extends Fragment implements ProfileFragment.View {

    private View view;

    private ProfileFragment.Presenter presenter;

    public ProfileFragmentViewImpl() {
        // Required empty public constructor
    }

    private String name, email, password, phone;

    private TextView
            text_name,
            text_email,
            text_password,
            text_phone;

    public ProfileFragmentViewImpl(String name, String email, String password, String phone) {
        // Required empty public constructor
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);
        presenter = new ProfileFragmentPresenterImpl(this);

        text_name = view.findViewById(R.id.text_name);
        text_email = view.findViewById(R.id.text_email);
        text_password = view.findViewById(R.id.text_password);
        text_phone = view.findViewById(R.id.text_phone);

        presenter.setEmailPresenter(email);
        presenter.setNamePresenter(name);
        presenter.setPasswordPresenter(password);
        presenter.setPhonePresenter(phone);

        return view;
    }

    @Override
    public void setNameView(String name) {
        text_name.setText(name);
    }

    @Override
    public void setEmailView(String email) {
        text_email.setText(email);
    }

    @Override
    public void setPasswordView(String password) {
        text_password.setText(password);
    }

    @Override
    public void setPhoneView(String phone) {
        text_phone.setText(phone);
    }


}
