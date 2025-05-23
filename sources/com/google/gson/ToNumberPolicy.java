package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;

public enum ToNumberPolicy implements ToNumberStrategy {
    DOUBLE {
        public Double readNumber(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER {
        public Number readNumber(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
            if (r7.isLenient() == false) goto L_0x002b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            throw new com.google.gson.stream.MalformedJsonException("JSON forbids NaN and infinities: " + r3 + "; at path " + r7.getPreviousPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            r0 = k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA("Cannot parse ", r2, "; at path ");
            r0.append(r7.getPreviousPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
            throw new com.google.gson.JsonParseException(r0.toString(), r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r3 = java.lang.Double.valueOf(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r3.isInfinite() == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
            if (r3.isNaN() != false) goto L_0x0021;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0011 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Number readNumber(com.google.gson.stream.JsonReader r7) {
            /*
                r6 = this;
                java.lang.String r0 = "; at path "
                java.lang.String r1 = "JSON forbids NaN and infinities: "
                java.lang.String r2 = r7.nextString()
                long r3 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0011 }
                java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0011 }
                return r7
            L_0x0011:
                java.lang.Double r3 = java.lang.Double.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0022 }
                boolean r4 = r3.isInfinite()     // Catch:{ NumberFormatException -> 0x0022 }
                if (r4 != 0) goto L_0x0024
                boolean r4 = r3.isNaN()     // Catch:{ NumberFormatException -> 0x0022 }
                if (r4 == 0) goto L_0x002a
                goto L_0x0024
            L_0x0022:
                r1 = move-exception
                goto L_0x0047
            L_0x0024:
                boolean r4 = r7.isLenient()     // Catch:{ NumberFormatException -> 0x0022 }
                if (r4 == 0) goto L_0x002b
            L_0x002a:
                return r3
            L_0x002b:
                com.google.gson.stream.MalformedJsonException r4 = new com.google.gson.stream.MalformedJsonException     // Catch:{ NumberFormatException -> 0x0022 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0022 }
                r5.<init>(r1)     // Catch:{ NumberFormatException -> 0x0022 }
                r5.append(r3)     // Catch:{ NumberFormatException -> 0x0022 }
                r5.append(r0)     // Catch:{ NumberFormatException -> 0x0022 }
                java.lang.String r1 = r7.getPreviousPath()     // Catch:{ NumberFormatException -> 0x0022 }
                r5.append(r1)     // Catch:{ NumberFormatException -> 0x0022 }
                java.lang.String r1 = r5.toString()     // Catch:{ NumberFormatException -> 0x0022 }
                r4.<init>((java.lang.String) r1)     // Catch:{ NumberFormatException -> 0x0022 }
                throw r4     // Catch:{ NumberFormatException -> 0x0022 }
            L_0x0047:
                com.google.gson.JsonParseException r3 = new com.google.gson.JsonParseException
                java.lang.String r4 = "Cannot parse "
                java.lang.StringBuilder r0 = k7E5adRDhz5TrQ52amP8wLo7HDbhrH2l5KpaWndX6GGTgMTxgSQneaXCWa2mPoOSZJ040aUJCrzVnziwwkci4knTDk5UrFr7180K7Lrs6FIFy7B.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA(r4, r2, r0)
                java.lang.String r7 = r7.getPreviousPath()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r3.<init>(r7, r1)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.ToNumberPolicy.AnonymousClass3.readNumber(com.google.gson.stream.JsonReader):java.lang.Number");
        }
    },
    BIG_DECIMAL {
        public BigDecimal readNumber(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            try {
                return new BigDecimal(nextString);
            } catch (NumberFormatException e) {
                StringBuilder N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA = wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA("Cannot parse ", nextString, "; at path ");
                N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA.append(jsonReader.getPreviousPath());
                throw new JsonParseException(N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA.toString(), e);
            }
        }
    }
}
