package a7ArzJbgBNuGCCQcpX6ihjc;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

public final class wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr implements LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA {
    public static final String[] DrqQ8C7rtVRDTSclHGsDImq = {"_data"};
    public static final String[] VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = {"_data"};
    public final /* synthetic */ int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final ContentResolver YmFIHVAy6MFnHbke10dLWI57IXCp;

    public /* synthetic */ wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(ContentResolver contentResolver, int i) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = i;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = contentResolver;
    }

    public final Cursor P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(Uri uri) {
        switch (this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.YmFIHVAy6MFnHbke10dLWI57IXCp.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, DrqQ8C7rtVRDTSclHGsDImq, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.YmFIHVAy6MFnHbke10dLWI57IXCp.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, (String) null);
        }
    }
}
