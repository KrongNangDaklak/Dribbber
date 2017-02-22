
package com.example.hoang.dribber.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shot {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("views_count")
    @Expose
    private int viewsCount;
    @SerializedName("likes_count")
    @Expose
    private int likesCount;
    @SerializedName("comments_count")
    @Expose
    private int commentsCount;
    @SerializedName("attachments_count")
    @Expose
    private int attachmentsCount;
    @SerializedName("rebounds_count")
    @Expose
    private int reboundsCount;
    @SerializedName("buckets_count")
    @Expose
    private int bucketsCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("attachments_url")
    @Expose
    private String attachmentsUrl;
    @SerializedName("buckets_url")
    @Expose
    private String bucketsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("likes_url")
    @Expose
    private String likesUrl;
    @SerializedName("projects_url")
    @Expose
    private String projectsUrl;
    @SerializedName("rebounds_url")
    @Expose
    private String reboundsUrl;
    @SerializedName("rebound_source_url")
    @Expose
    private String reboundSourceUrl;
    @SerializedName("animated")
    @Expose
    private boolean animated;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("team")
    @Expose
    private Object team;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shot() {
    }

    /**
     * 
     * @param tags
     * @param animated
     * @param bucketsCount
     * @param bucketsUrl
     * @param attachmentsUrl
     * @param width
     * @param likesCount
     * @param reboundsCount
     * @param attachmentsCount
     * @param commentsCount
     * @param team
     * @param updatedAt
     * @param id
     * @param htmlUrl
     * @param title
     * @param height
     * @param commentsUrl
     * @param createdAt
     * @param description
     * @param reboundSourceUrl
     * @param images
     * @param projectsUrl
     * @param likesUrl
     * @param viewsCount
     * @param user
     * @param reboundsUrl
     */
    public Shot(int id, String title, String description, int width, int height, Images images, int viewsCount, int likesCount, int commentsCount, int attachmentsCount, int reboundsCount, int bucketsCount, String createdAt, String updatedAt, String htmlUrl, String attachmentsUrl, String bucketsUrl, String commentsUrl, String likesUrl, String projectsUrl, String reboundsUrl, String reboundSourceUrl, boolean animated, List<String> tags, User user, Object team) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.width = width;
        this.height = height;
        this.images = images;
        this.viewsCount = viewsCount;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.attachmentsCount = attachmentsCount;
        this.reboundsCount = reboundsCount;
        this.bucketsCount = bucketsCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.htmlUrl = htmlUrl;
        this.attachmentsUrl = attachmentsUrl;
        this.bucketsUrl = bucketsUrl;
        this.commentsUrl = commentsUrl;
        this.likesUrl = likesUrl;
        this.projectsUrl = projectsUrl;
        this.reboundsUrl = reboundsUrl;
        this.reboundSourceUrl = reboundSourceUrl;
        this.animated = animated;
        this.tags = tags;
        this.user = user;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public int getAttachmentsCount() {
        return attachmentsCount;
    }

    public void setAttachmentsCount(int attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }

    public int getReboundsCount() {
        return reboundsCount;
    }

    public void setReboundsCount(int reboundsCount) {
        this.reboundsCount = reboundsCount;
    }

    public int getBucketsCount() {
        return bucketsCount;
    }

    public void setBucketsCount(int bucketsCount) {
        this.bucketsCount = bucketsCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getAttachmentsUrl() {
        return attachmentsUrl;
    }

    public void setAttachmentsUrl(String attachmentsUrl) {
        this.attachmentsUrl = attachmentsUrl;
    }

    public String getBucketsUrl() {
        return bucketsUrl;
    }

    public void setBucketsUrl(String bucketsUrl) {
        this.bucketsUrl = bucketsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getLikesUrl() {
        return likesUrl;
    }

    public void setLikesUrl(String likesUrl) {
        this.likesUrl = likesUrl;
    }

    public String getProjectsUrl() {
        return projectsUrl;
    }

    public void setProjectsUrl(String projectsUrl) {
        this.projectsUrl = projectsUrl;
    }

    public String getReboundsUrl() {
        return reboundsUrl;
    }

    public void setReboundsUrl(String reboundsUrl) {
        this.reboundsUrl = reboundsUrl;
    }

    public String getReboundSourceUrl() {
        return reboundSourceUrl;
    }

    public void setReboundSourceUrl(String reboundSourceUrl) {
        this.reboundSourceUrl = reboundSourceUrl;
    }

    public boolean isAnimated() {
        return animated;
    }

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getTeam() {
        return team;
    }

    public void setTeam(Object team) {
        this.team = team;
    }


}
