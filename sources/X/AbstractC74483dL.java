package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3dL */
/* loaded from: classes2.dex */
public abstract class AbstractC74483dL {
    public VideoCallParticipantView A00;
    public VideoPort A01;
    public boolean A02;
    public final UserJid A03;
    public final C84403tg A04;
    public final InterfaceC52052Zt A05;
    public final InterfaceC74493dM A06 = new C84673u8(this);
    public final String A07;

    public AbstractC74483dL(String str, InterfaceC52052Zt interfaceC52052Zt, UserJid userJid, C84403tg c84403tg) {
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/video/");
        sb.append(str);
        sb.append("/VideoParticipantPresenter for ");
        sb.append(userJid);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/VoipActivityV2/video/");
        this.A07 = C000200d.A0L(sb2, str, "/");
        this.A03 = userJid;
        this.A05 = interfaceC52052Zt;
        this.A04 = c84403tg;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap A00() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC74483dL.A00():android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0015, code lost:
        if (r0 < 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Point A01(com.whatsapp.voipcalling.VideoCallParticipantView r4, X.C28241Qv r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C84863uT
            if (r0 != 0) goto L39
            r1 = r3
            X.3uS r1 = (X.C84853uS) r1
            boolean r0 = r5.A0F
            if (r0 == 0) goto L17
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r1.A00
            X.3dW r0 = r0.A1H
            if (r0 == 0) goto L17
            int r0 = r0.A00
            int r1 = r0 * 90
            if (r0 >= 0) goto L18
        L17:
            r1 = 0
        L18:
            int r0 = r5.A03
            int r0 = r0 * 90
            int r0 = r0 - r1
            int r0 = r0 + 360
            int r0 = r0 % 360
            int r0 = r0 % 180
            if (r0 == 0) goto L2f
            int r1 = r5.A02
            int r0 = r5.A05
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
            return r2
        L2f:
            int r1 = r5.A05
            int r0 = r5.A02
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
            return r2
        L39:
            r0 = r3
            X.3uT r0 = (X.C84863uT) r0
            com.whatsapp.voipcalling.VoipActivityV2 r2 = r0.A00
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r2.A1N
            android.graphics.Point r0 = r0.getAdjustedCameraPreviewSize()
            if (r0 != 0) goto L50
            boolean r1 = r5.A02()
            if (r1 == 0) goto L50
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r2.A1N
            android.graphics.Point r0 = r0.lastAdjustedCameraPreviewSize
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC74483dL.A01(com.whatsapp.voipcalling.VideoCallParticipantView, X.1Qv):android.graphics.Point");
    }

    public void A02() {
        if (!(this instanceof C84863uT)) {
            C84853uS c84853uS = (C84853uS) this;
            UserJid userJid = c84853uS.A03;
            if (!c84853uS.A09()) {
                Voip.stopVideoRenderStream(userJid.getRawString());
                Voip.setVideoDisplayPort(userJid.getRawString(), null);
                return;
            }
            return;
        }
        ((C84863uT) this).A00.A1q();
    }

    public final void A03() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A07);
        sb.append("detachFromParticipantView ");
        sb.append(this.A00);
        sb.append(" for ");
        UserJid userJid = this.A03;
        C000200d.A1J(sb, userJid);
        VideoCallParticipantView videoCallParticipantView = this.A00;
        if (videoCallParticipantView == null || !userJid.equals(videoCallParticipantView.A0O)) {
            return;
        }
        VideoPort videoPort = this.A01;
        if (videoPort != null) {
            videoPort.setListener(null);
            this.A01 = null;
        }
        ImageView imageView = this.A00.A0J;
        if (imageView.getVisibility() == 0) {
            imageView.setImageBitmap(null);
            imageView.setVisibility(8);
        }
        this.A00.A0O = null;
        this.A00 = null;
    }

