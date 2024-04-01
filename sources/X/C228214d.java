package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.14d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C228214d {
    public int A00;
    public boolean A01;
    public final C006702y A02;
    public final C006702y A03;
    public final C0NR A04;

    public final void A00(C228114c c228114c, C30451ab c30451ab, String str) {
        final C006702y c006702y = this.A02;
        c006702y.put(c228114c, c30451ab);
        C006702y c006702y2 = this.A03;
        c006702y2.put(c228114c, str);
        int i = this.A00 - 1;
        this.A00 = i;
        if (!c30451ab.A02()) {
            this.A01 = true;
        }
        if (i == 0) {
            if (this.A01) {
                this.A04.A00.A08(new Exception(c006702y) { // from class: X.13v
                    public final C006702y zaay;

                    {
                        this.zaay = c006702y;
                    }

                    @Override // java.lang.Throwable
                    public String getMessage() {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((C06410Ta) this.zaay.keySet()).iterator();
                        boolean z = true;
                        while (true) {
                            C06440Td c06440Td = (C06440Td) it;
                            if (!c06440Td.hasNext()) {
                                break;
                            }
                            C228114c c228114c2 = (C228114c) c06440Td.next();
                            C30451ab c30451ab2 = (C30451ab) this.zaay.get(c228114c2);
                            if (c30451ab2.A02()) {
                                z = false;
                            }
                            String str2 = c228114c2.A01.A02;
                            String valueOf = String.valueOf(c30451ab2);
                            StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str2).length() + 2);
                            sb.append(str2);
                            sb.append(": ");
                            sb.append(valueOf);
                            arrayList.add(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (z) {
                            sb2.append("None of the queried APIs are available. ");
                        } else {
                            sb2.append("Some of the queried APIs are unavailable. ");
                        }
                        sb2.append(TextUtils.join("; ", arrayList));
                        return sb2.toString();
                    }
                });
                return;
            }
            this.A04.A00.A09(c006702y2);
        }
    }
}
