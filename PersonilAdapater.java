import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonilAdapter extends RecyclerView.Adapter<PersonilAdapter.PersonilViewHolder> {


    private ArrayList<Personil> dataList;

    public PersonilAdapter(ArrayList<Personil> dataList) {
        this.dataList = dataList;
    }

    @Override
    public PersonilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_personil, parent, false);
        return new PersonilViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonilViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtUmur.setText(dataList.get(position).getUmur());
        holder.txtLokasi.setText(dataList.get(position).getLokasi());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class PersonilViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtUmur, txtLokasi;

        public PersonilViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_personil);
            txtUmur = (TextView) itemView.findViewById(R.id.txt_umur_personil);
            txtLokasi = (TextView) itemView.findViewById(R.id.txt_lokasi_personil);
        }
    }
}
