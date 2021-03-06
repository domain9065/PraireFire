package com.praire.fire.merchant.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.praire.fire.R;
import com.praire.fire.merchant.bean.ShopTypeBeanList;

import java.util.List;

/**
 * Created by sunlo on 2018/1/5.
 */

public class SetledAdapter extends RecyclerView.Adapter<SetledAdapter.MyViewHolder>  {


    private List<ShopTypeBeanList.ListBean> data;
    private LayoutInflater inflater;

    public SetledAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    private OnItemClickListener mOnItemClickListener = null;

    public interface OnItemClickListener {
        void onItemClick(View view,int position);
    }
    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(inflater.inflate(R.layout.item_setled, parent,
                false));

        return holder;
    }

    ImageView imageView;

    Boolean b=true;
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.name.setText(data.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.iv.setImageResource(R.mipmap.store_type_selected);
                mOnItemClickListener.onItemClick(view,position);
            }
        });
    }






    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<ShopTypeBeanList.ListBean> Datas) {
        data = Datas;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView iv;
        public MyViewHolder(View itemView) {
            super(itemView);
            name =itemView.findViewById(R.id.tv_type);
            iv=itemView.findViewById(R.id.iv_choose);
        }

    }
}
