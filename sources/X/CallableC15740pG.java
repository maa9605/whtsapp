package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: X.0pG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class CallableC15740pG implements Callable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;

    public CallableC15740pG(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl) {
        this.A00 = shortcutInfoCompatSaverImpl;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        ArrayList arrayList = new ArrayList();
        for (C15810pN c15810pN : this.A00.A04.values()) {
            C0M2 c0m2 = c15810pN.A00;
            C0M2 c0m22 = new C0M2();
            c0m22.A02 = c0m2.A02;
            c0m22.A07 = c0m2.A07;
            Intent[] intentArr = c0m2.A0B;
            c0m22.A0B = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            c0m22.A01 = c0m2.A01;
            c0m22.A05 = c0m2.A05;
            c0m22.A06 = c0m2.A06;
            c0m22.A04 = c0m2.A04;
            c0m22.A03 = c0m2.A03;
            c0m22.A09 = c0m2.A09;
            c0m22.A0A = c0m2.A0A;
            c0m22.A00 = c0m2.A00;
            C12810k6[] c12810k6Arr = c0m2.A0C;
            if (c12810k6Arr != null) {
                c0m22.A0C = (C12810k6[]) Arrays.copyOf(c12810k6Arr, c12810k6Arr.length);
            }
            Set set = c0m2.A08;
            if (set != null) {
                c0m22.A08 = new HashSet(set);
            }
            if (!TextUtils.isEmpty(c0m22.A05)) {
                Intent[] intentArr2 = c0m22.A0B;
                if (intentArr2 != null && intentArr2.length != 0) {
                    arrayList.add(c0m22);
                } else {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
            } else {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
        }
        return arrayList;
    }
}
