package u7WSURlE4UdW83Fpzp6QuhjxNinQRIdijMWqRq2SzYzZwLHMYceV3WdoH3Sxb54y3kpveUEWmbK3WyUaeaGQmc8HZT4kEZkfdoey9cENBRl54QRnr2FfxNrXW3n9zyKmVjJO0;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ extends MediaDataSource {
    public final /* synthetic */ ByteBuffer xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    public hcbD5JnYtZWRUplQnAKSB4K6rMgILsdqTepvJUiT5QvBVnKVg8pMGRAkHHhIH7CCrpe8RdZ04tGKL9Ow2M6iiLPGOgY9QUurTIjfxWKZ(ByteBuffer byteBuffer) {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.limit();
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (j >= ((long) byteBuffer.limit())) {
            return -1;
        }
        byteBuffer.position((int) j);
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
