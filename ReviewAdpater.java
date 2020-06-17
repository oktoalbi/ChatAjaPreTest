package app.andropath.com.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ReviewAdpater extends RecyclerView.Adapter<ReviewAdpater.ReviewViewHolder> {


    private ArrayList<Review> dataList;

    public ReviewAdapter(ArrayList<Review> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ReviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_review, parent, false);
        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtUmur.setText(dataList.get(position).getUmur());
        holder.txtLokasi.setText(dataList.get(position).getLokasi());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ReviewViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtUmur, txtLokasi;

        public ReviewViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_review);
            txtUmur = (TextView) itemView.findViewById(R.id.txt_umur_review);
            txtLokasi = (TextView) itemView.findViewById(R.id.txt_lokasi_review);
        }
    }
}
