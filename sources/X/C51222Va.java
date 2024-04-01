package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.2Va  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51222Va {
    public final AnonymousClass012 A00;
    public final C2V1 A01;
    public final C462526a A02;
    public final C466827u A03;
    public final C466727t A04;
    public final C2Vd A05;
    public static final byte[] A07 = {87, 65, 4, 1};
    public static final byte[] A06 = {69, 68, 0, 1};

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2Vd] */
    public C51222Va(AnonymousClass012 anonymousClass012, C462526a c462526a, C2V1 c2v1, C0b9 c0b9, C02920Dk c02920Dk, InputStream inputStream, final OutputStream outputStream) {
        C466827u A01;
        byte[] decode;
        int length;
        this.A00 = anonymousClass012;
        this.A02 = c462526a;
        C0b9 A00 = C0b9.A00();
        String string = this.A02.A00.A00.getString("routing_info", null);
        if (!TextUtils.isEmpty(string) && (decode = Base64.decode(string, 3)) != null && (length = decode.length) > 0) {
            outputStream.write(A06);
            outputStream.write(new byte[]{(byte) (length >> 16), (byte) (length >> 8), (byte) length});
            outputStream.write(decode);
        }
        byte[] bArr = A07;
        outputStream.write(bArr);
        this.A01 = c2v1;
        this.A04 = new C466727t(inputStream);
        this.A05 = new FilterOutputStream(outputStream) { // from class: X.2Vd
            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                write(new byte[]{(byte) i});
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr2) {
                write(bArr2, 0, bArr2.length);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr2, int i, int i2) {
                if (i2 < 16777216) {
                    ((FilterOutputStream) this).out.write(AnonymousClass029.A1d(i2));
                    ((FilterOutputStream) this).out.write(bArr2, i, i2);
                    ((FilterOutputStream) this).out.flush();
                    return;
                }
                throw new IOException(C000200d.A0D("data too large to write; length=", i2)) { // from class: X.2SI
                };
            }
        };
        try {
            if (c02920Dk == null) {
                C2i9 c2i9 = new C2i9(C2i9.A05, bArr);
                byte[] bArr2 = A00.A02.A01;
                c2i9.A03.A00(bArr2);
                C0CT AVX = C54142iB.A04.AVX();
                C0AN A012 = C0AN.A01(bArr2, 0, bArr2.length);
                AVX.A02();
                C54142iB c54142iB = (C54142iB) AVX.A00;
                c54142iB.A00 |= 1;
                c54142iB.A01 = A012;
                C54142iB c54142iB2 = (C54142iB) AVX.A01();
                C0CT AVX2 = C54162iD.A04.AVX();
                AVX2.A02();
                C54162iD c54162iD = (C54162iD) AVX2.A00;
                if (c54142iB2 != null) {
                    c54162iD.A02 = c54142iB2;
                    c54162iD.A00 |= 1;
                    write(AVX2.A01().A0B());
                    A01 = A01(c2i9, A00, c0b9, A00());
                } else {
                    throw null;
                }
            } else {
                try {
                    C2i9 c2i92 = new C2i9(C2i9.A06, bArr);
                    C02920Dk c02920Dk2 = new C02920Dk(c2i92.A01(c02920Dk.A01));
                    byte[] bArr3 = A00.A02.A01;
                    C54132iA c54132iA = c2i92.A03;
                    c54132iA.A00(bArr3);
                    C02930Dl c02930Dl = A00.A01;
                    c2i92.A00(C02180Ae.A1f(c02920Dk2, c02930Dl));
                    byte[] A02 = c2i92.A02(c0b9.A02.A01);
                    C02930Dl c02930Dl2 = c0b9.A01;
                    c2i92.A00(C02180Ae.A1f(c02920Dk2, c02930Dl2));
                    byte[] A022 = c2i92.A02(this.A01.A0B());
                    C0CT AVX3 = C54142iB.A04.AVX();
                    C0AN A013 = C0AN.A01(bArr3, 0, bArr3.length);
                    AVX3.A02();
                    C54142iB c54142iB3 = (C54142iB) AVX3.A00;
                    c54142iB3.A00 |= 1;
                    c54142iB3.A01 = A013;
                    C0AN A014 = C0AN.A01(A02, 0, A02.length);
                    AVX3.A02();
                    C54142iB c54142iB4 = (C54142iB) AVX3.A00;
                    c54142iB4.A00 |= 2;
                    c54142iB4.A03 = A014;
                    C0AN A015 = C0AN.A01(A022, 0, A022.length);
                    AVX3.A02();
                    C54142iB c54142iB5 = (C54142iB) AVX3.A00;
                    c54142iB5.A00 |= 4;
                    c54142iB5.A02 = A015;
                    C54142iB c54142iB6 = (C54142iB) AVX3.A01();
                    C0CT AVX4 = C54162iD.A04.AVX();
                    AVX4.A02();
                    C54162iD c54162iD2 = (C54162iD) AVX4.A00;
                    if (c54142iB6 != null) {
                        c54162iD2.A02 = c54142iB6;
                        c54162iD2.A00 |= 1;
                        write(AVX4.A01().A0B());
                        C54182iF A002 = A00();
                        if ((A002.A00 & 2) == 2) {
                            throw new C54212iI(A002);
                        }
                        byte[] A062 = A002.A01.A06();
                        c54132iA.A00(A062);
                        int length2 = A062.length;
                        if (length2 == 32) {
                            c2i92.A00(C40631sa.A00().A04(A062, c02930Dl.A01));
                            c2i92.A00(C40631sa.A00().A04(A062, c02930Dl2.A01));
                            c2i92.A01(A002.A02.A06());
                            byte[][] A1k = AnonymousClass029.A1k(C002701i.A1Z(new byte[0], c2i92.A02, null, 64));
                            A01 = new C466827u(A1k[0], A1k[1], c02920Dk2);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Wrong length: ");
                            sb.append(length2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw null;
                    }
                } catch (C467027w e) {
                    throw new C467127x(e);
                }
            }
        } catch (C54212iI e2) {
            C54182iF c54182iF = e2.serverHello;
            C2i9 c2i93 = new C2i9(C2i9.A04, bArr);
            c2i93.A03.A00(A00.A02.A01);
            A01 = A01(c2i93, A00, c0b9, c54182iF);
        }
        this.A03 = A01;
    }

    public final C54182iF A00() {
        C466727t c466727t = this.A04;
        byte[] A00 = c466727t.A00(3);
        if (!Arrays.equals(C466727t.A01, A00)) {
            C54162iD c54162iD = (C54162iD) C0AZ.A03(C54162iD.A04, c466727t.A00(AnonymousClass029.A09(A00)));
            if ((c54162iD.A00 & 2) == 2) {
                C54182iF c54182iF = c54162iD.A03;
                if (c54182iF == null) {
                    return C54182iF.A04;
                }
                return c54182iF;
            }
            throw new IOException("Handshake message does not contain server hello!");
        }
        throw new IOException() { // from class: X.2Wi
        };
    }

    public final C466827u A01(C2i9 c2i9, C0b9 c0b9, C0b9 c0b92, C54182iF c54182iF) {
        try {
            byte[] A062 = c54182iF.A01.A06();
            c2i9.A03.A00(A062);
            int length = A062.length;
            if (length == 32) {
                C02930Dl c02930Dl = c0b9.A01;
                c2i9.A00(C40631sa.A00().A04(A062, c02930Dl.A01));
                C02920Dk c02920Dk = new C02920Dk(c2i9.A01(c54182iF.A03.A06()));
                c2i9.A00(C02180Ae.A1f(c02920Dk, c02930Dl));
                byte[] A01 = c2i9.A01(c54182iF.A02.A06());
                AnonymousClass012 anonymousClass012 = this.A00;
                try {
                    C54222iJ c54222iJ = (C54222iJ) C0AZ.A03(C54222iJ.A03, A01);
                    byte[] A063 = c54222iJ.A01.A06();
                    try {
                        C54232iK c54232iK = (C54232iK) C0AZ.A03(C54232iK.A06, A063);
                        C02920Dk c02920Dk2 = (C02920Dk) C54242iL.A00.get(c54232iK.A04);
                        if (c02920Dk2 == null) {
                            C000200d.A1M(C000200d.A0P("noise certificate issued by unknown source; issuer="), c54232iK.A04);
                        } else {
                            if (!C40631sa.A00().A03(c02920Dk2.A01, A063, c54222iJ.A02.A06())) {
                                C000200d.A1M(C000200d.A0P("invalid signature on noise certificate; issuer="), c54232iK.A04);
                            } else if (!Arrays.equals(c54232iK.A03.A06(), c02920Dk.A01)) {
                                C000200d.A1M(C000200d.A0P("noise certificate key does not match proposed server static key; issuer="), c54232iK.A04);
                            } else if ((c54232iK.A00 & 4) == 4 && c54232iK.A02 < anonymousClass012.A05() / 1000) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
                                StringBuilder A0P = C000200d.A0P("noise certificate expired; issuer=");
                                A0P.append(c54232iK.A04);
                                A0P.append("; expires=");
                                A0P.append(simpleDateFormat.format(new Date(c54232iK.A02 * 1000)));
                                Log.e(A0P.toString());
                            } else {
                                byte[] A02 = c2i9.A02(c0b92.A02.A01);
                                c2i9.A00(C40631sa.A00().A04(A062, c0b92.A01.A01));
                                byte[] A022 = c2i9.A02(this.A01.A0B());
                                C0CT AVX = C54252iM.A03.AVX();
                                C0AN A012 = C0AN.A01(A02, 0, A02.length);
                                AVX.A02();
                                C54252iM c54252iM = (C54252iM) AVX.A00;
                                c54252iM.A00 |= 1;
                                c54252iM.A02 = A012;
                                C0AN A013 = C0AN.A01(A022, 0, A022.length);
                                AVX.A02();
                                C54252iM c54252iM2 = (C54252iM) AVX.A00;
                                c54252iM2.A00 |= 2;
                                c54252iM2.A01 = A013;
                                C54252iM c54252iM3 = (C54252iM) AVX.A01();
                                C0CT AVX2 = C54162iD.A04.AVX();
                                AVX2.A02();
                                C54162iD c54162iD = (C54162iD) AVX2.A00;
                                if (c54252iM3 != null) {
                                    c54162iD.A01 = c54252iM3;
                                    c54162iD.A00 |= 4;
                                    write(AVX2.A01().A0B());
                                    byte[][] A1k = AnonymousClass029.A1k(C002701i.A1Z(new byte[0], c2i9.A02, null, 64));
                                    return new C466827u(A1k[0], A1k[1], c02920Dk);
                                }
                                throw null;
                            }
                        }
                    } catch (C0JX e) {
                        Log.e("noise certificate details parsing failed", e);
                    }
                } catch (C0JX e2) {
                    Log.e("noise certificate parsing failed", e2);
                }
                throw new Exception() { // from class: X.2WG
                    {
                        super("Untrusted server cert");
                    }
                };
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Wrong length: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } catch (C467027w e3) {
            throw new C467127x(e3);
        }
    }
}
