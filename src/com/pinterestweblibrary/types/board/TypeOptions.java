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
public class TypeOptions {
    
    private String username = "";
    private String field_set_key = "";
    private String [] bookmarks = null;
    private String main_module_name = "";
    private String slug = "";
    private String merchant_id = "";
    private String domain_url = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getField_set_key() {
        return field_set_key;
    }

    public void setField_set_key(String field_set_key) {
        this.field_set_key = field_set_key;
    }

    public String[] getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(String[] bookmarks) {
        this.bookmarks = bookmarks;
    }

    public String getMain_module_name() {
        return main_module_name;
    }

    public void setMain_module_name(String main_module_name) {
        this.main_module_name = main_module_name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getDomain_url() {
        return domain_url;
    }

    public void setDomain_url(String domain_url) {
        this.domain_url = domain_url;
    }
}
