package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class FieldMask extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 implements yYB09n8MJJV5AOyvwYNah2OjE3b4cVYa5dGXdqS1Q6 {
    /* access modifiers changed from: private */
    public static final FieldMask DEFAULT_INSTANCE;
    private static volatile YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN paths_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    /* access modifiers changed from: private */
    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.addAll(iterable, this.paths_);
    }

    /* access modifiers changed from: private */
    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    /* access modifiers changed from: private */
    public void addPathsBytes(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.checkByteStringIsUtf8(tygdzrfug3bl1r2ouet5caghmt4ugo8);
        ensurePathsIsMutable();
        this.paths_.add(tygdzrfug3bl1r2ouet5caghmt4ugo8.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY());
    }

    /* access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn = this.paths_;
        if (!((LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA) oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn).xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            this.paths_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.mutableCopy(oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn);
        }
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static S2Ri8niwfzN3JsWXHIeaZKJcTD3T5qxPNdcTILo6eIfap15OdilTILbEMoMDQXvt4Xki8wZAjsp3BYHnNxr1Cy9v81e9z5B6UKCLeMIH newBuilder() {
        return (S2Ri8niwfzN3JsWXHIeaZKJcTD3T5qxPNdcTILo6eIfap15OdilTILbEMoMDQXvt4Xki8wZAjsp3BYHnNxr1Cy9v81e9z5B6UKCLeMIH) DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setPaths(int i, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i, str);
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [com.google.protobuf.YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR, java.lang.Object] */
    public final Object dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, Object obj, Object obj2) {
        YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR;
        switch (vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 3:
                return new FieldMask();
            case 4:
                return new fjnDmDRWDWTE0t3jkJPcYK(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 = PARSER;
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR3 = yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2;
                if (yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 == null) {
                    synchronized (FieldMask.class) {
                        try {
                            YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR4 = PARSER;
                            yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR = yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR4;
                            if (yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR4 == null) {
                                ? obj3 = new Object();
                                PARSER = obj3;
                                yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR = obj3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR3 = yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR;
                }
                return yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getPaths(int i) {
        return (String) this.paths_.get(i);
    }

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 getPathsBytes(int i) {
        return tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn((String) this.paths_.get(i));
    }

    public int getPathsCount() {
        return this.paths_.size();
    }

    public List<String> getPathsList() {
        return this.paths_;
    }

    public static S2Ri8niwfzN3JsWXHIeaZKJcTD3T5qxPNdcTILo6eIfap15OdilTILbEMoMDQXvt4Xki8wZAjsp3BYHnNxr1Cy9v81e9z5B6UKCLeMIH newBuilder(FieldMask fieldMask) {
        return (S2Ri8niwfzN3JsWXHIeaZKJcTD3T5qxPNdcTILo6eIfap15OdilTILbEMoMDQXvt4Xki8wZAjsp3BYHnNxr1Cy9v81e9z5B6UKCLeMIH) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static FieldMask parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8);
    }

    public static FieldMask parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static FieldMask parseFrom(byte[] bArr) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static FieldMask parseFrom(InputStream inputStream) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static FieldMask parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH);
    }

    public static FieldMask parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (FieldMask) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }
}
