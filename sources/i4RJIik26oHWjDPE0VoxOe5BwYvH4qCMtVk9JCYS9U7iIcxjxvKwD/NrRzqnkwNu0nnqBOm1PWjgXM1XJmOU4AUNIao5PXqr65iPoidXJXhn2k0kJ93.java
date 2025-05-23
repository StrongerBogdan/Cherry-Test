package i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD;

import SdOdyhjIDEfE2FoeRBWvWcVsk135mG6LjmyA0tyGllCPnxRxSLQaIbPfwPuBolrliilCB6BD9TAumnTPR18UqY52iJZDf0FY2Zo.WA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93 implements Closeable {
    public static final Logger NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN = Logger.getLogger(NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93.class.getName());
    public int GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    public int Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96;
    public final byte[] qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG;
    public bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    public final RandomAccessFile xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    /* JADX INFO: finally extract failed */
    public NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93(File file) {
        byte[] bArr = new byte[16];
        this.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(bArr);
        int Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X = Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(0, bArr);
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X;
        if (((long) Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X) <= randomAccessFile2.length()) {
            this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(4, bArr);
            int Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X2 = Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(8, bArr);
            int Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X3 = Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(12, bArr);
            this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X2);
            this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96 = peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw + ", Actual length: " + randomAccessFile2.length());
    }

    public static int Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final synchronized void DrqQ8C7rtVRDTSclHGsDImq(D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk d8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk) {
        int i = this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        for (int i2 = 0; i2 < this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT; i2++) {
            bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6 = peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(i);
            d8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(new LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5(this, peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6), peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6.YmFIHVAy6MFnHbke10dLWI57IXCp);
            i = qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG(peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d + 4 + peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6.YmFIHVAy6MFnHbke10dLWI57IXCp);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0067
            int r0 = r6.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT     // Catch:{ all -> 0x0065 }
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0033
            monitor-enter(r6)     // Catch:{ all -> 0x0065 }
            r0 = 4096(0x1000, float:5.74E-42)
            r6.NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN(r0, r2, r2, r2)     // Catch:{ all -> 0x0030 }
            r6.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = r2     // Catch:{ all -> 0x0030 }
            i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD.bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf r2 = i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD.bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf.DrqQ8C7rtVRDTSclHGsDImq     // Catch:{ all -> 0x0030 }
            r6.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = r2     // Catch:{ all -> 0x0030 }
            r6.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96 = r2     // Catch:{ all -> 0x0030 }
            int r2 = r6.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw     // Catch:{ all -> 0x0030 }
            if (r2 <= r0) goto L_0x002c
            java.io.RandomAccessFile r2 = r6.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9     // Catch:{ all -> 0x0030 }
            long r3 = (long) r0     // Catch:{ all -> 0x0030 }
            r2.setLength(r3)     // Catch:{ all -> 0x0030 }
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ all -> 0x0030 }
            r2.force(r1)     // Catch:{ all -> 0x0030 }
        L_0x002c:
            r6.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = r0     // Catch:{ all -> 0x0030 }
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
            goto L_0x0063
        L_0x0030:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0033:
            i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD.bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf r0 = r6.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8     // Catch:{ all -> 0x0065 }
            int r3 = r0.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d     // Catch:{ all -> 0x0065 }
            r4 = 4
            int r3 = r3 + r4
            int r0 = r0.YmFIHVAy6MFnHbke10dLWI57IXCp     // Catch:{ all -> 0x0065 }
            int r3 = r3 + r0
            int r0 = r6.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG(r3)     // Catch:{ all -> 0x0065 }
            byte[] r3 = r6.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG     // Catch:{ all -> 0x0065 }
            r6.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9(r0, r3, r2, r4)     // Catch:{ all -> 0x0065 }
            byte[] r3 = r6.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG     // Catch:{ all -> 0x0065 }
            int r2 = Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(r2, r3)     // Catch:{ all -> 0x0065 }
            int r3 = r6.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw     // Catch:{ all -> 0x0065 }
            int r4 = r6.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT     // Catch:{ all -> 0x0065 }
            int r4 = r4 - r1
            i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD.bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf r5 = r6.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96     // Catch:{ all -> 0x0065 }
            int r5 = r5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d     // Catch:{ all -> 0x0065 }
            r6.NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN(r3, r4, r0, r5)     // Catch:{ all -> 0x0065 }
            int r3 = r6.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT     // Catch:{ all -> 0x0065 }
            int r3 = r3 - r1
            r6.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = r3     // Catch:{ all -> 0x0065 }
            i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD.bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf r1 = new i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD.bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf     // Catch:{ all -> 0x0065 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0065 }
            r6.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = r1     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r6)
            return
        L_0x0065:
            r0 = move-exception
            goto L_0x006d
        L_0x0067:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0065 }
            r0.<init>()     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x006d:
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4RJIik26oHWjDPE0VoxOe5BwYvH4qCMtVk9JCYS9U7iIcxjxvKwD.NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA():void");
    }

    public final void NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        byte[] bArr = this.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        RandomAccessFile randomAccessFile = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        randomAccessFile.seek(0);
        randomAccessFile.write(bArr);
    }

    public final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(byte[] bArr) {
        int i;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    YmFIHVAy6MFnHbke10dLWI57IXCp(length);
                    boolean uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn = uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn();
                    if (uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn) {
                        i = 16;
                    } else {
                        bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf = this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96;
                        i = qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG(bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d + 4 + bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.YmFIHVAy6MFnHbke10dLWI57IXCp);
                    }
                    bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf2 = new bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf(i, length);
                    yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(this.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG, 0, length);
                    uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8(this.qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG, i, 4);
                    uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8(bArr, i + 4, length);
                    NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN(this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw, this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT + 1, uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn ? i : this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d, i);
                    this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96 = bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf2;
                    this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT++;
                    if (uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn) {
                        this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void YmFIHVAy6MFnHbke10dLWI57IXCp(int i) {
        int i2 = i + 4;
        int ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR962 = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw - ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96();
        if (ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR962 < i2) {
            int i3 = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            do {
                ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR962 += i3;
                i3 <<= 1;
            } while (ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR962 < i2);
            RandomAccessFile randomAccessFile = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
            randomAccessFile.setLength((long) i3);
            randomAccessFile.getChannel().force(true);
            bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf = this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96;
            int qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2 = qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG(bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d + 4 + bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.YmFIHVAy6MFnHbke10dLWI57IXCp);
            if (qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2 < this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
                FileChannel channel = randomAccessFile.getChannel();
                channel.position((long) this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
                long j = (long) (qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            int i5 = this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            if (i4 < i5) {
                int i6 = (this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw + i4) - 16;
                NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN(i3, this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT, i5, i6);
                this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96 = new bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf(i6, this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96.YmFIHVAy6MFnHbke10dLWI57IXCp);
            } else {
                NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN(i3, this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT, i5, i4);
            }
            this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = i3;
        }
    }

    public final synchronized void close() {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.close();
    }

    public final int ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96() {
        if (this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT == 0) {
            return 16;
        }
        bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf = this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96;
        int i = bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        int i2 = this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        return i >= i2 ? (i - i2) + 4 + bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.YmFIHVAy6MFnHbke10dLWI57IXCp + 16 : (((i + 4) + bb0jgyaj0ao2i7e0amlb1y1az4x4bcnstsnc5ygcaxocf.YmFIHVAy6MFnHbke10dLWI57IXCp) + this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw) - i2;
    }

    public final bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(int i) {
        if (i == 0) {
            return bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf.DrqQ8C7rtVRDTSclHGsDImq;
        }
        RandomAccessFile randomAccessFile = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        randomAccessFile.seek((long) i);
        return new bB0JGyaj0AO2i7E0aMlb1Y1AZ4X4bcNstSNc5YGcAxOCf(i, randomAccessFile.readInt());
    }

    public final int qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG(int i) {
        int i2 = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
        sb.append(", size=");
        sb.append(this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT);
        sb.append(", first=");
        sb.append(this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8);
        sb.append(", last=");
        sb.append(this.ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96);
        sb.append(", element lengths=[");
        try {
            DrqQ8C7rtVRDTSclHGsDImq(new WA15WLgheoV9pT1dmVjJCJIVunNbOEW9WiQXpjS29LdGYcIw31VmhiSBUw69qFHhtsNzV5dKfHpeDKSkCURZcVVw1asNlDkCby79fKSuTBxAtsKpFY7tINknAkxqNVZoe(sb));
        } catch (IOException e) {
            NcFY6nnnD3zDVXsC1ujUmiLNn3XFBORW4CQPT3JG0ipXsN.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized boolean uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn() {
        return this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT == 0;
    }

    public final void uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8(byte[] bArr, int i, int i2) {
        int qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2 = qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG(i);
        int i3 = qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2 + i2;
        int i4 = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
        RandomAccessFile randomAccessFile = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (i3 <= i4) {
            randomAccessFile.seek((long) qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2;
        randomAccessFile.seek((long) qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final void xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9(int i, byte[] bArr, int i2, int i3) {
        int qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2 = qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG(i);
        int i4 = qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2 + i3;
        int i5 = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
        RandomAccessFile randomAccessFile = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (i4 <= i5) {
            randomAccessFile.seek((long) qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2;
        randomAccessFile.seek((long) qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG2);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }
}
