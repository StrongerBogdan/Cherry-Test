package itI8obOTylimgh3aFvoSDqxOrGmvxvdJfI7MUZgbrVtQIiipeJOt6Lauz2sHzaWHJ0JwIfHxzJeuRWCE5L1eT294M0;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX extends aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX {
    public final Socket Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;

    public S9YugTPzExfo3SDiUstGWx3eKtjcwCa6rTGotFX(Socket socket) {
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = socket;
    }

    public final void BrinjKkMNX0Ww9FldCotLl2() {
        Socket socket = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
        try {
            socket.close();
        } catch (Exception e) {
            Logger logger = zfocMDrnJnbYtdsnKHCh6s.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + socket, e);
        } catch (AssertionError e2) {
            if (LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.uOyBevV98ltUOUilp7DoFm42UWPOTxVsABEgMe8CCuScERPxr2BKOn(e2)) {
                Logger logger2 = zfocMDrnJnbYtdsnKHCh6s.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + socket, e2);
                return;
            }
            throw e2;
        }
    }

    public final IOException N5pXJ15tlNKatG0sBkhrXfiY7co2blYTvm3kVKApSyrf0tWXKlKPrkuHPRi2aPYj45VAoMTWa6sKGS2ZcLrtOpdnNxkt95tZnbpxQYN1985ys62TvSqA(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
