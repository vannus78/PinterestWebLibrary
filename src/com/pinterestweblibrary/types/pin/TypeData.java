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
package com.pinterestweblibrary.types.pin;

/**
 *
 * @author Stefano Vannucci
 */
public class TypeData {
    
    private String domain = "";
    private TypePlaceSummary place_summary = null;
    private String image_signature = "";
    private long like_count = 0;
    private TypeImages images = new TypeImages();
    private String id = "";
    private String price_currency = "";
    private String description_html = "";
    private String privacy = "";
    private String buyable_product = "";
    private TypeComments comments = new TypeComments();
    private String [] access = null;
    private long comment_count = 0;
    private TypeBoard board = new TypeBoard();
    private String type = "";
    private String method = "";
    private TypeAttribution attribution = new TypeAttribution();
    private String description = "";
    private double price_value = 0.0;
    private boolean is_playable = false;
    private String link = "";
    private String [] view_tags = null;
    private boolean is_repin = false;
    private boolean liked_by_me = false;
    private String [] additional_hide_reasons = null;
    private boolean is_uploaded = false;
    private TypePinner pinner = new TypePinner();
    private long repin_count = 0;
    private String created_at = "";
    private String title = "";
    private String promoter = "";
    private String dominant_color = "";
    private TypeEmbed embed = null;
    private TypeRichSummary rich_summary = new TypeRichSummary();
    private boolean is_video = false;
    private boolean is_downstream_promotion = false;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public TypePlaceSummary getPlace_summary() {
        return place_summary;
    }

    public void setPlace_summary(TypePlaceSummary place_summary) {
        this.place_summary = place_summary;
    }

    public String getImage_signature() {
        return image_signature;
    }

    public void setImage_signature(String image_signature) {
        this.image_signature = image_signature;
    }

    public long getLike_count() {
        return like_count;
    }

    public void setLike_count(long like_count) {
        this.like_count = like_count;
    }

    public TypeImages getImages() {
        return images;
    }

    public void setImages(TypeImages images) {
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice_currency() {
        return price_currency;
    }

    public void setPrice_currency(String price_currency) {
        this.price_currency = price_currency;
    }

    public String getDescription_html() {
        return description_html;
    }

    public void setDescription_html(String description_html) {
        this.description_html = description_html;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getBuyable_product() {
        return buyable_product;
    }

    public void setBuyable_product(String buyable_product) {
        this.buyable_product = buyable_product;
    }

    public TypeComments getComments() {
        return comments;
    }

    public void setComments(TypeComments comments) {
        this.comments = comments;
    }

    public String[] getAccess() {
        return access;
    }

    public void setAccess(String[] access) {
        this.access = access;
    }
    
    public long getComment_count() {
        return comment_count;
    }

    public void setComment_count(long comment_count) {
        this.comment_count = comment_count;
    }

    public TypeBoard getBoard() {
        return board;
    }

    public void setBoard(TypeBoard board) {
        this.board = board;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public TypeAttribution getAttribution() {
        return attribution;
    }

    public void setAttribution(TypeAttribution attribution) {
        this.attribution = attribution;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice_value() {
        return price_value;
    }

    public void setPrice_value(double price_value) {
        this.price_value = price_value;
    }

    public boolean isIs_playable() {
        return is_playable;
    }

    public void setIs_playable(boolean is_playable) {
        this.is_playable = is_playable;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String[] getView_tags() {
        return view_tags;
    }

    public void setView_tags(String[] view_tags) {
        this.view_tags = view_tags;
    }

    public boolean isIs_repin() {
        return is_repin;
    }

    public void setIs_repin(boolean is_repin) {
        this.is_repin = is_repin;
    }

    public boolean isLiked_by_me() {
        return liked_by_me;
    }

    public void setLiked_by_me(boolean liked_by_me) {
        this.liked_by_me = liked_by_me;
    }

    public String[] getAdditional_hide_reasons() {
        return additional_hide_reasons;
    }

    public void setAdditional_hide_reasons(String[] additional_hide_reasons) {
        this.additional_hide_reasons = additional_hide_reasons;
    }

    public boolean isIs_uploaded() {
        return is_uploaded;
    }

    public void setIs_uploaded(boolean is_uploaded) {
        this.is_uploaded = is_uploaded;
    }

    public TypePinner getPinner() {
        return pinner;
    }

    public void setPinner(TypePinner pinner) {
        this.pinner = pinner;
    }

    public long getRepin_count() {
        return repin_count;
    }

    public void setRepin_count(long repin_count) {
        this.repin_count = repin_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    public String getDominant_color() {
        return dominant_color;
    }

    public void setDominant_color(String dominant_color) {
        this.dominant_color = dominant_color;
    }

    public TypeEmbed getEmbed() {
        return embed;
    }

    public void setEmbed(TypeEmbed embed) {
        this.embed = embed;
    }

    public TypeRichSummary getRich_summary() {
        return rich_summary;
    }

    public void setRich_summary(TypeRichSummary rich_summary) {
        this.rich_summary = rich_summary;
    }

    public boolean isIs_video() {
        return is_video;
    }

    public void setIs_video(boolean is_video) {
        this.is_video = is_video;
    }

    public boolean isIs_downstream_promotion() {
        return is_downstream_promotion;
    }

    public void setIs_downstream_promotion(boolean is_downstream_promotion) {
        this.is_downstream_promotion = is_downstream_promotion;
    }
}
