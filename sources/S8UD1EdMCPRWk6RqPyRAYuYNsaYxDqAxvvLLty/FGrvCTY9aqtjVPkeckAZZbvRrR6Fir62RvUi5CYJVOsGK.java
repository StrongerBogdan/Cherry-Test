package S8UD1EdMCPRWk6RqPyRAYuYNsaYxDqAxvvLLty;

import android.media.MediaPlayer;

public final /* synthetic */ class FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    public final /* synthetic */ pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 YmFIHVAy6MFnHbke10dLWI57IXCp;

    public /* synthetic */ FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1, int i) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = i;
        this.YmFIHVAy6MFnHbke10dLWI57IXCp = pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        switch (this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d) {
            case 0:
                pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1 = this.YmFIHVAy6MFnHbke10dLWI57IXCp;
                MediaPlayer mediaPlayer2 = pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1.DrqQ8C7rtVRDTSclHGsDImq;
                if (mediaPlayer2 == null) {
                    return;
                }
                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.setOnCompletionListener(new FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK(pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1, 1));
                    return;
                }
                mediaPlayer2.release();
                pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1.DrqQ8C7rtVRDTSclHGsDImq = null;
                return;
            default:
                mediaPlayer.release();
                this.YmFIHVAy6MFnHbke10dLWI57IXCp.DrqQ8C7rtVRDTSclHGsDImq = null;
                return;
        }
    }
}
