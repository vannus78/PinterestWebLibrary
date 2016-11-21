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
package com.pinterestweblibrary.types.commons;

/**
 *
 * @author Stefano Vannucci
 */
public class TypeClientContext {
    private String unauth_id = "";
    private String origin = "";
    private String browser_locale = "";
    private String user_agent_platform = "";
    private String sterling_admin_mode_view_as = "";
    private boolean is_authenticated = false;
    private boolean allow_image_prioritization = false;
    private String deep_link_action = "";
    private boolean is_tablet_agent = false;
    private String visible_url = "";
    private transient String triggerable_experiments = "";
    private String utm_campaign = "";
    private int browser_type = 0;
    private String deep_link = "";
    private int site_type = 0;
    private String from_open_in_app_click = "";
    private String invite_code = "";
    private boolean use_react = false;
    private String locale = "";
    private String utm_medium = "";
    private boolean giftwrap_holdout = false;
    private String app_version = "";
    private TypeSiteConst site_const = new TypeSiteConst();
    private String real_ip = "";
    private boolean user_agent_is_ios_9_2_or_above = false;
    private transient String active_experiments = "";
    private boolean is_retina = false;
    private TypeUser user = new TypeUser();
    private String deep_link_default = "";
    private String http_referrer = "";
    private boolean is_sterling_on_steroids_v2 = false;
    private boolean is_mobile_agent = false;
    private boolean is_internal_ip = false;
    private String language = "";
    private boolean is_sterling_on_steroids = false;
    private String referrer = "";
    private boolean user_agent_can_use_native_app = false;
    private String sterling_on_steroids_ldap = "";
    private String browser_name = "";
    private String browser_country = "";
    private String country = "";
    private String error_template_path = "";
    private transient String app_interstitial_data = "";
    private transient String seo_experiments = "";

    public String getUnauth_id() {
        return unauth_id;
    }

