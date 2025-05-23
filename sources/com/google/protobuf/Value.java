package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 implements ZXX8fxfZckpBIXgmpNwD1FIj9qg1WoA7N0bGWyYPKZVVMbMNLw8yuR92TAlVRCcLFWODe2DA6mEWyFLfvn8gfhBBSp8BONAYEdrtCPiHoT0sJCRvSVTskqO4I {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    /* access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
            this.kind_ = listValue;
        } else {
            TibRsoWe1w09aipIqud3HqqyT20n1sFBgAJL35C24INunXWEOdzFZGCItFeS3wzYlHHX0uD08Isfa5cDQReLT3wRq5zpyiVzQZWToJo4GuRnBRoyphY6 newBuilder = ListValue.newBuilder((ListValue) this.kind_);
            newBuilder.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(listValue);
            this.kind_ = newBuilder.DrqQ8C7rtVRDTSclHGsDImq();
        }
        this.kindCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
            this.kind_ = struct;
        } else {
            lIsd5zQYuspHCyWkBQdrNlYff6j5C8xve0PK3sfYcArpaoa2RxUXm99vU newBuilder = Struct.newBuilder((Struct) this.kind_);
            newBuilder.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(struct);
            this.kind_ = newBuilder.DrqQ8C7rtVRDTSclHGsDImq();
        }
        this.kindCase_ = 5;
    }

    public static Rf9noF1BWgUo2ypT0aO99tv2ZzG6RwLUG5pydnWvaymaAZFm2Tb9aL8gLzVhZek9OfyH6GaE6Z2kDK9qEuHqvJJ5QHKtEcRahXrREIiM12CwFXl1o1LDutMkaQpSl2cAe71QjWOL58YxedqPJ4vLZEsbvb newBuilder() {
        return (Rf9noF1BWgUo2ypT0aO99tv2ZzG6RwLUG5pydnWvaymaAZFm2Tb9aL8gLzVhZek9OfyH6GaE6Z2kDK9qEuHqvJJ5QHKtEcRahXrREIiM12CwFXl1o1LDutMkaQpSl2cAe71QjWOL58YxedqPJ4vLZEsbvb) DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void setNullValue(VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL) {
        this.kind_ = Integer.valueOf(vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d());
        this.kindCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    public void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* access modifiers changed from: private */
    public void setStringValueBytes(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.checkByteStringIsUtf8(tygdzrfug3bl1r2ouet5caghmt4ugo8);
        this.kind_ = tygdzrfug3bl1r2ouet5caghmt4ugo8.OKEFRhs6OXFJKyry5Z71CY76oDnwhW5FJg2OAPnj9ulD5LM4Kq5Bjc83bCfwXFNmMjv6yp6Ftre2cNRkaH0Q3xMOZ2hMufJD0zymR1CE8pqwQRzY();
        this.kindCase_ = 3;
    }

    /* access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [com.google.protobuf.YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR, java.lang.Object] */
    public final Object dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, Object obj, Object obj2) {
        YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR;
        switch (vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 3:
                return new Value();
            case 4:
                return new fjnDmDRWDWTE0t3jkJPcYK(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 = PARSER;
                YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR3 = yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2;
                if (yxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR2 == null) {
                    synchronized (Value.class) {
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

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu getKindCase() {
        switch (this.kindCase_) {
            case 0:
                return Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu.NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN;
            case 1:
                return Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
            case 2:
                return Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            case 3:
                return Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
            case 4:
                return Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
            case 5:
                return Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96;
            case 6:
                return Q3gbjL4XP4OUgWyfdeN3ZNWDe3lEm9DubDhuJOWEsX93QqnsBxrsukpqonowXcEu.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG;
            default:
                return null;
        }
    }

    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    public VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL getNullValue() {
        int i = this.kindCase_;
        VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL = VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL.NULL_VALUE;
        if (i != 1) {
            return vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL;
        }
        if (((Integer) this.kind_).intValue() != 0) {
            vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL = null;
        }
        return vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL == null ? VQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL.UNRECOGNIZED : vQdmCBrxGVtL9Hz5UZF7RDNdde5nAjm8QHzVN8xDX1SCj6b1LL;
    }

    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    public tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 getStringValueBytes() {
        return tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static Rf9noF1BWgUo2ypT0aO99tv2ZzG6RwLUG5pydnWvaymaAZFm2Tb9aL8gLzVhZek9OfyH6GaE6Z2kDK9qEuHqvJJ5QHKtEcRahXrREIiM12CwFXl1o1LDutMkaQpSl2cAe71QjWOL58YxedqPJ4vLZEsbvb newBuilder(Value value) {
        return (Rf9noF1BWgUo2ypT0aO99tv2ZzG6RwLUG5pydnWvaymaAZFm2Tb9aL8gLzVhZek9OfyH6GaE6Z2kDK9qEuHqvJJ5QHKtEcRahXrREIiM12CwFXl1o1LDutMkaQpSl2cAe71QjWOL58YxedqPJ4vLZEsbvb) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, byteBuffer, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Value parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8);
    }

    public static Value parseFrom(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, tygdzrfug3bl1r2ouet5caghmt4ugo8, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Value parseFrom(byte[] bArr) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, bArr, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Value parseFrom(InputStream inputStream) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }

    public static Value parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH);
    }

    public static Value parseFrom(EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        return (Value) ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parseFrom(DEFAULT_INSTANCE, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
    }
}
