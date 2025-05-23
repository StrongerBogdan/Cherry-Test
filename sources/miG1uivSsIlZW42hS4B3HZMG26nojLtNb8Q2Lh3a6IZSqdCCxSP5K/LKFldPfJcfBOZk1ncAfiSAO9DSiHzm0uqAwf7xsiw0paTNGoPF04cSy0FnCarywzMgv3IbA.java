package miG1uivSsIlZW42hS4B3HZMG26nojLtNb8Q2Lh3a6IZSqdCCxSP5K;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;

public abstract class LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA {
    public static final ByteBuffer P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.oyvK1kTrRf3tlj9fHjZjN6freUc3VsJnyo10eIgiHGpIjYVqzmOqLAZyI78j0nhqnpvpZBYcayT3cwe9aGiIeTqRiS9dC9fYyEc1BLd6JBDW4vtIRArnnO7yLJU(order, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = order;
    }

    public static final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(byteBuffer2, "destination");
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray() || byteBuffer.isReadOnly() || byteBuffer2.isReadOnly()) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.position(i);
            duplicate.limit(i + i2);
            ByteBuffer duplicate2 = byteBuffer2.duplicate();
            duplicate2.position(i3);
            duplicate2.put(duplicate);
            return;
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + i3, i2);
    }
}