    public void setUnauth_id(String unauth_id) {
        this.unauth_id = unauth_id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBrowser_locale() {
        return browser_locale;
    }

    public void setBrowser_locale(String browser_locale) {
        this.browser_locale = browser_locale;
    }

    public String getUser_agent_platform() {
        return user_agent_platform;
    }

    public void setUser_agent_platform(String user_agent_platform) {
        this.user_agent_platform = user_agent_platform;
    }

    public String getSterling_admin_mode_view_as() {
        return sterling_admin_mode_view_as;
    }

    public void setSterling_admin_mode_view_as(String sterling_admin_mode_view_as) {
        this.sterling_admin_mode_view_as = sterling_admin_mode_view_as;
    }

    public boolean isIs_authenticated() {
        return is_authenticated;
    }

    public void setIs_authenticated(boolean is_authenticated) {
        this.is_authenticated = is_authenticated;
    }

    public boolean isAllow_image_prioritization() {
        return allow_image_prioritization;
    }

    public void setAllow_image_prioritization(boolean allow_image_prioritization) {
        this.allow_image_prioritization = allow_image_prioritization;
    }

    public String getDeep_link_action() {
        return deep_link_action;
    }

    public void setDeep_link_action(String deep_link_action) {
        this.deep_link_action = deep_link_action;
    }

    public boolean isIs_tablet_agent() {
        return is_tablet_agent;
    }

    public void setIs_tablet_agent(boolean is_tablet_agent) {
        this.is_tablet_agent = is_tablet_agent;
    }

    public String getVisible_url() {
        return visible_url;
    }

    public void setVisible_url(String visible_url) {
        this.visible_url = visible_url;
    }

    public String getTriggerable_experiments() {
        return triggerable_experiments;
    }

    public void setTriggerable_experiments(String triggerable_experiments) {
        this.triggerable_experiments = triggerable_experiments;
    }

    public String getUtm_campaign() {
        return utm_campaign;
    }

    public void setUtm_campaign(String utm_campaign) {
        this.utm_campaign = utm_campaign;
    }

    public int getBrowser_type() {
        return browser_type;
    }

    public void setBrowser_type(int browser_type) {
        this.browser_type = browser_type;
    }

    public String getDeep_link() {
        return deep_link;
    }

    public void setDeep_link(String deep_link) {
        this.deep_link = deep_link;
    }

    public int getSite_type() {
        return site_type;
    }

    public void setSite_type(int site_type) {
        this.site_type = site_type;
    }

    public String getFrom_open_in_app_click() {
        return from_open_in_app_click;
    }

    public void setFrom_open_in_app_click(String from_open_in_app_click) {
        this.from_open_in_app_click = from_open_in_app_click;
    }

    public String getInvite_code() {
        return invite_code;
    }

    public void setInvite_code(String invite_code) {
        this.invite_code = invite_code;
    }

    public boolean isUse_react() {
        return use_react;
    }

    public void setUse_react(boolean use_react) {
        this.use_react = use_react;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getUtm_medium() {
        return utm_medium;
    }

    public void setUtm_medium(String utm_medium) {
        this.utm_medium = utm_medium;
    }

    public boolean isGiftwrap_holdout() {
        return giftwrap_holdout;
    }

    public void setGiftwrap_holdout(boolean giftwrap_holdout) {
        this.giftwrap_holdout = giftwrap_holdout;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public TypeSiteConst getSite_const() {
        return site_const;
    }

    public void setSite_const(TypeSiteConst site_const) {
        this.site_const = site_const;
    }

    public String getReal_ip() {
        return real_ip;
    }

    public void setReal_ip(String real_ip) {
        this.real_ip = real_ip;
    }

    public boolean isUser_agent_is_ios_9_2_or_above() {
        return user_agent_is_ios_9_2_or_above;
    }

    public void setUser_agent_is_ios_9_2_or_above(boolean user_agent_is_ios_9_2_or_above) {
        this.user_agent_is_ios_9_2_or_above = user_agent_is_ios_9_2_or_above;
    }

    public String getActive_experiments() {
        return active_experiments;
    }

    public void setActive_experiments(String active_experiments) {
        this.active_experiments = active_experiments;
    }

    public boolean isIs_retina() {
        return is_retina;
    }

    public void setIs_retina(boolean is_retina) {
        this.is_retina = is_retina;
    }

    public TypeUser getUser() {
        return user;
    }

    public void setUser(TypeUser user) {
        this.user = user;
    }

    public String getDeep_link_default() {
        return deep_link_default;
    }

    public void setDeep_link_default(String deep_link_default) {
        this.deep_link_default = deep_link_default;
    }

    public String getHttp_referrer() {
        return http_referrer;
    }

    public void setHttp_referrer(String http_referrer) {
        this.http_referrer = http_referrer;
    }

    public boolean isIs_sterling_on_steroids_v2() {
        return is_sterling_on_steroids_v2;
    }

    public void setIs_sterling_on_steroids_v2(boolean is_sterling_on_steroids_v2) {
        this.is_sterling_on_steroids_v2 = is_sterling_on_steroids_v2;
    }

    public boolean isIs_mobile_agent() {
        return is_mobile_agent;
    }

    public void setIs_mobile_agent(boolean is_mobile_agent) {
        this.is_mobile_agent = is_mobile_agent;
    }

    public boolean isIs_internal_ip() {
        return is_internal_ip;
    }

    public void setIs_internal_ip(boolean is_internal_ip) {
        this.is_internal_ip = is_internal_ip;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isIs_sterling_on_steroids() {
        return is_sterling_on_steroids;
    }

    public void setIs_sterling_on_steroids(boolean is_sterling_on_steroids) {
        this.is_sterling_on_steroids = is_sterling_on_steroids;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public boolean isUser_agent_can_use_native_app() {
        return user_agent_can_use_native_app;
    }

    public void setUser_agent_can_use_native_app(boolean user_agent_can_use_native_app) {
        this.user_agent_can_use_native_app = user_agent_can_use_native_app;
    }

    public String getSterling_on_steroids_ldap() {
        return sterling_on_steroids_ldap;
    }

    public void setSterling_on_steroids_ldap(String sterling_on_steroids_ldap) {
        this.sterling_on_steroids_ldap = sterling_on_steroids_ldap;
    }

    public String getBrowser_name() {
        return browser_name;
    }

    public void setBrowser_name(String browser_name) {
        this.browser_name = browser_name;
    }

    public String getBrowser_country() {
        return browser_country;
    }

    public void setBrowser_country(String browser_country) {
        this.browser_country = browser_country;
    }

    public String getError_template_path() {
        return error_template_path;
    }

    public void setError_template_path(String error_template_path) {
        this.error_template_path = error_template_path;
    }
}
