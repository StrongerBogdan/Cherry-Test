package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;

public abstract class ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 extends wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4 unknownFields = uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ;

    public ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 DrqQ8C7rtVRDTSclHGsDImq(com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 r2, java.io.InputStream r3, com.google.protobuf.S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX r4) {
        /*
            int r0 = r3.read()     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, IOException -> 0x001f }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r2 = 0
            return r2
        L_0x0009:
            int r0 = com.google.protobuf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH.N6PwCtLZilQqv2HuGbZQ7SwIiPpRTSCJOi8G5CG6t7(r0, r3)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, IOException -> 0x001f }
            FR5EjxHMlnhgT4g3Cx4ZlPTPTuR7VSyr9dS4OVpMDfBHg2BGe3HbA1bXzNKGQKMp0i40dVoHiWcnjoEpq4vvipBd2.tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 r1 = new FR5EjxHMlnhgT4g3Cx4ZlPTPTuR7VSyr9dS4OVpMDfBHg2BGe3HbA1bXzNKGQKMp0i40dVoHiWcnjoEpq4vvipBd2.tygdzrfuG3bl1r2ouET5CaGhmt4ugo8
            r1.<init>(r0, r3)
            com.google.protobuf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH r3 = com.google.protobuf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(r1)
            com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 r2 = parsePartialFrom(r2, r3, r4)
            r4 = 0
            r3.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(r4)
            return r2
        L_0x001f:
            r2 = move-exception
            goto L_0x0023
        L_0x0021:
            r2 = move-exception
            goto L_0x002d
        L_0x0023:
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r3 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r4 = r2.getMessage()
            r3.<init>(r4, r2)
            throw r3
        L_0x002d:
            boolean r3 = r2.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9
            if (r3 == 0) goto L_0x003b
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r3 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r4 = r2.getMessage()
            r3.<init>(r4, r2)
            r2 = r3
        L_0x003b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.DrqQ8C7rtVRDTSclHGsDImq(com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6, java.io.InputStream, com.google.protobuf.S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX):com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6");
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 r7, byte[] r8, int r9, int r10, com.google.protobuf.S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX r11) {
        /*
            com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 r7 = r7.newMutableInstance()
            com.google.protobuf.Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p r0 = com.google.protobuf.Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0020, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001e, IOException -> 0x001c, IndexOutOfBoundsException -> 0x0022 }
            com.google.protobuf.ZIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG r6 = r0.YmFIHVAy6MFnHbke10dLWI57IXCp(r7)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0020, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001e, IOException -> 0x001c, IndexOutOfBoundsException -> 0x0022 }
            int r4 = r9 + r10
            com.google.protobuf.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp r5 = new com.google.protobuf.Um9b2ks8Y0LiK3u4FrDpXIUf9CDB20azqNED8tqUF5QXjqNMzV6NToOBBjWfuzhJwt8AdCxM1KC0y54xLsKDQKV5vpV75DQjOjBEi7ECY0uxjR1BVNeGxeMiDLdAwy33RHeQ9vkNdSttO818vnfVccP8CWp     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0020, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001e, IOException -> 0x001c, IndexOutOfBoundsException -> 0x0022 }
            r5.<init>(r11)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0020, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001e, IOException -> 0x001c, IndexOutOfBoundsException -> 0x0022 }
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(r1, r2, r3, r4, r5)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0020, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001e, IOException -> 0x001c, IndexOutOfBoundsException -> 0x0022 }
            r6.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(r7)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0020, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001e, IOException -> 0x001c, IndexOutOfBoundsException -> 0x0022 }
            return r7
        L_0x001c:
            r7 = move-exception
            goto L_0x0027
        L_0x001e:
            r7 = move-exception
            goto L_0x0040
        L_0x0020:
            r7 = move-exception
            goto L_0x004a
        L_0x0022:
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r7 = com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn()
            throw r7
        L_0x0027:
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            if (r8 == 0) goto L_0x0036
            java.lang.Throwable r7 = r7.getCause()
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r7 = (com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN) r7
            throw r7
        L_0x0036:
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r8 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r9 = r7.getMessage()
            r8.<init>(r9, r7)
            throw r8
        L_0x0040:
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r8 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            throw r8
        L_0x004a:
            boolean r8 = r7.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9
            if (r8 == 0) goto L_0x0058
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r8 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r9 = r7.getMessage()
            r8.<init>(r9, r7)
            r7 = r8
        L_0x0058:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6, byte[], int, int, com.google.protobuf.S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX):com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6");
    }

    public static void YmFIHVAy6MFnHbke10dLWI57IXCp(ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 zaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) {
        if (zaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 != null && !zaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.isInitialized()) {
            K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 newUninitializedMessageException = zaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.newUninitializedMessageException();
            newUninitializedMessageException.getClass();
            throw new IOException(newUninitializedMessageException.getMessage());
        }
    }

    public static YPUNbCiEs4mP05wc0XbPT720S8j9KGKIJ46ve3KsVW1Hp7aE4fKoMyRypV96CthwD5Xm44fZrQNseDB32OunGG1NWSwlsXjIcx6CkZL7zX5QuuVT2D7TfRfWrlE8WR21hHwvf9YPzfeYu5agfHLSl3 access$000(xym9wgZ7J542NQuCwCxgptMoKnFt4Dm6cyo359LJShJTrDIhKFNjvt1ODm7RIJtZ8mroo4ve5EKHNOjG5b8D9F0GnalEjEYtuzqgb8vVASbAzSRehgO4dST3nKJSldG3dE21BvcBtt851a xym9wgz7j542nqucwcxgptmoknft4dm6cyo359ljshjtrdihkfnjvt1odm7rijtz8mroo4ve5ekhnojg5b8d9f0gnalejeytuzqgb8vvasbazsrehgo4dst3nkjsldg3de21bvcbtt851a) {
        xym9wgz7j542nqucwcxgptmoknft4dm6cyo359ljshjtrdihkfnjvt1odm7rijtz8mroo4ve5ekhnojg5b8d9f0gnalejeytuzqgb8vvasbazsrehgo4dst3nkjsldg3de21bvcbtt851a.getClass();
        return (YPUNbCiEs4mP05wc0XbPT720S8j9KGKIJ46ve3KsVW1Hp7aE4fKoMyRypV96CthwD5Xm44fZrQNseDB32OunGG1NWSwlsXjIcx6CkZL7zX5QuuVT2D7TfRfWrlE8WR21hHwvf9YPzfeYu5agfHLSl3) xym9wgz7j542nqucwcxgptmoknft4dm6cyo359ljshjtrdihkfnjvt1odm7rijtz8mroo4ve5ekhnojg5b8d9f0gnalejeytuzqgb8vvasbazsrehgo4dst3nkjsldg3de21bvcbtt851a;
    }

    public static L9nAKDFmay05rZi8Fqdarg1ERhOMa8pJj8a4zGfXauZLgyEpRN0svSMpdQ8vfpImD0ZxyLfRJrPonCstmPqleW0ReNh7hsqAuLNg9Ao1bavFEQvIKpHIW0 emptyBooleanList() {
        return LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    }

    public static sEsrwl7iHhMvnlaL7rU9b2umIDPplRlPZCOlVPNaNqgem9IzpGgQzJ1jKl1KDxXZ42Fs0Jan3EQij50jeJqf16VWoa5 emptyDoubleList() {
        return Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    }

    public static tesoyBtHZ8RPf9nBL7HNn64VUK5a3dngXz07MIVPOrEHfmLAcFoaP61EAQSHGlHSlM emptyFloatList() {
        return PBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    }

    public static AEsKSGBXyDotAtDNmgW0sSUsLBlTzaj4bQ1WuiNHsGinU17ucz4huFJuQzZYGM8fT8xNtuDnpcyFFO6 emptyIntList() {
        return s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    }

    public static WA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe emptyLongList() {
        return w82utHiXkCH7tL0AIXUL3sTOhkWbEwYmPMOZ9XUqDTRkl8VCPjqeA5toj575PI1FdWH1TdBVL4SiM7wPfY2LJQKEdmkbtMklZSQKpeQZpjg0WalcVvyC7rHQii9xuSdelO.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    }

    public static <E> oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN emptyProtobufList() {
        return cWcULfVmZahP1nTDeRgzJ1X17EB33YpAyFYTduhKORWWkDvMLV3tuMlWZJpAqzns1uLUZXoaFsQIURXrH4dJFY.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T getDefaultInstance(Class<T> cls) {
        T t = (ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) sSHt2cgWVlGG7tF8g0c8FxCFcKtdgbADgmBm2ZaqcXsor768RsNuVhty5CBrNY7LuWPAk9whPzd.YmFIHVAy6MFnHbke10dLWI57IXCp(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static AEsKSGBXyDotAtDNmgW0sSUsLBlTzaj4bQ1WuiNHsGinU17ucz4huFJuQzZYGM8fT8xNtuDnpcyFFO6 mutableCopy(AEsKSGBXyDotAtDNmgW0sSUsLBlTzaj4bQ1WuiNHsGinU17ucz4huFJuQzZYGM8fT8xNtuDnpcyFFO6 aEsKSGBXyDotAtDNmgW0sSUsLBlTzaj4bQ1WuiNHsGinU17ucz4huFJuQzZYGM8fT8xNtuDnpcyFFO6) {
        int size = aEsKSGBXyDotAtDNmgW0sSUsLBlTzaj4bQ1WuiNHsGinU17ucz4huFJuQzZYGM8fT8xNtuDnpcyFFO6.size();
        int i = size == 0 ? 10 : size * 2;
        s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm = (s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM) aEsKSGBXyDotAtDNmgW0sSUsLBlTzaj4bQ1WuiNHsGinU17ucz4huFJuQzZYGM8fT8xNtuDnpcyFFO6;
        if (i >= s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT) {
            return new s1QYXWYGk6RLwnnfbriCtUNUZZgmKhvUsKjFesGmIMSBJOLzRePK75YPFYL8RsLHoE5BO0cM(Arrays.copyOf(s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, i), s1qyxwygk6rlwnnfbrictunuzzgmkhvuskjfesgmimsbjolzrepk75ypfyl8rslhoe5bo0cm.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, String str, Object[] objArr) {
        return new Y8SJr2dEpDUs9lhUB1gzZFOLvk9pBj8amLztY0qSGC9C3VWMXj68lKa25O(gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, str, objArr);
    }

    public static <ContainingType extends GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, Type> YPUNbCiEs4mP05wc0XbPT720S8j9KGKIJ46ve3KsVW1Hp7aE4fKoMyRypV96CthwD5Xm44fZrQNseDB32OunGG1NWSwlsXjIcx6CkZL7zX5QuuVT2D7TfRfWrlE8WR21hHwvf9YPzfeYu5agfHLSl3 newRepeatedGeneratedExtension(ContainingType containingtype, GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, EnNc7SVYfYqptNNzq0TcpAdB8G4Z7pbaMOTXeAzA1CWVek7QlMG0s737oWqFiOR1S9th0V72HWjEc0seM9MCNdloauv5ykgfvxfQlHAhjCcYE7j9TI6LelwxFiK4p8kiae0zH388Hy0I4f1ktyvIpdpC2ec93jBA enNc7SVYfYqptNNzq0TcpAdB8G4Z7pbaMOTXeAzA1CWVek7QlMG0s737oWqFiOR1S9th0V72HWjEc0seM9MCNdloauv5ykgfvxfQlHAhjCcYE7j9TI6LelwxFiK4p8kiae0zH388Hy0I4f1ktyvIpdpC2ec93jBA, int i, GC2W27Pzq1Fx0YEz8iUQf0k gC2W27Pzq1Fx0YEz8iUQf0k, boolean z, Class cls) {
        return new YPUNbCiEs4mP05wc0XbPT720S8j9KGKIJ46ve3KsVW1Hp7aE4fKoMyRypV96CthwD5Xm44fZrQNseDB32OunGG1NWSwlsXjIcx6CkZL7zX5QuuVT2D7TfRfWrlE8WR21hHwvf9YPzfeYu5agfHLSl3(containingtype, Collections.emptyList(), gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, new pndyUOdR5HXvqxOa7sLzbN6vRhTOHmcQZ0wAP8FZQjV4RgLxrboRFzoskcfWWUlvlOCkIxYNX17DBQqEEoOW2uHarRx9LIh6kfAzXgo2ooaIbs(enNc7SVYfYqptNNzq0TcpAdB8G4Z7pbaMOTXeAzA1CWVek7QlMG0s737oWqFiOR1S9th0V72HWjEc0seM9MCNdloauv5ykgfvxfQlHAhjCcYE7j9TI6LelwxFiK4p8kiae0zH388Hy0I4f1ktyvIpdpC2ec93jBA, i, gC2W27Pzq1Fx0YEz8iUQf0k, true, z));
    }

    public static <ContainingType extends GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, Type> YPUNbCiEs4mP05wc0XbPT720S8j9KGKIJ46ve3KsVW1Hp7aE4fKoMyRypV96CthwD5Xm44fZrQNseDB32OunGG1NWSwlsXjIcx6CkZL7zX5QuuVT2D7TfRfWrlE8WR21hHwvf9YPzfeYu5agfHLSl3 newSingularGeneratedExtension(ContainingType containingtype, Type type, GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, EnNc7SVYfYqptNNzq0TcpAdB8G4Z7pbaMOTXeAzA1CWVek7QlMG0s737oWqFiOR1S9th0V72HWjEc0seM9MCNdloauv5ykgfvxfQlHAhjCcYE7j9TI6LelwxFiK4p8kiae0zH388Hy0I4f1ktyvIpdpC2ec93jBA enNc7SVYfYqptNNzq0TcpAdB8G4Z7pbaMOTXeAzA1CWVek7QlMG0s737oWqFiOR1S9th0V72HWjEc0seM9MCNdloauv5ykgfvxfQlHAhjCcYE7j9TI6LelwxFiK4p8kiae0zH388Hy0I4f1ktyvIpdpC2ec93jBA, int i, GC2W27Pzq1Fx0YEz8iUQf0k gC2W27Pzq1Fx0YEz8iUQf0k, Class cls) {
        return new YPUNbCiEs4mP05wc0XbPT720S8j9KGKIJ46ve3KsVW1Hp7aE4fKoMyRypV96CthwD5Xm44fZrQNseDB32OunGG1NWSwlsXjIcx6CkZL7zX5QuuVT2D7TfRfWrlE8WR21hHwvf9YPzfeYu5agfHLSl3(containingtype, type, gpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV, new pndyUOdR5HXvqxOa7sLzbN6vRhTOHmcQZ0wAP8FZQjV4RgLxrboRFzoskcfWWUlvlOCkIxYNX17DBQqEEoOW2uHarRx9LIh6kfAzXgo2ooaIbs(enNc7SVYfYqptNNzq0TcpAdB8G4Z7pbaMOTXeAzA1CWVek7QlMG0s737oWqFiOR1S9th0V72HWjEc0seM9MCNdloauv5ykgfvxfQlHAhjCcYE7j9TI6LelwxFiK4p8kiae0zH388Hy0I4f1ktyvIpdpC2ec93jBA, i, gC2W27Pzq1Fx0YEz8iUQf0k, false, false));
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseDelimitedFrom(T t, InputStream inputStream) {
        T DrqQ8C7rtVRDTSclHGsDImq = DrqQ8C7rtVRDTSclHGsDImq(t, inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX.YmFIHVAy6MFnHbke10dLWI57IXCp());
        YmFIHVAy6MFnHbke10dLWI57IXCp(DrqQ8C7rtVRDTSclHGsDImq);
        return DrqQ8C7rtVRDTSclHGsDImq;
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, ByteBuffer byteBuffer, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH;
        if (byteBuffer.hasArray()) {
            enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH = EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (!byteBuffer.isDirect() || !sSHt2cgWVlGG7tF8g0c8FxCFcKtdgbADgmBm2ZaqcXsor768RsNuVhty5CBrNY7LuWPAk9whPzd.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH = EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(bArr, UNINITIALIZED_HASH_CODE, remaining, true);
        } else {
            enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH = new gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG(byteBuffer, false);
        }
        T parseFrom = parseFrom(t, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
        YmFIHVAy6MFnHbke10dLWI57IXCp(parseFrom);
        return parseFrom;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parsePartialFrom(T r2, com.google.protobuf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH r3, com.google.protobuf.S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX r4) {
        /*
            com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 r2 = r2.newMutableInstance()
            com.google.protobuf.Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p r0 = com.google.protobuf.Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001f, IOException -> 0x001d, RuntimeException -> 0x001b }
            com.google.protobuf.ZIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG r0 = r0.YmFIHVAy6MFnHbke10dLWI57IXCp(r2)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001f, IOException -> 0x001d, RuntimeException -> 0x001b }
            LRvH1s9Myp8RSLYfFGmMPYIZTAlBk4BWyHTHTqfEzmpfR5PNm4mBmSdYP2SnXjdFeN2einY4hK4r3j2yjMFQPIh.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh r1 = r3.YmFIHVAy6MFnHbke10dLWI57IXCp     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001f, IOException -> 0x001d, RuntimeException -> 0x001b }
            if (r1 == 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            LRvH1s9Myp8RSLYfFGmMPYIZTAlBk4BWyHTHTqfEzmpfR5PNm4mBmSdYP2SnXjdFeN2einY4hK4r3j2yjMFQPIh.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh r1 = new LRvH1s9Myp8RSLYfFGmMPYIZTAlBk4BWyHTHTqfEzmpfR5PNm4mBmSdYP2SnXjdFeN2einY4hK4r3j2yjMFQPIh.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001f, IOException -> 0x001d, RuntimeException -> 0x001b }
            r1.<init>((com.google.protobuf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) r3)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001f, IOException -> 0x001d, RuntimeException -> 0x001b }
        L_0x0014:
            r0.BrinjKkMNX0Ww9FldCotLl2(r2, r1, r4)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001f, IOException -> 0x001d, RuntimeException -> 0x001b }
            r0.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(r2)     // Catch:{ TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN -> 0x0021, K5GHRc6sxaVY2WyYm6zBiscnRo5ZRVC2GgP2ijvFb79N55gotAdu8Oc2 -> 0x001f, IOException -> 0x001d, RuntimeException -> 0x001b }
            return r2
        L_0x001b:
            r2 = move-exception
            goto L_0x0023
        L_0x001d:
            r2 = move-exception
            goto L_0x0033
        L_0x001f:
            r2 = move-exception
            goto L_0x004c
        L_0x0021:
            r2 = move-exception
            goto L_0x0056
        L_0x0023:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            if (r3 == 0) goto L_0x0032
            java.lang.Throwable r2 = r2.getCause()
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r2 = (com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN) r2
            throw r2
        L_0x0032:
            throw r2
        L_0x0033:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            if (r3 == 0) goto L_0x0042
            java.lang.Throwable r2 = r2.getCause()
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r2 = (com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN) r2
            throw r2
        L_0x0042:
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r3 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r4 = r2.getMessage()
            r3.<init>(r4, r2)
            throw r3
        L_0x004c:
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r3 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r2 = r2.getMessage()
            r3.<init>(r2)
            throw r3
        L_0x0056:
            boolean r3 = r2.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9
            if (r3 == 0) goto L_0x0064
            com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN r3 = new com.google.protobuf.TQcZ764YYWhMhOvLAII8l0vIffdyWviENaQS1DIwYI7PaBQ4Epqq6ysCOTnNR9YXlcWBPK9CnS4MN
            java.lang.String r4 = r2.getMessage()
            r3.<init>(r4, r2)
            r2 = r3
        L_0x0064:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.parsePartialFrom(com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6, com.google.protobuf.EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, com.google.protobuf.S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX):com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6");
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
        t.makeImmutable();
    }

    public Object buildMessageInfo() {
        return dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p = Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq;
        nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.getClass();
        return nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(getClass()).Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(this);
    }

    public final <MessageType extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6, BuilderType extends fjnDmDRWDWTE0t3jkJPcYK> BuilderType createBuilder() {
        return (fjnDmDRWDWTE0t3jkJPcYK) dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96);
    }

    public Object dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, Object obj) {
        return dynamicMethod(vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, obj, (Object) null);
    }

    public abstract Object dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p = Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq;
        nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.getClass();
        return nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(getClass()).H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(this, (ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR getParserForType() {
        return (YxWtJlgJKr0e6MMlOjHdhfDdmjZ0PoEkinpfoR) dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN);
    }

    public int getSerializedSize(ZIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG zIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG) {
        int i;
        int i2;
        if (isMutable()) {
            if (zIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG == null) {
                Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p = Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq;
                nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.getClass();
                i2 = nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(getClass()).oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(this);
            } else {
                i2 = zIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(this);
            }
            if (i2 >= 0) {
                return i2;
            }
            throw new IllegalStateException(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(i2, "serialized size must be non-negative, was "));
        } else if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        } else {
            if (zIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG == null) {
                Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p2 = Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq;
                nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p2.getClass();
                i = nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p2.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(getClass()).oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(this);
            } else {
                i = zIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(this);
            }
            setMemoizedSerializedSize(i);
            return i;
        }
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p = Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq;
        nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.getClass();
        nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(getClass()).VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        if (this.unknownFields == uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ) {
            this.unknownFields = new uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4();
        }
        uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4 uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4 = this.unknownFields;
        uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
        if (i != 0) {
            uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ((i << 3) | 2, tygdzrfug3bl1r2ouet5caghmt4ugo8);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4 uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4) {
        this.unknownFields = uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(this.unknownFields, uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ) {
            this.unknownFields = new uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4();
        }
        uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4 uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4 = this.unknownFields;
        uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
        if (i != 0) {
            uxgxst9qdzqlaq58d5ezh5exp3ry5gppri6f22lcibgcmf4.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(i << 3, Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 newMutableInstance() {
        return (ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8);
    }

    public boolean parseUnknownField(int i, EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ) {
            this.unknownFields = new uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4();
        }
        return this.unknownFields.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(i, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(i, "serialized size must be non-negative, was "));
    }

    public String toString() {
        String obj = super.toString();
        char[] cArr = tbaL2huNeiP6IdXIGdZ8PJsAZhpqWU5luETWbovsh2xJPRvob9IXBubxzTAbFZxeb27YojxwGgjFz87JI7BB9Yj9bGYxXOHdg9R0XdejxYastjMsMy3ER2YAkkmDNhQ31Eel.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        tbaL2huNeiP6IdXIGdZ8PJsAZhpqWU5luETWbovsh2xJPRvob9IXBubxzTAbFZxeb27YojxwGgjFz87JI7BB9Yj9bGYxXOHdg9R0XdejxYastjMsMy3ER2YAkkmDNhQ31Eel.DrqQ8C7rtVRDTSclHGsDImq(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }

    public void writeTo(zfocMDrnJnbYtdsnKHCh6s zfocmdrnjnbytdsnkhch6s) {
        Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p = Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq;
        nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.getClass();
        ZIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(getClass());
        tAhB2Nx8ZVmTMdEMHrXbvi6CDr2hFSn2TqvdF6AGEcmkYArFpMwL7O74TSpxYLvhtTyblTmKarkLx3 tahb2nx8zvmtmdemhrxbvi6cdr2hfsn2tqvdf6agecmkyarfpmwl7o74tspxylvhttybltmkarklx3 = zfocmdrnjnbytdsnkhch6s.DrqQ8C7rtVRDTSclHGsDImq;
        if (tahb2nx8zvmtmdemhrxbvi6cdr2hfsn2tqvdf6agecmkyarfpmwl7o74tspxylvhttybltmkarklx3 == null) {
            tahb2nx8zvmtmdemhrxbvi6cdr2hfsn2tqvdf6agecmkyarfpmwl7o74tspxylvhttybltmkarklx3 = new tAhB2Nx8ZVmTMdEMHrXbvi6CDr2hFSn2TqvdF6AGEcmkYArFpMwL7O74TSpxYLvhtTyblTmKarkLx3(zfocmdrnjnbytdsnkhch6s);
        }
        P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(this, tahb2nx8zvmtmdemhrxbvi6cdr2hfsn2tqvdf6agecmkyarfpmwl7o74tspxylvhttybltmkarklx3);
    }

    public static final <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p = Nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.DrqQ8C7rtVRDTSclHGsDImq;
        nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.getClass();
        boolean P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = nj64vPXMxuUFcLdQILgrBD31CrUODNk6N0Irt2WskbcgCEBcKh5I9p.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(t.getClass()).P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(t);
        if (z) {
            t.dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d ? t : null);
        }
        return P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    }

    public final <MessageType extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6, BuilderType extends fjnDmDRWDWTE0t3jkJPcYK> BuilderType createBuilder(MessageType messagetype) {
        BuilderType createBuilder = createBuilder();
        createBuilder.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(messagetype);
        return createBuilder;
    }

    public Object dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au) {
        return dynamicMethod(vdvx66v6xiey2owhwluoxnjiex6thu8znztsja3uenf2hw7bdc2acdfkgdgowlf5mup6hlqo3ygv8jhfmoiprmtbufemh9prfqnoseqo2uwjysjjmc61p8nha38ffz1fdbkuyivjuk2h6ipuqk0au, (Object) null, (Object) null);
    }

    public final ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 getDefaultInstanceForType() {
        return (ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG);
    }

    public final fjnDmDRWDWTE0t3jkJPcYK newBuilderForType() {
        return (fjnDmDRWDWTE0t3jkJPcYK) dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96);
    }

    public final fjnDmDRWDWTE0t3jkJPcYK toBuilder() {
        fjnDmDRWDWTE0t3jkJPcYK fjndmdrwdwte0t3jkjpcyk = (fjnDmDRWDWTE0t3jkJPcYK) dynamicMethod(vdVx66v6xIEy2oWHWluOXnjIex6Thu8ZnZTsjA3UEnF2HW7BdC2ACdfKgdGowLf5muP6HLQo3Ygv8JhfMOipRmTBUfeMH9PRFqNOSEQO2UwjysjjMc61p8NHa38Ffz1FdbkuyiVJUk2h6ipUQK0AU.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96);
        fjndmdrwdwte0t3jkjpcyk.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(this);
        return fjndmdrwdwte0t3jkjpcyk;
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseDelimitedFrom(T t, InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        T DrqQ8C7rtVRDTSclHGsDImq = DrqQ8C7rtVRDTSclHGsDImq(t, inputStream, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
        YmFIHVAy6MFnHbke10dLWI57IXCp(DrqQ8C7rtVRDTSclHGsDImq);
        return DrqQ8C7rtVRDTSclHGsDImq;
    }

    public static WA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe mutableCopy(WA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe wA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe) {
        int size = wA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe.size();
        int i = size == 0 ? 10 : size * 2;
        w82utHiXkCH7tL0AIXUL3sTOhkWbEwYmPMOZ9XUqDTRkl8VCPjqeA5toj575PI1FdWH1TdBVL4SiM7wPfY2LJQKEdmkbtMklZSQKpeQZpjg0WalcVvyC7rHQii9xuSdelO w82uthixkch7tl0aixul3stohkwbewympmoz9xuqdtrkl8vcpjqea5toj575pi1fdwh1tdbvl4sim7wpfy2ljqkedmkbtmklzsqkpeqzpjg0walcvvyc7rhqii9xusdelo = (w82utHiXkCH7tL0AIXUL3sTOhkWbEwYmPMOZ9XUqDTRkl8VCPjqeA5toj575PI1FdWH1TdBVL4SiM7wPfY2LJQKEdmkbtMklZSQKpeQZpjg0WalcVvyC7rHQii9xuSdelO) wA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe;
        if (i >= w82uthixkch7tl0aixul3stohkwbewympmoz9xuqdtrkl8vcpjqea5toj575pi1fdwh1tdbvl4sim7wpfy2ljqkedmkbtmklzsqkpeqzpjg0walcvvyc7rhqii9xusdelo.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT) {
            return new w82utHiXkCH7tL0AIXUL3sTOhkWbEwYmPMOZ9XUqDTRkl8VCPjqeA5toj575PI1FdWH1TdBVL4SiM7wPfY2LJQKEdmkbtMklZSQKpeQZpjg0WalcVvyC7rHQii9xuSdelO(Arrays.copyOf(w82uthixkch7tl0aixul3stohkwbewympmoz9xuqdtrkl8vcpjqea5toj575pi1fdwh1tdbvl4sim7wpfy2ljqkedmkbtmklzsqkpeqzpjg0walcvvyc7rhqii9xusdelo.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, i), w82uthixkch7tl0aixul3stohkwbewympmoz9xuqdtrkl8vcpjqea5toj575pi1fdwh1tdbvl4sim7wpfy2ljqkedmkbtmklzsqkpeqzpjg0walcvvyc7rhqii9xusdelo.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
        }
        throw new IllegalArgumentException();
    }

    public static tesoyBtHZ8RPf9nBL7HNn64VUK5a3dngXz07MIVPOrEHfmLAcFoaP61EAQSHGlHSlM mutableCopy(tesoyBtHZ8RPf9nBL7HNn64VUK5a3dngXz07MIVPOrEHfmLAcFoaP61EAQSHGlHSlM tesoybthz8rpf9nbl7hnn64vuk5a3dngxz07mivporehfmlacfoap61eaqshglhslm) {
        int size = tesoybthz8rpf9nbl7hnn64vuk5a3dngxz07mivporehfmlacfoap61eaqshglhslm.size();
        int i = size == 0 ? 10 : size * 2;
        PBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8 pBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8 = (PBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8) tesoybthz8rpf9nbl7hnn64vuk5a3dngxz07mivporehfmlacfoap61eaqshglhslm;
        if (i >= pBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT) {
            return new PBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8(Arrays.copyOf(pBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, i), pBNvgPQTsxcVT7V1y571pvQJVehXxhiBiaXTam5htIHHSDhhlaZxi5cIbgKk8KgS5zGoa8VGokxFbMiVhKVlRqzgCCg0WtRdcBl3GHYGsSHRS48NQPlrB5UiaoWTx64OqA2CuUR8.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, ByteBuffer byteBuffer) {
        return parseFrom(t, byteBuffer, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX.YmFIHVAy6MFnHbke10dLWI57IXCp());
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8) {
        T parseFrom = parseFrom(t, tygdzrfug3bl1r2ouet5caghmt4ugo8, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX.YmFIHVAy6MFnHbke10dLWI57IXCp());
        YmFIHVAy6MFnHbke10dLWI57IXCp(parseFrom);
        return parseFrom;
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, tygdzrfuG3bl1r2ouET5CaGhmt4ugo8 tygdzrfug3bl1r2ouet5caghmt4ugo8, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = tygdzrfug3bl1r2ouet5caghmt4ugo8.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8();
        T parsePartialFrom = parsePartialFrom(t, uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
        uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(UNINITIALIZED_HASH_CODE);
        YmFIHVAy6MFnHbke10dLWI57IXCp(parsePartialFrom);
        return parsePartialFrom;
    }

    public static sEsrwl7iHhMvnlaL7rU9b2umIDPplRlPZCOlVPNaNqgem9IzpGgQzJ1jKl1KDxXZ42Fs0Jan3EQij50jeJqf16VWoa5 mutableCopy(sEsrwl7iHhMvnlaL7rU9b2umIDPplRlPZCOlVPNaNqgem9IzpGgQzJ1jKl1KDxXZ42Fs0Jan3EQij50jeJqf16VWoa5 sesrwl7ihhmvnlal7ru9b2umidpplrlpzcolvpnanqgem9izpggqzj1jkl1kdxxz42fs0jan3eqij50jejqf16vwoa5) {
        int size = sesrwl7ihhmvnlal7ru9b2umidpplrlpzcolvpnanqgem9izpggqzj1jkl1kdxxz42fs0jan3eqij50jejqf16vwoa5.size();
        int i = size == 0 ? 10 : size * 2;
        Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI = (Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI) sesrwl7ihhmvnlal7ru9b2umidpplrlpzcolvpnanqgem9izpggqzj1jkl1kdxxz42fs0jan3eqij50jejqf16vwoa5;
        if (i >= hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT) {
            return new Hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI(Arrays.copyOf(hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, i), hfv852lbufjqS9YvuotOQGMlAwbT93xAB7vm4I08c6qrPUQoF33xZ7tgcFr07lRFO0AjYBoYHfH7ytkOI.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, byte[] bArr) {
        T VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(t, bArr, UNINITIALIZED_HASH_CODE, bArr.length, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX.YmFIHVAy6MFnHbke10dLWI57IXCp());
        YmFIHVAy6MFnHbke10dLWI57IXCp(VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU);
        return VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    }

    public static L9nAKDFmay05rZi8Fqdarg1ERhOMa8pJj8a4zGfXauZLgyEpRN0svSMpdQ8vfpImD0ZxyLfRJrPonCstmPqleW0ReNh7hsqAuLNg9Ao1bavFEQvIKpHIW0 mutableCopy(L9nAKDFmay05rZi8Fqdarg1ERhOMa8pJj8a4zGfXauZLgyEpRN0svSMpdQ8vfpImD0ZxyLfRJrPonCstmPqleW0ReNh7hsqAuLNg9Ao1bavFEQvIKpHIW0 l9nAKDFmay05rZi8Fqdarg1ERhOMa8pJj8a4zGfXauZLgyEpRN0svSMpdQ8vfpImD0ZxyLfRJrPonCstmPqleW0ReNh7hsqAuLNg9Ao1bavFEQvIKpHIW0) {
        int size = l9nAKDFmay05rZi8Fqdarg1ERhOMa8pJj8a4zGfXauZLgyEpRN0svSMpdQ8vfpImD0ZxyLfRJrPonCstmPqleW0ReNh7hsqAuLNg9Ao1bavFEQvIKpHIW0.size();
        int i = size == 0 ? 10 : size * 2;
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 = (LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5) l9nAKDFmay05rZi8Fqdarg1ERhOMa8pJj8a4zGfXauZLgyEpRN0svSMpdQ8vfpImD0ZxyLfRJrPonCstmPqleW0ReNh7hsqAuLNg9Ao1bavFEQvIKpHIW0;
        if (i >= leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT) {
            return new LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5(Arrays.copyOf(leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, i), leskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, byte[] bArr, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        T VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(t, bArr, UNINITIALIZED_HASH_CODE, bArr.length, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
        YmFIHVAy6MFnHbke10dLWI57IXCp(VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU);
        return VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    }

    public int getSerializedSize() {
        return getSerializedSize((ZIgI27Mk7qHMxdVwS6Ahd0zOVg8aC5lwvCm55LqLMpwhsf3lzQzcKZPbPm9R45MEd6j0BLIlXJrt6jiYj9i94ZYrJYG8xQTTZvUvekP2C7odGZPFtlSopCCDlpavX5oyQD3bkPl6hmStHpZLG) null);
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parsePartialFrom(T t, EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        return parsePartialFrom(t, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX.YmFIHVAy6MFnHbke10dLWI57IXCp());
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, InputStream inputStream) {
        T parsePartialFrom = parsePartialFrom(t, EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(inputStream), S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX.YmFIHVAy6MFnHbke10dLWI57IXCp());
        YmFIHVAy6MFnHbke10dLWI57IXCp(parsePartialFrom);
        return parsePartialFrom;
    }

    public static <E> oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN mutableCopy(oI0ni7m0OP8ewxEFxveR9GgB1iLd2Wk3wndWyFNspxQbiEBPM7cZzdSrYDdEDQOg8DXXmP7a0BdAyceinNJZep1SSf1Xvcj68gN oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn) {
        int size = oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn.size();
        return oi0ni7m0op8ewxefxver9ggb1ild2wk3wndwyfnspxqbiebpm7czzdsryddedqog8dxxmp7a0bdayceinnjzep1ssf1xvcj68gn.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA(size == 0 ? 10 : size * 2);
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, InputStream inputStream, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        T parsePartialFrom = parsePartialFrom(t, EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH.Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(inputStream), s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
        YmFIHVAy6MFnHbke10dLWI57IXCp(parsePartialFrom);
        return parsePartialFrom;
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH) {
        return parseFrom(t, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX.YmFIHVAy6MFnHbke10dLWI57IXCp());
    }

    public static <T extends ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6> T parseFrom(T t, EnIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX) {
        T parsePartialFrom = parsePartialFrom(t, enIuAlkglP8FgbJ5MXr6zWuinpSgBjAv1kbSsRmbVqeBpdXcylin4OJ403mF9ia9IJajDYHJMWiqjLwR8KV5bqLMC3kCnGiP0CWqV73n0OqGwLNtd4vXhHgIfA6RngPwviUm25YptQNGVYU8XTH, s9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX);
        YmFIHVAy6MFnHbke10dLWI57IXCp(parsePartialFrom);
        return parsePartialFrom;
    }
}
