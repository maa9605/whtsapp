package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.OrientationEventListener;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3dW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74593dW extends OrientationEventListener {
    public int A00;
    public final Handler A01;
    public final /* synthetic */ VoipActivityV2 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74593dW(VoipActivityV2 voipActivityV2, Context context) {
        super(context);
        this.A02 = voipActivityV2;
        this.A00 = -1;
        this.A01 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.3ca
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C74593dW c74593dW = C74593dW.this;
                if (message.what == 1) {
                    Voip.videoOrientationChanged(c74593dW.A00 * 90);
                    int i = c74593dW.A00;
                    if (i == 1) {
                        i = 3;
                    } else if (i == 3) {
                        i = 1;
                    }
                    int i2 = i * 90;
                    VoipActivityV2 voipActivityV22 = c74593dW.A02;
                    voipActivityV22.A1z(i2);
                    CallInfo A1V = voipActivityV22.A1V();
                    if (A1V != null) {
                        voipActivityV22.A2E(A1V);
                    }
                }
                return true;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r4 >= (r1 + 270)) goto L29;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onOrientationChanged(int r7) {
        /*
            r6 = this;
            r5 = -1
            if (r7 != r5) goto L4
            return
        L4:
            int r4 = r7 % 360
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r6.A02
            int r2 = r1.A03
            int r0 = 360 - r2
            r3 = 1
            if (r4 >= r0) goto L70
            if (r4 < r2) goto L70
            int r1 = r1.A02
            int r0 = 90 - r1
            if (r4 < r0) goto L5b
            int r0 = r1 + 90
            if (r4 >= r0) goto L5b
            r2 = 1
        L1c:
            int r0 = r6.A00
            if (r2 == r0) goto L5a
            if (r2 == r5) goto L5a
            java.lang.String r1 = "voip/VoipActivityV2/VideoOrientationListener/onOrientationChanged Degress =  "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            java.lang.String r0 = "voip/VoipActivityV2/VideoOrientationListener/onOrientationChanged from: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r6.A00
            r1.append(r0)
            java.lang.String r0 = " to: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            r6.A00 = r2
            android.os.Handler r2 = r6.A01
            r2.removeMessages(r3)
            r0 = 800(0x320, double:3.953E-321)
            r2.sendEmptyMessageDelayed(r3, r0)
        L5a:
            return
        L5b:
            int r0 = 180 - r2
            if (r4 < r0) goto L65
            int r0 = r2 + 180
            if (r4 >= r0) goto L65
            r2 = 2
            goto L1c
        L65:
            int r0 = 270 - r1
            if (r4 < r0) goto L6e
            int r0 = r1 + 270
            r2 = 3
            if (r4 < r0) goto L1c
        L6e:
            r2 = -1
            goto L1c
        L70:
            r2 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74593dW.onOrientationChanged(int):void");
    }
}
