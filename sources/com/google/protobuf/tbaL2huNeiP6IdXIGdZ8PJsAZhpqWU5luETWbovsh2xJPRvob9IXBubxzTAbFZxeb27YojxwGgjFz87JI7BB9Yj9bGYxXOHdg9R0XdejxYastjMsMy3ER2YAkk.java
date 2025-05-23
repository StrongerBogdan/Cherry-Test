package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class tbaL2huNeiP6IdXIGdZ8PJsAZhpqWU5luETWbovsh2xJPRvob9IXBubxzTAbFZxeb27YojxwGgjFz87JI7BB9Yj9bGYxXOHdg9R0XdejxYastjMsMy3ER2YAkkmDNhQ31Eel {
    public static final char[] P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

    static {
        char[] cArr = new char[80];
        P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0195, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L_0x0197;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void DrqQ8C7rtVRDTSclHGsDImq(com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6 r20, java.lang.StringBuilder r21, int r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r20.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L_0x008c
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L_0x0036
            goto L_0x0089
        L_0x0036:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r13) goto L_0x0041
            goto L_0x0089
        L_0x0041:
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x0053
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L_0x0089
        L_0x0053:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 != 0) goto L_0x005e
            goto L_0x0089
        L_0x005e:
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 == 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L_0x0078
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L_0x0089
        L_0x0078:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x008c:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x020c
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto L_0x00e9
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto L_0x00e9
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x00e9
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L_0x00e9
            java.lang.Class r15 = r14.getReturnType()
            java.lang.Class<java.util.List> r13 = java.util.List.class
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x00e9
            int r7 = r9.length()
            int r7 = r7 + -4
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.invokeOrDie(r14, r0, r9)
            YmFIHVAy6MFnHbke10dLWI57IXCp(r1, r2, r7, r9)
        L_0x00e7:
            r13 = 3
            goto L_0x0094
        L_0x00e9:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L_0x0131
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x0131
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L_0x0131
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0131
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L_0x0131
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L_0x0131
            int r7 = r9.length()
            r14 = 3
            int r7 = r7 - r14
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.invokeOrDie(r13, r0, r9)
            YmFIHVAy6MFnHbke10dLWI57IXCp(r1, r2, r7, r9)
            goto L_0x00e7
        L_0x0131:
            java.lang.String r13 = r12.concat(r9)
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x013c
        L_0x013b:
            goto L_0x00e7
        L_0x013c:
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L_0x0161
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r10)
            int r14 = r9.length()
            int r14 = r14 + -5
            java.lang.String r14 = r9.substring(r8, r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            boolean r13 = r5.containsKey(r13)
            if (r13 == 0) goto L_0x0161
            goto L_0x013b
        L_0x0161:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r13 = r11.concat(r9)
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto L_0x00e7
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.invokeOrDie(r7, r0, r14)
            if (r13 != 0) goto L_0x01f9
            boolean r13 = r7 instanceof java.lang.Boolean
            r14 = 1
            if (r13 == 0) goto L_0x018a
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r13 = r13 ^ r14
            goto L_0x01f4
        L_0x018a:
            boolean r13 = r7 instanceof java.lang.Integer
            if (r13 == 0) goto L_0x0199
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 != 0) goto L_0x01f3
        L_0x0197:
            r13 = r14
            goto L_0x01f4
        L_0x0199:
            boolean r13 = r7 instanceof java.lang.Float
            if (r13 == 0) goto L_0x01ab
            r13 = r7
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            if (r13 != 0) goto L_0x01f3
            goto L_0x0197
        L_0x01ab:
            boolean r13 = r7 instanceof java.lang.Double
            if (r13 == 0) goto L_0x01c1
            r13 = r7
            java.lang.Double r13 = (java.lang.Double) r13
            double r16 = r13.doubleValue()
            long r16 = java.lang.Double.doubleToRawLongBits(r16)
            r18 = 0
            int r13 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x01f3
            goto L_0x0197
        L_0x01c1:
            boolean r13 = r7 instanceof java.lang.String
            if (r13 == 0) goto L_0x01cc
            java.lang.String r13 = ""
            boolean r13 = r7.equals(r13)
            goto L_0x01f4
        L_0x01cc:
            boolean r13 = r7 instanceof com.google.protobuf.tygdzrfuG3bl1r2ouET5CaGhmt4ugo8
            if (r13 == 0) goto L_0x01d7
            com.google.protobuf.M3SW7lhn3CC34g1pOnXRwQAqcaE5solEHAhxEeoyf4PIh r13 = com.google.protobuf.tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw
            boolean r13 = r7.equals(r13)
            goto L_0x01f4
        L_0x01d7:
            boolean r13 = r7 instanceof com.google.protobuf.GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV
            if (r13 == 0) goto L_0x01e5
            r13 = r7
            com.google.protobuf.GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV r13 = (com.google.protobuf.GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV) r13
            com.google.protobuf.GpIOCeFImAarHj21xvRSXchCrzDkJmiexe9jqVL9LKRkfkqrO1XEvwJPAq7535qBmQUgFQY3ujXJZdtuGRL6jkZrbREOA3rd2FbbxrppaM2dNgKHLcPYuGYWIRoZ9kTneltQt6Sxao1d8u9sV r13 = r13.getDefaultInstanceForType()
            if (r7 != r13) goto L_0x01f3
            goto L_0x0197
        L_0x01e5:
            boolean r13 = r7 instanceof java.lang.Enum
            if (r13 == 0) goto L_0x01f3
            r13 = r7
            java.lang.Enum r13 = (java.lang.Enum) r13
            int r13 = r13.ordinal()
            if (r13 != 0) goto L_0x01f3
            goto L_0x0197
        L_0x01f3:
            r13 = r8
        L_0x01f4:
            if (r13 != 0) goto L_0x01f7
            goto L_0x0205
        L_0x01f7:
            r14 = r8
            goto L_0x0205
        L_0x01f9:
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r13 = com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6.invokeOrDie(r13, r0, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r14 = r13.booleanValue()
        L_0x0205:
            if (r14 == 0) goto L_0x00e7
            YmFIHVAy6MFnHbke10dLWI57IXCp(r1, r2, r9, r7)
            goto L_0x00e7
        L_0x020c:
            boolean r3 = r0 instanceof com.google.protobuf.GeneratedMessageLite$ExtendableMessage
            if (r3 == 0) goto L_0x0242
            r3 = r0
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r3 = (com.google.protobuf.GeneratedMessageLite$ExtendableMessage) r3
            com.google.protobuf.svfds6qQVO3c07wq71KxZdYPTG0lyJZm3kvg2RHcEFbK5HN1nCI9JgwJRmP2i9OQjSbbCkms4eJueAUQJnxn0uEDeUJBy3CnNs98u15IdV r3 = r3.extensions
            java.util.Iterator r3 = r3.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9()
        L_0x0219:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0242
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "["
            r5.<init>(r6)
            java.lang.Object r6 = r4.getKey()
            com.google.protobuf.pndyUOdR5HXvqxOa7sLzbN6vRhTOHmcQZ0wAP8FZQjV4RgLxrboRFzoskcfWWUlvlOCkIxYNX17DBQqEEoOW2uHarRx9LIh6kfAzXgo2ooaIbs r6 = (com.google.protobuf.pndyUOdR5HXvqxOa7sLzbN6vRhTOHmcQZ0wAP8FZQjV4RgLxrboRFzoskcfWWUlvlOCkIxYNX17DBQqEEoOW2uHarRx9LIh6kfAzXgo2ooaIbs) r6
            int r6 = r6.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9
            java.lang.String r7 = "]"
            java.lang.String r5 = k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(r5, r6, r7)
            java.lang.Object r4 = r4.getValue()
            YmFIHVAy6MFnHbke10dLWI57IXCp(r1, r2, r5, r4)
            goto L_0x0219
        L_0x0242:
            com.google.protobuf.uxGXst9QdZQlaQ58d5eZH5EXp3rY5gPPri6f22LCIbgcmf4 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x025e
        L_0x0246:
            int r3 = r0.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d
            if (r8 >= r3) goto L_0x025e
            int[] r3 = r0.YmFIHVAy6MFnHbke10dLWI57IXCp
            r3 = r3[r8]
            r4 = 3
            int r3 = r3 >>> r4
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r5 = r0.DrqQ8C7rtVRDTSclHGsDImq
            r5 = r5[r8]
            YmFIHVAy6MFnHbke10dLWI57IXCp(r1, r2, r3, r5)
            int r8 = r8 + 1
            goto L_0x0246
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.tbaL2huNeiP6IdXIGdZ8PJsAZhpqWU5luETWbovsh2xJPRvob9IXBubxzTAbFZxeb27YojxwGgjFz87JI7BB9Yj9bGYxXOHdg9R0XdejxYastjMsMy3ER2YAkkmDNhQ31Eel.DrqQ8C7rtVRDTSclHGsDImq(com.google.protobuf.ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6, java.lang.StringBuilder, int):void");
    }

    public static void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d, 0, i2);
            i -= i2;
        }
    }

    public static void YmFIHVAy6MFnHbke10dLWI57IXCp(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object YmFIHVAy6MFnHbke10dLWI57IXCp : (List) obj) {
                YmFIHVAy6MFnHbke10dLWI57IXCp(sb, i, str, YmFIHVAy6MFnHbke10dLWI57IXCp);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry YmFIHVAy6MFnHbke10dLWI57IXCp2 : ((Map) obj).entrySet()) {
                YmFIHVAy6MFnHbke10dLWI57IXCp(sb, i, str, YmFIHVAy6MFnHbke10dLWI57IXCp2);
            }
        } else {
            sb.append(10);
            P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.oXXcFIamw7ZjKxPeGpdtwcq6GThLG(tygdzrfuG3bl1r2ouET5CaGhmt4ugo8.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn((String) obj)));
                sb.append('\"');
            } else if (obj instanceof tygdzrfuG3bl1r2ouET5CaGhmt4ugo8) {
                sb.append(": \"");
                sb.append(MTpeiijAJ8dSu4iDwUKM27bbbQsDXmNCQDn3Wx2o8le4Vr82KACBN9iABJg6G2uXik2sYlV7IlADCi1WYpWzCT5Whv6cPPkTBH8IfZGGdqZjASOlqOl0AiaDdv5fOn2SAqqrBVER6OHLJnMyba8cCxuTGUUEWY3s.oXXcFIamw7ZjKxPeGpdtwcq6GThLG((tygdzrfuG3bl1r2ouET5CaGhmt4ugo8) obj));
                sb.append('\"');
            } else if (obj instanceof ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) {
                sb.append(" {");
                DrqQ8C7rtVRDTSclHGsDImq((ZaTpYFkmyHQiCtbqN7u6ywdpmIoQYkYsaIBpsEtf3XnkubF72humYkbhbm6LtgufRjwXXwaVQW4CmTje0Pv2a6) obj, sb, i + 2);
                sb.append("\n");
                P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                YmFIHVAy6MFnHbke10dLWI57IXCp(sb, i3, "key", entry.getKey());
                YmFIHVAy6MFnHbke10dLWI57IXCp(sb, i3, "value", entry.getValue());
                sb.append("\n");
                P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }
}
