package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Timestamp extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 implements yYB09n8MJJV5AOyvwYNah2OjE3b4cVYa5dGXdqS1Q6 {
    /* access modifiers changed from: private */
    public static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    /* access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xINRuGmdEsZViibS1NwSKOxZE5Qn1YNY newBuilder() {
        return (xINRuGmdEsZViibS1NwSKOxZE5Qn1YNY) DEFAULT_INSTANCE.createBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* access modifiers changed from: private */
    public void setSeconds(long j) {
        this.seconds_ = j;
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
                return ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new Timestamp();
            case 4:
                return new fjnDmDRWDWTE0t3jkJPcYK(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 = PARSER;
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR3 = yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2;
                if (yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 == null) {
                    synchronized (Timestamp.class) {
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

    public int getNanos() {
        return this.nanos_;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    public static xINRuGmdEsZViibS1NwSKOxZE5Qn1YNY newBuilder(Timestamp timestamp) {
        return (xINRuGmdEsZViibS1NwSKOxZE5Qn1YNY) DEFAULT_INSTANCE.createBuilder(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Timestamp parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8);
    }

    public static Timestamp parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Timestamp parseFrom(byte[] bArr) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Timestamp parseFrom(byte[] bArr, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Timestamp parseFrom(InputStream inputStream) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Timestamp parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH);
    }

    public static Timestamp parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Timestamp) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }
}
