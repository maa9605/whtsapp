package X;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.1Z0  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Z0 extends AbstractC20770yA {
    public C29901Yy[] A00;
    public final AbstractC008503r A01;
    public final ZipFile A02;
    public final /* synthetic */ C009003w A03;

    public boolean A02(ZipEntry zipEntry, String str) {
        throw null;
    }

    public C1Z0(C009003w c009003w, AbstractC008503r abstractC008503r) {
        this.A03 = c009003w;
        this.A02 = new ZipFile(c009003w.A00);
        this.A01 = abstractC008503r;
    }

    @Override // X.AbstractC20770yA
    public final C20740y7 A00() {
        return new C20740y7(A03());
    }

    @Override // X.AbstractC20770yA
    public final AbstractC20760y9 A01() {
        return new AbstractC20760y9() { // from class: X.1Yz
            public int A00;

            @Override // X.AbstractC20760y9
            public C20750y8 A00() {
                C1Z0 c1z0 = C1Z0.this;
                c1z0.A03();
                C29901Yy[] c29901YyArr = c1z0.A00;
                int i = this.A00;
                this.A00 = i + 1;
                C29901Yy c29901Yy = c29901YyArr[i];
                InputStream inputStream = c1z0.A02.getInputStream(c29901Yy.A01);
                try {
                    return new C20750y8(c29901Yy, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }

            @Override // X.AbstractC20760y9
            public boolean A01() {
                C1Z0 c1z0 = C1Z0.this;
                c1z0.A03();
                return this.A00 < c1z0.A00.length;
            }
        };
    }

    public final C29901Yy[] A03() {
        int i;
        int length;
        C29901Yy[] c29901YyArr = this.A00;
        if (c29901YyArr == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(this.A03.A01);
            String[] A0Q = C002501g.A0Q();
            Enumeration<? extends ZipEntry> entries = this.A02.entries();
            while (true) {
                i = 0;
                if (!entries.hasMoreElements()) {
                    break;
                }
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = compile.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    while (true) {
                        if (i >= A0Q.length) {
                            break;
                        } else if (A0Q[i] == null || !group.equals(A0Q[i])) {
                            i++;
                        } else if (i >= 0) {
                            linkedHashSet.add(group);
                            C29901Yy c29901Yy = (C29901Yy) hashMap.get(group2);
                            if (c29901Yy == null || i < c29901Yy.A00) {
                                hashMap.put(group2, new C29901Yy(group2, nextElement, i));
                            }
                        }
                    }
                }
            }
            AbstractC008503r abstractC008503r = this.A01;
            linkedHashSet.toArray(new String[linkedHashSet.size()]);
            if (abstractC008503r != null) {
                C29901Yy[] c29901YyArr2 = (C29901Yy[]) hashMap.values().toArray(new C29901Yy[hashMap.size()]);
                Arrays.sort(c29901YyArr2);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    length = c29901YyArr2.length;
                    if (i2 >= length) {
                        break;
                    }
                    C29901Yy c29901Yy2 = c29901YyArr2[i2];
                    if (A02(c29901Yy2.A01, ((C20730y6) c29901Yy2).A01)) {
                        i3++;
                    } else {
                        c29901YyArr2[i2] = null;
                    }
                    i2++;
                }
                c29901YyArr = new C29901Yy[i3];
                int i4 = 0;
                while (i < length) {
                    C29901Yy c29901Yy3 = c29901YyArr2[i];
                    if (c29901Yy3 != null) {
                        c29901YyArr[i4] = c29901Yy3;
                        i4++;
                    }
                    i++;
                }
                this.A00 = c29901YyArr;
            } else {
                throw null;
            }
        }
        return c29901YyArr;
    }

    @Override // X.AbstractC20770yA, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A02.close();
    }
}
