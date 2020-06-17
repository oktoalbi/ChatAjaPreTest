import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PersonilAdapter adapter;
    private ArrayList<Personil> personilArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new PersonilAdapter(personilArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        personilArrayList = new ArrayList<>();
        personilArrayList.add(new Personil("Adi", "25", "Jakarta"));
        personilArrayList.add(new Personil("Yaya", "32", "Jakarta"));
        personilArrayList.add(new Personil("Risa", "23", "Jakarta"));
        personilArrayList.add(new Personil("Radit", "31", "Jakarta"));
        personilArrayList.add(new Personil("Adit", "24", "Jakarta"));
        personilArrayList.add(new Personil("Yayat", "30", "Jakarta"));
        personilArrayList.add(new Personil("Riska", "23", "Jakarta"));
        personilArrayList.add(new Personil("Ivan", "31", "Jakarta"));
        personilArrayList.add(new Personil("Adi", "25", "Bekasi"));
        personilArrayList.add(new Personil("Yaya", "32", "Tangerang"));
        personilArrayList.add(new Personil("Risa", "23", "Bogor"));
        personilArrayList.add(new Personil("Radit", "31", "Surabaya"));
        personilArrayList.add(new Personil("Adit", "24", "Malang"));
        personilArrayList.add(new Personil("Yayat", "30", "Batu"));
        personilArrayList.add(new Personil("Riska", "23", "Madiun"));
        personilArrayList.add(new Personil("Ivan", "31", "Bandung"));
        personilArrayList.add(new Personil("Adi", "25", "Bandung"));
        personilArrayList.add(new Personil("Yaya", "32", "Bekasi"));
        personilArrayList.add(new Personil("Risa", "23", "Bekasi"));
        personilArrayList.add(new Personil("Radit", "31", "Depok"));
        personilArrayList.add(new Personil("Adit", "24", "Gresik"));
        personilArrayList.add(new Personil("Yayat", "30", "Makassar"));
        personilArrayList.add(new Personil("Riska", "23", "Manado"));
        personilArrayList.add(new Personil("Ivan", "31", "Lampung"));
        personilArrayList.add(new Personil("Adi", "25", "Jambi"));
        personilArrayList.add(new Personil("Yaya", "32", "Jambi"));
        personilArrayList.add(new Personil("Risa", "23", "Tulungagung"));
        personilArrayList.add(new Personil("Radit", "31", "Bandung"));
        personilArrayList.add(new Personil("Adit", "24", "Bandung"));
        personilArrayList.add(new Personil("Yayat", "30", "Bandung"));
        personilArrayList.add(new Personil("Riska", "23", "Bandung"));
        personilArrayList.add(new Personil("Ivan", "31", "Bandung"));
        
    }

}
