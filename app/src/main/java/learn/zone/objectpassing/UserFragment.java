package learn.zone.objectpassing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;

public class UserFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        User user = new Gson().fromJson("user", User.class);
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView email = (TextView) view.findViewById(R.id.email);
        TextView address = (TextView) view.findViewById(R.id.address);
        name.setText(user.getName());
        email.setText(user.getEmail());
        address.setText(user.getAddress());
        return view;
    }
}
