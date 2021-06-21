// PostsResponse.java

package com.example.a9gag;

public class PostsResponse {
    private Meta meta;
    private Data data;

    public Meta getMeta() { return meta; }
    public void setMeta(Meta value) { this.meta = value; }

    public Data getData() { return data; }
    public void setData(Data value) { this.data = value; }
}

class Data {
    private String dummyField;
    private long didEndOfList;
    private Post[] posts;
    private TargetedAdTags targetedAdTags;
    private FeaturedAd[] featuredAds;
    private long updateCount;

    public String getDummyField() { return dummyField; }
    public void setDummyField(String value) { this.dummyField = value; }

    public long getDidEndOfList() { return didEndOfList; }
    public void setDidEndOfList(long value) { this.didEndOfList = value; }

    public Post[] getPosts() { return posts; }
    public void setPosts(Post[] value) { this.posts = value; }

    public TargetedAdTags getTargetedAdTags() { return targetedAdTags; }
    public void setTargetedAdTags(TargetedAdTags value) { this.targetedAdTags = value; }

    public FeaturedAd[] getFeaturedAds() { return featuredAds; }
    public void setFeaturedAds(FeaturedAd[] value) { this.featuredAds = value; }

    public long getUpdateCount() { return updateCount; }
    public void setUpdateCount(long value) { this.updateCount = value; }
}

class FeaturedAd {
    private long width;
    private long height;
    private String render;
    private String url;
    private long position;

