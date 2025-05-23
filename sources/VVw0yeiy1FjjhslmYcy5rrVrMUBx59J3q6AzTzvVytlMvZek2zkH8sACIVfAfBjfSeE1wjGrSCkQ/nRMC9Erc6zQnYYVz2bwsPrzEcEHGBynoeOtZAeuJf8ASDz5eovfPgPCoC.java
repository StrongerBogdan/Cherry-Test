package VVw0yeiy1FjjhslmYcy5rrVrMUBx59J3q6AzTzvVytlMvZek2zkH8sACIVfAfBjfSeE1wjGrSCkQ;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

public final class nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC {
    public final long P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;

    public nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC(long j) {
        this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d = j;
    }

    public static nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC(Long.parseLong(jsonReader.nextString()));
                } else {
                    nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc = new nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC(jsonReader.nextLong());
                    jsonReader.close();
                    return nrmc9erc6zqnyyvz2bwsprzecehgbynoeotzaeujf8asdz5eovfpgpcoc;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC)) {
            return false;
        }
        return this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d == ((nRMC9Erc6zQnYYVz2bwsPrzEcEHGBynoeOtZAeuJf8ASDz5eovfPgPCoC) obj).P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
    }

    public final int hashCode() {
        long j = this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d + "}";
    }
}
