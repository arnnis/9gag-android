package com.example.a9gag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UsersRecyclerAdapter extends RecyclerView.Adapter<UsersRecyclerAdapter.UserViewHolder> {
    private ArrayList<User> usersList;

    public UsersRecyclerAdapter(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView usernameTxt;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            this.usernameTxt = itemView.findViewById(R.id.textView2);
        }
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item, parent, false);

        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        String username = usersList.get(position).getUsername();
        holder.usernameTxt.setText(username);
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
