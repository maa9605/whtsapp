package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.ScaleGestureDetector;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3pw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82083pw extends C3XV {
    public C63532zw A00;
    public boolean A01;
    public boolean A02;
    public final C003701t A03;
    public final C41471ty A04;
    public final PhotoView A05;
    public final AnonymousClass095 A06;
    public final C3XU A07;
    public final C42471vn A08;

    public C82083pw(C003701t c003701t, C018508q c018508q, C018308n c018308n, C41471ty c41471ty, C02E c02e, C002301c c002301c, C42441vk c42441vk, C42471vn c42471vn, final AbstractC53802hX abstractC53802hX, AnonymousClass092 anonymousClass092) {
        super(c018508q, c02e, c002301c, c42441vk, c018308n, abstractC53802hX);
        this.A03 = c003701t;
        this.A04 = c41471ty;
        this.A08 = c42471vn;
        AnonymousClass095 anonymousClass095 = (AnonymousClass095) anonymousClass092;
        this.A06 = anonymousClass095;
        String A1A = anonymousClass095.A1A();
        long j = 4500;
        if (C003101m.A0Y(anonymousClass095.A0G)) {
            j = 6750;
        } else if (!anonymousClass095.A0n.A02) {
            int A01 = C43981yK.A01(A1A);
            j = (long) (((A01 >= 89 ? 1.0d : Math.sqrt(A01 / 89)) * 3000.0d) + 4500.0d);
        }
        this.A07 = new C3XU(j);
        final Context A012 = A01();
        PhotoView photoView = new PhotoView(A012) { // from class: X.41X
            @Override // com.whatsapp.mediaview.PhotoView, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                AbstractC53812hY abstractC53812hY = abstractC53802hX.A00;
                abstractC53812hY.A0O(true, true);
                abstractC53812hY.A0F();
                C82083pw.this.A01 = true;
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onScaleBegin(scaleGestureDetector);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
                if (r9.getPointerCount() == 1) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
                if (r2 == 3) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
                r8.A00.A01 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
                r0 = r3.A00;
                r0.A0I();
                r0.A0G();
                r1 = r8.A0P;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
                if (r1 == null) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
                r2 = ((com.whatsapp.mediaview.PhotoView) r8).A00;
                r3 = r8.A05;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
                if (r3 != 0.0f) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
                r3 = r8.A04;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
                r1.A00(r2, r3, getWidth() >> 1, getHeight() >> 1, 200);
             */
            @Override // com.whatsapp.mediaview.PhotoView, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onTouchEvent(android.view.MotionEvent r9) {
                /*
                    r8 = this;
                    int r2 = r9.getActionMasked()
                    r1 = 1
                    r0 = 5
                    if (r2 != r0) goto L1a
                    int r0 = r9.getPointerCount()
                    if (r0 <= r1) goto L22
                    android.view.ViewParent r0 = r8.getParent()
                    r0.requestDisallowInterceptTouchEvent(r1)
                L15:
                    boolean r0 = super.onTouchEvent(r9)
                    return r0
                L1a:
                    if (r2 != r1) goto L22
                    int r0 = r9.getPointerCount()
                    if (r0 == r1) goto L2b
                L22:
                    X.3pw r0 = X.C82083pw.this
                    boolean r0 = r0.A01
                    if (r0 == 0) goto L15
                    r0 = 3
                    if (r2 != r0) goto L15
                L2b:
                    X.3pw r0 = X.C82083pw.this
                    r1 = 0
                    r0.A01 = r1
                    android.view.ViewParent r0 = r8.getParent()
                    r0.requestDisallowInterceptTouchEvent(r1)
                    X.2hX r0 = r3
                    X.2hY r0 = r0.A00
                    r0.A0I()
                    r0.A0G()
                    X.31H r1 = r8.A0P
                    if (r1 == 0) goto L15
                    float r2 = r8.A00
                    float r3 = r8.A05
                    r0 = 0
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 != 0) goto L50
                    float r3 = r8.A04
                L50:
                    int r0 = r8.getWidth()
                    int r0 = r0 >> 1
                    float r4 = (float) r0
                    int r0 = r8.getHeight()
                    int r0 = r0 >> 1
                    float r5 = (float) r0
                    r6 = 200(0xc8, double:9.9E-322)
                    r1.A00(r2, r3, r4, r5, r6)
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C41X.onTouchEvent(android.view.MotionEvent):boolean");
            }
        };
        this.A05 = photoView;
        photoView.A01 = 0.2f;
        photoView.A0Y = true;
        if (1 == 0) {
            photoView.A02();
        }
        PhotoView photoView2 = this.A05;
        photoView2.A0V = false;
        photoView2.setIsLongpressEnabled(false);
        this.A05.setId(R.id.status_playback_image);
    }

    @Override // X.C3XV
    public long A00() {
        return this.A07.A03;
    }

    @Override // X.C3XV
    public void A04() {
        C3XU c3xu = this.A07;
        c3xu.A00 = 0L;
        c3xu.A01 = SystemClock.elapsedRealtime();
        c3xu.A01();
        super.A05.A01();
    }

    @Override // X.C3XV
    public void A05() {
        this.A07.A02();
        this.A02 = false;
    }
}
