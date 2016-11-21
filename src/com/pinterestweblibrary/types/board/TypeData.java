/*
 * The MIT License
 *
 * Copyright 2016 Stefano Vannucci.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pinterestweblibrary.types.board;

/**
 *
 * @author Stefano Vannucci
 */
public class TypeData {

    private TypeOwner owner = new TypeOwner();
    private TypeCoverImages cover_images = new TypeCoverImages();    
    private String image_cover_url = "";
    private String rel_board_to_klp_canonical_url = "";
    private String id = "";
    private String category = "";
    private String layout = "";
    private String privacy = "";
    private String [] access = null;
    private String [] pin_thumbnail_urls = null;
    private long follower_count = 0;
    private boolean followed_by_me = false;
    private String type = "";
    private boolean is_collaborative = false;
    private String map_id = "";
    private String description = "";
    private long collaborator_count = 0;
    private boolean collaborated_by_me = false;
    private long pin_count = 0;
    private String name = "";
    private String url = "";
    private String rel_board_to_best_board_canonical_url_grp = "";
    private String rel_board_to_best_board_canonical_url = "";
    private String rel_board_to_klp_canonical_url_grp = "";
    private String created_at = "";
    private String board_order_modified_at = "";

    public String getImage_cover_url() {
        return image_cover_url;
    }

    public void setImage_cover_url(String image_cover_url) {
        this.image_cover_url = image_cover_url;
    }

    public String getRel_board_to_klp_canonical_url() {
        return rel_board_to_klp_canonical_url;
    }

    public void setRel_board_to_klp_canonical_url(String rel_board_to_klp_canonical_url) {
        this.rel_board_to_klp_canonical_url = rel_board_to_klp_canonical_url;
    }

    public TypeOwner getOwner() {
        return owner;
    }

    public void setOwner(TypeOwner owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String[] getAccess() {
        return access;
    }

    public void setAccess(String[] access) {
        this.access = access;
    }

    public long getFollower_count() {
        return follower_count;
    }

    public void setFollower_count(long follower_count) {
        this.follower_count = follower_count;
    }

    public boolean isFollowed_by_me() {
        return followed_by_me;
    }

    public void setFollowed_by_me(boolean followed_by_me) {
        this.followed_by_me = followed_by_me;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIs_collaborative() {
        return is_collaborative;
    }

    public void setIs_collaborative(boolean is_collaborative) {
        this.is_collaborative = is_collaborative;
    }

    public String getMap_id() {
        return map_id;
    }

    public void setMap_id(String map_id) {
        this.map_id = map_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCollaborator_count() {
        return collaborator_count;
    }

    public void setCollaborator_count(long collaborator_count) {
        this.collaborator_count = collaborator_count;
    }

    public boolean isCollaborated_by_me() {
        return collaborated_by_me;
    }

    public void setCollaborated_by_me(boolean collaborated_by_me) {
        this.collaborated_by_me = collaborated_by_me;
    }

    public long getPin_count() {
        return pin_count;
    }

    public void setPin_count(long pin_count) {
        this.pin_count = pin_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRel_board_to_best_board_canonical_url_grp() {
        return rel_board_to_best_board_canonical_url_grp;
    }

    public void setRel_board_to_best_board_canonical_url_grp(String rel_board_to_best_board_canonical_url_grp) {
        this.rel_board_to_best_board_canonical_url_grp = rel_board_to_best_board_canonical_url_grp;
    }

    public String getRel_board_to_best_board_canonical_url() {
        return rel_board_to_best_board_canonical_url;
    }

    public void setRel_board_to_best_board_canonical_url(String rel_board_to_best_board_canonical_url) {
        this.rel_board_to_best_board_canonical_url = rel_board_to_best_board_canonical_url;
    }

    public String getRel_board_to_klp_canonical_url_grp() {
        return rel_board_to_klp_canonical_url_grp;
    }

    public void setRel_board_to_klp_canonical_url_grp(String rel_board_to_klp_canonical_url_grp) {
        this.rel_board_to_klp_canonical_url_grp = rel_board_to_klp_canonical_url_grp;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getBoard_order_modified_at() {
        return board_order_modified_at;
    }

    public void setBoard_order_modified_at(String board_order_modified_at) {
        this.board_order_modified_at = board_order_modified_at;
    }

    public TypeCoverImages getCover_images() {
        return cover_images;
    }

    public void setCover_images(TypeCoverImages cover_images) {
        this.cover_images = cover_images;
    }

    public String[] getPin_thumbnail_urls() {
        return pin_thumbnail_urls;
    }

    public void setPin_thumbnail_urls(String[] pin_thumbnail_urls) {
        this.pin_thumbnail_urls = pin_thumbnail_urls;
    }   
}
