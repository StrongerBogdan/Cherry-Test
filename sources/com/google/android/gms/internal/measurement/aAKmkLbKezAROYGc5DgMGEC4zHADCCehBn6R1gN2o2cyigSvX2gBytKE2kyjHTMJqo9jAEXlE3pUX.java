package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX implements Iterator {
    public final /* synthetic */ Iterator Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public final /* synthetic */ Iterator xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    public aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX(Iterator it, Iterator it2) {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = it;
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = it2;
    }

    public final boolean hasNext() {
        if (this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.hasNext()) {
            return true;
        }
        return this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.hasNext();
    }

    public final /* synthetic */ Object next() {
        Iterator it = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (it.hasNext()) {
            return new gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG(((Integer) it.next()).toString());
        }
        Iterator it2 = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
        if (it2.hasNext()) {
            return new gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
