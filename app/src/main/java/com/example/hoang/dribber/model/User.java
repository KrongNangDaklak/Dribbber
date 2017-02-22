
package com.example.hoang.dribber.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("buckets_count")
    @Expose
    private int bucketsCount;
    @SerializedName("comments_received_count")
    @Expose
    private int commentsReceivedCount;
    @SerializedName("followers_count")
    @Expose
    private int followersCount;
    @SerializedName("followings_count")
    @Expose
    private int followingsCount;
    @SerializedName("likes_count")
    @Expose
    private int likesCount;
    @SerializedName("likes_received_count")
    @Expose
    private int likesReceivedCount;
    @SerializedName("projects_count")
    @Expose
    private int projectsCount;
    @SerializedName("rebounds_received_count")
    @Expose
    private int reboundsReceivedCount;
    @SerializedName("shots_count")
    @Expose
    private int shotsCount;
    @SerializedName("teams_count")
    @Expose
    private int teamsCount;
    @SerializedName("can_upload_shot")
    @Expose
    private boolean canUploadShot;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("pro")
    @Expose
    private boolean pro;
    @SerializedName("buckets_url")
    @Expose
    private String bucketsUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("likes_url")
    @Expose
    private String likesUrl;
    @SerializedName("projects_url")
    @Expose
    private String projectsUrl;
    @SerializedName("shots_url")
    @Expose
    private String shotsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("members_count")
    @Expose
    private int membersCount;
    @SerializedName("members_url")
    @Expose
    private String membersUrl;
    @SerializedName("team_shots_url")
    @Expose
    private String teamShotsUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param teamsUrl
     * @param shotsCount
     * @param followingsCount
     * @param likesReceivedCount
     * @param bucketsUrl
     * @param location
     * @param type
     * @param id
     * @param htmlUrl
     * @param username
     * @param projectsCount
     * @param createdAt
     * @param avatarUrl
     * @param name
     * @param followingUrl
     * @param teamShotsUrl
     * @param membersUrl
     * @param bucketsCount
     * @param membersCount
     * @param likesCount
     * @param links
     * @param teamsCount
     * @param commentsReceivedCount
     * @param updatedAt
     * @param followersUrl
     * @param bio
     * @param shotsUrl
     * @param reboundsReceivedCount
     * @param pro
     * @param followersCount
     * @param canUploadShot
     * @param projectsUrl
     * @param likesUrl
     */
    public User(int id, String name, String username, String htmlUrl, String avatarUrl, String bio, String location, Links links, int bucketsCount, int commentsReceivedCount, int followersCount, int followingsCount, int likesCount, int likesReceivedCount, int projectsCount, int reboundsReceivedCount, int shotsCount, int teamsCount, boolean canUploadShot, String type, boolean pro, String bucketsUrl, String followersUrl, String followingUrl, String likesUrl, String projectsUrl, String shotsUrl, String teamsUrl, String createdAt, String updatedAt, int membersCount, String membersUrl, String teamShotsUrl) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.htmlUrl = htmlUrl;
        this.avatarUrl = avatarUrl;
        this.bio = bio;
        this.location = location;
        this.links = links;
        this.bucketsCount = bucketsCount;
        this.commentsReceivedCount = commentsReceivedCount;
        this.followersCount = followersCount;
        this.followingsCount = followingsCount;
        this.likesCount = likesCount;
        this.likesReceivedCount = likesReceivedCount;
        this.projectsCount = projectsCount;
        this.reboundsReceivedCount = reboundsReceivedCount;
        this.shotsCount = shotsCount;
        this.teamsCount = teamsCount;
        this.canUploadShot = canUploadShot;
        this.type = type;
        this.pro = pro;
        this.bucketsUrl = bucketsUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.likesUrl = likesUrl;
        this.projectsUrl = projectsUrl;
        this.shotsUrl = shotsUrl;
        this.teamsUrl = teamsUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.membersCount = membersCount;
        this.membersUrl = membersUrl;
        this.teamShotsUrl = teamShotsUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public int getBucketsCount() {
        return bucketsCount;
    }

    public void setBucketsCount(int bucketsCount) {
        this.bucketsCount = bucketsCount;
    }

    public int getCommentsReceivedCount() {
        return commentsReceivedCount;
    }

    public void setCommentsReceivedCount(int commentsReceivedCount) {
        this.commentsReceivedCount = commentsReceivedCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFollowingsCount() {
        return followingsCount;
    }

    public void setFollowingsCount(int followingsCount) {
        this.followingsCount = followingsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getLikesReceivedCount() {
        return likesReceivedCount;
    }

    public void setLikesReceivedCount(int likesReceivedCount) {
        this.likesReceivedCount = likesReceivedCount;
    }

    public int getProjectsCount() {
        return projectsCount;
    }

    public void setProjectsCount(int projectsCount) {
        this.projectsCount = projectsCount;
    }

    public int getReboundsReceivedCount() {
        return reboundsReceivedCount;
    }

    public void setReboundsReceivedCount(int reboundsReceivedCount) {
        this.reboundsReceivedCount = reboundsReceivedCount;
    }

    public int getShotsCount() {
        return shotsCount;
    }

    public void setShotsCount(int shotsCount) {
        this.shotsCount = shotsCount;
    }

    public int getTeamsCount() {
        return teamsCount;
    }

    public void setTeamsCount(int teamsCount) {
        this.teamsCount = teamsCount;
    }

    public boolean isCanUploadShot() {
        return canUploadShot;
    }

    public void setCanUploadShot(boolean canUploadShot) {
        this.canUploadShot = canUploadShot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPro() {
        return pro;
    }

    public void setPro(boolean pro) {
        this.pro = pro;
    }

    public String getBucketsUrl() {
        return bucketsUrl;
    }

    public void setBucketsUrl(String bucketsUrl) {
        this.bucketsUrl = bucketsUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
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

    public String getShotsUrl() {
        return shotsUrl;
    }

    public void setShotsUrl(String shotsUrl) {
        this.shotsUrl = shotsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
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

    public int getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(int membersCount) {
        this.membersCount = membersCount;
    }

    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public String getTeamShotsUrl() {
        return teamShotsUrl;
    }

    public void setTeamShotsUrl(String teamShotsUrl) {
        this.teamShotsUrl = teamShotsUrl;
    }



}
