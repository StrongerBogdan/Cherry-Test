package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Api extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 implements yYB09n8MJJV5AOyvwYNah2OjE3b4cVYa5dGXdqS1Q6 {
    /* access modifiers changed from: private */
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN methods_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
    private oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN mixins_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
    private String name_ = "";
    private oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN options_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_ = "";

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.registerDefaultInstance(Api.class, api);
    }

    private Api() {
    }

    /* access modifiers changed from: private */
    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.addAll(iterable, this.methods_);
    }

    /* access modifiers changed from: private */
    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.addAll(iterable, this.mixins_);
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void addMethods(Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    /* access modifiers changed from: private */
    public void addMixins(Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.emptyProtobufList();
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
    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    /* access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn = this.methods_;
        if (!((LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA) oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn).xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            this.methods_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.mutableCopy(oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn);
        }
    }

    private void ensureMixinsIsMutable() {
        oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn = this.mixins_;
        if (!((LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA) oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn).xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            this.mixins_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.mutableCopy(oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn);
        }
    }

    private void ensureOptionsIsMutable() {
        oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn = this.options_;
        if (!((LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA) oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn).xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9) {
            this.options_ = ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.mutableCopy(oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn);
        }
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            this.sourceContext_ = sourceContext;
            return;
        }
        CrcgYjUnADF4tCPCilou2kJjqgraYIJeNY3htrxvXe59wkjMJwYctVZhCWnSMCPyFOW1vAXqyIvrRaZwNw1wP2obaCRRD newBuilder = SourceContext.newBuilder(this.sourceContext_);
        newBuilder.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(sourceContext);
        this.sourceContext_ = (SourceContext) newBuilder.DrqQ8C7rtVRDTSclHGsDImq();
    }

    public static aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX newBuilder() {
        return (aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX) DEFAULT_INSTANCE.createBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeMethods(int i) {
        ensureMethodsIsMutable();
        this.methods_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeMixins(int i) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i, method);
    }

    /* access modifiers changed from: private */
    public void setMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i, mixin);
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
    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    /* access modifiers changed from: private */
    public void setSyntax(Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF) {
        this.syntax_ = mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
    }

    /* access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* access modifiers changed from: private */
    public void setVersionBytes(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.checkByteStringIsUtf8(tygdzrfug3bl1r2ouet5caghmt4ugo8);
        this.version_ = tygdzrfug3bl1r2ouet5caghmt4ugo8.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY();
    }

    /* JADX WARNING: type inference failed for: r11v15, types: [com.google.protobuf.YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR, java.lang.Object] */
    public final Object dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, Object obj, Object obj2) {
        YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR;
        switch (vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 3:
                return new Api();
            case 4:
                return new fjnDmDRWDWTE0t3jkJPcYK(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 = PARSER;
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR3 = yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2;
                if (yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 == null) {
                    synchronized (Api.class) {
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

    public Method getMethods(int i) {
        return (Method) this.methods_.get(i);
    }

    public int getMethodsCount() {
        return this.methods_.size();
    }

    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public FcvuHLcObGE7tsg9FNSf8KNmkg29pwJ getMethodsOrBuilder(int i) {
        return (FcvuHLcObGE7tsg9FNSf8KNmkg29pwJ) this.methods_.get(i);
    }

    public List<? extends FcvuHLcObGE7tsg9FNSf8KNmkg29pwJ> getMethodsOrBuilderList() {
        return this.methods_;
    }

    public Mixin getMixins(int i) {
        return (Mixin) this.mixins_.get(i);
    }

    public int getMixinsCount() {
        return this.mixins_.size();
    }

    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public l2lUh6P8k69whSDopxKENyDqbLkhTZTTZGRoNJffNWcMwzTOODn68GxOamCju5aABQESrOFQazEnfLcdbkG5g2zYHY7ppHOTeXGBH3CqfkOf4c6L3GRRLHsFXjlSEVaYQjtNt6B2m2L6xWzv getMixinsOrBuilder(int i) {
        return (l2lUh6P8k69whSDopxKENyDqbLkhTZTTZGRoNJffNWcMwzTOODn68GxOamCju5aABQESrOFQazEnfLcdbkG5g2zYHY7ppHOTeXGBH3CqfkOf4c6L3GRRLHsFXjlSEVaYQjtNt6B2m2L6xWzv) this.mixins_.get(i);
    }

    public List<? extends l2lUh6P8k69whSDopxKENyDqbLkhTZTTZGRoNJffNWcMwzTOODn68GxOamCju5aABQESrOFQazEnfLcdbkG5g2zYHY7ppHOTeXGBH3CqfkOf4c6L3GRRLHsFXjlSEVaYQjtNt6B2m2L6xWzv> getMixinsOrBuilderList() {
        return this.mixins_;
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

    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    public Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF getSyntax() {
        Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF YmFIHVAy6MFnHbke10dLWI57IXCp = Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF.YmFIHVAy6MFnHbke10dLWI57IXCp(this.syntax_);
        return YmFIHVAy6MFnHbke10dLWI57IXCp == null ? Mp7haNgyjx6AOMwE8unfgpkGZd97ZjYtD11pz0yharI1KF3PsfKw9T1UPVVbzBF.UNRECOGNIZED : YmFIHVAy6MFnHbke10dLWI57IXCp;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public String getVersion() {
        return this.version_;
    }

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 getVersionBytes() {
        return tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(this.version_);
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX newBuilder(Api api) {
        return (aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX) DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Api parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8);
    }

    /* access modifiers changed from: private */
    public void addMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i, method);
    }

    /* access modifiers changed from: private */
    public void addMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i, mixin);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Api parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Api parseFrom(byte[] bArr) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Api parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH);
    }

    public static Api parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Api) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }
}
