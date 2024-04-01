package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2vr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC61262vr extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C47212Ai A04;
    public final /* synthetic */ File A05;

    public /* synthetic */ RunnableC61262vr(C47212Ai c47212Ai, File file, int i, int i2, int i3, long j) {
        this.A04 = c47212Ai;
        this.A05 = file;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47212Ai c47212Ai = this.A04;
        File file = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        try {
            C2BR c2br = new C2BR(C40841sx.A0I(file), file.getPath(), i, i2, i3);
            if (c47212Ai.A03(c2br)) {
                c47212Ai.A09.A01(c2br, j);
            }
        } catch (IOException unused) {
            Log.e("GifManager/add/error saving gif to disk");
        }
    }
}
