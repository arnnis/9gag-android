package com.example.a9gag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CommentsRecyclerAdapter extends RecyclerView.Adapter<CommentsRecyclerAdapter.CommentViewHolder> {
    CommentsResponse commentsResponse;

    public CommentsRecyclerAdapter(CommentsResponse commentsResponse) {
        this.commentsResponse = commentsResponse;
    }

    public class CommentViewHolder extends RecyclerView.ViewHolder {
        private TextView commentTxt;
        public CommentViewHolder(@NonNull View itemView) {
            super(itemView);
            this.commentTxt = itemView.findViewById(R.id.comment_text);
        }
    }

    @NonNull
    @Override
    public CommentsRecyclerAdapter.CommentViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_row, parent, false);
        return new CommentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsRecyclerAdapter.CommentViewHolder holder, int position) {
        holder.commentTxt.setText(commentsResponse.getPayload().getComments()[position].getMediaText().toString());
    }

    @Override
    public int getItemCount() {
        return commentsResponse.getPayload().getComments().length;
    }
}
