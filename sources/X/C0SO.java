package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* renamed from: X.0SO */
/* loaded from: classes.dex */
public class C0SO {
    public int A01;
    public final C2I4 A02 = new C2I4();
    public int A00 = -1;

    public static int A00(double d, C2I4 c2i4) {
        long j = (long) d;
        if (j == d) {
            return A01(j, c2i4);
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        c2i4.write((byte) doubleToRawLongBits);
        c2i4.write((byte) (doubleToRawLongBits >> 8));
        c2i4.write((byte) (doubleToRawLongBits >> 16));
        c2i4.write((byte) (doubleToRawLongBits >> 24));
        c2i4.write((byte) (doubleToRawLongBits >> 32));
        c2i4.write((byte) (doubleToRawLongBits >> 40));
        c2i4.write((byte) (doubleToRawLongBits >> 48));
        c2i4.write((byte) (doubleToRawLongBits >> 56));
        return 7;
    }

    public static int A01(long j, C2I4 c2i4) {
        if (j == 0) {
            return 1;
        }
        if (j == 1) {
            return 2;
        }
        c2i4.write((byte) j);
        if (-128 <= j && j <= 127) {
            return 3;
        }
        c2i4.write((byte) (j >> 8));
        if (-32768 > j || j > 32767) {
            c2i4.write((byte) (j >> 16));
            c2i4.write((byte) (j >> 24));
            if (-2147483648L <= j && j <= 2147483647L) {
                return 5;
            }
            c2i4.write((byte) (j >> 32));
            c2i4.write((byte) (j >> 40));
            c2i4.write((byte) (j >> 48));
            c2i4.write((byte) (j >> 56));
            return 6;
        }
        return 4;
    }

    public static int A02(long j, C2I4 c2i4) {
        if (j >= 0 && j <= 4294967295L) {
            c2i4.write((byte) j);
            if (j <= 255) {
                return 1;
            }
            c2i4.write((byte) (j >> 8));
            if (j <= 65535) {
                return 2;
            }
            c2i4.write((byte) (j >> 16));
            c2i4.write((byte) (j >> 24));
            return 4;
        }
        throw new IllegalArgumentException("Value is not an unsigned integer");
    }

    public static int A03(Object obj, C2I4 c2i4) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return A01(((Boolean) obj).booleanValue() ? 1L : 0L, c2i4);
        } else if (obj instanceof Long) {
            return A01(((Number) obj).longValue(), c2i4);
        } else {
            if (obj instanceof Number) {
                return A00(((Number) obj).doubleValue(), c2i4);
            }
            if (obj instanceof String) {
                return A04((String) obj, c2i4);
            }
            StringBuilder A0P = C000200d.A0P("Expected class Boolean, Number, or String, got ");
            A0P.append(obj.getClass().getName());
            throw new IllegalArgumentException(A0P.toString());
        }
    }

    public static int A04(String str, C2I4 c2i4) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            if (length > 1024) {
                Log.w(String.format(Locale.US, "wam/serialize: string length is limited to %d UTF-8 bytes", 1024));
            }
            int min = Math.min(length, 1024);
            int A02 = A02(min, c2i4);
            c2i4.write(bytes, 0, min);
            if (A02 != 1) {
                if (A02 != 2) {
                    if (A02 == 4) {
                        return 10;
                    }
                    throw new Error("Impossible");
                }
                return 9;
            }
            return 8;
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    public static long A05(int i, ByteBuffer byteBuffer) {
        if (4 >= i) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j |= (byteBuffer.get() & 255) << (i2 << 3);
            }
            return j;
        }
        throw new IllegalArgumentException(C000200d.A0D("Invalid number of bytes: ", i));
    }

    public static C2I2 A06(ByteBuffer byteBuffer) {
        try {
            return A07(byteBuffer);
        } catch (BufferUnderflowException unused) {
            throw new C2I3("Incomplete buffer");
        }
    }

    public static C2I2 A07(ByteBuffer byteBuffer) {
        long A05;
        Object obj;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int position = byteBuffer.position();
        byte b = byteBuffer.get();
        int i = b & 3;
        if (i <= 2) {
            if (!((b & 8) != 0)) {
                A05 = A05(1, byteBuffer);
            } else {
                A05 = A05(2, byteBuffer);
            }
            int i2 = (int) A05;
            int i3 = (b >> 4) & 15;
            if (i3 <= 10) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                switch (i3) {
                    case 0:
                        obj = null;
                        break;
                    case 1:
                        obj = 0;
                        break;
                    case 2:
                        obj = 1;
                        break;
                    case 3:
                        obj = Byte.valueOf(byteBuffer.get());
                        break;
                    case 4:
                        obj = Short.valueOf(byteBuffer.getShort());
                        break;
                    case 5:
                        obj = Integer.valueOf(byteBuffer.getInt());
                        break;
                    case 6:
                        obj = Long.valueOf(byteBuffer.getLong());
                        break;
                    case 7:
                        obj = Double.valueOf(byteBuffer.getDouble());
                        break;
                    case 8:
                        obj = A08((int) A05(1, byteBuffer), byteBuffer);
                        break;
                    case 9:
                        obj = A08((int) A05(2, byteBuffer), byteBuffer);
                        break;
                    case 10:
                        obj = A08((int) A05(4, byteBuffer), byteBuffer);
                        break;
                    default:
                        throw new Error("Invalid value type");
                }
                return new C2I2(i, i2, obj);
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value type ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            } catch (IllegalArgumentException e) {
                String format = String.format(Locale.US, "%02X ", Byte.valueOf(b));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e);
                sb2.append(" at ");
                sb2.append(position);
                sb2.append(", tag: ");
                sb2.append(format);
                throw new C2I3(sb2.toString());
            }
        }
        try {
            throw new IllegalArgumentException("Invalid record type");
        } catch (IllegalArgumentException e2) {
            String format2 = String.format(Locale.US, "%02X ", Byte.valueOf(b));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e2);
            sb3.append(" at ");
            sb3.append(position);
            sb3.append(", tag: ");
            sb3.append(format2);
            throw new C2I3(sb3.toString());
        }
    }

    public static String A08(int i, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("UnsupportedEncoding: ");
            sb.append(e);
            throw new C2I3(sb.toString());
        }
    }

    public final byte A09() {
        return this.A02.A01()[this.A00];
    }

    public int A0A() {
        return this.A02.size();
    }

    public void A0B() {
        this.A02.reset();
        this.A00 = -1;
        this.A01 = 0;
    }

    public final void A0C(byte b) {
        this.A02.A01()[this.A00] = b;
    }

    public final void A0D(int i, int i2, Object obj) {
        C2I4 c2i4 = this.A02;
        this.A00 = c2i4.size();
        int i3 = 0;
        c2i4.write(0);
        int A02 = A02(i2, c2i4);
        if (A02 != 1) {
            if (A02 != 2) {
                throw new Error("Id too big to fit in 2 bytes");
            }
            i3 = 1;
        }
        A0C((byte) (i | (A03(obj, c2i4) << 4) | (i3 << 3)));
        this.A01++;
    }
}
