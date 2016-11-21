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
public class TypeSiteConst {
    
    private int PIN_MARGIN = 0;
    private int MAX_COLUMNS = 0;
    private int MIN_COLUMNS = 0;
    private String PRESENTER_BUTTON_MODULE_NAME = "";
    private int PIN_WIDTH = 0;

    public int getPIN_MARGIN() {
        return PIN_MARGIN;
    }

    public void setPIN_MARGIN(int PIN_MARGIN) {
        this.PIN_MARGIN = PIN_MARGIN;
    }

    public int getMAX_COLUMNS() {
        return MAX_COLUMNS;
    }

    public void setMAX_COLUMNS(int MAX_COLUMNS) {
        this.MAX_COLUMNS = MAX_COLUMNS;
    }

    public int getMIN_COLUMNS() {
        return MIN_COLUMNS;
    }

    public void setMIN_COLUMNS(int MIN_COLUMNS) {
        this.MIN_COLUMNS = MIN_COLUMNS;
    }

    public String getPRESENTER_BUTTON_MODULE_NAME() {
        return PRESENTER_BUTTON_MODULE_NAME;
    }

    public void setPRESENTER_BUTTON_MODULE_NAME(String PRESENTER_BUTTON_MODULE_NAME) {
        this.PRESENTER_BUTTON_MODULE_NAME = PRESENTER_BUTTON_MODULE_NAME;
    }

    public int getPIN_WIDTH() {
        return PIN_WIDTH;
    }

    public void setPIN_WIDTH(int PIN_WIDTH) {
        this.PIN_WIDTH = PIN_WIDTH;
    }
}
