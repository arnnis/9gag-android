package com.example.a9gag;

import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class PostsRecyclerAdapter extends RecyclerView.Adapter<PostsRecyclerAdapter.UserViewHolder> {
    private PostsResponse postsResponse;

    public PostsRecyclerAdapter(PostsResponse postsResponse ) {
        this.postsResponse = postsResponse;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView usernameTxt;
        private ImageView imageView;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            this.usernameTxt = itemView.findViewById(R.id.textView2);
            this.imageView = itemView.findViewById(R.id.post_image_view);
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

        int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
        int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

//        DisplayMetrics displayMetrics = holder.imageView.getContext().getResources().getDisplayMetrics();
        int height = (int) postsResponse.getData().getPosts()[position].getImages().getImage460().getHeight();



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
