package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1UL */
/* loaded from: classes.dex */
public class C1UL extends AbstractC08920cK implements InterfaceC09590eN {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A0B;
    public int A0C;
    public long A0D;
    public Rect A0E;
    public VelocityTracker A0F;
    public C13090ka A0H;
    public AbstractC14940np A0I;
    public C14950nq A0J;
    public RecyclerView A0M;
    public List A0N;
    public List A0P;
    public final List A0S = new ArrayList();
    public final float[] A0T = new float[2];
    public C0TS A0L = null;
    public int A09 = -1;
    public int A08 = 0;
    public List A0O = new ArrayList();
    public final Runnable A0R = new Runnable() { // from class: X.0nl
        {
            C1UL.this = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x004c, code lost:
            if (r12 < 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
            if (r4 < 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x00ca, code lost:
            if (r4 > 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x00ef, code lost:
            if (r12 > 0) goto L14;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC14900nl.run():void");
        }
    };
    public InterfaceC15110o6 A0K = null;
    public View A0G = null;
    public int A0A = -1;
    public final InterfaceC15190oE A0Q = new InterfaceC15190oE() { // from class: X.1UI
        {
            C1UL.this = this;
        }

        @Override // X.InterfaceC15190oE
        public boolean AL6(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1UL c1ul = C1UL.this;
            c1ul.A0H.A00.APj(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                c1ul.A09 = motionEvent.getPointerId(0);
                c1ul.A02 = motionEvent.getX();
                c1ul.A03 = motionEvent.getY();
                VelocityTracker velocityTracker = c1ul.A0F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c1ul.A0F = VelocityTracker.obtain();
                if (c1ul.A0L == null && !c1ul.A0O.isEmpty()) {
                    View A05 = c1ul.A05(motionEvent);
                    int size = c1ul.A0O.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C14970ns c14970ns = (C14970ns) c1ul.A0O.get(size);
                        C0TS c0ts = c14970ns.A0C;
                        View view = c0ts.A0H;
                        if (view == A05) {
                            c1ul.A02 -= c14970ns.A01;
                            c1ul.A03 -= c14970ns.A02;
                            c1ul.A0A(c0ts, true);
                            if (c1ul.A0S.remove(view)) {
                                AbstractC14940np.A00(c0ts);
                            }
                            c1ul.A09(c0ts, c14970ns.A0A);
                            c1ul.A06(motionEvent, c1ul.A0B, 0);
                        } else {
                            size--;
                        }
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = c1ul.A09;
                if (i != -1 && motionEvent.findPointerIndex(i) >= 0 && c1ul.A0L == null && actionMasked == 2 && c1ul.A08 != 2 && c1ul.A0I == null) {
                    throw null;
                }
            } else {
                c1ul.A09 = -1;
                c1ul.A09(null, 0);
            }
            VelocityTracker velocityTracker2 = c1ul.A0F;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return c1ul.A0L != null;
        }

        @Override // X.InterfaceC15190oE
        public void ANv(boolean z) {
            if (z) {
                C1UL.this.A09(null, 0);
            }
        }

        @Override // X.InterfaceC15190oE
        public void APi(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1UL c1ul = C1UL.this;
            c1ul.A0H.A00.APj(motionEvent);
            VelocityTracker velocityTracker = c1ul.A0F;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (c1ul.A09 == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(c1ul.A09);
            if (findPointerIndex >= 0 && c1ul.A0L == null && actionMasked == 2 && c1ul.A08 != 2 && c1ul.A0I == null) {
                throw null;
            }
            C0TS c0ts = c1ul.A0L;
            if (c0ts == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex < 0) {
                        return;
                    }
                    c1ul.A06(motionEvent, c1ul.A0B, findPointerIndex);
                    c1ul.A08(c0ts);
                    RecyclerView recyclerView2 = c1ul.A0M;
                    Runnable runnable = c1ul.A0R;
                    recyclerView2.removeCallbacks(runnable);
                    runnable.run();
                    c1ul.A0M.invalidate();
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == c1ul.A09) {
                            c1ul.A09 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            c1ul.A06(motionEvent, c1ul.A0B, actionIndex);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = c1ul.A0F;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            c1ul.A09(null, 0);
            c1ul.A09 = -1;
        }
    };

    @Override // X.InterfaceC09590eN
    public void AIQ(View view) {
    }

    public C1UL(AbstractC14940np abstractC14940np) {
        this.A0I = abstractC14940np;
    }

    @Override // X.AbstractC08920cK
    public void A00(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
        float f;
        float f2;
        this.A0A = -1;
        if (this.A0L != null) {
            float[] fArr = this.A0T;
            A0B(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC14940np abstractC14940np = this.A0I;
        C0TS c0ts = this.A0L;
        List list = this.A0O;
        if (abstractC14940np != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C14970ns c14970ns = (C14970ns) list.get(i);
                float f3 = c14970ns.A06;
                float f4 = c14970ns.A08;
                if (f3 == f4) {
                    c14970ns.A01 = c14970ns.A0C.A0H.getTranslationX();
                } else {
                    c14970ns.A01 = ((f4 - f3) * c14970ns.A00) + f3;
                }
                float f5 = c14970ns.A07;
                float f6 = c14970ns.A09;
                if (f5 == f6) {
                    c14970ns.A02 = c14970ns.A0C.A0H.getTranslationY();
                } else {
                    c14970ns.A02 = ((f6 - f5) * c14970ns.A00) + f5;
                }
                int save = canvas.save();
                AbstractC14940np.A01(recyclerView, c14970ns.A0C, c14970ns.A01, c14970ns.A02, false);
                canvas.restoreToCount(save);
            }
            if (c0ts != null) {
                int save2 = canvas.save();
                AbstractC14940np.A01(recyclerView, c0ts, f, f2, true);
                canvas.restoreToCount(save2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AbstractC08920cK
    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
        rect.setEmpty();
    }

    @Override // X.AbstractC08920cK
    public void A02(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
        boolean z = false;
        if (this.A0L != null) {
            A0B(this.A0T);
        }
        AbstractC14940np abstractC14940np = this.A0I;
        C0TS c0ts = this.A0L;
        List list = this.A0O;
        if (abstractC14940np != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
                canvas.restoreToCount(canvas.save());
            }
            if (c0ts != null) {
                canvas.restoreToCount(canvas.save());
            }
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C14970ns c14970ns = (C14970ns) list.get(i2);
                if (c14970ns.A03 && !c14970ns.A04) {
                    list.remove(i2);
                } else if (!c14970ns.A03) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
                return;
            }
            return;
        }
        throw null;
    }

    public final int A03(int i) {
        if ((i & 12) != 0) {
            int i2 = this.A00 > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.A0F;
            if (velocityTracker != null && this.A09 > -1) {
                AbstractC14940np abstractC14940np = this.A0I;
                float f = this.A04;
                if (abstractC14940np != null) {
                    velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, f);
                    float xVelocity = this.A0F.getXVelocity(this.A09);
                    float yVelocity = this.A0F.getYVelocity(this.A09);
                    int i3 = xVelocity > 0.0f ? 8 : 4;
                    float abs = Math.abs(xVelocity);
                    if ((i3 & i) != 0 && i2 == i3) {
                        AbstractC14940np abstractC14940np2 = this.A0I;
                        float f2 = this.A07;
                        if (abstractC14940np2 != null) {
                            if (abs >= f2 && abs > Math.abs(yVelocity)) {
                                return i3;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
            float width = this.A0M.getWidth();
            if (this.A0I != null) {
                float f3 = width * 0.5f;
                if ((i & i2) == 0 || Math.abs(this.A00) <= f3) {
                    return 0;
                }
                return i2;
            }
            throw null;
        }
        return 0;
    }

    public final int A04(int i) {
        if ((i & 3) != 0) {
            int i2 = this.A01 > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.A0F;
            if (velocityTracker != null && this.A09 > -1) {
                AbstractC14940np abstractC14940np = this.A0I;
                float f = this.A04;
                if (abstractC14940np != null) {
                    velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, f);
                    float xVelocity = this.A0F.getXVelocity(this.A09);
                    float yVelocity = this.A0F.getYVelocity(this.A09);
                    int i3 = yVelocity > 0.0f ? 2 : 1;
                    float abs = Math.abs(yVelocity);
                    if ((i3 & i) != 0 && i3 == i2) {
                        AbstractC14940np abstractC14940np2 = this.A0I;
                        float f2 = this.A07;
                        if (abstractC14940np2 != null) {
                            if (abs >= f2 && abs > Math.abs(xVelocity)) {
                                return i3;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
            float height = this.A0M.getHeight();
            if (this.A0I != null) {
                float f3 = height * 0.5f;
                if ((i & i2) == 0 || Math.abs(this.A01) <= f3) {
                    return 0;
                }
                return i2;
            }
            throw null;
        }
        return 0;
    }

    public View A05(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C0TS c0ts = this.A0L;
        if (c0ts != null) {
            View view = c0ts.A0H;
            float f = this.A05 + this.A00;
            float f2 = this.A06 + this.A01;
            if (x >= f && x <= f + view.getWidth() && y >= f2 && y <= f2 + view.getHeight()) {
                return view;
            }
        }
        for (int size = this.A0O.size() - 1; size >= 0; size--) {
            C14970ns c14970ns = (C14970ns) this.A0O.get(size);
            View view2 = c14970ns.A0C.A0H;
            float f3 = c14970ns.A01;
            float f4 = c14970ns.A02;
            if (x >= f3 && x <= f3 + view2.getWidth() && y >= f4 && y <= f4 + view2.getHeight()) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.A0M;
        int A00 = recyclerView.A0K.A00();
        while (true) {
            A00--;
            if (A00 < 0) {
                return null;
            }
            View A03 = recyclerView.A0K.A03(A00);
            float translationX = A03.getTranslationX();
            float translationY = A03.getTranslationY();
            if (x >= A03.getLeft() + translationX && x <= A03.getRight() + translationX && y >= A03.getTop() + translationY && y <= A03.getBottom() + translationY) {
                return A03;
            }
        }
    }

    public void A06(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.A02;
        this.A00 = f;
        float f2 = y - this.A03;
        this.A01 = f2;
        float f3 = f2;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.A00 = f;
        }
        if ((i & 8) == 0) {
            this.A00 = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            f3 = Math.max(0.0f, f2);
            this.A01 = f3;
        }
        if ((i & 2) == 0) {
            this.A01 = Math.min(0.0f, f3);
        }
    }

    public void A07(View view) {
        if (view == this.A0G) {
            this.A0G = null;
            if (this.A0K != null) {
                this.A0M.setChildDrawingOrderCallback(null);
            }
        }
    }

    public void A08(C0TS c0ts) {
        int left;
        int abs;
        int bottom;
        int abs2;
        int abs3;
        int right;
        int abs4;
        if (!this.A0M.isLayoutRequested() && this.A08 == 2) {
            if (this.A0I != null) {
                int i = (int) (this.A05 + this.A00);
                int i2 = (int) (this.A06 + this.A01);
                View view = c0ts.A0H;
                if (Math.abs(i2 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i - view.getLeft()) >= view.getWidth() * 0.5f) {
                    List list = this.A0P;
                    if (list == null) {
                        this.A0P = new ArrayList();
                        this.A0N = new ArrayList();
                    } else {
                        list.clear();
                        this.A0N.clear();
                    }
                    if (this.A0I != null) {
                        int round = Math.round(this.A05 + this.A00) - 0;
                        int round2 = Math.round(this.A06 + this.A01) - 0;
                        int width = view.getWidth() + round + 0;
                        int height = view.getHeight() + round2 + 0;
                        int i3 = (round + width) / 2;
                        int i4 = (round2 + height) / 2;
                        C0SV c0sv = this.A0M.A0S;
                        int A0A = c0sv.A0A();
                        for (int i5 = 0; i5 < A0A; i5++) {
                            View A0H = c0sv.A0H(i5);
                            if (A0H != view && A0H.getBottom() >= round2 && A0H.getTop() <= height && A0H.getRight() >= round && A0H.getLeft() <= width) {
                                C0TS A0E = this.A0M.A0E(A0H);
                                if (this.A0I != null) {
                                    int abs5 = Math.abs(i3 - ((A0H.getRight() + A0H.getLeft()) >> 1));
                                    int abs6 = Math.abs(i4 - ((A0H.getBottom() + A0H.getTop()) / 2));
                                    int i6 = (abs6 * abs6) + (abs5 * abs5);
                                    int size = this.A0P.size();
                                    int i7 = 0;
                                    for (int i8 = 0; i8 < size && i6 > ((Number) this.A0N.get(i8)).intValue(); i8++) {
                                        i7++;
                                    }
                                    this.A0P.add(i7, A0E);
                                    this.A0N.add(i7, Integer.valueOf(i6));
                                } else {
                                    throw null;
                                }
                            }
                        }
                        List list2 = this.A0P;
                        if (list2.size() == 0) {
                            return;
                        }
                        if (this.A0I != null) {
                            int width2 = view.getWidth() + i;
                            int height2 = view.getHeight() + i2;
                            int left2 = i - view.getLeft();
                            int top = i2 - view.getTop();
                            int size2 = list2.size();
                            C0TS c0ts2 = null;
                            int i9 = -1;
                            for (int i10 = 0; i10 < size2; i10++) {
                                C0TS c0ts3 = (C0TS) list2.get(i10);
                                if (left2 > 0 && (right = c0ts3.A0H.getRight() - width2) < 0) {
                                    if (c0ts3.A0H.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i9) {
                                        i9 = abs4;
                                        c0ts2 = c0ts3;
                                    }
                                } else if (left2 < 0 && (left = c0ts3.A0H.getLeft() - i) > 0 && c0ts3.A0H.getLeft() < view.getLeft() && (abs = Math.abs(left)) > i9) {
                                    i9 = abs;
                                    c0ts2 = c0ts3;
                                }
                                if (top < 0) {
                                    int top2 = c0ts3.A0H.getTop() - i2;
                                    if (top2 > 0 && c0ts3.A0H.getTop() < view.getTop() && (abs3 = Math.abs(top2)) > i9) {
                                        i9 = abs3;
                                        c0ts2 = c0ts3;
                                    }
                                } else if (top > 0 && (bottom = c0ts3.A0H.getBottom() - height2) < 0 && c0ts3.A0H.getBottom() > view.getBottom() && (abs2 = Math.abs(bottom)) > i9) {
                                    i9 = abs2;
                                    c0ts2 = c0ts3;
                                }
                            }
                            if (c0ts2 == null) {
                                this.A0P.clear();
                                this.A0N.clear();
                                return;
                            }
                            int A00 = c0ts2.A00();
                            c0ts.A00();
                            C82753r1 c82753r1 = (C82753r1) this.A0I;
                            if (c82753r1 != null) {
                                int A002 = c0ts.A00();
                                int A003 = c0ts2.A00();
                                StickerStoreMyTabFragment stickerStoreMyTabFragment = c82753r1.A00;
                                if (A003 >= ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0B.size() || A003 < 0 || A002 >= ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0B.size() || A002 < 0) {
                                    return;
                                }
                                int i11 = A002;
                                if (A002 < A003) {
                                    while (i11 < A003) {
                                        int i12 = i11 + 1;
                                        Collections.swap(((StickerStoreTabFragment) stickerStoreMyTabFragment).A0B, i11, i12);
                                        i11 = i12;
                                    }
                                } else {
                                    while (i11 > A003) {
                                        int i13 = i11 - 1;
                                        Collections.swap(((StickerStoreTabFragment) stickerStoreMyTabFragment).A0B, i11, i13);
                                        i11 = i13;
                                    }
                                }
                                stickerStoreMyTabFragment.A04 = true;
                                ((AbstractC04890Mh) ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0A).A01.A01(A002, A003);
                                AbstractC14940np abstractC14940np = this.A0I;
                                RecyclerView recyclerView = this.A0M;
                                if (abstractC14940np != null) {
                                    C0SV c0sv2 = recyclerView.A0S;
                                    if (c0sv2 instanceof C0SY) {
                                        ((C0SY) c0sv2).AQp(view, c0ts2.A0H, i, i2);
                                        return;
                                    }
                                    if (c0sv2.A1A()) {
                                        View view2 = c0ts2.A0H;
                                        if (C0SV.A03(view2) <= recyclerView.getPaddingLeft()) {
                                            recyclerView.A0Y(A00);
                                        }
                                        if (C0SV.A04(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                            recyclerView.A0Y(A00);
                                        }
                                    }
                                    if (c0sv2.A1B()) {
                                        View view3 = c0ts2.A0H;
                                        if (C0SV.A05(view3) <= recyclerView.getPaddingTop()) {
                                            recyclerView.A0Y(A00);
                                        }
                                        if (C0SV.A02(view3) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                            recyclerView.A0Y(A00);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x019a, code lost:
        if (r0 > 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(X.C0TS r28, int r29) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UL.A09(X.0TS, int):void");
    }

    public void A0A(C0TS c0ts, boolean z) {
        for (int size = this.A0O.size() - 1; size >= 0; size--) {
            C14970ns c14970ns = (C14970ns) this.A0O.get(size);
            if (c14970ns.A0C == c0ts) {
                c14970ns.A05 |= z;
                if (!c14970ns.A03) {
                    c14970ns.A0B.cancel();
                }
                this.A0O.remove(size);
                return;
            }
        }
    }

    public final void A0B(float[] fArr) {
        if ((this.A0B & 12) != 0) {
            fArr[0] = (this.A05 + this.A00) - this.A0L.A0H.getLeft();
        } else {
            fArr[0] = this.A0L.A0H.getTranslationX();
        }
        if ((this.A0B & 3) != 0) {
            fArr[1] = (this.A06 + this.A01) - this.A0L.A0H.getTop();
        } else {
            fArr[1] = this.A0L.A0H.getTranslationY();
        }
    }

    @Override // X.InterfaceC09590eN
    public void AIR(View view) {
        A07(view);
        C0TS A0E = this.A0M.A0E(view);
        if (A0E == null) {
            return;
        }
        C0TS c0ts = this.A0L;
        if (c0ts != null && A0E == c0ts) {
            A09(null, 0);
            return;
        }
        A0A(A0E, false);
        if (!this.A0S.remove(A0E.A0H)) {
            return;
        }
        AbstractC14940np.A00(A0E);
    }
}
