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

import com.google.gson.annotations.SerializedName;
import com.pinterestweblibrary.types.commons.TypeImageSpecs;

/**
 *
 * @author Stefano Vannucci
 */
public class TypeImages {
    
    @SerializedName("736x")
    private TypeImageSpecs _736x = new TypeImageSpecs();
    @SerializedName("474x")
    private TypeImageSpecs _474x = new TypeImageSpecs();
    private TypeImageSpecs orig = new TypeImageSpecs();
    @SerializedName("136x136")
    private TypeImageSpecs _136x136 = new TypeImageSpecs();
    @SerializedName("236x")
    private TypeImageSpecs _236x = new TypeImageSpecs();

    public TypeImageSpecs get736x() {
        return _736x;
    }

    public void set736x(TypeImageSpecs _736x) {
        this._736x = _736x;
    }

    public TypeImageSpecs get474x() {
        return _474x;
    }

    public void set474x(TypeImageSpecs _474x) {
        this._474x = _474x;
    }

    public TypeImageSpecs getOrig() {
        return orig;
    }

    public void setOrig(TypeImageSpecs orig) {
        this.orig = orig;
    }

    public TypeImageSpecs get136x136() {
        return _136x136;
    }

    public void set136x136(TypeImageSpecs _136x136) {
        this._136x136 = _136x136;
    }

    public TypeImageSpecs get236x() {
        return _236x;
    }

    public void set236x(TypeImageSpecs _236x) {
        this._236x = _236x;
    }    
}
