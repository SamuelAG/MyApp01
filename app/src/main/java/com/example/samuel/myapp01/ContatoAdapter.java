package com.example.samuel.myapp01;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ViewHolder> {

    private List<Contato> mContatos;

    public ContatoAdapter(List<Contato> mContatos) {
        this.mContatos = mContatos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contato contato = mContatos.get(position);

        TextView textViewName = holder.txtName;
        textViewName.setText(contato.getNome());

        TextView textViewNumber = holder.txtNumber;
        textViewNumber.setText(contato.getTelefone());
    }

    @Override
    public int getItemCount() {
        return mContatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtName;
        public TextView txtNumber;


        public ViewHolder(View itemView) {
            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtNumber = (TextView) itemView.findViewById(R.id.txtNumber);
        }
    }
}
