package X;

import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import java.io.File;
import java.util.List;

/* renamed from: X.3q3 */
/* loaded from: classes2.dex */
public class C82153q3 extends C3XV {
    public float A00;
    public C63532zw A01;
    public AbstractC48662Ge A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final View A08;
    public final FrameLayout A09;
    public final FrameLayout A0A;
    public final C01B A0B;
    public final C003701t A0C;
    public final C41471ty A0D;
    public final DoodleView A0E;
    public final PhotoView A0F;
    public final C09F A0G;
    public final InterfaceC71723Xf A0H;
    public final C2Q5 A0I;
    public final C42471vn A0J;
    public final InterfaceC002901k A0K;
    public final ExoPlayerErrorFrame A0L;
    public final C2Q4 A0M;

    public C82153q3(C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C012005w c012005w, C40081rY c40081rY, C01B c01b, C018308n c018308n, C41471ty c41471ty, C02E c02e, C002301c c002301c, C42441vk c42441vk, C42471vn c42471vn, C2Q4 c2q4, C43791xz c43791xz, C2Q5 c2q5, AbstractC53802hX abstractC53802hX, AnonymousClass092 anonymousClass092) {
        super(c018508q, c02e, c002301c, c42441vk, c018308n, abstractC53802hX);
        String str;
        this.A07 = true;
        this.A00 = 0.0f;
        this.A0C = c003701t;
        this.A0B = c01b;
        this.A0D = c41471ty;
        this.A0K = interfaceC002901k;
        this.A0J = c42471vn;
        this.A0M = c2q4;
        this.A0I = c2q5;
        DoodleView doodleView = null;
        this.A0G = (C09F) anonymousClass092;
        this.A0A = (FrameLayout) C018308n.A00(A01()).findViewById(R.id.video_playback_container);
        this.A08 = C018308n.A00(A01()).findViewById(R.id.video_playback_container_overlay);
        this.A09 = new FrameLayout(A01());
        PhotoView photoView = new PhotoView(A01());
        this.A0F = photoView;
        photoView.A01 = 0.0f;
        photoView.A0Y = false;
        if (0 == 0) {
            photoView.A02();
        }
        PhotoView photoView2 = this.A0F;
        photoView2.A0V = false;
        photoView2.setEnabled(false);
        this.A0F.setBackgroundColor(A01().getResources().getColor(R.color.black));
        this.A0L = new ExoPlayerErrorFrame(A01(), null);
        this.A09.addView(this.A0F);
        this.A09.addView(this.A0L);
        this.A09.setId(R.id.status_playback_video);
        A0G();
        C09F c09f = this.A0G;
        C09H c09h = ((AnonymousClass097) c09f).A02;
        if (c09h != null) {
            if (c09f.A0n.A02 && !c09h.A0P && !c09h.A0O && (str = c09h.A0H) != null) {
                File A0F = C0DD.A0F(c012005w, str);
                if (A0F.exists()) {
                    DoodleView doodleView2 = new DoodleView(A01());
                    C2EK A02 = C2EK.A02(A0F, A01(), c40081rY, c002301c, c43791xz);
                    if (A02 != null) {
                        doodleView2.setLayerType(1, null);
                        doodleView2.setEnabled(false);
                        doodleView2.setDoodle(A02);
                        this.A09.addView(doodleView2, new FrameLayout.LayoutParams(-1, -1, 17));
                    }
                    doodleView = doodleView2;
                }
            }
            this.A0E = doodleView;
            this.A0H = new InterfaceC71723Xf() { // from class: X.3q1
                @Override // X.InterfaceC71723Xf
                public void AHX(int i, int i2, int i3) {
                }

                {
                    C82153q3.this = this;
                }

                @Override // X.InterfaceC71723Xf
                public void AHU(boolean z) {
                    C82153q3.this.A0H(z);
                }
            };
            return;
        }
        throw null;
    }

