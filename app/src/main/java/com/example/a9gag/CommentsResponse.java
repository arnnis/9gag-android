// CommentsResponse.java

package com.example.a9gag;

import java.io.IOException;

public class CommentsResponse {
    private String status;
    private String error;
    private Payload payload;

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public String getError() { return error; }
    public void setError(String value) { this.error = value; }

    public Payload getPayload() { return payload; }
    public void setPayload(Payload value) { this.payload = value; }
}

class Payload {
    private String url;
    private String status;
    private boolean lock;
    private long total;
    private String opUserID;
    private CommentsComment[] comments;
    private Object prev;
    private String next;
    private Object parent;
    private long level;

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public boolean getLock() { return lock; }
    public void setLock(boolean value) { this.lock = value; }

    public long getTotal() { return total; }
    public void setTotal(long value) { this.total = value; }

    public String getOpUserID() { return opUserID; }
    public void setOpUserID(String value) { this.opUserID = value; }

    public CommentsComment[] getComments() { return comments; }
    public void setComments(CommentsComment[] value) { this.comments = value; }

    public Object getPrev() { return prev; }
    public void setPrev(Object value) { this.prev = value; }

    public String getNext() { return next; }
    public void setNext(String value) { this.next = value; }

    public Object getParent() { return parent; }
    public void setParent(Object value) { this.parent = value; }

    public long getLevel() { return level; }
    public void setLevel(long value) { this.level = value; }
}

class CommentsComment {
    private String commentID;
    private long level;
    private Media[] media;
    private MentionMapping mentionMapping;
    private Parent parent;
    private String permalink;
    private String text;
    private String threadID;
    private long timestamp;
    private AttachmentType type;
    private long isVoteMasked;
    private String mediaText;
    private User user;
    private long likeCount;
    private long dislikeCount;
    private long isPinned;
    private long childrenTotal;
    private String childrenURL;
    private Attachment[] attachments;
    private long isCollapsed;
    private long isDeleted;
    private long isSensitive;

    public String getCommentID() { return commentID; }
    public void setCommentID(String value) { this.commentID = value; }

    public long getLevel() { return level; }
    public void setLevel(long value) { this.level = value; }

    public Media[] getMedia() { return media; }
    public void setMedia(Media[] value) { this.media = value; }

    public MentionMapping getMentionMapping() { return mentionMapping; }
    public void setMentionMapping(MentionMapping value) { this.mentionMapping = value; }

    public Parent getParent() { return parent; }
    public void setParent(Parent value) { this.parent = value; }

    public String getPermalink() { return permalink; }
    public void setPermalink(String value) { this.permalink = value; }

    public String getText() { return text; }
    public void setText(String value) { this.text = value; }

    public String getThreadID() { return threadID; }
    public void setThreadID(String value) { this.threadID = value; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long value) { this.timestamp = value; }

    public AttachmentType getType() { return type; }
    public void setType(AttachmentType value) { this.type = value; }

    public long getIsVoteMasked() { return isVoteMasked; }
    public void setIsVoteMasked(long value) { this.isVoteMasked = value; }

    public String getMediaText() { return mediaText; }
    public void setMediaText(String value) { this.mediaText = value; }

    public User getUser() { return user; }
    public void setUser(User value) { this.user = value; }

    public long getLikeCount() { return likeCount; }
    public void setLikeCount(long value) { this.likeCount = value; }

    public long getDislikeCount() { return dislikeCount; }
    public void setDislikeCount(long value) { this.dislikeCount = value; }

    public long getIsPinned() { return isPinned; }
    public void setIsPinned(long value) { this.isPinned = value; }

    public long getChildrenTotal() { return childrenTotal; }
    public void setChildrenTotal(long value) { this.childrenTotal = value; }

    public String getChildrenURL() { return childrenURL; }
    public void setChildrenURL(String value) { this.childrenURL = value; }

    public Attachment[] getAttachments() { return attachments; }
    public void setAttachments(Attachment[] value) { this.attachments = value; }

    public long getIsCollapsed() { return isCollapsed; }
    public void setIsCollapsed(long value) { this.isCollapsed = value; }

    public long getIsDeleted() { return isDeleted; }
    public void setIsDeleted(long value) { this.isDeleted = value; }

