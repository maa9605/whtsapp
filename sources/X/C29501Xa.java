package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1Xa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29501Xa {
    public final Bitmap.Config A00;
    public final SparseArray A01 = new SparseArray();
    public final C1Xe A02;
    public final AbstractC19380vL A03;
    public final ExecutorService A04;

    public C29501Xa(AbstractC19380vL abstractC19380vL, C1Xe c1Xe, Bitmap.Config config, ExecutorService executorService) {
        this.A03 = abstractC19380vL;
        this.A02 = c1Xe;
        this.A00 = config;
        this.A04 = executorService;
    }
}
