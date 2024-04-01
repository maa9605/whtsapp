package java.lang;

import X.C000200d;
import X.C000500h;
import X.C06F;
import X.C2IJ;
import X.C2L7;
import X.C2L8;
import X.C42781wJ;
import X.C49172Iw;
import X.C49182Ix;
import X.C53782hV;
import X.C53792hW;
import X.C53922hj;
import X.C72003Yh;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.report.BusinessActivityReportViewModel;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0100100_I0 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape0S0100100_I0(Object obj, long j, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A02) {
            case 0:
                C2IJ c2ij = (C2IJ) this.A01;
                long j = this.A00;
                ChatInfoActivity chatInfoActivity = (ChatInfoActivity) c2ij.A09.get();
                if (chatInfoActivity == null || c2ij.A04()) {
                    return;
                }
                chatInfoActivity.A1Y(j);
                return;
            case 1:
                C2IJ c2ij2 = (C2IJ) this.A01;
                long j2 = this.A00;
                ChatInfoActivity chatInfoActivity2 = (ChatInfoActivity) c2ij2.A09.get();
                if (chatInfoActivity2 == null || c2ij2.A04()) {
                    return;
                }
                chatInfoActivity2.A1X(j2);
                return;
            case 2:
                C2L7 c2l7 = (C2L7) this.A01;
                long j3 = this.A00;
                C49172Iw c49172Iw = c2l7.A05;
                C2L8 c2l8 = c2l7.A00;
                C49182Ix c49182Ix = c49172Iw.A00;
                if (j3 <= c49182Ix.A03.A02() + 86400) {
                    c49182Ix.A0E.A00();
                    c49182Ix.A0F.AS1(new RunnableEBaseShape0S0200100_I0(c49172Iw, c2l8, j3, 0));
                    return;
                }
                DevicePairQrScannerActivity devicePairQrScannerActivity = c49182Ix.A0E.A00;
                devicePairQrScannerActivity.A04.AG4(1);
                devicePairQrScannerActivity.A01.A07(R.string.companion_device_time_incorrect_error, 1);
                return;
            case 3:
                long j4 = this.A00;
                C06F c06f = ((C42781wJ) this.A01).A00;
                synchronized (c06f) {
                    c06f.A05(Long.valueOf(j4));
                }
                return;
            case 4:
                long j5 = this.A00;
                C53792hW c53792hW = ((C53782hV) this.A01).A00;
                C000200d.A0g(c53792hW.A00.A04, "business_activity_report_state", 1);
                C000200d.A0h(c53792hW.A00.A04, "business_activity_report_timestamp", j5);
                return;
            case 5:
                long j6 = this.A00;
                BusinessActivityReportViewModel businessActivityReportViewModel = ((C53922hj) this.A01).A00.A00;
                businessActivityReportViewModel.A01.A0B(0);
                businessActivityReportViewModel.A02.A0B(1);
                C000500h c000500h = businessActivityReportViewModel.A04;
                C000200d.A0g(c000500h, "business_activity_report_state", 1);
                C000200d.A0h(c000500h, "business_activity_report_timestamp", j6);
                return;
            case 6:
                C72003Yh c72003Yh = (C72003Yh) this.A01;
                long j7 = this.A00;
                synchronized (c72003Yh) {
                    c72003Yh.A00 = j7;
                }
                return;
            default:
                return;
        }
    }
}
