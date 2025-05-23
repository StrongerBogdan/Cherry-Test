package FR5EjxHMlnhgT4g3Cx4ZlPTPTuR7VSyr9dS4OVpMDfBHg2BGe3HbA1bXzNKGQKMp0i40dVoHiWcnjoEpq4vvipBd2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr extends InputStream {
    public int Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = -1;
    public final ByteBuffer xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    public wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(ByteBuffer byteBuffer) {
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = byteBuffer;
    }

    public final int available() {
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.remaining();
    }

    public final synchronized void mark(int i) {
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & 255;
    }

    public final synchronized void reset() {
        int i = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
        if (i != -1) {
            this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j) {
        ByteBuffer byteBuffer = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
