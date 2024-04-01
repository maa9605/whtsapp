package X;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Locale;

/* renamed from: X.0yX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20940yX {
    public static AnonymousClass122 A00;

    public static C06260Si A00(Context context, InterfaceC21190yw interfaceC21190yw, AbstractC222211m abstractC222211m, InterfaceC21060yj interfaceC21060yj) {
        AnonymousClass122 anonymousClass122;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        new Object() { // from class: X.0z1
        };
        synchronized (C20940yX.class) {
            anonymousClass122 = A00;
            if (anonymousClass122 == null) {
                String country = Locale.getDefault().getCountry();
                if (country != null) {
                    country = country.toUpperCase(Locale.US);
                }
                int[] iArr = (int[]) C30221a7.A09.get(country);
                if (iArr == null) {
                    iArr = new int[]{2, 2, 2, 2};
                }
                SparseArray sparseArray = new SparseArray(6);
                sparseArray.append(0, Long.valueOf((long) SearchActionVerificationClientService.MS_TO_NS));
                Long valueOf = Long.valueOf(C30221a7.A0D[iArr[0]]);
                sparseArray.append(2, valueOf);
                sparseArray.append(3, Long.valueOf(C30221a7.A0A[iArr[1]]));
                sparseArray.append(4, Long.valueOf(C30221a7.A0B[iArr[2]]));
                sparseArray.append(5, Long.valueOf(C30221a7.A0C[iArr[3]]));
                sparseArray.append(7, valueOf);
                C12Q c12q = C12Q.A00;
                Long l = (Long) sparseArray.get(0);
                if (l == null) {
                    l = (Long) sparseArray.get(0);
                }
                anonymousClass122 = new C30221a7(l.longValue(), c12q);
                A00 = anonymousClass122;
            }
        }
        return new C06260Si(context, interfaceC21190yw, abstractC222211m, interfaceC21060yj, anonymousClass122, myLooper);
    }
}
