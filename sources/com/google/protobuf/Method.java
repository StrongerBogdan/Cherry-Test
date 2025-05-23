package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Method extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 implements FcvuHLcObGE7tsg9FNSf8KNmkg29pwJ {
    /* access modifiers changed from: private */
    public static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_ = "";
    private oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN options_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
    private boolean requestStreaming_;
    private String requestTypeUrl_ = "";
    private boolean responseStreaming_;
    private String responseTypeUrl_ = "";
    private int syntax_;

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.registerDefaultInstance(Method.class, method);
    }

    private Method() {
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    /* access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    /* access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn = this.options_;
        if (!((LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA) oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn).xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            this.options_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.mutableCopy(oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn);
        }
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static AsRFx1dhoiX20s6djHGpjlMn0tr1ONPWbHHeIopoASaI7hEzmkL2DqnndJGZ9vdRLpCIHygdYfsF8G2vXY9cK5VdUlECBPWzqcEjro9sFoU0DvccLXRedk1I6CJxMdiz6 newBuilder() {
        return (AsRFx1dhoiX20s6djHGpjlMn0tr1ONPWbHHeIopoASaI7hEzmkL2DqnndJGZ9vdRLpCIHygdYfsF8G2vXY9cK5VdUlECBPWzqcEjro9sFoU0DvccLXRedk1I6CJxMdiz6) DEFAULT_INSTANCE.createBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void setNameBytes(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.checkByteStringIsUtf8(tygdzrfug3bl1r2ouet5caghmt4ugo8);
        this.name_ = tygdzrfug3bl1r2ouet5caghmt4ugo8.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY();
    }

    /* access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* access modifiers changed from: private */
    public void setRequestStreaming(boolean z) {
        this.requestStreaming_ = z;
    }

    /* access modifiers changed from: private */
    public void setRequestTypeUrl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setRequestTypeUrlBytes(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.checkByteStringIsUtf8(tygdzrfug3bl1r2ouet5caghmt4ugo8);
        this.requestTypeUrl_ = tygdzrfug3bl1r2ouet5caghmt4ugo8.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY();
    }

    /* access modifiers changed from: private */
    public void setResponseStreaming(boolean z) {
        this.responseStreaming_ = z;
    }

    /* access modifiers changed from: private */
    public void setResponseTypeUrl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setResponseTypeUrlBytes(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.checkByteStringIsUtf8(tygdzrfug3bl1r2ouet5caghmt4ugo8);
        this.responseTypeUrl_ = tygdzrfug3bl1r2ouet5caghmt4ugo8.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY();
    }

    /* access modifiers changed from: private */
    public void setSyntax(Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF) {
        this.syntax_ = mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
    }

    /* access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* JADX WARNING: type inference failed for: r9v15, types: [com.google.protobuf.YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR, java.lang.Object] */
    public final Object dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, Object obj, Object obj2) {
        YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR;
        switch (vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 3:
                return new Method();
            case 4:
                return new fjnDmDRWDWTE0t3jkJPcYK(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 = PARSER;
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR3 = yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2;
                if (yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 == null) {
                    synchronized (Method.class) {
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

    public String getName() {
        return this.name_;
    }

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 getNameBytes() {
        return tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(this.name_);
    }

    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public MyBpyx3FEt3oeMocUQPQ4rrH8yVl4pzGvGDG7SexehRhNBQpQWh0AfCzBfUuPXvYLKRvbgiA3S85nqDBbUpuQ27ImSOLNHJ8AC2lqwUrcsjCyWQ2gKb1JDjZ47xC41uTDg4AQoqNd384BjcmEctayWW getOptionsOrBuilder(int i) {
        return (MyBpyx3FEt3oeMocUQPQ4rrH8yVl4pzGvGDG7SexehRhNBQpQWh0AfCzBfUuPXvYLKRvbgiA3S85nqDBbUpuQ27ImSOLNHJ8AC2lqwUrcsjCyWQ2gKb1JDjZ47xC41uTDg4AQoqNd384BjcmEctayWW) this.options_.get(i);
    }

    public List<? extends MyBpyx3FEt3oeMocUQPQ4rrH8yVl4pzGvGDG7SexehRhNBQpQWh0AfCzBfUuPXvYLKRvbgiA3S85nqDBbUpuQ27ImSOLNHJ8AC2lqwUrcsjCyWQ2gKb1JDjZ47xC41uTDg4AQoqNd384BjcmEctayWW> getOptionsOrBuilderList() {
        return this.options_;
    }

    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 getRequestTypeUrlBytes() {
        return tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(this.requestTypeUrl_);
    }

    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 getResponseTypeUrlBytes() {
        return tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(this.responseTypeUrl_);
    }

    public Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF getSyntax() {
        Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF YmFIHVAy6MFnHbke10dLWI57IXCp = Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF.YmFIHVAy6MFnHbke10dLWI57IXCp(this.syntax_);
        return YmFIHVAy6MFnHbke10dLWI57IXCp == null ? Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF.UNRECOGNIZED : YmFIHVAy6MFnHbke10dLWI57IXCp;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static AsRFx1dhoiX20s6djHGpjlMn0tr1ONPWbHHeIopoASaI7hEzmkL2DqnndJGZ9vdRLpCIHygdYfsF8G2vXY9cK5VdUlECBPWzqcEjro9sFoU0DvccLXRedk1I6CJxMdiz6 newBuilder(Method method) {
        return (AsRFx1dhoiX20s6djHGpjlMn0tr1ONPWbHHeIopoASaI7hEzmkL2DqnndJGZ9vdRLpCIHygdYfsF8G2vXY9cK5VdUlECBPWzqcEjro9sFoU0DvccLXRedk1I6CJxMdiz6) DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Method parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Method parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Method parseFrom(byte[] bArr) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Method parseFrom(InputStream inputStream) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Method parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH);
    }

    public static Method parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Method) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }
}