    public final void A04() {
        if (this.A02) {
            CallInfo A1V = this.A04.A00.A1V();
            if (A1V == null) {
                C000200d.A1Q(new StringBuilder(), this.A07, "startRenderingIfReady can not get callInfo");
                return;
            }
            C28241Qv infoByJid = A1V.getInfoByJid(this.A03);
            if (infoByJid == null) {
                C000200d.A1Q(new StringBuilder(), this.A07, "startRenderingIfReady cancelled due to no participant info");
                return;
            }
            VideoCallParticipantView videoCallParticipantView = this.A00;
            if (videoCallParticipantView != null) {
                A08(videoCallParticipantView, infoByJid, A1V);
                if (this instanceof C84863uT) {
                    C84863uT c84863uT = (C84863uT) this;
                    if (!infoByJid.A02() && !A1V.isCallOnHold()) {
                        c84863uT.A00.A2N(c84863uT, infoByJid);
                    }
                } else {
                    C84853uS c84853uS = (C84853uS) this;
                    UserJid userJid = c84853uS.A03;
                    if (!c84853uS.A09()) {
                        if (Voip.setVideoDisplayPort(userJid.getRawString(), c84853uS.A01) == 0) {
                            Voip.startVideoRenderStream(userJid.getRawString());
                        } else {
                            C25L c25l = c84853uS.A00.A1B;
                            if (c25l != null) {
                                c25l.A0b(22, null);
                            }
                        }
                    }
                }
                A05(infoByJid);
                return;
            }
            throw null;
        }
    }

    public final void A05(C28241Qv c28241Qv) {
        VideoCallParticipantView videoCallParticipantView = this.A00;
        if (videoCallParticipantView == null) {
            C000200d.A1Q(new StringBuilder(), this.A07, "updateLayoutParams cancelled due to no participant view");
            return;
        }
        if (c28241Qv == null) {
            CallInfo A1V = this.A04.A00.A1V();
            if (A1V == null) {
                C000200d.A1Q(new StringBuilder(), this.A07, "VideoParticipantPresenter can not get callInfo from voip");
                c28241Qv = null;
            } else {
                c28241Qv = A1V.getInfoByJid(this.A03);
            }
            if (c28241Qv == null) {
                C000200d.A1Q(new StringBuilder(), this.A07, "updateLayoutParams cancelled due to no participant info");
                return;
            }
        }
        Point A01 = A01(videoCallParticipantView, c28241Qv);
        if (A01 != null && A01.x != 0 && A01.y != 0) {
            this.A05.AVv(videoCallParticipantView, A01);
        } else {
            C000200d.A1Q(new StringBuilder(), this.A07, "updateLayoutParams cancelled due to bad video size");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x01c4, code lost:
        if (r11.A0B == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(X.C28241Qv r11, com.whatsapp.voipcalling.CallInfo r12) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC74483dL.A06(X.1Qv, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A07(VideoCallParticipantView videoCallParticipantView) {
        if (videoCallParticipantView == this.A00 && this.A03.equals(videoCallParticipantView.A0O)) {
            return;
        }
        if (this.A00 != null) {
            A03();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A07);
        sb.append("attachToParticipantView ");
        sb.append(videoCallParticipantView);
        sb.append(" for ");
        UserJid userJid = this.A03;
        C000200d.A1J(sb, userJid);
        this.A00 = videoCallParticipantView;
        videoCallParticipantView.A0O = userJid;
        VideoPort ADq = this.A05.ADq(videoCallParticipantView);
        this.A01 = ADq;
        ADq.setListener(this.A06);
    }

    public final void A08(VideoCallParticipantView videoCallParticipantView, C28241Qv c28241Qv, CallInfo callInfo) {
        if (!c28241Qv.A02() && !callInfo.self.A09 && !c28241Qv.A0H && c28241Qv.A04 != 2) {
            ImageView imageView = videoCallParticipantView.A0J;
            if (imageView.getVisibility() == 0) {
                imageView.setImageBitmap(null);
                imageView.setVisibility(8);
            }
        } else if (C74733dl.A00) {
        } else {
            ImageView imageView2 = videoCallParticipantView.A0J;
            if (imageView2.getVisibility() == 0) {
                return;
            }
            Bitmap A00 = A00();
            if (A00 == null) {
                C000200d.A1Q(new StringBuilder(), this.A07, "showLastFrameOverlay no bitmap");
            } else {
                int width = A00.getWidth() / 40;
                if (width < 8) {
                    width = 8;
                } else if (width > 16) {
                    width = 16;
                }
                FilterUtils.blurNative(A00, width, 2);
            }
            imageView2.setImageBitmap(A00);
            imageView2.setVisibility(0);
        }
    }
}