    @Override // X.C3XV
    public long A00() {
        long A03;
        C09F c09f = this.A0G;
        C09H c09h = ((AnonymousClass097) c09f).A02;
        if (c09h != null) {
            if (c09f.A0n.A02 && !c09h.A0P && !c09h.A0O) {
                long j = c09h.A0D;
                if (j >= 0) {
                    long j2 = c09h.A0E;
                    if (j2 > 0) {
                        A03 = j2 - j;
                        return Math.min(this.A0B.A07(C01C.A3w) * 1000, A03);
                    }
                }
            }
            AbstractC48662Ge abstractC48662Ge = this.A02;
            A03 = abstractC48662Ge != null ? abstractC48662Ge.A03() : 0L;
            return Math.min(this.A0B.A07(C01C.A3w) * 1000, A03);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x006e  */
    @Override // X.C3XV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04() {
        /*
            r11 = this;
            X.2Q5 r2 = r11.A0I
            X.3Xf r1 = r11.A0H
            java.util.List r0 = r2.A04
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.A04 = r0
        Lf:
            r0.add(r1)
            boolean r0 = r2.A05
            r11.A0H(r0)
            boolean r0 = r11.A06
            r10 = 0
            if (r0 == 0) goto L21
            r11.A06 = r10
            r11.A0B()
        L21:
            boolean r0 = r11.A04
            if (r0 == 0) goto L26
            return
        L26:
            r11.A0C()
            X.2Ge r9 = r11.A02
            if (r9 == 0) goto L7b
            X.09F r0 = r11.A0G
            X.09H r8 = r0.A02
            if (r8 == 0) goto L79
            X.094 r0 = r0.A0n
            boolean r7 = r0.A02
            if (r7 == 0) goto L75
            boolean r0 = r8.A0P
            if (r0 != 0) goto L75
            boolean r0 = r8.A0O
            if (r0 != 0) goto L75
            long r3 = r8.A0D
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L75
            long r1 = r8.A0E
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L75
            int r0 = (int) r3
            r9.A0A(r0)
        L53:
            if (r7 == 0) goto L65
            boolean r0 = r8.A0P
            if (r0 != 0) goto L65
            boolean r0 = r8.A0O
            if (r0 != 0) goto L65
            boolean r0 = r8.A0N
            if (r0 == 0) goto L65
            r0 = 1
            r11.A0H(r0)
        L65:
            X.2Ge r0 = r11.A02
            r0.A08()
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r11.A0E
            if (r0 == 0) goto L71
            r0.A02()
        L71:
            r11.A0F()
            return
        L75:
            r9.A0A(r10)
            goto L53
        L79:
            r0 = 0
            throw r0
        L7b:
            java.lang.String r0 = "video player is null for "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            X.09F r0 = r11.A0G
            X.094 r0 = r0.A0n
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82153q3.A04():void");
    }

    @Override // X.C3XV
    public void A05() {
        A0D();
        AbstractC48662Ge abstractC48662Ge = this.A02;
        if (abstractC48662Ge != null && !abstractC48662Ge.A0E()) {
            abstractC48662Ge.A09();
        }
        DoodleView doodleView = this.A0E;
        if (doodleView != null) {
            doodleView.A0F.A0C = false;
            doodleView.invalidate();
        }
        A0A();
        A0E();
        this.A08.setVisibility(0);
        A0G();
        this.A00 = 0.0f;
        this.A07 = true;
        C2Q5 c2q5 = this.A0I;
        InterfaceC71723Xf interfaceC71723Xf = this.A0H;
        List list = c2q5.A04;
        if (list != null) {
            list.remove(interfaceC71723Xf);
        }
    }

    public final int A09() {
        AbstractC48662Ge abstractC48662Ge = this.A02;
        if (abstractC48662Ge == null) {
            return 0;
        }
        C09F c09f = this.A0G;
        C09H c09h = ((AnonymousClass097) c09f).A02;
        if (c09h != null) {
            if (c09f.A0n.A02 && !c09h.A0P && !c09h.A0O && c09h.A0D >= 0 && c09h.A0E > 0) {
                return abstractC48662Ge.A02() - ((int) c09h.A0D);
            }
            return abstractC48662Ge.A02();
        }
        throw null;
    }

    public final void A0A() {
        C2Q5 c2q5 = this.A0I;
        if (c2q5 != null) {
            Log.i("AudioManager/on-abandon-audio-focus");
            if (c2q5.A03 == this) {
                Handler handler = c2q5.A02;
                Runnable runnable = c2q5.A07;
                handler.removeCallbacks(runnable);
                c2q5.A02.postDelayed(runnable, 1000L);
            }
            this.A03 = false;
            return;
        }
        throw null;
    }

    public final void A0B() {
        PhotoView photoView = this.A0F;
        if (photoView.getVisibility() != 0) {
            return;
        }
        View decorView = C018308n.A00(A01()).getWindow().getDecorView();
        final int max = Math.max(decorView.getWidth(), decorView.getHeight());
        this.A0J.A0C(this.A0G, photoView, new InterfaceC43821y3() { // from class: X.3q2
            @Override // X.InterfaceC43821y3
            public void AKM() {
            }

            {
                C82153q3.this = this;
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                return max;
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                C82153q3.this.A0F.A06(bitmap);
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                PhotoView photoView2 = C82153q3.this.A0F;
                photoView2.A0J = null;
                photoView2.A04 = 0.0f;
            }
        }, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0C() {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82153q3.A0C():void");
    }

    public final void A0D() {
        StringBuilder A0P = C000200d.A0P("videoContainer=");
        A0P.append(this.A0A.getVisibility() == 0);
        A0P.append("videoPlaybackContainerOverlay=");
        A0P.append(this.A08.getVisibility() == 0);
        A0P.append("photoView=");
        A0P.append(this.A0F.getVisibility() == 0);
        A0P.append("mainView=");
        A0P.append(this.A09.getVisibility() == 0);
        A0P.append(" isPlaybackStarted=");
        A0P.append(super.A05.A00.A05);
        A0P.toString();
    }

    public final void A0E() {
        A0D();
        this.A0L.setVisibility(8);
        AbstractC48662Ge abstractC48662Ge = this.A02;
        if (abstractC48662Ge != null) {
            abstractC48662Ge.A01 = null;
            abstractC48662Ge.A03 = null;
            abstractC48662Ge.A02 = null;
            abstractC48662Ge.A00 = null;
            if (abstractC48662Ge.A0E()) {
                C48652Gd c48652Gd = this.A0M.A00;
                if (c48652Gd != null) {
                    C06260Si c06260Si = c48652Gd.A08;
                    if (c06260Si != null && c06260Si.ACT() != 1) {
                        c48652Gd.A0M = true;
                        c48652Gd.A08.A00();
                    } else {
                        c48652Gd.A0M = false;
                    }
                }
            } else {
                abstractC48662Ge.A09();
            }
            this.A02.A07();
            this.A02 = null;
        }
    }

    public final void A0F() {
        if (!this.A05 && !this.A03 && super.A05.A00.A05) {
            this.A03 = true;
            C2Q5 c2q5 = this.A0I;
            if (c2q5 != null) {
                Log.i("AudioManager/on-request-audio-focus");
                c2q5.A02.removeCallbacks(c2q5.A07);
                if (c2q5.A03 == null) {
                    Log.i("AudioManager/request-audio-focus");
                    AudioManager A0A = c2q5.A06.A0A();
                    if (A0A != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            A0A.requestAudioFocus(c2q5.A01());
                        } else {
                            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c2q5.A01;
                            if (onAudioFocusChangeListener == null) {
                                onAudioFocusChangeListener = C71713Xe.A00;
                                c2q5.A01 = onAudioFocusChangeListener;
                            }
                            A0A.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
                        }
                    }
                }
                c2q5.A03 = this;
                return;
            }
            throw null;
        }
    }

    public final void A0G() {
        PhotoView photoView = this.A0F;
        if (photoView.getVisibility() == 0) {
            return;
        }
        A0D();
        photoView.setVisibility(0);
    }

    public void A0H(boolean z) {
        if (this instanceof C86403xO) {
            return;
        }
        this.A05 = z;
        AbstractC48662Ge abstractC48662Ge = this.A02;
        if (abstractC48662Ge != null) {
            abstractC48662Ge.A0B(z);
        }
        A0F();
    }
}
