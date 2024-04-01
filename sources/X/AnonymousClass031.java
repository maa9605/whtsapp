package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.031  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass031 {
    public static volatile AnonymousClass031 A04;
    public ArrayList A01;
    public final C001200o A03;
    public boolean A02 = false;
    public AnonymousClass032 A00 = null;

    public AnonymousClass031(C001200o c001200o) {
        this.A03 = c001200o;
    }

    public static AnonymousClass031 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass031.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass031(C001200o.A01);
                }
            }
        }
        return A04;
    }

    public C10120fK A01(String str) {
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    A06();
                    AnonymousClass032 anonymousClass032 = new AnonymousClass032(this.A01.size());
                    Iterator it = this.A01.iterator();
                    while (it.hasNext()) {
                        C10120fK c10120fK = (C10120fK) it.next();
                        anonymousClass032.A03(c10120fK.A02, c10120fK);
                    }
                    this.A00 = anonymousClass032;
                } catch (IOException unused) {
                    throw new RuntimeException("empty metadata");
                }
            }
        }
        try {
            return (C10120fK) this.A00.A01(str);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02(int r10, java.lang.String r11) {
        /*
            r9 = this;
            r9.A06()
            java.util.ArrayList r0 = r9.A01
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r6 = r2.next()
            X.0fK r6 = (X.C10120fK) r6
            int r1 = r6.A00
            if (r1 != r10) goto L9
            r0 = 7
            r7 = 0
            if (r1 == r0) goto L52
            r0 = 241(0xf1, float:3.38E-43)
            if (r1 == r0) goto L52
            r0 = 998(0x3e6, float:1.398E-42)
            if (r1 == r0) goto L52
            r5 = 0
        L26:
            int r0 = r11.length()
            if (r5 >= r0) goto L51
            java.lang.String[] r4 = r6.A0B
            if (r4 == 0) goto L51
            r3 = 0
            r2 = 0
        L32:
            int r0 = r4.length
            if (r3 >= r0) goto L47
            if (r2 != 0) goto L4e
            r0 = r4[r3]
            char r1 = r0.charAt(r7)
            char r0 = r11.charAt(r5)
            if (r1 != r0) goto L44
            r2 = 1
        L44:
            int r3 = r3 + 1
            goto L32
        L47:
            if (r2 != 0) goto L4e
            java.lang.String r11 = r11.substring(r5)
            return r11
        L4e:
            int r5 = r5 + 1
            goto L26
        L51:
            return r11
        L52:
            int r8 = r11.length()
            r5 = 0
        L57:
            if (r5 >= r8) goto L69
            java.lang.String[] r4 = r6.A0B
            if (r4 == 0) goto L69
            int r0 = r8 - r5
            int r0 = r6.A00(r0)
            if (r0 > 0) goto L6a
            java.lang.String r11 = r11.substring(r5)
        L69:
            return r11
        L6a:
            int r3 = r4.length
            r2 = 0
        L6c:
            if (r2 >= r3) goto L80
            r0 = r4[r2]
            char r1 = r0.charAt(r7)
            char r0 = r11.charAt(r5)
            if (r1 != r0) goto L7d
            int r5 = r5 + 1
            goto L57
        L7d:
            int r2 = r2 + 1
            goto L6c
        L80:
            java.lang.String r11 = r11.substring(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass031.A02(int, java.lang.String):java.lang.String");
    }

    public String A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        A06();
        try {
            int parseInt = Integer.parseInt(str);
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C10120fK c10120fK = (C10120fK) it.next();
                if (c10120fK.A00 == parseInt) {
                    return c10120fK.A04;
                }
            }
            return "";
        } catch (NumberFormatException e) {
            Log.i("countries/get-tos-region", e);
            return "";
        }
    }

    public String A04(String str) {
        A06();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C10120fK c10120fK = (C10120fK) it.next();
            if (c10120fK.A03.startsWith(str)) {
                return c10120fK.A02;
            }
        }
        return "";
    }

    public String A05(String str) {
        A06();
        int length = str.length();
        if (length != 2) {
            if (length != 3 || str.equals("999")) {
                return null;
            }
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C10120fK c10120fK = (C10120fK) it.next();
                int[] iArr = c10120fK.A07;
                if (iArr != null) {
                    for (int i : iArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        if (str.equals(sb.toString())) {
                            return Integer.toString(c10120fK.A00);
                        }
                    }
                    continue;
                }
            }
        } else {
            C10120fK A01 = A01(str.toUpperCase(Locale.US));
            if (A01 != null) {
                return Integer.toString(A01.A00);
            }
        }
        return null;
    }

    public final synchronized void A06() {
        String[] split;
        if (this.A02) {
            return;
        }
        this.A01 = new ArrayList(243);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.A03.A00.getResources().openRawResource(R.raw.countries), "UTF-8"));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                try {
                    try {
                        split = TextUtils.split(readLine, "\t");
                    } catch (NumberFormatException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("countries/load/bad-number: ");
                        sb.append(readLine);
                        Log.e(sb.toString(), e);
                    }
                } catch (IllegalArgumentException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("countries/load/bad-line: ");
                    sb2.append(readLine);
                    Log.e(sb2.toString(), e2);
                }
                if (split != null && split.length >= 12) {
                    this.A01.add(new C10120fK(split));
                } else {
                    throw new IllegalArgumentException();
                    break;
                }
            } else {
                bufferedReader.close();
                this.A02 = true;
                return;
            }
        }
    }
}
