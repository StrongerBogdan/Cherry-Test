package etcH8B6uzexe8iDJuQkWKA4jt0VojEDfCiERoRHicumhLGzqE1ccUME7k96hqHaJXopaPDXwzuHO3LqvdQ;

import d4zyxunQ6qX80DLQmmjtqPnQt7TWErWiYO5fy60gEHBg.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public abstract class QUXHX0HYJ4t6XfyGaI2rjGSSNwIFHVBjobeg4RR16pG1pKMnJfq7lUAQdcUbkNwfPG5BTHmFutK5LNIRQLr3uIvUAdXTU4latM3uXEZraQeFRJlkTM3ft4BF3KRAP3XIn4t78ilWPnmR44WevxKiI extends nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC {
    public static Integer HYbBbYss6O3jYJMRtSahuRrtqEq573V63IRw0JGVBPYd2aUZZRyLHFGZ4le9Pl2ckgD3jmT4LDtxDer5JiPrGiNu8pzWIuOP8Gn49R84UMHVQFLXmPxXkvIObf5CCceqH8xwiu7giYLaOIKNVw(String str) {
        int i;
        boolean z;
        int i2;
        FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static boolean aZuAhXw2fyeVaFe5cLiFWs7eBelKKZRnYMMs9fWCog30oJtjUT9MJ1hJV0xdiSt4TlE(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static String danOaN3trT4ulYcks9a9f4p9fSWChAHWxhCGHxpU4upA11owby(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            int i2 = 1;
            if (i == 1) {
                return str.toString();
            }
            int length = str.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(str.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(str);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.DrqQ8C7rtVRDTSclHGsDImq(sb2);
                return sb2;
            }
            char charAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    public static boolean fFqIsJKfHjBDwU79lNmK3Ur3NkuxOx54lFxdfXRKkDiym5pLfc7qhQUGLF1l4PgotAM7T52yuH(String str, String str2, boolean z) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "<this>");
        if (!z) {
            return str.endsWith(str2);
        }
        return lJehLOMsId34it7M2mxBd95SNI656PMzCrzaU7coSXy(str.length() - str2.length(), str, str2, true, 0, str2.length());
    }

    public static boolean iwNj1XK9oI6wbUgiZZW0x1FKeGItLiIWjtnS311RWKnR7QXlyKkQk4a9KuHUL9rT1jHziL7G4F4KvvsLaHFfr(String str, String str2, boolean z, int i) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "<this>");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return lJehLOMsId34it7M2mxBd95SNI656PMzCrzaU7coSXy(i, str, str2, z, 0, str2.length());
    }

    public static final boolean lJehLOMsId34it7M2mxBd95SNI656PMzCrzaU7coSXy(int i, String str, String str2, boolean z, int i2, int i3) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "<this>");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String oXXcFIamw7ZjKxPeGpdtwcq6GThLG(String str, String str2, String str3) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "<this>");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str2, "oldValue");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str3, "newValue");
        int IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u = bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf.IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u(str, str2, 0, false);
        if (IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append(str, i2, IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u);
                sb.append(str3);
                i2 = IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u + length;
                if (IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u >= str.length() || (IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u = bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf.IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u(str, str2, IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u + i, false)) <= 0) {
                    sb.append(str, i2, str.length());
                    String sb2 = sb.toString();
                    LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(sb2, "toString(...)");
                }
                sb.append(str, i2, IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u);
                sb.append(str3);
                i2 = IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u + length;
                break;
            } while ((IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u = bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf.IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u(str, str2, IAyRm1qbGf5srmRUjTvuMDFMxUXauVQak0HCrUoBE3NVI7VvFNtHkovvQKBcmvuSO5NLXsrWRNiPey1mfneaXd8tZkT5WKOHItqrkhgeJHcsFkYQpy8XdFK7Q44u + i, false)) <= 0);
            sb.append(str, i2, str.length());
            String sb22 = sb.toString();
            LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(sb22, "toString(...)");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static boolean rwFNtLQPwDHQdQINzTzTw3EtqALAHvztEZMKjjqp2tky27GOxN0Vb5EDFEkUYcSN7dWAkxHYxr7biB91ch0sszKj0pO0IXHHankzEJtN9OPnb8uzi1CdGjMM(String str, String str2, boolean z) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, "<this>");
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return lJehLOMsId34it7M2mxBd95SNI656PMzCrzaU7coSXy(0, str, str2, z, 0, str2.length());
    }
}
