package al.ahgitdevelopment.spds;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private DatabaseReference ref;
    private FirebaseListAdapter<Paciente> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        ref = FirebaseDatabase.getInstance().getReference().child("pacientes");

        mAdapter = new FirebaseListAdapter<Paciente>(
                this, Paciente.class, android.R.layout.two_line_list_item, ref.orderByChild("ExpiracyMilisec")) {
                    @Override
                    protected void populateView(View view, Paciente paciente, int position) {
                        TextView name = (TextView) view.findViewById(android.R.id.text1);
                        TextView expiracy = (TextView) view.findViewById(android.R.id.text2);
                        name.setTextSize(16);
                        expiracy.setTextSize(16);
                        view.setPadding(0, 10, 0, 10);

                        name.setText(paciente.getName());
                        expiracy.setText(paciente.getExpiracy());
                    }
                };

        listView.setAdapter(mAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAdapter.cleanup();
    }
}
