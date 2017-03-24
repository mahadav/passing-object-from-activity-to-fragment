package learn.zone.objectpassing;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();
        user.setName("Madhav Bhattarai");
        user.setEmail("madhavbhattarai10@gmail.com");
        user.setAddress("Gangtok,\nEast Sikkim,\nIndia");
        passObject(user);
    }

    private void passObject(User user) {
        Bundle bundle = new Bundle();
        bundle.putString("user", new Gson().toJson(user));
        Fragment fragment = new UserFragment();
        fragment.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }
}
