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
public class TypeBoard {
    
    private boolean is_collaborative = false;
    private String layout = "";
    private String name = "";
    private String privacy = "";
    private String url = "";
    private TypeOwner owner = new TypeOwner();
    private boolean followed_by_me = false;
    private String type = "";
    private long id = 0;
    private String image_thumbnail_url = "";

    public boolean is_collaborative() {
        return is_collaborative;
    }

    public void setCollaborative(boolean is_collaborative) {
        this.is_collaborative = is_collaborative;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TypeOwner getOwner() {
        return owner;
    }

    public void setOwner(TypeOwner owner) {
        this.owner = owner;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage_thumbnail_url() {
        return image_thumbnail_url;
    }

    public void setImage_thumbnail_url(String image_thumbnail_url) {
        this.image_thumbnail_url = image_thumbnail_url;
    }   
}
