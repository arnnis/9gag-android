package com.example.a9gag;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;

public class PostsRecyclerAdapter extends RecyclerView.Adapter<PostsRecyclerAdapter.UserViewHolder> {
    private PostsResponse postsResponse;

    public PostsRecyclerAdapter(PostsResponse postsResponse ) {
        this.postsResponse = postsResponse;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView usernameTxt;
        private ImageView imageView;
//        private VideoView videoView;
        private TextView upvotesTxt;
        private TextView downvotesTxt;
        private TextView commentsTxt;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            this.usernameTxt = itemView.findViewById(R.id.textView2);
            this.imageView = itemView.findViewById(R.id.post_image_view);
//            this.videoView = itemView.findViewById(R.id.videoView);
            this.upvotesTxt = itemView.findViewById(R.id.upvotes);
            this.downvotesTxt = itemView.findViewById(R.id.downvotes);
            this.commentsTxt = itemView.findViewById(R.id.comments);
        }
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_row, parent, false);

        return new UserViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.usernameTxt.setText(postsResponse.getData().getPosts()[position].getTitle());
        holder.upvotesTxt.setText(Long.toString (postsResponse.getData().getPosts()[position].getUpVoteCount()) );
        holder.downvotesTxt.setText(Long.toString (postsResponse.getData().getPosts()[position].getDownVoteCount()));
        holder.commentsTxt.setText(Long.toString (postsResponse.getData().getPosts()[position].getCommentsCount()));

        holder.commentsTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.imageView.getContext(), "Opened post", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), PostActivity.class);
                intent.putExtra("POST_ID", postsResponse.getData().getPosts()[position].getID());
                intent.putExtra("POST_URL", postsResponse.getData().getPosts()[position].getURL());
                v.getContext().startActivity(intent);
            }
        });

        // Post Image
        int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
        int height = (int) postsResponse.getData().getPosts()[position].getImages().getImage460().getHeight();
        holder.imageView.setVisibility(View.VISIBLE);
        holder.imageView.getLayoutParams().height =(screenWidth) / 460 * height;
        holder.imageView.requestLayout();

        Glide
                .with(holder.imageView.getContext())
                .load(postsResponse.getData().getPosts()[position].getImages().getImage460().getURL())
                .transition(DrawableTransitionOptions.withCrossFade()).fitCenter()
                .into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return postsResponse.getData().getPosts().length;
    }


}
