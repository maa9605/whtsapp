package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.4Hk */
/* loaded from: classes3.dex */
public class C92074Hk extends C4FL {
    public final C0HK A00;
    public final C0HK A01;
    public final C0HK A02;
    public final C0HK A03;
    public final C018508q A04;
    public final C48I A05;
    public final C899248y A06;
    public final InterfaceC002901k A07;

    public C92074Hk(AnonymousClass012 anonymousClass012, C018508q c018508q, InterfaceC002901k interfaceC002901k, C899248y c899248y, AnonymousClass498 anonymousClass498, C48I c48i, AnonymousClass499 anonymousClass499, AnonymousClass493 anonymousClass493, C899048w c899048w) {
        super(anonymousClass012, anonymousClass498, anonymousClass499, anonymousClass493, c899048w);
        this.A02 = new C0HK();
        this.A01 = new C0HK();
        this.A03 = new C0HK();
        this.A00 = new C0HK();
        this.A04 = c018508q;
        this.A07 = interfaceC002901k;
        this.A06 = c899248y;
        this.A05 = c48i;
    }

    @Override // X.C0MU
    public void A01() {
        Log.i("DyiViewModel/on-cleared");
        C899248y c899248y = this.A06;
        if (c899248y.A02() == 3) {
            synchronized (c899248y) {
                C2F4 c2f4 = c899248y.A00;
                if (c2f4 != null) {
                    c2f4.A04();
                }
                c899248y.A09.A0E(2);
            }
        }
    }

    public void A03() {
        this.A06.A05(new C4F4(this));
    }

    public void A04() {
        C899248y c899248y = this.A06;
        String obj = UUID.randomUUID().toString();
        synchronized (c899248y) {
            C012005w c012005w = c899248y.A02;
            AnonymousClass024.A0T(c012005w.A09(), 0L);
            File A06 = c012005w.A06();
            File A0J = c012005w.A0J(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(A06);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(A0J);
                    AnonymousClass024.A0V(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    if (!A0J.setLastModified(c899248y.A06.A05())) {
                        Log.e("dyiReportManager/prepare-report-for-export/failed to update report file");
                        Log.i("DyiViewModel/export-report/on-error");
                        this.A03.A0A(new C0FK(2, new C28Q()));
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("DyiViewModel/export-report/on-ready-to-export :: ");
                    sb.append(obj);
                    Log.i(sb.toString());
                    this.A00.A0A(obj);
                } finally {
                }
            } catch (IOException e) {
                Log.e("dyiReportManager/prepare-report-for-export/can't prepare report file", e);
                Log.i("DyiViewModel/export-report/on-error");
                this.A03.A0A(new C0FK(2, new C28Q()));
            }
        }
    }

    public final void A05(int i) {
        if (this.A04.A0J()) {
            return;
        }
        Log.i("DyiViewModel/check-internet :: no internet connection aborting the action");
        this.A03.A0A(new C0FK(Integer.valueOf(i), new C28Q(7)));
    }
}