    public long getIsSensitive() { return isSensitive; }
    public void setIsSensitive(long value) { this.isSensitive = value; }
}

class Attachment {
    private AttachmentType type;
    private CommentData data;

    public AttachmentType getType() { return type; }
    public void setType(AttachmentType value) { this.type = value; }

    public CommentData getData() { return data; }
    public void setData(CommentData value) { this.data = value; }
}

class CommentData {
    private ClassEnum type;
    private CommentImage image;
    private CommentImage imageXLarge;
    private CommentImage animated;
    private CommentImage video;

    public ClassEnum getType() { return type; }
    public void setType(ClassEnum value) { this.type = value; }

    public CommentImage getImage() { return image; }
    public void setImage(CommentImage value) { this.image = value; }

    public CommentImage getImageXLarge() { return imageXLarge; }
    public void setImageXLarge(CommentImage value) { this.imageXLarge = value; }

    public CommentImage getAnimated() { return animated; }
    public void setAnimated(CommentImage value) { this.animated = value; }

    public CommentImage getVideo() { return video; }
    public void setVideo(CommentImage value) { this.video = value; }
}

class CommentImage {
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


enum ClassEnum {
    ANIMATED, ANIMATED_VIDEO, STATIC;

    public String toValue() {
        switch (this) {
            case ANIMATED: return "ANIMATED";
            case ANIMATED_VIDEO: return "ANIMATED_VIDEO";
            case STATIC: return "STATIC";
        }
        return null;
    }

    public static ClassEnum forValue(String value) throws IOException {
        if (value.equals("ANIMATED")) return ANIMATED;
        if (value.equals("ANIMATED_VIDEO")) return ANIMATED_VIDEO;
        if (value.equals("STATIC")) return STATIC;
        throw new IOException("Cannot deserialize ClassEnum");
    }
}


enum AttachmentType {
    USER_MEDIA;

    public String toValue() {
        switch (this) {
            case USER_MEDIA: return "userMedia";
        }
        return null;
    }

    public static AttachmentType forValue(String value) throws IOException {
        if (value.equals("userMedia")) return USER_MEDIA;
        throw new IOException("Cannot deserialize AttachmentType");
    }
}

class Media {
    private CommentData imageMetaByType;
    private SourceMeta sourceMeta;
    private String hash;

    public CommentData getImageMetaByType() { return imageMetaByType; }
    public void setImageMetaByType(CommentData value) { this.imageMetaByType = value; }

    public SourceMeta getSourceMeta() { return sourceMeta; }
    public void setSourceMeta(SourceMeta value) { this.sourceMeta = value; }

    public String getHash() { return hash; }
    public void setHash(String value) { this.hash = value; }
}

class SourceMeta {
    private String accountKey;
    private String key;
    private String type;
    private ClassEnum sourceMetaClass;
    private long size;
    private long width;
    private long height;
    private String hash;
    private Video video;

    public String getAccountKey() { return accountKey; }
    public void setAccountKey(String value) { this.accountKey = value; }

    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public ClassEnum getSourceMetaClass() { return sourceMetaClass; }
    public void setSourceMetaClass(ClassEnum value) { this.sourceMetaClass = value; }

    public long getSize() { return size; }
    public void setSize(long value) { this.size = value; }

    public long getWidth() { return width; }
    public void setWidth(long value) { this.width = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public String getHash() { return hash; }
    public void setHash(String value) { this.hash = value; }

    public Video getVideo() { return video; }
    public void setVideo(Video value) { this.video = value; }
}

 class Video {
    private long hasAudio;
    private long duration;

    public long getHasAudio() { return hasAudio; }
    public void setHasAudio(long value) { this.hasAudio = value; }

    public long getDuration() { return duration; }
    public void setDuration(long value) { this.duration = value; }
}




class MentionMapping {
    private String dummy;

    public String getDummy() { return dummy; }
    public void setDummy(String value) { this.dummy = value; }
}



enum Parent {
    C_162426709624004124;

    public String toValue() {
        switch (this) {
            case C_162426709624004124: return "c_162426709624004124";
        }
        return null;
    }

