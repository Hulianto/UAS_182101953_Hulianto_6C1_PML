package com.hulianto182101953.userprojectcrud.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hulianto182101953.userprojectcrud.EditActivity;
import com.hulianto182101953.userprojectcrud.R;
import com.hulianto182101953.userprojectcrud.model.User;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.MyViewHolder> {
    List<User> mUserList;

    public UsersAdapter(List <User> userList){
        mUserList = userList;
    }

    @NonNull
    @Override
    public UsersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.users_list, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(mView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.MyViewHolder holder, int position) {
        holder.mTextViewId.setText("Id = "+mUserList.get(position).getId());
        holder.mTextViewName.setText("Name = "+mUserList.get(position).getName());
        holder.mTextVIewEmail.setText("Email = "+mUserList.get(position).getEmail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(view.getContext(), EditActivity.class);
                mintent.putExtra("Id", mUserList.get(position).getId());
                mintent.putExtra("Name", mUserList.get(position).getName());
                mintent.putExtra("Email", mUserList.get(position).getEmail());
                view.getContext().startActivity(mintent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewName, mTextVIewEmail;

        public MyViewHolder(View itemView){
            super(itemView);
            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            mTextViewName = (TextView) itemView.findViewById(R.id.tvName);
            mTextVIewEmail = (TextView) itemView.findViewById(R.id.tvEmail);
        }
    }
}
