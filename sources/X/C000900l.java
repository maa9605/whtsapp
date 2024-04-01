package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.00l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C000900l implements InterfaceC001000m {
    public final AtomicReference A00 = new AtomicReference("D");

    public C000900l(C000800k c000800k) {
        c000800k.A01(this);
    }

    @Override // X.InterfaceC001000m
    public void AIx(C05050Nc c05050Nc) {
        int i;
        String str = "D";
        if (c05050Nc.A02 && (i = c05050Nc.A00) != -1) {
            if (i == 0) {
                str = "M";
            } else if (i != 1) {
                str = Integer.toString(i);
            } else {
                str = "W";
            }
        }
        this.A00.set(str);
    }
}
