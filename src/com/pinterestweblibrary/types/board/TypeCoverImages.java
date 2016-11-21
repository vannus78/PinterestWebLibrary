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

import com.google.gson.annotations.SerializedName;
import com.pinterestweblibrary.types.commons.TypeImageSpecs;

/**
 *
 * @author Stefano Vannucci
 */
public class TypeCoverImages {
    @SerializedName("400x300")
    private TypeImageSpecs _400x300 = new TypeImageSpecs();
    @SerializedName("216x146")
    private TypeImageSpecs _216x146 = new TypeImageSpecs();

    public TypeImageSpecs get400x300() {
        return _400x300;
    }

    public void set400x300(TypeImageSpecs _400x300) {
        this._400x300 = _400x300;
    }

    public TypeImageSpecs get216x146() {
        return _216x146;
    }

    public void set216x146(TypeImageSpecs _216x146) {
        this._216x146 = _216x146;
    }
}
