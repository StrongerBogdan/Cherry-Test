package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA extends AbstractList implements oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN {
    public boolean xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = true;

    public final boolean DrqQ8C7rtVRDTSclHGsDImq() {
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
    }

    public final void YmFIHVAy6MFnHbke10dLWI57IXCp() {
        if (!this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(Object obj) {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
        return super.addAll(collection);
    }

    public void clear() {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection collection) {
        YmFIHVAy6MFnHbke10dLWI57IXCp();
        return super.addAll(i, collection);
    }
}