    public long getWidth() { return width; }
    public void setWidth(long value) { this.width = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public String getRender() { return render; }
    public void setRender(String value) { this.render = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public long getPosition() { return position; }
    public void setPosition(long value) { this.position = value; }
}

class Post {
    private String id;
    private String url;
    private String status;
    private String title;
    private String description;
    private String type;
    private long version;
    private long nsfw;
    private long upVoteCount;
    private long downVoteCount;
    private long totalVoteCount;
    private long viewsCount;
    private long score;
    private long reportedStatus;
    private long creationTs;
    private String albumWebURL;
    private long hasImageTile;
    private PostTile postTile;
    private long promoted;
    private long isVoteMasked;
    private long sortTs;
    private long orderID;
    private long hasLongPostCover;
    private Images images;
    private Colors colors;
    private String sourceDomain;
    private String sourceURL;
    private String externalURL;
    private String channel;
    private String isVoted;
    private long userScore;
    private Creator creator;
    private long commentsCount;
    private long fbShares;
    private long tweetCount;
    private String created;
    private Comment comment;
    private String commentOpClientID;
    private String commentOpSignature;
    private String commentSystem;
    private TopComments topComments;
    private TargetedAdTags targetedAdTags;
    private PostSection postSection;
    private Tag[] tags;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public long getVersion() { return version; }
    public void setVersion(long value) { this.version = value; }

    public long getNsfw() { return nsfw; }
    public void setNsfw(long value) { this.nsfw = value; }

    public long getUpVoteCount() { return upVoteCount; }
    public void setUpVoteCount(long value) { this.upVoteCount = value; }

    public long getDownVoteCount() { return downVoteCount; }
    public void setDownVoteCount(long value) { this.downVoteCount = value; }

    public long getTotalVoteCount() { return totalVoteCount; }
    public void setTotalVoteCount(long value) { this.totalVoteCount = value; }

    public long getViewsCount() { return viewsCount; }
    public void setViewsCount(long value) { this.viewsCount = value; }

    public long getScore() { return score; }
    public void setScore(long value) { this.score = value; }

    public long getReportedStatus() { return reportedStatus; }
    public void setReportedStatus(long value) { this.reportedStatus = value; }

    public long getCreationTs() { return creationTs; }
    public void setCreationTs(long value) { this.creationTs = value; }

    public String getAlbumWebURL() { return albumWebURL; }
    public void setAlbumWebURL(String value) { this.albumWebURL = value; }

    public long getHasImageTile() { return hasImageTile; }
    public void setHasImageTile(long value) { this.hasImageTile = value; }

    public PostTile getPostTile() { return postTile; }
    public void setPostTile(PostTile value) { this.postTile = value; }

    public long getPromoted() { return promoted; }
    public void setPromoted(long value) { this.promoted = value; }

    public long getIsVoteMasked() { return isVoteMasked; }
    public void setIsVoteMasked(long value) { this.isVoteMasked = value; }

    public long getSortTs() { return sortTs; }
    public void setSortTs(long value) { this.sortTs = value; }

    public long getOrderID() { return orderID; }
    public void setOrderID(long value) { this.orderID = value; }

    public long getHasLongPostCover() { return hasLongPostCover; }
    public void setHasLongPostCover(long value) { this.hasLongPostCover = value; }

    public Images getImages() { return images; }
    public void setImages(Images value) { this.images = value; }

    public Colors getColors() { return colors; }
    public void setColors(Colors value) { this.colors = value; }

    public String getSourceDomain() { return sourceDomain; }
    public void setSourceDomain(String value) { this.sourceDomain = value; }

    public String getSourceURL() { return sourceURL; }
    public void setSourceURL(String value) { this.sourceURL = value; }

    public String getExternalURL() { return externalURL; }
    public void setExternalURL(String value) { this.externalURL = value; }

    public String getChannel() { return channel; }
    public void setChannel(String value) { this.channel = value; }

    public String getIsVoted() { return isVoted; }
    public void setIsVoted(String value) { this.isVoted = value; }

    public long getUserScore() { return userScore; }
    public void setUserScore(long value) { this.userScore = value; }

    public Creator getCreator() { return creator; }
    public void setCreator(Creator value) { this.creator = value; }

    public long getCommentsCount() { return commentsCount; }
    public void setCommentsCount(long value) { this.commentsCount = value; }

    public long getFbShares() { return fbShares; }
    public void setFbShares(long value) { this.fbShares = value; }

    public long getTweetCount() { return tweetCount; }
    public void setTweetCount(long value) { this.tweetCount = value; }

    public String getCreated() { return created; }
    public void setCreated(String value) { this.created = value; }

    public Comment getComment() { return comment; }
    public void setComment(Comment value) { this.comment = value; }

    public String getCommentOpClientID() { return commentOpClientID; }
    public void setCommentOpClientID(String value) { this.commentOpClientID = value; }

    public String getCommentOpSignature() { return commentOpSignature; }
    public void setCommentOpSignature(String value) { this.commentOpSignature = value; }

    public String getCommentSystem() { return commentSystem; }
    public void setCommentSystem(String value) { this.commentSystem = value; }

    public TopComments getTopComments() { return topComments; }
    public void setTopComments(TopComments value) { this.topComments = value; }

    public TargetedAdTags getTargetedAdTags() { return targetedAdTags; }
    public void setTargetedAdTags(TargetedAdTags value) { this.targetedAdTags = value; }

    public PostSection getPostSection() { return postSection; }
    public void setPostSection(PostSection value) { this.postSection = value; }

    public Tag[] getTags() { return tags; }
    public void setTags(Tag[] value) { this.tags = value; }
}

class Colors {
    private String placeholder;

    public String getPlaceholder() { return placeholder; }
    public void setPlaceholder(String value) { this.placeholder = value; }
}

class Comment {
    private String listType;
    private long updateTs;
    private String latestCommentText;

    public String getListType() { return listType; }
    public void setListType(String value) { this.listType = value; }

    public long getUpdateTs() { return updateTs; }
    public void setUpdateTs(long value) { this.updateTs = value; }

    public String getLatestCommentText() { return latestCommentText; }
    public void setLatestCommentText(String value) { this.latestCommentText = value; }
}

class Creator {
    private String userID;
    private String userName;
    private String profileURL;
    private String avatarURLSmall;

    public String getUserID() { return userID; }
    public void setUserID(String value) { this.userID = value; }

    public String getUserName() { return userName; }
    public void setUserName(String value) { this.userName = value; }

    public String getProfileURL() { return profileURL; }
    public void setProfileURL(String value) { this.profileURL = value; }

    public String getAvatarURLSmall() { return avatarURLSmall; }
    public void setAvatarURLSmall(String value) { this.avatarURLSmall = value; }
}

class Images {
    private Image image700;
    private Image image460;
    private Image imageFbThumbnail;
    private Image image700Ba;
    private Image image460Sa;
    private Image460Sv image460sv;

    public Image getImage700() { return image700; }
    public void setImage700(Image value) { this.image700 = value; }

    public Image getImage460() { return image460; }
    public void setImage460(Image value) { this.image460 = value; }

    public Image getImageFbThumbnail() { return imageFbThumbnail; }
    public void setImageFbThumbnail(Image value) { this.imageFbThumbnail = value; }

    public Image getImage700Ba() { return image700Ba; }
    public void setImage700Ba(Image value) { this.image700Ba = value; }

    public Image getImage460Sa() { return image460Sa; }
    public void setImage460Sa(Image value) { this.image460Sa = value; }

    public Image460Sv getImage460sv() { return image460sv; }
    public void setImage460sv(Image460Sv value) { this.image460sv = value; }
}

class Image {
    private long width;
    private long height;
    private String url;
    private String webpURL;

    public long getWidth() { return width; }
    public void setWidth(long value) { this.width = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getWebpURL() { return webpURL; }
    public void setWebpURL(String value) { this.webpURL = value; }
}

class Image460Sv {
    private long width;
    private long height;
    private String url;
    private long hasAudio;
    private long duration;
    private String vp8URL;
    private String h265URL;
    private String vp9URL;
    private String av1URL;

    public long getWidth() { return width; }
    public void setWidth(long value) { this.width = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public long getHasAudio() { return hasAudio; }
    public void setHasAudio(long value) { this.hasAudio = value; }

    public long getDuration() { return duration; }
    public void setDuration(long value) { this.duration = value; }

    public String getVp8URL() { return vp8URL; }
    public void setVp8URL(String value) { this.vp8URL = value; }

    public String getH265URL() { return h265URL; }
    public void setH265URL(String value) { this.h265URL = value; }

    public String getVp9URL() { return vp9URL; }
    public void setVp9URL(String value) { this.vp9URL = value; }

    public String getAv1URL() { return av1URL; }
    public void setAv1URL(String value) { this.av1URL = value; }
}

class PostSection {
    private String name;
    private String url;
    private String imageURL;
    private String webpURL;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getImageURL() { return imageURL; }
    public void setImageURL(String value) { this.imageURL = value; }

    public String getWebpURL() { return webpURL; }
    public void setWebpURL(String value) { this.webpURL = value; }
}

class PostTile {
    private H800 h800;

    public H800 getH800() { return h800; }
    public void setH800(H800 value) { this.h800 = value; }
}

class H800 {
    private long width;
    private long height;
    private Image[] images;

    public long getWidth() { return width; }
    public void setWidth(long value) { this.width = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public Image[] getImages() { return images; }
    public void setImages(Image[] value) { this.images = value; }
}

class Tag {
    private String key;
    private String url;

    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}



class TargetedAdTags {
}

class TopComments {
    private Object[] comments;

    public Object[] getComments() { return comments; }
    public void setComments(Object[] value) { this.comments = value; }
}

 class Meta {
    private long timestamp;
    private String status;
    private String sid;

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long value) { this.timestamp = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public String getSid() { return sid; }
    public void setSid(String value) { this.sid = value; }
}
