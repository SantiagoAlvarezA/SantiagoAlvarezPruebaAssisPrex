package www.santiagoalvarez.santiagoalvarezpruebaassisprex.VIews;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces.RegisterFormFragment;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.Presenters.RegisterFormFragmentPresenterImpl;
import www.santiagoalvarez.santiagoalvarezpruebaassisprex.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFormFragmentViewImpl extends Fragment implements RegisterFormFragment.View {

    private View view;
    private RegisterFormFragment.Presenter presenter;


    private TextInputEditText
            textInput_name,
            textInput_email,
            textInput_password,
            textInput_phone;

    private Button btn_next;

    public RegisterFormFragmentViewImpl() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_register_form, container, false);
        presenter = new RegisterFormFragmentPresenterImpl(this);

        textInput_name = view.findViewById(R.id.textInput_name);
        textInput_email = view.findViewById(R.id.textInput_email);
        textInput_password = view.findViewById(R.id.textInput_password);
        textInput_phone = view.findViewById(R.id.textInput_phone);

        btn_next = view.findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.navigateToProfilePresenter(textInput_name.getText().toString(),
                        textInput_email.getText().toString(),
                        textInput_password.getText().toString(),
                        textInput_phone.getText().toString());
            }
        });

        return view;
    }

    @Override
    public void navigateToProfileView(String name, String email, String password, String phone) {
        Fragment fragment = new ProfileFragmentViewImpl(name, email, password, phone);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.content_fragment, fragment);
        transaction.addToBackStack(fragment.getClass().getName());
        transaction.commit();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
