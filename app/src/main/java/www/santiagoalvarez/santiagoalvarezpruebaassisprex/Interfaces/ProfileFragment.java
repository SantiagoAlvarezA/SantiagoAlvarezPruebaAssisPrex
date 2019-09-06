package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces;

public interface ProfileFragment {

    interface Model {

    }

    interface View {

        void setNameView(String name);

        void setEmailView(String email);

        void setPasswordView(String password);

        void setPhoneView(String phone);
    }

    interface Presenter {

        void setNamePresenter(String name);

        void setEmailPresenter(String email);

        void setPasswordPresenter(String password);

        void setPhonePresenter(String phone);
    }
}