    public static Parent forValue(String value) throws IOException {
        if (value.equals("c_162426709624004124")) return C_162426709624004124;
        throw new IOException("Cannot deserialize Parent");
    }
}

class User {
    private String userID;
    private String avatarUrl;
    private String displayName;
    private String emojiStatus;
    private String country;
    private String profileURL;
    private ProfileUrls profileUrls;
    private String timestamp;
    private Permissions permissions;
    private boolean isActivePro;
    private boolean isActiveProPlus;
    private boolean isVerifiedAccount;
    private String accountID;
    private long activeTs;
    private Preferences preferences;

    public String getUserID() { return userID; }
    public void setUserID(String value) { this.userID = value; }

    public String getAvatarUrl() { return avatarUrl; }
    public void setAvatarUrl(String value) { this.avatarUrl = value; }

    public String getDisplayName() { return displayName; }
    public void setDisplayName(String value) { this.displayName = value; }

    public String getEmojiStatus() { return emojiStatus; }
    public void setEmojiStatus(String value) { this.emojiStatus = value; }

    public String getCountry() { return country; }
    public void setCountry(String value) { this.country = value; }

    public String getProfileURL() { return profileURL; }
    public void setProfileURL(String value) { this.profileURL = value; }

    public ProfileUrls getProfileUrls() { return profileUrls; }
    public void setProfileUrls(ProfileUrls value) { this.profileUrls = value; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String value) { this.timestamp = value; }

    public Permissions getPermissions() { return permissions; }
    public void setPermissions(Permissions value) { this.permissions = value; }

    public boolean getIsActivePro() { return isActivePro; }
    public void setIsActivePro(boolean value) { this.isActivePro = value; }

    public boolean getIsActiveProPlus() { return isActiveProPlus; }
    public void setIsActiveProPlus(boolean value) { this.isActiveProPlus = value; }

    public boolean getIsVerifiedAccount() { return isVerifiedAccount; }
    public void setIsVerifiedAccount(boolean value) { this.isVerifiedAccount = value; }

    public String getAccountID() { return accountID; }
    public void setAccountID(String value) { this.accountID = value; }

    public long getActiveTs() { return activeTs; }
    public void setActiveTs(long value) { this.activeTs = value; }

    public Preferences getPreferences() { return preferences; }
    public void setPreferences(Preferences value) { this.preferences = value; }
}

class Permissions {
    private Long the9GAGPro;
    private Long the9GAGProPlus;

    public Long getThe9GAGPro() { return the9GAGPro; }
    public void setThe9GAGPro(Long value) { this.the9GAGPro = value; }

    public Long getThe9GAGProPlus() { return the9GAGProPlus; }
    public void setThe9GAGProPlus(Long value) { this.the9GAGProPlus = value; }
}

class Preferences {
    private long hideProBadge;
    private long hideActiveTs;
    private AccentColor accentColor;
    private BackgroundColor backgroundColor;

    public long getHideProBadge() { return hideProBadge; }
    public void setHideProBadge(long value) { this.hideProBadge = value; }

    public long getHideActiveTs() { return hideActiveTs; }
    public void setHideActiveTs(long value) { this.hideActiveTs = value; }

    public AccentColor getAccentColor() { return accentColor; }
    public void setAccentColor(AccentColor value) { this.accentColor = value; }

    public BackgroundColor getBackgroundColor() { return backgroundColor; }
    public void setBackgroundColor(BackgroundColor value) { this.backgroundColor = value; }
}



 enum AccentColor {
    EMPTY, ORANGE;

    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case ORANGE: return "Orange";
        }
        return null;
    }

    public static AccentColor forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("Orange")) return ORANGE;
        throw new IOException("Cannot deserialize AccentColor");
    }
}



enum BackgroundColor {
    EMPTY, GREEN;

    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case GREEN: return "Green";
        }
        return null;
    }

    public static BackgroundColor forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("Green")) return GREEN;
        throw new IOException("Cannot deserialize BackgroundColor");
    }
}

class ProfileUrls {
    private String aDd8F2B7D304A10Edaf6F29517Ea0Ca4100A43D1B;

    public String getADd8F2B7D304A10Edaf6F29517Ea0Ca4100A43D1B() { return aDd8F2B7D304A10Edaf6F29517Ea0Ca4100A43D1B; }
    public void setADd8F2B7D304A10Edaf6F29517Ea0Ca4100A43D1B(String value) { this.aDd8F2B7D304A10Edaf6F29517Ea0Ca4100A43D1B = value; }
}
