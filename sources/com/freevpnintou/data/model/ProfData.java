package com.freevpnintou.data.model;

import X2pol6shVbN8JggoSvtXZ6aXtDbhmyFB93snmxXteLoPwJW9Xb2OrGyqmYRvO300r9Wuf7DZQliD4cF17XpZlVfrgLxAv2mq3Dtbl1VBgBY1wCnKeV9wI3ZehMzOcauW51KSQNo.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import Xl1fS84ifTfDIVd462oyI4uximijChWvbQGxSPFGZkUYuO2hFcgMJlvaAAOFzarX1k2ap6Owv2LzjHqMKk0DngVbj86K0XK3ITxX0Glxic4HytmA5IKRwdTNDCa.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public final class ProfData {
    public static final int $stable = 0;
    private final int age;
    private final boolean gender;
    private final int id;
    private final String name;
    private final String photo;
    private final int score;

    public ProfData(int i, String str, String str2, boolean z, int i2, int i3) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100911864278102L));
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str2, wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100886094474326L));
        this.id = i;
        this.photo = str;
        this.name = str2;
        this.gender = z;
        this.age = i2;
        this.score = i3;
    }

    public static /* synthetic */ ProfData copy$default(ProfData profData, int i, String str, String str2, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = profData.id;
        }
        if ((i4 & 2) != 0) {
            str = profData.photo;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            str2 = profData.name;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            z = profData.gender;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            i2 = profData.age;
        }
        int i5 = i2;
        if ((i4 & 32) != 0) {
            i3 = profData.score;
        }
        return profData.copy(i, str3, str4, z2, i5, i3);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.photo;
    }

    public final String component3() {
        return this.name;
    }

    public final boolean component4() {
        return this.gender;
    }

    public final int component5() {
        return this.age;
    }

    public final int component6() {
        return this.score;
    }

    public final ProfData copy(int i, String str, String str2, boolean z, int i2, int i3) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str, wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-101002058591318L));
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(str2, wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100976288787542L));
        return new ProfData(i, str, str2, z, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfData)) {
            return false;
        }
        ProfData profData = (ProfData) obj;
        return this.id == profData.id && LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(this.photo, profData.photo) && LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(this.name, profData.name) && this.gender == profData.gender && this.age == profData.age && this.score == profData.score;
    }

    public final int getAge() {
        return this.age;
    }

    public final boolean getGender() {
        return this.gender;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final int getScore() {
        return this.score;
    }

    public int hashCode() {
        int hashCode = this.photo.hashCode();
        return Integer.hashCode(this.score) + WZzKBFiavuBbEH9SEUHXa4D4PUPTrJheXkN1sV5I7LfyT.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.YmFIHVAy6MFnHbke10dLWI57IXCp(this.age, gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6((this.name.hashCode() + ((hashCode + (Integer.hashCode(this.id) * 31)) * 31)) * 31, 31, this.gender), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100954813951062L));
        sb.append(this.id);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100211784608854L));
        sb.append(this.photo);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100310568856662L));
        sb.append(this.name);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100276209118294L));
        sb.append(this.gender);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100095820491862L));
        sb.append(this.age);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100065755720790L));
        return gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9(sb, this.score, ')');
    }
}
