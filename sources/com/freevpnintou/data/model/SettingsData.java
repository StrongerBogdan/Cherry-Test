package com.freevpnintou.data.model;

import X2pol6shVbN8JggoSvtXZ6aXtDbhmyFB93snmxXteLoPwJW9Xb2OrGyqmYRvO300r9Wuf7DZQliD4cF17XpZlVfrgLxAv2mq3Dtbl1VBgBY1wCnKeV9wI3ZehMzOcauW51KSQNo.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import Xl1fS84ifTfDIVd462oyI4uximijChWvbQGxSPFGZkUYuO2hFcgMJlvaAAOFzarX1k2ap6Owv2LzjHqMKk0DngVbj86K0XK3ITxX0Glxic4HytmA5IKRwdTNDCa.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG;

public final class SettingsData {
    public static final int $stable = 0;
    private final int id;
    private final float musicVolume;
    private final float soundVolume;

    public SettingsData(int i, float f, float f2) {
        this.id = i;
        this.soundVolume = f;
        this.musicVolume = f2;
    }

    public static /* synthetic */ SettingsData copy$default(SettingsData settingsData, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = settingsData.id;
        }
        if ((i2 & 2) != 0) {
            f = settingsData.soundVolume;
        }
        if ((i2 & 4) != 0) {
            f2 = settingsData.musicVolume;
        }
        return settingsData.copy(i, f, f2);
    }

    public final int component1() {
        return this.id;
    }

    public final float component2() {
        return this.soundVolume;
    }

    public final float component3() {
        return this.musicVolume;
    }

    public final SettingsData copy(int i, float f, float f2) {
        return new SettingsData(i, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsData)) {
            return false;
        }
        SettingsData settingsData = (SettingsData) obj;
        return this.id == settingsData.id && Float.compare(this.soundVolume, settingsData.soundVolume) == 0 && Float.compare(this.musicVolume, settingsData.musicVolume) == 0;
    }

    public final int getId() {
        return this.id;
    }

    public final float getMusicVolume() {
        return this.musicVolume;
    }

    public final float getSoundVolume() {
        return this.soundVolume;
    }

    public int hashCode() {
        return Float.hashCode(this.musicVolume) + gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(this.soundVolume, Integer.hashCode(this.id) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100164539968598L));
        sb.append(this.id);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100503842384982L));
        sb.append(this.soundVolume);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100576856829014L));
        return gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA(sb, this.musicVolume, ')');
    }
}
