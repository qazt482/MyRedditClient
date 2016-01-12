package com.ssl.myredditclient;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LinkAdapter extends RecyclerView.Adapter<LinkAdapter.LinkViewHolder> {

    private final List<LinkViewModel> links;

    public LinkAdapter(List<LinkViewModel> links) {
        this.links = links;
    }

    @Override
    public LinkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.link_layout, parent, false);
        return new LinkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LinkViewHolder holder, int position) {
        LinkViewModel link = links.get(position);
        holder.title.setText(link.getTitleText());
        holder.submitted.setText(link.getSubmittedText());
        holder.commentsCount.setText(link.getCommentText());
    }

    @Override
    public int getItemCount() {
        return links.size();
    }

    public static class LinkViewHolder extends RecyclerView.ViewHolder {

        protected TextView title;
        protected TextView submitted;
        protected TextView commentsCount;

        public LinkViewHolder(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.textLinkTitle);
            submitted = (TextView) v.findViewById(R.id.textLinkSubmitted);
            commentsCount = (TextView) v.findViewById(R.id.textComments);
        }
    }
}
