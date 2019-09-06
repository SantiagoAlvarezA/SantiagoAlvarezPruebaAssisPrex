package www.santiagoalvarez.santiagoalvarezpruebaassisprex.Interfaces;

public interface RegisterFormFragment {

    interface Model {

    }

    interface View {
        void navigateToProfileView(String name, String email, String password, String phone);
    }

    interface Presenter {
        void navigateToProfilePresenter(String name, String email, String password, String phone);
    }

}
