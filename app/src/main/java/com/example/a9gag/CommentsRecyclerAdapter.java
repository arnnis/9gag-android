package com.example.a9gag;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

public class CommentsRecyclerAdapter extends RecyclerView.Adapter<CommentsRecyclerAdapter.CommentViewHolder> {
    CommentsResponse commentsResponse;

    public CommentsRecyclerAdapter(CommentsResponse commentsResponse) {
        this.commentsResponse = commentsResponse;
    }

    public class CommentViewHolder extends RecyclerView.ViewHolder {
        private TextView commentTxt;
        private TextView usernameTxt;
        private TextView hoursTxt;
        private ImageView avatarImg;
        private ImageView commentImg;

        public CommentViewHolder(@NonNull View itemView) {
            super(itemView);
            this.commentTxt = itemView.findViewById(R.id.comment_text);
            this.usernameTxt = itemView.findViewById(R.id.username);
            this.hoursTxt = itemView.findViewById(R.id.hours);
            this.avatarImg = itemView.findViewById(R.id.avatar_imageview);
            this.commentImg = itemView.findViewById(R.id.comment_imageview);
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
        holder.commentTxt.setText(commentsResponse.getPayload().getComments()[position].getMediaText());
        holder.usernameTxt.setText(commentsResponse.getPayload().getComments()[position].getUser().getUserID());
        holder.hoursTxt.setText(Long.toString(commentsResponse.getPayload().getComments()[position].getTimestamp()));
        Glide
                .with(holder.avatarImg.getContext())
                .load(commentsResponse.getPayload().getComments()[position].getUser().getAvatarUrl())
                .transition(DrawableTransitionOptions.withCrossFade()).fitCenter()
                .transform(new CenterCrop(),new RoundedCorners(360))
                .into(holder.avatarImg);

        // Comment Image
        if (
                commentsResponse.getPayload().getComments()[position].getAttachments() != null
                && commentsResponse.getPayload().getComments()[position].getAttachments().length > 0
                && commentsResponse.getPayload().getComments()[position].getAttachments()[0].getData() != null
        ) {

            int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
            int height = (int) commentsResponse.getPayload().getComments()[position].getAttachments()[0].getData().getImage().getHeight();
            int width = (int) commentsResponse.getPayload().getComments()[position].getAttachments()[0].getData().getImage().getWidth();
            holder.commentImg.setVisibility(View.VISIBLE);
            holder.commentImg.getLayoutParams().height = screenWidth / width * height;
            holder.commentImg.requestLayout();

            Glide
                    .with(holder.commentImg.getContext())
                    .load(commentsResponse.getPayload().getComments()[position].getAttachments()[0].getData().getImage().getURL())
                    .transition(DrawableTransitionOptions.withCrossFade()).fitCenter()
                    .into(holder.commentImg);
        }

    }

    @Override
    public int getItemCount() {
        return commentsResponse.getPayload().getComments().length;
    }
}
