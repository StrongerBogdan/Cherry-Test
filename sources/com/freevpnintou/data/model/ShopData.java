package com.freevpnintou.data.model;

import WZzKBFiavuBbEH9SEUHXa4D4PUPTrJheXkN1sV5I7LfyT.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;
import X2pol6shVbN8JggoSvtXZ6aXtDbhmyFB93snmxXteLoPwJW9Xb2OrGyqmYRvO300r9Wuf7DZQliD4cF17XpZlVfrgLxAv2mq3Dtbl1VBgBY1wCnKeV9wI3ZehMzOcauW51KSQNo.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import Xl1fS84ifTfDIVd462oyI4uximijChWvbQGxSPFGZkUYuO2hFcgMJlvaAAOFzarX1k2ap6Owv2LzjHqMKk0DngVbj86K0XK3ITxX0Glxic4HytmA5IKRwdTNDCa.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX;

public final class ShopData {
    public static final int $stable = 0;
    private final int cost;
    private final int id;
    private final boolean isOpen;
    private final int itemRes;

    public ShopData(int i, int i2, boolean z, int i3) {
        this.id = i;
        this.itemRes = i2;
        this.isOpen = z;
        this.cost = i3;
    }

    public static /* synthetic */ ShopData copy$default(ShopData shopData, int i, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = shopData.id;
        }
        if ((i4 & 2) != 0) {
            i2 = shopData.itemRes;
        }
        if ((i4 & 4) != 0) {
            z = shopData.isOpen;
        }
        if ((i4 & 8) != 0) {
            i3 = shopData.cost;
        }
        return shopData.copy(i, i2, z, i3);
    }

    public final int component1() {
        return this.id;
    }

    public final int component2() {
        return this.itemRes;
    }

    public final boolean component3() {
        return this.isOpen;
    }

    public final int component4() {
        return this.cost;
    }

    public final ShopData copy(int i, int i2, boolean z, int i3) {
        return new ShopData(i, i2, z, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopData)) {
            return false;
        }
        ShopData shopData = (ShopData) obj;
        return this.id == shopData.id && this.itemRes == shopData.itemRes && this.isOpen == shopData.isOpen && this.cost == shopData.cost;
    }

    public final int getCost() {
        return this.cost;
    }

    public final int getId() {
        return this.id;
    }

    public final int getItemRes() {
        return this.itemRes;
    }

    public int hashCode() {
        return Integer.hashCode(this.cost) + gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.peWj2vBaTGXaSVZcclMS1QR5VFfj9k2Ro1TkEeOT4X7bpWNeX4hNGCEdprBXcQXCbLki3foy6j7SpuBuT6(LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.YmFIHVAy6MFnHbke10dLWI57IXCp(this.itemRes, Integer.hashCode(this.id) * 31, 31), 31, this.isOpen);
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100374993366102L));
        sb.append(this.id);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100456597744726L));
        sb.append(this.itemRes);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-100409353104470L));
        sb.append(this.isOpen);
        sb.append(wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(-75489952853078L));
        return gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9(sb, this.cost, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShopData(int i, int i2, boolean z, int i3, int i4, aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX aakmklbkezaroygc5dgmgec4zhadccehbn6r1gn2o2cyigsvx2gbytke2kyjhtmjqo9jaexle3pux) {
        this(i, i2, (i4 & 4) != 0 ? false : z, i3);
    }
}
