package X;

import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3aG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C72583aG {
    public int A00;
    public C72553aD A01 = new C72553aD();
    public File A02;
    public boolean A03;
    public static final byte[] A07 = "%PDF-".getBytes();
    public static final byte[] A05 = "%FDF-".getBytes();
    public static final byte[] A06 = " obj".getBytes();
    public static final byte[] A04 = "endobj".getBytes();
    public static final byte[] A08 = "stream".getBytes();
    public static final String[] A09 = {"/RichMedia", "/JS", "/JavaScript", "/AA", "/Launch", "/RichMediaInstance"};

    public static boolean A02(int i) {
        return i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 40 || i == 41 || i == -1;
    }

    public static boolean A03(int i) {
        return i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
    }

    public C72583aG(File file) {
        this.A02 = file;
    }

    public static int A00(InputStream inputStream) {
        int read = inputStream.read();
        while (A03(read)) {
            read = inputStream.read();
        }
        return read;
    }

    public static void A01(InputStream inputStream) {
        int A00 = A00(inputStream);
        if (A00 == -1) {
            return;
        }
        while (true) {
            if (A00 == 40) {
                while (true) {
                    int read = inputStream.read();
                    if (read == 92) {
                        inputStream.read();
                    } else if (read != 41 && read != -1) {
                    }
                }
            } else if (A00 != 60) {
                if (A00 == 91) {
                    A01(inputStream);
                } else if (A00 == 93 || A00 == -1) {
                    return;
                }
            } else {
                do {
                } while (inputStream.read() != 62);
            }
            A00 = inputStream.read();
        }
    }

    public Map A04(InputStream inputStream) {
        HashMap hashMap = new HashMap();
        int A00 = A00(inputStream);
        while (true) {
            if (A03(A00)) {
                A00 = A00(inputStream);
            }
            if (A00 != -1 && (A00 != 62 || inputStream.read() != 62)) {
                StringBuilder sb = new StringBuilder();
                do {
                    sb.append((char) A00);
                    A00 = inputStream.read();
                    if (A02(A00)) {
                        break;
                    }
                } while (!A03(A00));
                if (A03(A00)) {
                    A00 = A00(inputStream);
                }
                if (A00 == -1) {
                    break;
                }
                Object obj = null;
                if (A00 == 40) {
                    while (true) {
                        int read = inputStream.read();
                        if (read == 92) {
                            inputStream.read();
                        } else if (read == 41 || read == -1) {
                            break;
                        }
                    }
                    A00 = inputStream.read();
                } else if (A00 == 60) {
                    A00 = inputStream.read();
                    if (A00 == 60) {
                        obj = A04(inputStream);
                        A00 = inputStream.read();
                    }
                } else if (A00 != 91) {
                    StringBuilder sb2 = new StringBuilder();
                    if (A00 == 47) {
                        sb2.append((char) A00);
                        A00 = inputStream.read();
                    }
                    while (true) {
                        if (A02(A00) && !A03(A00)) {
                            break;
                        }
                        sb2.append((char) A00);
                        A00 = inputStream.read();
                    }
                    obj = sb2.toString().trim();
                } else {
                    A01(inputStream);
                    A00 = inputStream.read();
                }
                hashMap.put(sb.toString().trim(), obj);
            } else {
                break;
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw new X.C72573aF();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05() {
        /*
            r6 = this;
            r0 = 0
            r6.A00 = r0
            r6.A03 = r0
            java.io.File r1 = r6.A02
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            r4.<init>(r0)
            X.3aD r0 = r6.A01     // Catch: java.lang.Throwable -> L55
            byte[] r1 = r0.A01     // Catch: java.lang.Throwable -> L55
            r0 = 0
            java.util.Arrays.fill(r1, r0)     // Catch: java.lang.Throwable -> L55
            r5 = 0
        L1a:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L55
            if (r0 < 0) goto L4f
            X.3aD r3 = r6.A01     // Catch: java.lang.Throwable -> L55
            byte r1 = (byte) r0     // Catch: java.lang.Throwable -> L55
            byte[] r0 = r3.A01     // Catch: java.lang.Throwable -> L55
            int r2 = r3.A00     // Catch: java.lang.Throwable -> L55
            r0[r2] = r1     // Catch: java.lang.Throwable -> L55
            r1 = 1
            int r2 = r2 + r1
            r3.A00 = r2     // Catch: java.lang.Throwable -> L55
            int r0 = r0.length     // Catch: java.lang.Throwable -> L55
            int r2 = r2 % r0
            r3.A00 = r2     // Catch: java.lang.Throwable -> L55
            byte[] r0 = X.C72583aG.A07     // Catch: java.lang.Throwable -> L55
            boolean r0 = r3.A00(r0)     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L48
            byte[] r0 = X.C72583aG.A05     // Catch: java.lang.Throwable -> L55
            boolean r0 = r3.A00(r0)     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L48
            int r5 = r5 + 1
            r0 = 1024(0x400, float:1.435E-42)
            if (r5 >= r0) goto L4f
            goto L1a
        L48:
            r6.A06(r4, r1)     // Catch: java.lang.Throwable -> L55
            r4.close()
            return
        L4f:
            X.3aF r0 = new X.3aF     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72583aG.A05():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0000 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(final java.io.InputStream r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72583aG.A06(java.io.InputStream, boolean):void");
    }

    public final void A07(String str) {
        if (!TextUtils.isEmpty(str) && str.charAt(0) == '/' && str.indexOf(35) >= 0) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '#' && i <= length - 3) {
                    try {
                        sb.append((char) Integer.parseInt(str.substring(i + 1, i + 3), 16));
                        i += 2;
                    } catch (NumberFormatException unused) {
                        sb.append(charAt);
                    }
                } else {
                    sb.append(charAt);
                }
                i++;
            }
            str = sb.toString();
        }
        for (String str2 : A09) {
            if (str2.equals(str)) {
                this.A03 = true;
                C000200d.A14("pdfparser/checkname pdf contains suspicious name ", str);
            }
        }
    }

    public final void A08(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            A07((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof String) {
                A07((String) value);
            } else if (value instanceof Map) {
                A08((Map) value);
            }
        }
    }

    public final boolean A09(InputStream inputStream, byte[] bArr) {
        Arrays.fill(this.A01.A01, (byte) 0);
        int read = inputStream.read();
        while (read >= 0) {
            C72553aD c72553aD = this.A01;
            byte b = (byte) read;
            byte[] bArr2 = c72553aD.A01;
            int i = c72553aD.A00;
            bArr2[i] = b;
            int i2 = i + 1;
            c72553aD.A00 = i2;
            c72553aD.A00 = i2 % bArr2.length;
            if (c72553aD.A00(bArr)) {
                return true;
            }
            read = inputStream.read();
        }
        return false;
    }
}
