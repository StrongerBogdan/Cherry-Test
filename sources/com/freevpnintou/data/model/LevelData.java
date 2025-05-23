package com.freevpnintou.data.model;

import X2pol6shVbN8JggoSvtXZ6aXtDbhmyFB93snmxXteLoPwJW9Xb2OrGyqmYRvO300r9Wuf7DZQliD4cF17XpZlVfrgLxAv2mq3Dtbl1VBgBY1wCnKeV9wI3ZehMzOcauW51KSQNo.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;

public final class LevelData {
    public static final int $stable = 0;
    private final int id;
    private final boolean isOpen;

    public LevelData(int i, boolean z) {
        this.id = i;
        this.isOpen = z;
    }

    public static /* synthetic */ LevelData copy$default(LevelData levelData, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = levelData.id;
        }
        if ((i2 & 2) != 0) {
            z = levelData.isOpen;
        }
        return levelData.copy(i, z);
    }

    public final int component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.isOpen;
    }

    public final LevelData copy(int i, boolean z) {
        return new LevelData(i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelData)) {
            return false;
        }
        LevelData levelData = (LevelData) obj;
        return this.id == levelData.id && this.isOpen == levelData.isOpen;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOpen) + (Integer.hashCode(this.id) * 31);
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public String toString() {
        return wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-101152382446678L) + this.id + wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-101092252904534L) + this.isOpen + ')';
    }
}
