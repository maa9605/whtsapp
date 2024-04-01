package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.1QU  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1QU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ C0H9 A03;

    public /* synthetic */ C1QU(C0H9 c0h9, Context context, Uri uri, int i) {
        this.A03 = c0h9;
        this.A01 = context;
        this.A02 = uri;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0H9 c0h9 = this.A03;
        Context context = this.A01;
        Uri uri = this.A02;
        int i = this.A00;
        try {
            C38051nT c38051nT = new C38051nT(i);
            c38051nT.A00.setDataSource(context, uri);
            c38051nT.A04();
            c38051nT.A07();
            C0HV c0hv = c0h9.A00;
            if (c0hv != null) {
                c0hv.A05();
            }
            c0h9.A00 = c38051nT;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("asyncaudioplayer/play/e Error playing URI: ");
            sb.append(uri);
            sb.append(" with stream: ");
            sb.append(i);
            Log.w(sb.toString(), e);
        }
    }
}
