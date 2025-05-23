package pqE5I4H2lZeKSNrTtWCcL6p4p2jKTUvH4MK4sQrNVqu4irQ2cVrCwGJcSIDD2BqppVEpYvV6sl;

import Xl1fS84ifTfDIVd462oyI4uximijChWvbQGxSPFGZkUYuO2hFcgMJlvaAAOFzarX1k2ap6Owv2LzjHqMKk0DngVbj86K0XK3ITxX0Glxic4HytmA5IKRwdTNDCa.gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA extends InputStream implements DataInput {
    public static final ByteOrder ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96 = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG = ByteOrder.BIG_ENDIAN;
    public int GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    public ByteOrder Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public byte[] uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8;
    public final DataInputStream xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;

    public LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(int i) {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
            int i3 = i - i2;
            int skip = (int) dataInputStream.skip((long) i3);
            if (skip <= 0) {
                if (this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 == null) {
                    this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8 = new byte[8192];
                }
                skip = dataInputStream.read(this.uSPzwon3h3afDxL8OXJTWGiki0rybAPqNtMD48vX967e1Yh3jajI7do4lEPybuhojvLQmCY34McmrJGxL8AW84VsBmCgaOj4uwpQW6xYNisv7GyjZwwdqt6dGoOHOqEC8, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(gevZisGpxsTSC2qbbnIQnk9DyjfZCnV2T4t4wpPB9Vs9pdSjZYxPGSiG.BrinjKkMNX0Ww9FldCotLl2(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += i2;
    }

    public final int available() {
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.available();
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public final int read() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT++;
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.read();
    }

    public final boolean readBoolean() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT++;
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.readBoolean();
    }

    public final byte readByte() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT++;
        int read = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += 2;
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += i2;
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.readFully(bArr, i, i2);
    }

    public final int readInt() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += 4;
        DataInputStream dataInputStream = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            if (byteOrder == ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
        }
        throw new EOFException();
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += 8;
        DataInputStream dataInputStream = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            if (byteOrder == ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96) {
                return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
            }
            int i = read;
            if (byteOrder == qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG) {
                return (((long) i) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
            }
            throw new IOException("Invalid byte order: " + this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
        }
        throw new EOFException();
    }

    public final short readShort() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += 2;
        DataInputStream dataInputStream = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            if (byteOrder == ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += 2;
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.readUTF();
    }

    public final int readUnsignedByte() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT++;
        return this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += 2;
        DataInputStream dataInputStream = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
            if (byteOrder == ldGdYLUh6hMmv4Hx5TzlrrWxo0uqaUSVZfITVO5uH8OME4MWnKFycS8Eu4oWAhjwOIOnBDRLQYn5vN4frfi8x7xEl0yzxR96) {
                return (read2 << 8) + read;
            }
            if (byteOrder == qET9a8lmqGmWjBV7vMaqNX6EIjrBJ1BEMmsBfo1nCSKWtIwkxCVLD9vLcOZZRJp6QDWeKGIQY4h2lSrJi4j6oHeQROm4bMvRnOY1DhEjcLrefVJZ4jeMUOP5Zb1eeRRojbQtbf6WYpzrby7DrQ8msL9fG) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
        }
        throw new EOFException();
    }

    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA(InputStream inputStream, ByteOrder byteOrder) {
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = dataInputStream;
        dataInputStream.mark(0);
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = 0;
        this.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = byteOrder;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.read(bArr, i, i2);
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += read;
        return read;
    }

    public final void readFully(byte[] bArr) {
        this.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT += bArr.length;
        this.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9.readFully(bArr);
    }
}
